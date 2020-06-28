import java.util.Date;

public class Employee {
    private String name;
    private String sex;
    private String bDay;
    private String bMonth;
    private String bYear;

    private Date birthDay;

    public Employee() {
    }

    public Employee(String name, String sex, int bDay, int bMonth, int bYear) {
        this.name = name;
        this.sex = sex;
        this.bDay = "0" + bDay;
        this.bMonth = "0" + bMonth;
        this.bYear = String.valueOf(bYear);
        birthDay = new Date(bYear, bMonth, bDay);
    }

    public int getBirthDayTime() {
        return (int) birthDay.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getbDay() {
        return bDay;
    }

    public void setbDay(String bDay) {
        this.bDay = bDay;
    }

    public String getbMonth() {
        return bMonth;
    }

    public void setbMonth(String bMonth) {
        this.bMonth = bMonth;
    }

    public String getbYear() {
        return (String) bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = String.valueOf(bYear);
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}