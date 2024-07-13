package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.DButils;
import home.homeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class loginScreenController {
	@FXML
	TextField LoginName;

	@FXML
	TextField Password;

	@FXML
	Label errorMessage;

	public void LoginButtonClick() throws SQLException {

		String FirstName = LoginName.getText();
		String password = Password.getText();

		String seleteQuery = "select * from user where First_Name='" + FirstName + "' and Password='" + password+ "' ";
		ResultSet resultset = DButils.executeSelectQuery(seleteQuery);

		if (resultset.next()) {
			errorMessage.setText("Login Success");
			errorMessage.setTextFill(Color.DARKGREEN);

			new homeScreen().show();

		} else {
			errorMessage.setText("Login failed ");
			errorMessage.setTextFill(Color.DARKRED);
		}
	}
}
