package Build;

//���彨����2
public class ConcreteBuilder2 extends Builder{
    Product product = new Product();
    @Override
    public void BuildPartA() {
    product.partsList.add("����X");

    }

    @Override
    public void BuildPartB() {
        product.partsList.add("����Y");
    }

    @Override
    public Product GetResult() {
        return product;
    }

}
