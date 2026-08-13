import java.util.Scanner;

public class RideSharingPlatform {

    static class Driver {
        String name;

        Driver(String name) {
            this.name = name;
        }
    }

    static class Rider {
        String name;

        Rider(String name) {
            this.name = name;
        }
    }

    static class Vehicle {
        double calculateFare(double distance) {
            return 0;
        }
    }

    static class Bike extends Vehicle {
        double calculateFare(double distance) {
            return distance * 5;
        }
    }

    static class Auto extends Vehicle {
        double calculateFare(double distance) {
            return distance * 12;
        }
    }

    static class Cab extends Vehicle {
        double calculateFare(double distance) {
            return distance * 12;
        }
    }

    static class Trip {
        Vehicle vehicle;

        Trip(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        double getFare(double distance) throws Exception {
            if (distance <= 0) {
                throw new Exception("Invalid distance");
            }

            return vehicle.calculateFare(distance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double distance = sc.nextDouble();

            Vehicle vehicle;

            if (type.equals("Bike")) {
                vehicle = new Bike();
            } else if (type.equals("Auto")) {
                vehicle = new Auto();
            } else if (type.equals("Cab")) {
                vehicle = new Cab();
            } else {
                System.out.println("Invalid booking");
                continue;
            }

            Trip trip = new Trip(vehicle);

            try {
                double fare = trip.getFare(distance);
                System.out.println((int) fare);
            } catch (Exception e) {
                System.out.println("Invalid booking");
            }
        }

        sc.close();
    }
}