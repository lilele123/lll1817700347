package DB;

public class SqlserverUser implements IUser 
{
    public function insert(User $user)
    {
        echo "��SQL Server�е�User�����һ����¼\n";
    }

    public function getUser($id)
    {
        echo "����id�õ�SQL Server��User��һ����¼\n";
    }
}
