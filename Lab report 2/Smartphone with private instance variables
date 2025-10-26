public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = (storageCapacity >= 0) ? storageCapacity : 0;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    // Method to increase storage
    public void increaseStorage(int extra) {
        if (extra > 0) {
            storageCapacity += extra;
            System.out.println("Storage increased by " + extra + " GB.");
        } else {
            System.out.println("Invalid storage value!");
        }
    }

    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.setBrand("Samsung");
        s.setModel("Galaxy S23");
        s.setStorageCapacity(128);

        System.out.println("Brand: " + s.getBrand());
        System.out.println("Model: " + s.getModel());
        System.out.println("Storage: " + s.getStorageCapacity() + " GB");

        s.increaseStorage(64);
        System.out.println("Updated Storage: " + s.getStorageCapacity() + " GB");
    }
}
