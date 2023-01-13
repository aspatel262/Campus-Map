package campusproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.BackgroundImage;

public class CampusProject extends Application {
	public static Group root = new Group();
    @Override
    
    public void start(Stage primaryStage) {
    	BgImg bgm = new BgImg();
        //width, height, x, y, color
        Dorms dm1 = new Dorms(100, 100, 30, 350, Color.rgb(255, 69, 0, 0.6), "Dorm A");
        Dorms dm2 = new Dorms(50, 50, 120, 200, Color.rgb(0, 0, 128, 0.6), "Dorm B");
        Dorms dm3 = new Dorms(150, 150, 300, 50, Color.rgb(139, 0, 139, 0.6), "Dorm C");
        Dorms dm4 = new Dorms(30, 30, 689, 190, Color.rgb(210, 105, 30, 0.6), "Dorm D");
        Dorms dm5 = new Dorms(175, 175, 331, 442, Color.rgb(0, 255, 0, 0.6), "Dorm E");
        
        Scene scene = new Scene(root,800, 600);
        primaryStage.setTitle("Campus Map");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
