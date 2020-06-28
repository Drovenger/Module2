import java.io.File;
import java.util.Comparator;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Main {
    public static String maleList_xml = "maleList.xml";
    public static String femaleList_xml = "femaleList.xml";
    public static String listEmployee_xml = "Employee.xml";

    public static void main(String[] args) {
        MyQueue<Employee> maleList = new MyQueue<>();
        MyQueue<Employee> femaleList = new MyQueue<>();

        MyQueue<Employee> listEmployee = new MyQueue<>();

        Employee male1 = new Employee("Toan", "male", 17, 2, 1998);
        Employee male2 = new Employee("Nguyen", "male", 8, 8, 1995);
        Employee male3 = new Employee("Linh", "male", 4, 5, 2001);

        Employee female1 = new Employee("Huong", "female", 3, 3, 1999);
        Employee female2 = new Employee("An", "female", 5, 8, 2001);
        Employee female3 = new Employee("Phuong", "female", 23, 10, 2001);

        Employee[] list = {male1, male2, male3, female1, female2, female3};

        for (Employee Employee : list) {
            listEmployee.enqueue(Employee);
            if (Employee.getSex().equals("male")) {
                maleList.enqueue(Employee);
            } else {
                femaleList.enqueue(Employee);
            }
        }

        saveXML(listEmployee, listEmployee_xml);

        // Sort by birt day
        Comparator<Employee> comparator = Comparator.comparingInt(Employee::getBirthDayTime);

        if (!maleList.isQueueEmpty()) {
            // Sort by birt day
            maleList.sort(comparator);
            saveXML(maleList, maleList_xml);
        }

        if (!femaleList.isQueueEmpty()) {
            // Sort by birt day
            femaleList.sort(comparator);
            saveXML(femaleList, femaleList_xml);
        }
    }

    public static void setAttribute(Document doc, Element e, String key, String value) {
        Attr attr = doc.createAttribute(key);
        attr.setValue(value);
        e.setAttributeNode(attr);
    }

    public static void saveXML(MyQueue<Employee> list, String file) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // Create root XML
            Element rootElement = doc.createElement("EmployeeList");
            doc.appendChild(rootElement);

            // write male list
            list.forEach((Employee) -> {
                Element EmployeeEl = doc.createElement("Employee");
                rootElement.appendChild(EmployeeEl);

                // Name
                setAttribute(doc, EmployeeEl, "name", Employee.getName());

                // Sex
                setAttribute(doc, EmployeeEl, "sex", Employee.getSex());

                // birth day
                setAttribute(doc, EmployeeEl, "birthDay", Employee.getbDay());

                // birth month
                setAttribute(doc, EmployeeEl, "birthMonth", Employee.getbMonth());

                // birth year
                setAttribute(doc, EmployeeEl, "birthYear", Employee.getbYear());
            });

            // write file XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(file));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}