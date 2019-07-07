package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class myControler {

	@FXML
	private Button button;

	@FXML
	void handleButton(ActionEvent event) {
		try {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EmployeeOverview.fxml"));
		Parent root1 = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));  
		stage.show();
		} catch (Exception e) {
			System.out.println("zle");
		}
	}

}
