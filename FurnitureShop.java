public class FurnitureShop
{
    public static void main (String [] args)
    {

        LightWeight lightWeight = new LightWeightFurniture();
        HeavyWeight heavyWeight = new HeavyWeightFurniture();

        Furniture Chair = new Furniture("Chair", 350.00, 5);
        Furniture ShoeBench = new Furniture("ShoeBench", 600.00, 9);
        Furniture SmallTable = new Furniture("SmallTable", 599.0, 2);
        Furniture CoffeeTable = new Furniture("CoffeeTable", 699.0, 7);
    
        System.out.println("LIGHT WEIGHT FURNITURE");
        System.out.println("Shipping Rate: ₱100.00\n ");

        System.out.println("Furniture Type: " + Chair.getFurniture() +
                           "\nItem Price: " + Chair.getCost() +
                           "\nShipping Fee: ₱500.00" +
                           "\nTOTAL COST: ₱" + Chair.accept(lightWeight, Chair.getCost()));

        System.out.println("\nFurniture Type: " + ShoeBench.getFurniture() +
                           "\nItem Price: " + ShoeBench.getCost() +
                           "\nShipping Fee: ₱500.00" +
                           "\nTOTAL COST: ₱" + ShoeBench.accept(lightWeight, ShoeBench.getCost()));

        System.out.println("\nFurniture Type: " + SmallTable.getFurniture() +
                           "\nItem Price: " + SmallTable.getCost() +
                           "\nShipping Fee: ₱500.00" +
                           "\nTOTAL COST: ₱" + SmallTable.accept(lightWeight, SmallTable.getCost()));

        System.out.println("\nFurniture Type: " + CoffeeTable.getFurniture() +
                           "\nItem Price: " + CoffeeTable.getCost() +
                           "\nShipping Fee: ₱500.00" +
                           "\nTOTAL COST: ₱" + CoffeeTable.accept(lightWeight, CoffeeTable.getCost()));


        Furniture Cabinet = new Furniture("Cabinet", 4500, 10);
        Furniture Sofa = new Furniture("Sofa", 15000.0, 8);
        Furniture BookShelf = new Furniture("BookShelf", 6000, 14);
        Furniture Table = new Furniture("Table", 1500, 4);

    

        System.out.println("HEAVY WEIGHT FURNITURE");
        System.out.println("Shipping Rate: ₱200.00 per Kilometer\n");

        System.out.println("Furniture Type: " + Cabinet.getFurniture() +
                           "\nItem Price: " + Cabinet.getCost() +
                           "\nDistance: " + Cabinet.getDistance() + "km" +
                           "\nShipping Fee: ₱200.00" +
                           "\nTotal Cost: ₱" + Cabinet.accept(heavyWeight, Cabinet.getCost(), Cabinet.getDistance()));

        System.out.println("\nFurniture Type: " + Sofa.getFurniture() +
                           "\nItem Price: " + Sofa.getCost() +
                           "\nDistance: " + Sofa.getDistance() + "km" +
                           "\nShipping Fee: ₱200.00" +
                           "\nTotal Cost: ₱" + Sofa.accept(heavyWeight, Sofa.getCost(), Sofa.getDistance()));

        System.out.println("\nFurniture Type: " + BookShelf.getFurniture() +
                           "\nItem Price: " + BookShelf.getCost() +
                           "\nDistance: " + BookShelf.getDistance() + "km" +
                           "\nShipping Fee: ₱200.00" +
                           "\nTotal Cost: ₱" + BookShelf.accept(heavyWeight, BookShelf.getCost(), BookShelf.getDistance()));

        System.out.println("\nFurniture Type: " + Table.getFurniture() +
                           "\nItem Price: " + Table.getCost() +
                           "\nDistance: " + Table.getDistance() + "km" +
                           "\nShipping Fee: ₱200.00" +
                           "\nTotal Cost: ₱" + Table.accept(heavyWeight, Table.getCost(), Table.getDistance()));

    }
}