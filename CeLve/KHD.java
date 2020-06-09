package CeLve;

public class KHD {

	 private static double total = 0;



	    public static void main(String[] args) {

	        consume("�����շ�", 1, 1000);

	        consume("��300��100", 1, 1000);

	        consume("��8��", 1, 1000);



	        System.out.println("�ܼ�:" + total);

	    }

	    public static void consume(String type, int num, double price)

	    {

	        Context Context = null;



	        if ("�����շ�".equals(type))

	        {

	            Context = new Context(new ShoufeiNormal());

	        }

	        else if ("��300��100".equals(type))

	        {

	            Context = new Context(new ShoufeiManjian(100, 300));

	        }

	        else if ("��8��".equals(type))

	        {

	            Context = new Context(new ShoufeiDazhe(0.8));

	        }



	        double totalPrices = Context.shoufei(num * price);

	        total += totalPrices;



	        System.out.println("����:" + price + " ����:" + num + "�ϼ�:" + totalPrices);

	    }
}
