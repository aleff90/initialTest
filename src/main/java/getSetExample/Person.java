package getSetExample;

public class Person {
    public String name; //private  = restricted access

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String newName) {
        this.name = newName;
    }
}
