package LeiFeng;

//ѧ�׷�Ĵ�ѧ������
public class UndergraduateFactory implements IFactory
{
	public LeiFeng createLeiFeng()
	{
		return new Undergraduate();
	}
}
