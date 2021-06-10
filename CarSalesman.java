package Advanced.Exersice.CarSalesman;

public class CarSalesman {
    //model, engine, weight and color.
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public CarSalesman(String model, Engine engine){
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public CarSalesman(String model, Engine engine, int weight){
        this(model, engine);
        this.weight = weight;
    }

    public CarSalesman(String model, Engine engine, String color){
        this(model, engine);
        this.color = color;
    }

    public CarSalesman(String model, Engine engine, int weight, String color){
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }
    //<CarModel>://
    //<EngineModel>://
    //Power: <EnginePower>//
    //Displacement: <EngineDisplacement>//
    //Efficiency: <EngineEfficiency>//
    //Weight: <CarWeight>
    //Color: <CarColor>

    @Override
    public String toString (){
        if(weight == 0 && engine.getDisplacement() == 0) {
         return    String.format("%s:%n%s:%nPower: %s%nDisplacement: n/a%nEfficiency: %s%nWeight: n/a%nColor: %s",
                    model, engine.getModel(), engine.getPower(), engine.getEfficiency(), color);
        } else if(weight == 0 && engine.getDisplacement() != 0){
            return String.format("%s:%n%s:%nPower: %s%nDisplacement: %d%nEfficiency: %s%nWeight: n/a%nColor: %s",
                    model, engine.getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), color);
        }else if(weight != 0 && engine.getDisplacement() == 0){
            return String.format("%s:%n%s:%nPower: %s%nDisplacement: n/a%nEfficiency: %s%nWeight: %d%nColor: %s",
                    model, engine.getModel(), engine.getPower(), engine.getEfficiency(), weight, color);
        }
        return String.format("%s:%n%s:%nPower: %s%nDisplacement: %d%nEfficiency: %s%nWeight: %d%nColor: %s",
                model, engine.getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), weight, color);
    }
}
