public class Person {
    private String name;
    private int age;

    Person(String xName, int xAge) {
        name = xName;
        age=xAge;
    }
    public String toString() {return(name + " " + age);}

    public String getName() {
        return name;
    }
}
