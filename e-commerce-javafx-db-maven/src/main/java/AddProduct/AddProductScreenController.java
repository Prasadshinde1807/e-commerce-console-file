
package AddProduct;

import java.sql.ResultSet;
import java.sql.SQLException;

import ProductManagement.ProductScreen;
import common.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class AddProductScreenController {
	@FXML
	TextField productname;
	@FXML
	TextField productquantity;
	@FXML
	TextField productprice;
	@FXML
	Label errorMessage;
	
	public void addProduct() throws SQLException
	{
		String insertQuery="insert into product(Product_name,Product_quantity,Product_price) values('"+productname.getText()+"','"+productquantity.getText()+"','"+productprice.getText()+"')";
		String checkQuery="select * from product where Product_name='"+productname.getText()+"'";
		ResultSet resultSet=DButils.executeSelectQuery(checkQuery);
		if(resultSet.next())
		{
			errorMessage.setText("Product allready exits");
			errorMessage.setTextFill(Color.RED);
		}
		else
		{
			errorMessage.setText("Product added successfully");
			errorMessage.setTextFill(Color.GREEN);
			DButils.executeQuery(insertQuery);
		}
	}
	public void backbutton()
	{
		new ProductScreen().show();
	}
}
