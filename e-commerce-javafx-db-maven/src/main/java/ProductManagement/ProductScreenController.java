package ProductManagement;

import AddProduct.AddProductScreen;
import DeleteProduct.DeleteProductScreen;
import UpdateProduct.UpdateProductScreen;
import home.homeScreen;
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
	
	@FXML
	Button backButton;

	public void AddProductButtonClick() {
		System.out.println("Add Product Button Clicked");
		new AddProductScreen().show();
	}

	public void UpdateProductButtonClick() {
		System.out.println("Update Product Button Clicked");
		new UpdateProductScreen().show();
	}

	public void SearchProductButtonClick() {
		System.out.println("Search Product Button Clicked");
	}

	public void DeleteProductButtonClick() {
		System.out.println("Delete Product Button Clicked");
		new DeleteProductScreen().show();
	}

	public void PrintProductButtonClick() {
		System.out.println("Print Product Button Clicked");
	}

	public void ExitProductButtonClick() {
		System.out.println("Exit Product Button Clicked");
	}
	public void backButtonClick() {
		System.out.println("back Button Clicked");
		new homeScreen().show();
	}
}
