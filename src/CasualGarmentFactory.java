public class CasualGarmentFactory implements GarmentFactory{
    //Factory dedicated to creating Casual items
    @Override
    public Top createTop() {return new CasualTop();}

    @Override
    public Shoes createShoes() {return new CasualShoes();}

    @Override
    public Pants createPants() {return new CasualPants();}
}
