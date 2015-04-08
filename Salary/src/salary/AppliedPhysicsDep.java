package salary;
import java.util.ArrayList;
import java.util.Calendar;

public final class AppliedPhysicsDep extends department {
    int temp;

    public AppliedPhysicsDep(String name, int age, String position, int month) {
        super(name, age, position, month);
    }

    @Override
    public void GetPayment(Salary s) {
        if (this.Month == Calendar.MONTH) {
            System.out.println("Congrats you have BirthDay party get your Bonus :) \n Your bonus is:" + s.getBonus());
            this.Payment = s.getBonus();
        }
        this.Payment += s.paySalary();
        System.out.println("Applied Physics departure Payment is:" + this.Payment);
    }

    public static void main(String[] args) {
        ArrayList<AppliedPhysicsDep> physics = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            physics.add(new AppliedPhysicsDep("ALEX", 34, "IT", 2));
        }
        for (int i = 5; i < 10; i++) {
            physics.add(new AppliedPhysicsDep("ALEX", 34, "IT", 10));
        }
        // Set Salary for Departure
        s = new Salary(-1, physics.size());
        physics.get(5).GetPayment(s);
    }
}
