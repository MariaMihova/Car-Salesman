package Advanced.Exersice.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Engine> engines = new LinkedHashSet<>();
        Set<CarSalesman> carSalesmen = new LinkedHashSet<>();
        int numberOfLines = Integer.parseInt(scanner.nextLine());
         while (numberOfLines-- > 0){
             String[] enginesInfo = scanner.nextLine().split("\\s+");
             //"<Model> <Power> <Displacement> <Efficiency>
             String model = enginesInfo[0];
             String power = enginesInfo[1];
             if(enginesInfo.length == 2){
                 Engine engine = new Engine(model, power);
                 engines.add(engine);
             }else if(enginesInfo.length == 3){
                 try {
                     int displacement = Integer.parseInt(enginesInfo[2]);
                     Engine engine = new Engine(model, power, displacement);
                     engines.add(engine);
                 }catch (NumberFormatException e){
                     String efficiency = enginesInfo[2];
                     Engine engine = new Engine(model, power, efficiency);
                     engines.add(engine);
                 }
             } else{
                 int displacement = Integer.parseInt(enginesInfo[2]);
                 String efficiency = enginesInfo[3];
                 Engine engine = new Engine(model, power, displacement, efficiency);
                 engines.add(engine);
             }
         }
         numberOfLines = Integer.parseInt(scanner.nextLine());

         while (numberOfLines-- >0){
             String[] carInfo = scanner.nextLine().split("\\s+");
             //"<Model> <Engine> <Weight> <Color>

             String model = carInfo[0];
             String engine = carInfo[1];
             if(carInfo.length == 2){
                 Engine currentE = getCurrentE(engines, engine);
                 CarSalesman carSalesman = new CarSalesman(model, currentE);
                 carSalesmen.add(carSalesman);
             }else if(carInfo.length == 3){
                 Engine currentE = getCurrentE(engines, engine);
                 try {
                     int weight = Integer.parseInt(carInfo[2]);
                     CarSalesman carSalesman = new CarSalesman(model, currentE, weight);
                     carSalesmen.add(carSalesman);
                 }catch (NumberFormatException e){
                     String color = carInfo[2];
                     CarSalesman carSalesman = new CarSalesman(model, currentE, color);
                     carSalesmen.add(carSalesman);
                 }
             }else {
                 Engine currentE = getCurrentE(engines, engine);
                 int weight = Integer.parseInt(carInfo[2]);
                 String color = carInfo[3];
                 CarSalesman carSalesman = new CarSalesman(model, currentE, weight, color);
                 carSalesmen.add(carSalesman);
             }

         }

        for (CarSalesman carSalesman : carSalesmen) {
            System.out.println(carSalesman.toString());

        }
    }

    private static Engine getCurrentE(Set<Engine> engines, String engine) {
        Engine currentE = new Engine();
        for (Engine engine1 : engines) {
            if(engine1.getModel().equals(engine)){
                currentE = engine1;
                break;
            }
        }
        return currentE;
    }
}
