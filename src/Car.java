class Car {
    private int numofcylinders;
    private String cylindername;

    Car() {
        boolean engine = true;
        int wheels = 4;
    }

//    Car(int numcylinders,String cylindersname) {
//        boolean engine = true;
//        int wheels = 4;
//        this.numofcylinders = numcylinders;
//        this.cylindername = cylindersname;
//    }

    public int getNumofcylinders() {
        return numofcylinders;
    }

    public void setNumofcylinders(int num) {

        this.numofcylinders = num;

    }

    public String getCylindername() {
        return cylindername;
    }

    public void setCylindername(String name) {

        this.cylindername = name;
    }
    public void startEngine() {
        System.out.println("engine started");
        System.out.println(this.getNumofcylinders());
        System.out.println(this.getCylindername());

    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void brake() {
        System.out.println("stopped");

    }

}

class Bmw extends Car{
    public void startEngine() {
        System.out.println("BMW Started");
        System.out.println(this.getNumofcylinders());
        System.out.println(this.getCylindername());
    }

    public void accelerate() {
        System.out.println("BMW accelerating");

    }

    public void brake() {
        System.out.println("BMW stopped");

    }
}

class Audi extends Car{
    public void startEngine() {
        System.out.println("Audi Started");
        System.out.println(this.getNumofcylinders());
        System.out.println(this.getCylindername());
    }

    public void accelerate() {
        System.out.println("Audi accelerating");

    }

    public void brake() {
        System.out.println("Audi stopped");

    }
}


class Gm extends Car{
    public void startEngine() {
        System.out.println("Gm Started");
        System.out.println(this.getNumofcylinders());
        System.out.println(this.getCylindername());

    }

    public void accelerate() {
        System.out.println("Gm accelerating");

    }

    public void brake() {
        System.out.println("Gm stopped");

    }
}


class TestCar {
    public static void main(String[] args) {
        Car car;
        car = new Bmw();
        car.setNumofcylinders(2);
        car.setCylindername("nitro");
        car.startEngine();
        car.accelerate();
        car.brake();
        car = new Audi();
        car.setNumofcylinders(3);
        car.setCylindername("boost");
        car.startEngine();
        car.accelerate();
        car.brake();
        car = new Gm();
        car.setNumofcylinders(4);
        car.setCylindername("strip");
        car.startEngine();
        car.accelerate();
        car.brake();
    }

}




