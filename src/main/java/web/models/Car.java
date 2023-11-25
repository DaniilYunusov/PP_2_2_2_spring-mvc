package web.models;

public class Car {
    private String model;
    private int series;
    private int yearAssembly;

    public Car() {

    }

    public Car(String model, int series, int yearAssembly) {
        this.model = model;
        this.series = series;
        this.yearAssembly = yearAssembly;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearAssembly() {
        return yearAssembly;
    }

    public void setYearAssembly(int yearAssembly) {
        this.yearAssembly = yearAssembly;
    }
}
