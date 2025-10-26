public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    // Setters
    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public void setModelName(String model_name) {
        this.model_name = model_name;
    }

    public void setYear(int year) {
        this.year = (year > 0) ? year : 0;
    }

    // Getters
    public String getCompanyName() {
        return company_name;
    }

    public String getModelName() {
        return model_name;
    }

    public int getYear() {
        return year;
    }

    // Only getter for mileage
    public double getMileage() {
        return mileage;
    }

    // Optional: Constructor to set mileage initially
    public Car(double mileage) {
        this.mileage = (mileage >= 0) ? mileage : 0;
    }

    public static void main(String[] args) {
        Car c = new Car(15.5);
        c.setCompanyName("Toyota");
        c.setModelName("Corolla");
        c.setYear(2022);

        System.out.println("Company: " + c.getCompanyName());
        System.out.println("Model: " + c.getModelName());
        System.out.println("Year: " + c.getYear());
        System.out.println("Mileage: " + c.getMileage() + " km/l");
    }
}
