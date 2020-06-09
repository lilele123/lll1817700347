package DB;

public class SqlserverUser implements IUser 
{
    public function insert(User $user)
    {
        echo "往SQL Server中的User表添加一条记录\n";
    }

    public function getUser($id)
    {
        echo "根据id得到SQL Server中User表一条记录\n";
    }
}
