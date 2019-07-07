package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;


public class Main_tescik extends Application {
	private static Stage primaryStage = null;
	private ObservableList<Employee> employeeData = FXCollections.observableArrayList();
	@Override
	public void start(Stage primaryStage) {
		try {
			Main_tescik.primaryStage = primaryStage;
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main_tescik.class.getResource("RootLayout.fxml"));
			BorderPane rootLayout = (BorderPane) loader.load();
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Stage getPrimaryStage() {
		return primaryStage;
	}
    public ObservableList<Employee> getEmployeeData() {
        return employeeData;
    }
    public boolean showEmployeeEditDialog(Employee person) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main_tescik.class.getResource("EmployeeEditDialog.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Employee");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);


            EmployeeEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setEmployee(person);


            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void showSecondWindow() {
    	 try {
    	 // Load the fxml file and create a new stage for the popup dialog.
    	 FXMLLoader loader = new FXMLLoader();
    	 loader.setLocation(Main_tescik.class.getResource("Demo.fxml"));
    	 BorderPane page = (BorderPane) loader.load();
    	 // Create the dialog Stage.
    	 Stage dialogStage = new Stage();
    	 dialogStage.setTitle("Second Window");
    	 dialogStage.initModality(Modality.WINDOW_MODAL);
    	 dialogStage.initOwner(getPrimaryStage());
    	 Scene scene = new Scene(page);
    	 dialogStage.setScene(scene);
 
    	 dialogStage.showAndWait();
    	 } catch (Exception e) {
    	 e.printStackTrace();
    	 }
    	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
