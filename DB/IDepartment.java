package DB;

import javax.xml.ws.FaultAction;

public interface IDepartment {

	public FaultAction insert(Department $user);
    public FaultAction getDepartment(id);
}
