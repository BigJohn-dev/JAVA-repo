public class PetroPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int petrolQuantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetroPurchase(String stationLocation, String typeOfPetrol, int petrolQuantity, double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.petrolQuantity = petrolQuantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }
    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }
    public String getStationLocation() {
        return stationLocation;
    }
    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }
    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }
    public void setPetrolQuantity(int petrolQuantity) {
        this.petrolQuantity = petrolQuantity;
    }
    public int getPetrolQuantity() {
        return petrolQuantity;
    }
    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }
    public double getPricePerLitre() {
        return pricePerLitre;
    }
    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount() {
        return percentageDiscount;
    }
    public double getPurchasePrice() {
        double result = (pricePerLitre * petrolQuantity) - percentageDiscount;
        return result;
    }
}
