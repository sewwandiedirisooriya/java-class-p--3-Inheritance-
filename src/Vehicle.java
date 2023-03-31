public class Vehicle {
    void drive() {
        System.out.println("Driving!");

    }

    void vehicleBreak(){
        System.out.println("Break!");

    }
    void reverse(){
        System.out.println("reverse!");
    }

    }
    class Car extends Vehicle{
    void motorRacing(){
        System.out.println("Racing!");
    }
    }
    class ModernCar extends Car{
    void flying(){
        System.out.println("flying!");
    }
    }
    class Boart extends Vehicle{
    void surf(){
        System.out.println("surfing");
    }
    }
    class ModernBoart extends Boart{
    void landRidng(){
        System.out.println("Riding");
    }

    }
    class TestOutput {
        public static void main(String[] args) {
            ModernCar mc = new ModernCar();
            ModernBoart mb = new ModernBoart();
            mc.drive();
            mc.vehicleBreak();
            mc.reverse();
            mc.motorRacing();
            mc.flying();
            mb.drive();
            mb.vehicleBreak();
            mb.reverse();
            mb.surf();
            mb.landRidng();
        }
    }




