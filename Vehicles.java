class Vehicles {
    String brand;
    String model;
    public Vehicles(){}
    public Vehicles(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public void displayInfo(){
        System.out.println("Vehicle Brand: " + brand + "\nVehicle Model: " + model);
    }
}

class Cars extends Vehicles{
    int numOfDoors;
    public Cars(String brand, String model, int numOfDoors){
        super(brand, model);
        this.numOfDoors = numOfDoors;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numOfDoors);
        System.out.println("-----------------------------------------------------------\n");
    }
}

class MotorCycle extends Vehicles{
    boolean hasCarrier;
    public MotorCycle(String brand, String model, boolean hasCarrier){
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("HasCarriers: ");
        if (hasCarrier){
            System.out.print("Yes\n");
        }else {
            System.out.print("No\n");
        }
        System.out.println("-----------------------------------------------------------\n");
    }
}

class Info{
    public static void main(String[] args){
        Vehicles car = new Cars("Tata", "Safari", 4);
        Vehicles bike = new MotorCycle("Royal Enfield", "Himalayan", false);
        car.displayInfo();
        bike.displayInfo();
    }
}