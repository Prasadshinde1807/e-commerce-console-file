package SearchUser;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SearchUserScreenController {

	@FXML
	Button FirstName;

	@FXML
	Button LastName;

	@FXML
	Button Gender;
	
	@FXML
	Button Age;

	@FXML
	Button Email;

	@FXML
	Button Password;
	
	@FXML
	Button ConfirmPassword;

	public void FirstNameButtonClick() {
		System.out.println("User First name Button Clicked");
	}
	public void LastNameButtonClick() {
		System.out.println("User Last name Button Clicked");
	}
	public void GenderButtonClick() {
		System.out.println("User Gender Button Clicked");
	}
	public void AgeButtonClick() {
		System.out.println("User Age Button Clicked");
	}
	public void EmailButtonClick() {
		System.out.println("User Email Button Clicked");
	}
	public void PasswordButtonClick() {
		System.out.println("User Password Button Clicked");
	}
	public void ConfirmPaswordButtonClick() {
		System.out.println("User ConfirmPassword Button Clicked");
	}
}

