package web.model;


public class Car {

    private int year;
    private String model;
    private String brand;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setModel(String model) {
        this.model = model;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }


}

