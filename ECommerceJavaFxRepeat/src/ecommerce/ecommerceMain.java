package ecommerce;

import common.StageHolder;
import home.homeScreen;
import javafx.stage.Stage;
import javafx.application.Application;

public class ecommerceMain extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stageCreatedByJavaFX) throws Exception {

		StageHolder.stage = stageCreatedByJavaFX;
		StageHolder.stage.setTitle("ECommerce Application");
		new homeScreen().show();

	}
}