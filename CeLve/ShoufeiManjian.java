package CeLve;

public class ShoufeiManjian implements Shoufei {

    private double Manjian=0;

    public ShoufeiManjian(double manjian,double menkan){

        this.Manjian =manjian;

    }

    @Override

    public double shoufei(double money) {

        if (money<money){

        return money;

        }

        else{

            return money=money-Manjian;

        }

    }
}
