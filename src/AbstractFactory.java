import adidas.AdidasProduct;
import nike.NikeProduct;

public abstract class AbstractFactory {
    abstract AdidasProduct getAdidasProduct(String product);
    abstract NikeProduct getNikeProduct(String product);
}
