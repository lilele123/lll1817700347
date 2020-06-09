package Clone;

import java.util.ArrayList;

/*
 * �鱾���ͣ����ݵ���ConcretePrototype��ɫ����Cloneable����Prototype��ɫ
 */
public class Book implements Cloneable {

    private String title;// ����
    private ArrayList<String> image = new ArrayList<String>();// ͼƬ���б�

    public Book() {
        super();
    }

    /**
     * ��д��������
     */
    @Override
    protected Book clone()  {
        try {
            Book book = (Book) super.clone();
            return book;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<String> getImage() {
        return image;
    }

    public void addImage(String img) {
        this.image.add(img);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ӡ����
     */
    public void showBook() {
        System.out.println("----------------------Start----------------------");

        System.out.println("title��" + title);
        for (String img : image) {
            System.out.println("image name:" + img);
        }

        System.out.println("----------------------End----------------------");
    }
}

