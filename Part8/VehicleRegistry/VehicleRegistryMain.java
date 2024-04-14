public class VehicleRegistryMain {
    public static void main(String[] args) {
        // Create a VehicleRegistry
        VehicleRegistry registry = new VehicleRegistry();

        // Create LicensePlate objects
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");

        // Add license plates to the registry
        registry.add(li1, "Arto");
        registry.add(li2, "Jürgen");

        // Retrieve owner of a license plate
        System.out.println("Owner of " + li1 + ": " + registry.get(li1));
        System.out.println("Owner of " + li2 + ": " + registry.get(li2));

        // Remove a license plate
//        boolean removed = registry.remove(li1);
//        System.out.println("Removed " + li1 + ": " + removed);

        // Attempt to retrieve owner of the removed license plate
        System.out.println("Owner of " + li1 + ": " + registry.get(li1));

        registry.printLicensePlates();
        registry.printOwners();
    }
}