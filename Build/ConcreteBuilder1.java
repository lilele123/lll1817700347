package Build;

//���彨����
public class ConcreteBuilder1 extends Builder{
    Product product = new Product();
    @Override
    public void BuildPartA() {
    product.partsList.add("����A");

    }

    @Override
    public void BuildPartB() {
        product.partsList.add("����B");
    }

    @Override
    public Product GetResult() {
        return product;
    }

}
