package Build;

import java.util.ArrayList;
import java.util.List;

//�����Ʒ��
public class Product {

	List<String> partsList = new ArrayList<String>();
    public void Add(String part){
        partsList.add(part);

    }
    public void Show(){
        System.out.println("\n��Ʒ  ����----");
        for (String part :partsList){
            System.out.println(part);
        }
    }

}
