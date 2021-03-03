package EDE07p2vuelo;

/**
 *
 * @author Alejandro Ballesta Sierras
 */
public class Flight {

    private static final int MAXSEATS = 140;

    public int flightNumber = 0;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    public int numberOfSeatsleet;
    private double originalPrice;

    private static int TOTALSEATS = 0;

    String getOrigin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    enum status {
        SUCCESS, ERROR, WARNING, PENDING, COMPLETED
    }

    public Flight() {
    }

    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
    }

    public boolean Bookaseat() {
        if (numberOfSeatsleet > 0) {
            this.numberOfSeatsleet = numberOfSeatsleet - 1;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String one = "Flight" + flightNumber;
        return one;
    }

    
    //getters and setters
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfSeatsleet() {
        return numberOfSeatsleet;
    }

    public void setNumberOfSeatsleet(int numberOfSeatsleet) {
        this.numberOfSeatsleet = numberOfSeatsleet;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public static int getTOTALSEATS() {
        return TOTALSEATS;
    }

    public static void setTOTALSEATS(int TOTALSEATS) {
        Flight.TOTALSEATS = TOTALSEATS;
    }

    
    
}
