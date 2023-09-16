import java.io.File;

public class NoGenericProgramming {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList(6);

        employees.addElement("Maria");
        employees.addElement("Juan");
        employees.addElement("Joam");
        employees.addElement("Ana");
        employees.addElement("Eva");

        //String personName = (String) employees.getObject(0);
        employees.addElement(new File("ejemplo.xlsx"));
        File personName = (File) employees.getObject(1);
        System.out.println(personName);
    }
}

