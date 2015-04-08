package salary;
import java.util.ArrayList;
import java.util.Calendar;
/**
 * @author Александр
 */
public final class AppliedMathDep extends department {
    public AppliedMathDep(String name, int age, String position, int month) {
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
        ArrayList<AppliedMathDep> mathematics = new ArrayList<>(10);
        s = new Salary(-1, mathematics.size());
    }
}
