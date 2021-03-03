package EDE07p2vuelo;
/**
 *
 * @author Alejandro Ballesta Sierras
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

    List<Flight> listOfflights;

    public Manager() {

        listOfflights = new ArrayList<Flight>();

    }

    public void displayAvailableFlights(String origin, String destination) {
        int size, seats;
        boolean flag = true;
        String o, d;
        size = listOfflights.size();
        for (int i = 0; i < size; i++) {
        o = listOfflights.get(i).getOrigin();
        d = listOfflights.get(i).getDestination();
        seats = listOfflights.get(i).getNumberOfSeatsleet();
        if ((o.equals(origin) == true) && (d.equals(destination) == true)
                && seats > 0) {
                if (flag) {
                System.out.println("List of available flights:");
                flag = false;
                }
            }
        }
        if (flag == true) {
        }
    }

    public void bookSeat(int flightNumber, Passenger p) {
        double price;
        boolean flag = false;
        int index = 0, seats, size = listOfflights.size();
        for (int i = 0; i < size; i++)
        {if (listOfflights.get(i).getFlightNumber() == flightNumber)
        {
                flag = true;
                index = i;
                break;
        }
        }

        seats = listOfflights.get(index).getNumberOfSeatsleet();
        if (flag == true && (seats > 0))
            listOfflights.get(index).Bookaseat();
        else {
        if (flag == true && seats == 0)
            System.out.println("The Flight " + flightNumber + " is full you cannot book a ticket for this flight");
        else if (flag == false)
            System.out.println("The Flight " + flightNumber + " cdoes not exist");
        }
    }

    public static void main(String[] args) {
        Manager M = new Manager();
        Flight F;
        Passenger P;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String Input, origin;
        int FN;
        boolean flag = false;

        while (flag != true) {
            System.out.println("Enter c or d if you would like to display all flights (displayAvailableFlights method)");
            System.out.println("Enter t if you would like to terminate the program");
            Input = scan1.nextLine();
            switch (Input) {case "c":case "d":
                    System.out.println("Enter flight origin");
                    origin = scan1.nextLine();
                    break;
            case "g":
                    System.out.println("Enter Flight number");
                    FN = scan2.nextInt();
                    break;
            case "b":
                    break;
                    case "t":
                        flag = true;
                        System.out.println("Program is terminated");
                        break;
                            default:
                                System.out.println("You entered an invalid option");
                                break;
            }

        }

    }
}

