package AddProduct;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AddProductScreenController {

	@FXML
	Button ProductName;

	@FXML
	Button ProductQuantity;

	@FXML
	Button ProductPrice;

	public void ProductNameButtonClick() {
		System.out.println("Product name Button Clicked");
	}

	public void ProductQuantityButtonClick() {
		System.out.println("Product Quantity Button Clicked");
	}

	public void ProductPriceButtonClick() {
		System.out.println("Product Price Button Clicked");
	}
}
