public class FactoryGenerator {

    public static AbstractFactory getFactory(String factory){
        if (factory.equalsIgnoreCase("ADIDAS")) return new AdidasFactory();
        if (factory.equalsIgnoreCase("NIKE")) return new NikeFactory();
        return null;
    }
}
