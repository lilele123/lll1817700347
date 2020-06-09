package DB;

import java.awt.EventFilter.FilterAction;

import javax.xml.ws.FaultAction;

public class AcessDepartment implements IDepartment 
{
    public FaultAction insert(Department $department)
    {
        String echo = "往Acess Server中的Department表添加一条记录\n";
    }

    public FilterAction getDepartment($id)
    {
        echo "根据id得到Acess Server中Department表一条记录\n";
    }
}