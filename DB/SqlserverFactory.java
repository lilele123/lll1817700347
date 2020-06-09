package DB;

import java.util.function.Function;

public class SqlserverFactory implements IFactory
{
	public Function CreateUser(){
		return new SqlserverUser();
		}
	public function CreateDepartment(){
		return new SqlserverDepartment();
	}
}
