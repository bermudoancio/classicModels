package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField txt_usuario;
	
	@FXML
	private PasswordField txt_password;
	
	@FXML
	public void checkLogin(ActionEvent e) {
		String usuario = txt_usuario.getText();
		System.out.println(usuario);
	}
}
