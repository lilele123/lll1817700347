package DB;

public class SqlserverDepartment implements IDepartment 
{
    public function insert(Department $department)
    {
        echo "��SQL Server�е�Department�����һ����¼\n";
    }

    public function getDepartment($id)
    {
        echo "����id�õ�SQL Server��Department��һ����¼\n";
    }
}
