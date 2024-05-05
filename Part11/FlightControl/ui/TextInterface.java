package ui;

import domain.Airplane;
import domain.Flight;
import logic.FlightControlLogic;

import java.util.Scanner;

public class TextInterface {
        private FlightControlLogic logic;
        public TextInterface(FlightControlLogic logic){
            this.logic=logic;
        }

    public void start() {
        while (true) {
            AssetControl();
            FlightControl();
            break;
        }
    }

    public void AssetControl() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an action:\n" +
                               "[1] Add an airplane\n" +
                               "[2] Add a flight\n" +
                               "[x] Exit Airport Asset Control\n" +
                               "> 1");

            String entry = scanner.nextLine();
            if (entry.equals("1")) {
                System.out.print("Give the airplane id:");
                String airId = scanner.nextLine();
                System.out.println("Give the airplane capacity:");
                int airCapacity = Integer.valueOf(scanner.nextLine());
                logic.addAirplane(new Airplane(airId, airCapacity));
            } else if (entry.equals("2")) {
                System.out.print("Give the airplane id:");
                String flightAirId=scanner.nextLine();
                System.out.print("Give the departure airport id:");
                String airportId=scanner.nextLine();
                System.out.print("Give the target airport id:");
                String targetId=scanner.nextLine();
                logic.addFlight(new Flight(flightAirId,airportId,targetId));
            } else if (entry.equals("x")) {
                break;
            } else {
                System.out.println("Invalid command!");
            }
        }
    }

    public void FlightControl() {
        while (true) {
            System.out.println("Choose an action:\n" +
                               "[1] Print airplanes\n" +
                               "[2] Print flights\n" +
                               "[3] Print airplane details\n" +
                               "[x] Quit");

            Scanner scanner = new Scanner(System.in);
            String entry = scanner.nextLine();
            if (entry.equals("1")) {
                logic.printAllAirplanes();
            } else if (entry.equals("2")) {
                logic.printAllFlights();
            } else if (entry.equals("3")) {
                System.out.print("Give the airplane id:");
                String flightId=scanner.nextLine();
                logic.getFlight(flightId);
            } else if (entry.equals("x")) {
                break;
            } else {
                System.out.println("Invalid command!");
            }
        }
    }
}
