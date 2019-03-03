import adidas.AdidasProduct;
import nike.NikeOuterWear;
import nike.NikeProduct;
import nike.NikeShoes;

public class NikeFactory extends AbstractFactory {
    @Override
    AdidasProduct getAdidasProduct(String product) {
        return null;
    }

    @Override
    NikeProduct getNikeProduct(String product) {
        if (product == null) return null;
        if (product.equalsIgnoreCase("NIKE OUTERWEAR")) return new NikeOuterWear();
        if (product.equalsIgnoreCase("NIKE SHOES")) return new NikeShoes();
        return null;
    }
}
