import java.util.*;


public class HeavyWeightFurniture implements HeavyWeight
{
    private static Map<String, Double> heavyweightMap = new HashMap<>();

    static
    {
        heavyweightMap.put("Sofa", 200.0);
        heavyweightMap.put("Cabinet", 200.0);
        heavyweightMap.put("Bed", 200.0);
        heavyweightMap.put("Mattress", 200.0);
    }

    @Override
    public double calculateHeavyWeight(String furniture, double price, double distance)
    {
        double heavyWeightAmount = distance * 200.0;
        return heavyWeightAmount + price;
    }
}