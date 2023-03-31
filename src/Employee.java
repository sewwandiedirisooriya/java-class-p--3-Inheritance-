
public class Employee {
    int sallery = 50000;
}
class Labour extends Employee {
    int bonus = 10000;

    public static void main(String[] args) {
        Labour l = new Labour();
        System.out.println("Sallery is " + l.sallery);
        System.out.println("Bonus is " + l.bonus);
    }
}