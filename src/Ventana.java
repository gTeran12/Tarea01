import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ventana extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		VBox ventana = new VBox();
        Button btUno = new Button("Cafe");
        Button btDos = new Button("Azul");
        Button btTres = new Button("Rojo");
        ventana.setAlignment(Pos.CENTER);
        ventana.setSpacing(50);
        ventana.getChildren().addAll(btUno,btDos,btTres);
        var scene = new Scene(ventana, 640, 480);
        stage.setScene(scene);
        stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch();
	}

}
