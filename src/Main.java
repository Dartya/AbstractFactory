import adidas.AdidasProduct;
import nike.NikeProduct;

public class Main {

    public static void main(String[] args) {
        AbstractFactory adidasFactory = FactoryGenerator.getFactory("Adidas");          //Создаем переменную типа AbstractFactory, получаем новый класс путем применения статического метода получитьФабрику. Т.к. на вход подается "Adidas", то и вернется AdidasFactory
        AdidasProduct adidasProduct = adidasFactory.getAdidasProduct("Adidas shoes");   //В зависимости от того, какой продукт нужен, AdidasFactory возвращает запрошенный продукт - объект интерфейса AdidasProduct, в этом случае объект AdidasShoes
        adidasProduct.makeAdidasProduct();                                              //AdidasShoes в свою очередь имплементит AdidasProduct и его метод makeAdidasProduct() - выводит на экран Make Adidas shoes

        AbstractFactory nikeFactory = FactoryGenerator.getFactory("Nike");
        NikeProduct nikeProduct = nikeFactory.getNikeProduct("nike outerwear");
        nikeProduct.makeNikeProduct();
    }
}