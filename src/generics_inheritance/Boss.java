package generics_inheritance;

public class Boss extends Employee {

    public Boss(String name, int age, double salary) {
        super(name, age, salary);
    }

    double incentive(double inc) {
        return inc;
    }

}
