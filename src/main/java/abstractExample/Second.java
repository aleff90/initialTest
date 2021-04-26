package abstractExample;

class Second {
    public static void main(String[] args) {
        //create an object of the Student class (which inherits attributes and methods from Main)
        Student myObj2 = new Student();

        System.out.println("\n Name: "+myObj2.fname);
        System.out.println("\n Age: "+myObj2.age);
        System.out.println("\n Graduation Year: "+myObj2.graduationYear);
        myObj2.study(); //call abstract method
    }
}
