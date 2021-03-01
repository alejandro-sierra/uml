
public class Flight {
    private static final int max_seats = 140;

    public int flightNumber = 0;
    private String origin = "";
    private String destination = "";
    private String departureTime;
    private int capacity;
    public int numberOfSeatsleet;
    private double originalPrice;
    private int i;

    private static int TOTALSEATS;

    enum status {SUCCESS, ERROR, WARNING, PENDING, COMPLETED}

    public Flight () {
    }

    public Flight (int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
    }

    public boolean Bookaseat() {
        if(numberOfSeatsleet > 0) {
        	numberOfSeatsleet = numberOfSeatsleet-1;
        	return true;
        }
        
        
        return false;
    }

    @Override
    public String toString () {
        String one = "Flight"+flightNumber;
        return one;
    } 

}
