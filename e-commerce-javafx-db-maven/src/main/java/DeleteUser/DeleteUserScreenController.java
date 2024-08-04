package DeleteUser;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import UserManagement.UserScreen;

public class DeleteUserScreenController {
	@FXML
	 TextField DeleteUser;
	 @FXML
	 Label errorMessage;
	
	public void deleteUser() throws SQLException
	{
		String deleteQuery="delete from user where First_Name='"+DeleteUser.getText()+"'";
		DButils.executeQuery(deleteQuery);
		String checkQuery="select * from user where First_Name='"+DeleteUser.getText()+"'";
		ResultSet checkResultSet=DButils.executeSelectQuery(checkQuery);
		if(checkResultSet.next())
		{
			errorMessage.setText("Delete user unsuccesfully");
			errorMessage.setTextFill(Color.RED);
		}
		else
		{
			errorMessage.setText("Delete user Succesfully");
			errorMessage.setTextFill(Color.GREEN);
		}
	}
	 
	 public void backbutton()
	{
		 new UserScreen().show();
	}

}