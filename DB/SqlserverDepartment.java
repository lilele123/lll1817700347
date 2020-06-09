package DB;

public class SqlserverDepartment implements IDepartment 
{
    public function insert(Department $department)
    {
        echo "往SQL Server中的Department表添加一条记录\n";
    }

    public function getDepartment($id)
    {
        echo "根据id得到SQL Server中Department表一条记录\n";
    }
}
