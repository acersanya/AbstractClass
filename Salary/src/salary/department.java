package salary;

public abstract class department {

    public int age;
    public String name;
    public String position;
    public int Month;
    public double Payment;
    static Salary s;
    
    public department(String name, int age, String position, int month) {
        setName(name);
        setAge(age);
        setPosition(position);
        setBirthMonth(month);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPosition(String postion) {
        this.position = postion;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setBirthMonth(int month) {
        this.Month = month;
    }

// This method will be Overrided
    public abstract void GetPayment(Salary s);
    
}
