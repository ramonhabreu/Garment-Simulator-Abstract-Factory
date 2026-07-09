/* The Driver Class
Runs and tests all outfit variations to demonstrate runtime correctness.
@Author Ramon H. Abreu
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== GARMENT SIMULATOR OUTFIT TESTS ===\n");

        // 1. Assemble and test a Professional Outfit
        System.out.println("[Customer requests a Professional Outfit]");
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        GarmentSimulator professionalClient = new GarmentSimulator(professionalFactory);
        professionalClient.testOutfit();
        System.out.println("----------------------------------------");

        // 2. Assemble and test a Casual Outfit
        System.out.println("[Customer requests a Casual Outfit]");
        GarmentFactory casualFactory = new CasualGarmentFactory();
        GarmentSimulator casualClient = new GarmentSimulator(casualFactory);
        casualClient.testOutfit();
        System.out.println("----------------------------------------");

        // 3. Assemble and test a Party Outfit
        System.out.println("[Customer requests a Party Outfit]");
        GarmentFactory partyFactory = new PartyGarmentFactory();
        GarmentSimulator partyClient = new GarmentSimulator(partyFactory);
        partyClient.testOutfit();
        System.out.println("----------------------------------------");
    }
}