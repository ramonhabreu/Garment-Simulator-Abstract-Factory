public class PartyGarmentFactory implements GarmentFactory{
    //Factory dedicated to creating Party Itemts
    @Override
    public Top createTop() {return new PartyTop();}

    @Override
    public Pants createPants() {return new PartyPants();}

    @Override
    public Shoes createShoes() {return new PartyShoes();}


}
