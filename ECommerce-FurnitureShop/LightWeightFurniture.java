import java.util.*;
public class LightWeightFurniture implements LightWeight
{
    private static Map<String, Double> lightweightMap = new HashMap<>();

    static{
        lightweightMap.put("Table", 100.0);
        lightweightMap.put("Chair", 100.0);
        lightweightMap.put("Small Book Case", 100.0);
        lightweightMap.put("Foldable Desk", 100.0);
    }
    @Override
    public double calculateLightWeight(String furniture, double price)
    {
        double lightWeightAmount = lightweightMap.getOrDefault(furniture, 0.0);
        return lightWeightAmount + price;
    }
}