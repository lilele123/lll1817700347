package DB;

import java.awt.EventFilter.FilterAction;

import javax.xml.ws.FaultAction;

public class AcessDepartment implements IDepartment 
{
    public FaultAction insert(Department $department)
    {
        String echo = "��Acess Server�е�Department�����һ����¼\n";
    }

    public FilterAction getDepartment($id)
    {
        echo "����id�õ�Acess Server��Department��һ����¼\n";
    }
}