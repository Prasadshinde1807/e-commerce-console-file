package ecommerce;

import common.StageHolder;
import javafx.stage.Stage;
import login.loginScreen;
import javafx.application.Application;

public class ecommerceMain extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stageCreatedByJavaFX) throws Exception {

		StageHolder.stage = stageCreatedByJavaFX;
		StageHolder.stage.setTitle("ECommerce Application");
		new loginScreen().show();

	}
}