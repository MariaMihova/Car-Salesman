package Advanced.Exersice.CarSalesman;

public class Engine {

    //model, power, displacement and efficiency
    private String model;
    private String power;
    private int displacement;
    private String efficiency;

    public Engine(String model, String  power){
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }

    public Engine(String model, String  power, int displacement){
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, String  power, String efficiency){
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, String  power, int displacement, String efficiency){
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
    public Engine(){

    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
