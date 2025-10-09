public class PowerOutletDemo {
    public static void main(String[] args) {
        
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();
        
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(charger);

        System.out.println("Plugging in laptop...");
        laptopAdapter.plugIn();
        System.out.println("Plugging in refrigirator...");
        refrigeratorAdapter.plugIn();
        System.out.println("Plugging in smartphone charger...");
        smartphoneAdapter.plugIn();
    }
}