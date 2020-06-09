package DB;

import java.nio.file.DirectoryStream.Filter;

import javax.xml.ws.FaultAction;

public class DataBase {

	const DB = 'Sqlserver';
    // private $db = 'Access';

    public static FaultAction CreateUser()
    {   
        $class = static::DB.'User';
        return new $class();
    }

    public static Filter CreateDepartment()
    {
        $class = static::DB.'Department';
        return new $class();
    }
}
