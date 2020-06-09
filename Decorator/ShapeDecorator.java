package Decorator;

/**
 * Shape�ӿڵĳ���װ����
 * @author lmb
 *
 */
public abstract class ShapeDecorator implements Shape{

    public Shape decoratedShape;

    //ShapeDecorator����Ҫ���췽������һ����װ�εĶ���
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();      
    }

}
