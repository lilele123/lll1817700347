package Sales;

public class Cash
{
	private double	total			= 0;
	private int		selectedIndex	= 0;

	public void selectFormLoad()
	{
		String[] selectForm = { "�����շ�", "��8��", "��7��", "��5��" };
		selectedIndex = 0;
	}

	public void submit(int num, double price)
	{
		double totalPrices = 0;
		switch (selectedIndex)
		{
			case 0:
				totalPrices = num * price;
				break;
			case 1:
				totalPrices = num * price * 0.8;
				break;
			case 2:
				totalPrices = num * price * 0.7;
				break;
			case 3:
				totalPrices = num * price * 0.5;
				break;
		}
		total += totalPrices;
		System.out.println("����:" + price + " ����:" + num + "�ϼ�:" + totalPrices);
	}

	public double getTotal()
	{
		return total;
	}

	public void setTotal(double total)
	{
		this.total = total;
	}

	public int getSelectedIndex()
	{
		return selectedIndex;
	}

	public void setSelectedIndex(int selectedIndex)
	{
		this.selectedIndex = selectedIndex;
	}
}
