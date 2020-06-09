package DB;

import java.util.function.Function;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public interface IFactory {

	public FormAction CreateUser();
	public Function CreateDepartment();
}
