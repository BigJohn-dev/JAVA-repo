
public class PetrolPurchaseTest {
    public static void main(String[] args) {
        PetroPurchase petrol = new PetroPurchase("Lagos", "Fuel", 5, 860.5, 0.02);

        petrol.getStationLocation();
        petrol.getTypeOfPetrol();
        petrol.getPetrolQuantity();
        petrol.getPricePerLitre();
        petrol.getPercentageDiscount();

        System.out.println("The petrol price is " + petrol.getPricePerLitre());
        System.out.println("The litre is " + petrol.getPetrolQuantity());
        System.out.println("The purchase amount is " + petrol.getPurchasePrice());
    }
}
