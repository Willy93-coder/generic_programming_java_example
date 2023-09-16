package generics_inheritance;

public class VariousTypes<T> {

    private T first;

    public VariousTypes() {
        first = null;
    }

    // Parametros comodin para poder conseguir pasar objetos
    // que hereden en este caso de la clase Employee
    public static void printEmployee(VariousTypes<? extends Employee> e) {
        Employee first = e.getFirst();
        System.out.println(first);
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T newValue) {
        this.first = newValue;
    }

}
