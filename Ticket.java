public class Ticket {
    public String details;
    public String username;
    public int seatNumber;

    public Ticket (String details, String username, int seatNumber) {
        this.details = details;
        this.username = username;
        this.seatNumber = seatNumber;
    }

    public String getDetails () {
        return details;
    }

    public void setDetails (String details) {
        this.details = details;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public int getSeatNumber () {
        return seatNumber;
    }

    public void setSeatNumber (int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString () {
        return "Ticket{" +
                "details='" + details + '\'' +
                ", username='" + username + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
