package controller;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TextPaneController {

    @FXML
    private TextArea TextArea1;

    @FXML
    private TextArea TextArea2;

	public TextArea getTextArea1() {
		return TextArea1;
	}

	public void setTekstArea1(TextArea textArea1) {
		TextArea1 = textArea1;
	}

	public TextArea getTextArea2() {
		return TextArea2;
	}

	public void setTekstArea2(TextArea textArea2) {
		TextArea2 = textArea2;
	}

}
