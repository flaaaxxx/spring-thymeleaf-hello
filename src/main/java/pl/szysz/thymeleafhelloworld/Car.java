package pl.szysz.thymeleafhelloworld;

public class Car {

    private String model;
    private String mark;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public Car(String mark, String model) {
        this.model = model;
        this.mark = mark;
    }

    public Car() {
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
