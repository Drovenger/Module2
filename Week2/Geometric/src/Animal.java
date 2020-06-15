public class Animal {

    public void speak(){

        System.out.println("Hello");

    }

}

    //Sau đó xây dựng lớp TestAnimal như sau:

public class TestAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.speak();

    }

}