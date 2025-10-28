package ridesharing;

import java.util.Scanner;

abstract class ride {
  abstract int calculateFare(int distance);
  public void rideType() {
    System.out.println("Generic Ride");
  }
}

class AutoRide extends ride {
  public int calculateFare(int distance) {
    int fare = distance * 10;
    return fare; 
  }
}

class CarRide extends ride {
  public int calculateFare(int distance) {
    int fare = distance * 20;
    return fare;
  }

  public void rideType() {
    System.out.println("Car Ride");
  }
}

class BookingApp {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter ride type (auto/car): ");
    String rideType = input.nextLine();

    System.out.println("Enter distance (in km): ");
    int distance = input.nextInt();

    ride ride;
    if (rideType.equals("auto")) {
      ride = new AutoRide();
    } else if (rideType.equals("car")) {
      ride = new CarRide();
    } else {
      System.out.println("Invalid ride type");
      input.close();
      return;
    }

    ride.rideType();
    int fare = ride.calculateFare(distance);
    System.out.println("Total fare for " + distance + " km: " + fare);
  }
}