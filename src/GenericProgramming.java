public class GenericProgramming {
    public static void main(String[] args) {
        // 'T' = String
        MyGenericClass<String> myObject1 = new MyGenericClass<String>();

        myObject1.setObject("Juan");

        System.out.println(myObject1.getObject());

        // 'T' = Person (clase creada por nosotros)
        MyGenericClass<Person> myObject2 = new MyGenericClass<Person>();

        Person sonia = new Person("Sonia");
        myObject2.setObject(sonia);
        System.out.println(myObject2.getObject());
    }
}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}