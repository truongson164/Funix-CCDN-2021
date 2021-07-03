public class Employee {
    private String name;
    private String gender;
    public String toString() {
        return name+" "+gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
}
