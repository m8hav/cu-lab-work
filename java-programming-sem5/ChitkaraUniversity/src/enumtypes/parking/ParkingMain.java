package enumtypes.parking;

public class ParkingMain {
    private static int vehicleCounter = 500;
    ParkingStatus parkingStatus;
    ParkingType parkingType;

    Sample sample;
    private enum Sample {
        SAMPLE1, SAMPLE2
    }
    public ParkingMain(ParkingType parkingType) {
        this.parkingType = parkingType;
        vehicleCounter++;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public void setParkingStatus(ParkingStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public ParkingStatus getParkingStatus() {
        return parkingStatus;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public static int getVehicleCount() {
        return vehicleCounter;
    }

    public static void main(String[] args) {
        ParkingMain obj = new ParkingMain(ParkingType.PARK_FIRST_AND_PAY_LATER);

        obj.setParkingStatus(ParkingStatus.EMPTY);

        System.out.println(obj.getParkingStatus());
        System.out.println(obj.getParkingType());
        System.out.println(getVehicleCount());
    }
}
