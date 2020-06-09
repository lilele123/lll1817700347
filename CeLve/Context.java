package CeLve;

public class Context {

	ShoufeiNormal shoufei;

    public Context(ShoufeiNormal shoufeiManjian){

        this.shoufei=shoufeiManjian;

    }

    public Context(ShoufeiDazhe shoufeiDazhe) {
		// TODO Auto-generated constructor stub
	}

	public Context(ShoufeiManjian shoufeiManjian) {
		// TODO Auto-generated constructor stub
	}

	public double shoufei(double money){

        return shoufei.shoufei(money);

    }
}
