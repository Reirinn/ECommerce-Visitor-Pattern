public interface Weight
{
    public double accept(LightWeight lightweight, double weight);
    public double accept(HeavyWeight heavyweight, double weight, double distance);
}