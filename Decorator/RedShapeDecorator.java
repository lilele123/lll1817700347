package Decorator;

//Shape�ӿڵľ���װ���࣬�̳��Գ���װ����SHapeDecorator
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator decoratedShape;

    //���췽������һ����װ�ε�Shape����
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

   @Override
   public void draw() {
      decoratedShape.draw();//����һ��ͼ��           
      setRedBorder(decoratedShape);//Ϊ���ͼ�μ�һ����ɫ�ı߿�
   }

    //Shape�ӿڳ���װ���������RedShapeDecorator���е�һ��װ��Shapeʵ�����װ�η���
    private void setRedBorder(Shape decoratedShape){
          System.out.println("Border Color: Red");
    }

}
