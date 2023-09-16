package generics_inheritance;

public class InheritanceGenerics {

    public static void main(String[] args) {
        /*Employee employee15248;
        Boss sara = new Boss("Sara", 27, 3444);
        employee15248 = sara;*/

        VariousTypes<Employee> employee15248 = new VariousTypes<>();
        VariousTypes<Boss> sara = new VariousTypes<>();

        //employee15248 = sara;

        VariousTypes.printEmployee(employee15248);
    }

}
