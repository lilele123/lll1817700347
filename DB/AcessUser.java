package DB;

public class AcessUser implements IUser 
{
    public function insert(User $user)
    {
        echo "��Acess Server�е�User�����һ����¼\n";
    }

    public function getUser($id)
    {
        echo "����id�õ�Acess Server��User��һ����¼\n";
    }
}
