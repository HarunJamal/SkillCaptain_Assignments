package Java2.Day2;

public class PersonDeets{
    String name;
    int age;

    public PersonDeets(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Details of person");
        System.out.println("-----------------------");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println();
    }
    public static void main(String[] args) {
        PersonDeets p1 = new PersonDeets("Alice",25);
        PersonDeets p2 = new PersonDeets("Bob",30);

        p1.display();
        p2.display();
    }
}