import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class myCircle extends Application {

	public static void main(String[] args) {
		
		//launch the application
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//create eighth and set properties
		Circle circleEight = new Circle();
		circleEight.setCenterX(125);
		circleEight.setCenterY(190);
		circleEight.setRadius(25);
		circleEight.setStroke(Color.DARKGREEN);
		circleEight.setFill(Color.OLIVE);
		
		//create seventh and set properties
		Circle circleSeven = new Circle();
		circleSeven.setCenterX(175);
		circleSeven.setCenterY(160);
		circleSeven.setRadius(25);
		circleSeven.setStroke(Color.INDIGO);
		circleSeven.setFill(Color.MEDIUMORCHID);
		
		//create fifth and set properties
		Circle circleFive = new Circle();
		circleFive.setCenterX(207.5);
		circleFive.setCenterY(112.5);
		circleFive.setRadius(25);
		circleFive.setStroke(Color.BLUE);
		circleFive.setFill(Color.HONEYDEW);
		
		//create sixth and set properties
		Circle circleSix = new Circle();
		circleSix.setCenterX(75);
		circleSix.setCenterY(160);
		circleSix.setRadius(25);
		circleSix.setStroke(Color.INDIANRED);
		circleSix.setFill(Color.HOTPINK);
		
		//create third circle and set properties
		Circle circleThree = new Circle();
		circleThree.setCenterX(42.5);
		circleThree.setCenterY(112.5);
		circleThree.setRadius(25);
		circleThree.setStroke(Color.SLATEBLUE);
		circleThree.setFill(Color.SKYBLUE);
		
		//create fourth circle and set properties
		Circle circleFour = new Circle();
		circleFour.setCenterX(175);
		circleFour.setCenterY(65);
		circleFour.setRadius(25);
		circleFour.setStroke(Color.BROWN);
		circleFour.setFill(Color.SALMON);
		
		//create second circle and set properties
		Circle circleTwo = new Circle();
		circleTwo.setCenterX(75);
		circleTwo.setCenterY(65);
		circleTwo.setRadius(25);
		circleTwo.setStroke(Color.RED);
		circleTwo.setFill(Color.ORANGE);
		
		//create first circle and set properties
		Circle circle = new Circle();
		circle.setCenterX(125);
		circle.setCenterY(40);
		circle.setRadius(25);
		circle.setStroke(Color.PINK);
		circle.setFill(Color.YELLOW);
		
		//create a pane to hold shapes (pane is a container)
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		pane.getChildren().add(circleTwo);
		pane.getChildren().add(circleThree);
		pane.getChildren().add(circleFour);
		pane.getChildren().add(circleFive);
		pane.getChildren().add(circleSix);
		pane.getChildren().add(circleSeven);
		pane.getChildren().add(circleEight);
		
		//create a scene and place it in stage
		Scene scene = new Scene(pane,250,250);
		primaryStage.setTitle("A Circle");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}