package Proxy;

//Proxy�࣬����һ������ʹ�ô�����Է���ʵ�壬���ṩһ����Subject�Ľӿ���ͬ�Ľӿڣ������Ĵ�����������ʵ�塣
public class Proxy1 implements Subject
{
	RealSubject	realSubject;

	public void request()
	{
		if (null == realSubject)
		{
			realSubject = new RealSubject();
		}
		realSubject.request();
	}
}
