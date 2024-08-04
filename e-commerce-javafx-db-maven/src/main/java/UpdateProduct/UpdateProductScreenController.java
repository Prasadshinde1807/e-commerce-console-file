package UpdateProduct;

import java.sql.ResultSet;
import java.sql.SQLException;

import ProductManagement.ProductScreen;
import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class UpdateProductScreenController {
	@FXML
	TextField productnametoupdate;
	@FXML
	Label errormessage1;
	public void updateProductExecute() throws SQLException
	{
		String checkQuery="select * from product where ProductName='"+productnametoupdate.getText()+"'";
		ResultSet updateResultSet=DButils.executeSelectQuery(checkQuery);
		if(updateResultSet.next())
		{
			errormessage1.setText("Product Found to update..!");
			errormessage1.setTextFill(Color.GREEN);
		}
		else
		{
			errormessage1.setText("Product Not Found..!");
			errormessage1.setTextFill(Color.RED);
		}
	}
	public void backButton()
	{
		new ProductScreen().show();
	}
}
