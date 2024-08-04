package AddUser;

import java.sql.ResultSet;
import java.sql.SQLException;

import UserManagement.UserScreen;
import common.DButils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddUserScreenController {

	@FXML
	TextField FirstName;
	@FXML
	TextField LastName;
	@FXML
	TextField Gender;
	@FXML
	TextField Age;
	@FXML
	TextField Email;
	@FXML
	TextField Password;
	@FXML
	Label errorMessage;
	

	public void addUser() throws SQLException
	{
		String insertQuery="insert into user(First_Name,Last_Name,Gender,Age,Email,Password) values('"+FirstName.getText()+"','"+LastName.getText()+"','"+Gender.getText()+"','"+Age.getText()+"','"+Email.getText()+"','"+Password.getText()+"')";
		String checkQuery="select * from user where First_Name='"+FirstName.getText()+"'";
		ResultSet resultSet=DButils.executeSelectQuery(checkQuery);
		if(resultSet.next())
		{
			errorMessage.setText("User allready exits");
			errorMessage.setTextFill(Color.RED);
		}
		else
		{
			errorMessage.setText("User added successfully");
			errorMessage.setTextFill(Color.GREEN);
			DButils.executeQuery(insertQuery);
		}
	}
	public void backbutton()
	{
		new UserScreen().show();
	}
}

