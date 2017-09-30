package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class ContentPaneController implements Initializable {

    @FXML
    private Button ClearingButton;
    
    @FXML
    private TextPaneController textPaneController;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	TextArea textArea1 = textPaneController.getTextArea1();
        TextArea textArea2 = textPaneController.getTextArea2();
        
        ClearingButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clearing both windows from text");
        		textArea1.clear();
        		textArea2.clear();	
            }
        });
         
        textArea1.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            	String text1 = textArea1.getText();
        		StringBuilder sb = new StringBuilder(text1);
        		String reversedText = sb.reverse().toString();
        		textArea2.setText(reversedText);
            }
        });
  /*      
        textArea2.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            	String text1 = textArea2.getText();
        		StringBuilder sb = new StringBuilder(text1);
        		String reversedText = sb.reverse().toString();
        		textArea1.setText(reversedText);
            }
        });   */
        
        textArea2.addEventFilter(KeyEvent.KEY_RELEASED, x -> textArea1
                .setText(new StringBuilder(textArea2.getText()).reverse()
                        .toString()));
        
    }
    

}
