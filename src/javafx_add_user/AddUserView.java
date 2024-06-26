package javafx_add_user;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import Common.CommonStatic;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddUserView {
	public static void showAddUserScreen()
	{
		URL fxmlload;
		try {
			CommonStatic.stage.setTitle("Add_User");
			fxmlload = Paths.get("C:\\Users\\Shridhar\\eclipse-workspace\\ecommerce-javafx-db\\src\\javafx_add_user\\AddUserScreen.fxml").toUri().toURL();
			Parent actorgroup=FXMLLoader.load(fxmlload);
			Scene scene=new Scene(actorgroup,1300,800);
			CommonStatic.stage.setScene(scene);
			CommonStatic.stage.show();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
