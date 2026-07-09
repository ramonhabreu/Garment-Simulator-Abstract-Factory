public interface GarmentFactory {
    //This interface defines the contract for creating a cohesive product family.
    //It guarantees that any factory will produce matching itmems.
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}