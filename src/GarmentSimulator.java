/*
The Client Class
This simulatori s fully edecoupled from the concrete product variations.
It relies entirely on abstract interfaces.
This design complies with the Open/Closed Principle: new collections can
be added without modifying this underlying core simulation logic.
 */

public class GarmentSimulator {
    private final Top top;
    private final Pants pants;
    private final Shoes shoes;

    //The factory passed here determines the concrete variation family.
    public GarmentSimulator(GarmentFactory factory) {
        this.top = factory.createTop();
        this.pants = factory.createPants();
        this.shoes = factory.createShoes();
    }

    //Displays the constructed and matching uniform ensemble
    public void testOutfit() {
        top.wear();
        pants.wear();
        shoes.wear();
    }
}
