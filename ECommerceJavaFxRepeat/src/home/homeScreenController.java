package home;

import ProductManagement.ProductScreen;
import UserManagement.UserScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.loginScreen;

public class homeScreenController {

	@FXML
	Button UserManagement;

	@FXML
	Button ProductManagement;

	@FXML
	Button LogOut;

	public void UserManagementButtonClick() {
		System.out.println("User Management Button Clicked");
		new UserScreen().show();
	}

	public void ProductManagementButtonClick() {
		System.out.println("ProductManagement Button Clicked");
		new ProductScreen().show();
	}

	public void LogOutButtonClick() {
		System.out.println("Log Out Button Clicked");
		new loginScreen().show();
	}
}
