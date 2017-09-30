package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class SampleController implements Initializable{

    @FXML
    private Button ClearingButton;

    @FXML
    private TextArea TekstArea1;

    @FXML
    private TextArea TekstArea2;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ClearingButton.addEventFilter(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clearing both windows from text");
        		TekstArea1.clear();
        		TekstArea2.clear();	
            }
        });
         
        TekstArea1.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            	String text1 = TekstArea1.getText();
        		StringBuilder sb = new StringBuilder(text1);
        		String reversedText = sb.reverse().toString();
        		TekstArea2.setText(reversedText);
            }
        });
        
        TekstArea2.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            	String text1 = TekstArea2.getText();
        		StringBuilder sb = new StringBuilder(text1);
        		String reversedText = sb.reverse().toString();
        		TekstArea1.setText(reversedText);
            }
        });
    }
    
/*
    @Override
    public void initialize(URL location, ResourceBundle resources) {  
    }
    */
/*	
	@FXML
    void ClearWindows(ActionEvent event) {
		System.out.println("Clearing both windows from text");
		TekstArea1.clear();
		TekstArea2.clear();		
    }
	
	@FXML
    void ReversedText1(KeyEvent event) {
		String text1 = TekstArea1.getText();
		StringBuilder sb = new StringBuilder(text1);
		String reversedText = sb.reverse().toString();
		TekstArea2.setText(reversedText);
    }
	
	@FXML
    void ReversedText2(KeyEvent event) {
		String text = TekstArea2.getText();
		StringBuilder sb = new StringBuilder(text);
		String reversedText = sb.reverse().toString();
		TekstArea1.setText(reversedText);
    }
*/
}

