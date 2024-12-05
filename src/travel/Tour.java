package travel;

public class Tour {
    private  int tourId;
    private String tourName;
    private double tourPrice;
    private boolean isReserved;
//    private TourPacge tourPacge;


    public Tour(int tourId, String tourName, double tourPrice, boolean isReserved) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.tourPrice = tourPrice;
        this.isReserved = isReserved;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getTourPrice() {
        return tourPrice;
    }

    public void setTourPrice(double tourPrice) {
        this.tourPrice = tourPrice;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

}
