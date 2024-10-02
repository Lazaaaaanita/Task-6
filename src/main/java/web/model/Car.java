package web.model;

public class Car {
    private int id;
    private String carModel;
    private int carSeries;

    public Car() {
    }

    public Car(int id, String carModel, int carSeries){
        this.id=id;
        this.carModel=carModel;
        this.carSeries=carSeries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(int carSeries) {
        this.carSeries = carSeries;
    }
    @Override
    public String toString(){
        return id+" "+carModel+" "+carSeries;
    }
}

