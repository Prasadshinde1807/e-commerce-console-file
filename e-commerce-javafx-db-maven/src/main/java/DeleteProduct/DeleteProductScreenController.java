package DeleteProduct;

import java.sql.ResultSet;
import java.sql.SQLException;

import ProductManagement.ProductScreen;
import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class DeleteProductScreenController {
	@FXML
	TextField DeleteProduct;
	@FXML
	Label errorMessage;
	
	public void deleteProduct() throws SQLException
	{
		String deleteQuery="delete from product where Product_name='"+DeleteProduct.getText()+"'";
		DButils.executeQuery(deleteQuery);
		String checkQuery="select * from product where Product_name='"+DeleteProduct.getText()+"'";
		ResultSet deleteResultSet=DButils.executeSelectQuery(checkQuery);
		if(deleteResultSet.next())
		{
			errorMessage.setText("Delete Product Unsuccessfully");
			errorMessage.setTextFill(Color.RED);
		}
		else
		{
			errorMessage.setText("Delete Product Successfully");
			errorMessage.setTextFill(Color.GREEN);
		}
	}
	public void backbutton()
	{
		new ProductScreen().show();
	}

}
