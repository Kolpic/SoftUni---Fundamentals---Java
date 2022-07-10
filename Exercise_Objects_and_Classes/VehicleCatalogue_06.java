package Exercise_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_06 {
    static class Vehicles{
        String type;
        String model;
        String color;
        int horsePower;

        public Vehicles(String type,String model,String color,int horsePower){
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return this.type;
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return this.horsePower;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicles> listOfVehicles = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] commandArr = command.split(" ");
            String vehicleType = commandArr[0];
            String vehicleModel = commandArr[1];
            String vehicleColor = commandArr[2];
            int vehicleHorsePower = Integer.parseInt(commandArr[3]);

            Vehicles currentVehicle = new Vehicles(vehicleType,vehicleModel,vehicleColor,vehicleHorsePower);
            listOfVehicles.add(currentVehicle);

            command = scanner.nextLine();
        }
        String secondCommand = scanner.nextLine();

        int counterForCars = 0;
        int counterForTrucks = 0;
        int horsePowerCars = 0;
        int horsePowerTruck = 0;


        while (!secondCommand.equals("Close the Catalogue")){
                for(Vehicles vehicle : listOfVehicles) {
                    if (vehicle.getType().equals("car")) {
                        horsePowerCars += vehicle.getHorsePower();
                        counterForCars++;
                    } else {
                        horsePowerTruck += vehicle.getHorsePower();
                        counterForTrucks++;
                    }
                    if (vehicle.getModel().equals(secondCommand)) {

                        String formattedType = "";
                        if (vehicle.type.equals("car")) {
                            formattedType = "Car";
                        } else if (vehicle.type.equals("truck")) {
                            formattedType = "Truck";
                        }

                        System.out.printf("Type: %s%n" +
                                        "Model: %s%n" +
                                        "Color: %s%n" +
                                        "Horsepower: %d%n",
                                formattedType, vehicle.getModel(),
                                vehicle.getColor(), vehicle.getHorsePower());
//
                    }
                }
            secondCommand = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",getAverageHP(listOfVehicles, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.",getAverageHP(listOfVehicles, "trucks"));
    }
    private static double getAverageHP(List<Vehicles> vehiclesList, String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("cars")) {
            for (Vehicles vehicle : vehiclesList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
        } else if (type.equals("trucks")) {
            for (Vehicles vehicle : vehiclesList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
        }

        if (sum == 0) {
            return 0;
        }
        return sum / count;
}
}
