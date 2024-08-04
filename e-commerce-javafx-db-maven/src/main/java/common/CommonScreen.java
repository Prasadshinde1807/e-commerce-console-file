package common;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CommonScreen {
	public void show() {

		String myClassName = getClass().getSimpleName();

		String classFilePath = getClass().getResource(myClassName + ".class").toString();

		String fxmlFilePath = classFilePath.replace(".class", ".fxml");
		System.out.println(fxmlFilePath);
        String exactFilePath=fxmlFilePath.substring(8);
		URL fxmlUrl;
		try {
			fxmlUrl = Paths.get(exactFilePath).toUri().toURL();

			Parent actorGroup = FXMLLoader.load(fxmlUrl);

			Scene scene = new Scene(actorGroup, 600, 400);
			StageHolder.stage.setScene(scene);
			StageHolder.stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
