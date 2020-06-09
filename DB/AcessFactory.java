package DB;

import java.nio.file.DirectoryStream.Filter;
import java.util.function.Function;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public class AcessFactory implements IFactory{
	public AcessUser CreateUser(){
		return new AcessUser();
		}

	public Function CreateDepartment(){
		return new AcessDepartment();
		}
}
