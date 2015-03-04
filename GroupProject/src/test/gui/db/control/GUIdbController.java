package test.gui.db.control;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import test.gui.db.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class GUIdbController implements Initializable{
	
	@FXML private Pane pane;
	@FXML private Button btnRetrieve, dbSubmit;
	@FXML private TextField id, name, surname, address, purchases;
	
	ArrayList<String> al = new ArrayList<String>();
	
	DatabaseConnection dbc = new DatabaseConnection();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Application Started");
		
	}
	
	@FXML private void insertDatabase1(ActionEvent event){
		
		String sId, s_name, s_surname, s_address, s_purchases;
		
		sId = id.getText();
		id.clear();
		int s_id = Integer.parseInt(sId);
		s_name = name.getText();
		name.clear();
		s_surname = surname.getText();
		surname.clear();
		s_address = address.getText();
		address.clear();
		s_purchases = purchases.getText();
		purchases.clear();
        
		dbc.insertDatabase1(s_id, s_name, s_surname, s_address, s_purchases);
		
	}
	
	@FXML private void retrieveItem(){
		al = dbc.retrieveDatabase1();
		
		for(int i = 0; i < al.size(); i++){
			Button b = new Button(al.get(i));
			pane.getChildren().addAll(b);
		}
		btnRetrieve.setDisable(true);
	}
	
	/*@FXML private void retrieveItem(){
		Button b = new Button();
		b.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		//pane.getOnMouseClicked().toString().
	}*/
}
