public class ProfessionalGarmentFactory implements GarmentFactory{
    //Factory dedicated to creating Professional items.
    @Override
    public Top createTop() { return new ProfessionalTop();}

    @Override
    public Pants createPants() { return new ProfessionalPants();}

    @Override
    public Shoes createShoes() {return new ProfessionalShoes();}

}
