package Clone;

public class Client {

    public static void main(String[] args) {
        // 1.�����鱾����
        Book book1 = new Book();        
        // 2.�༭�鱾�����ͼƬ
        book1.setTitle("��1");
        book1.addImage("ͼ1");
        book1.showBook();

        // ��ԭ���ĵ�Ϊԭ�ͣ�����һ�ݸ���
        Book book2 = (Book) book1.clone();
        book2.showBook();
        // �޸�ͼ�鸱��������Ӱ��ԭʼ�鱾
        book2.setTitle("��2");
        book2.addImage("ͼ2");
        book2.showBook();

        // �ٴδ�ӡԭʼ�鱾
        book1.showBook();
    }
}

