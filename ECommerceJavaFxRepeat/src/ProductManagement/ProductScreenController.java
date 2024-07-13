package ProductManagement;

import AddProduct.AddProductScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProductScreenController {

	@FXML
	Button AddProduct;

	@FXML
	Button UpdateProduct;

	@FXML
	Button SearchProduct;

	@FXML
	Button DeleteProduct;

	@FXML
	Button PrintProduct;

	@FXML
	Button ExitProduct;

	public void AddProductButtonClick() {
		System.out.println("Add Product Button Clicked");
		new AddProductScreen().show();
	}

	public void UpdateProductButtonClick() {
		System.out.println("Update Product Button Clicked");
	}

	public void SearchProductButtonClick() {
		System.out.println("Search Product Button Clicked");
	}

	public void DeleteProductButtonClick() {
		System.out.println("Delete Product Button Clicked");
	}

	public void PrintProductButtonClick() {
		System.out.println("Print Product Button Clicked");
	}

	public void ExitProductButtonClick() {
		System.out.println("Exit Product Button Clicked");
	}
}
