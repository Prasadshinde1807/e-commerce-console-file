package SearchProduct;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SearchProductScreenController {

	@FXML
	Button ProductName;

	@FXML
	Button ProductQuantity;

	@FXML
	Button ProductPrice;

	public void ProductNameButtonClick() {
		System.out.println("User Management Button Clicked");
	}

	public void ProductQuantityButtonClick() {
		System.out.println("ProductManagement Button Clicked");
	}

	public void ProductPrieButtonClick() {
		System.out.println("Log Out Button Clicked");
	}
}
