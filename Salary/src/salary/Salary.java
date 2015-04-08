
package salary;

/**
 *
 * @author Александр
 */
public class Salary {

    private double money;
    private int persons;
    private double bonus;

    public Salary(int n, int k) {
        setMoney(n);
        setPersons(k);
    }

    public void setPersons(int n) {
        this.persons = n;
    }

    public void setMoney(int n) {
        try {
            if (n < 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Money can't be under zero");
            System.exit(-1);
        }
        this.money = 0.99 * n;
        bonus = 0.01 * n;
    }

    public double getBonus() {
        return bonus / persons;
    }

    public double paySalary() {
        double salary = (double) money / persons;
        this.money = this.money - salary;
        persons = persons - 1;
        return salary;
    }

}
