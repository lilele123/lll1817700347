package DB;

public class AcessUser implements IUser 
{
    public function insert(User $user)
    {
        echo "往Acess Server中的User表添加一条记录\n";
    }

    public function getUser($id)
    {
        echo "根据id得到Acess Server中User表一条记录\n";
    }
}
