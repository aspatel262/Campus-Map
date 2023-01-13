package campusproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.BackgroundImage;


public class BgImg {
	public Image bgIm;
	public ImageView bgImV;
	
	public BgImg(){
		bgIm = new Image(getClass().getResource("Images/CampusMap.png").toString());
		bgImV = new ImageView(bgIm);
		bgImV.setPreserveRatio(true);
		bgImV.setFitWidth(800);
		bgImV.toBack();
		
		CampusProject.root.getChildren().add(bgImV);
		
	}
	
	
}	
