package campusproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;



public class Dorms {
	Rectangle dorm;
	Double orgSceneX, orgSceneY;
        Double orgTranslateX, orgTranslateY;
        VBox dormInfo;
        Text nam; 
        Font font;
        
	public Dorms(double width, double height, double loX, double loY, Color color, String name){
                //Rectangles
		dorm = new Rectangle(loX, loY, width, height);
		dorm.setFill(color);
		dorm.setStroke(Color.WHITE);
		dorm.setStrokeWidth(4);
                
                //Text
                nam = new Text(loX, (loY + height + 1), name);
		
                //Mouse
                dorm.setCursor(Cursor.HAND);
                dorm.setOnMousePressed((t) -> {
                orgSceneX = t.getSceneX();
                orgSceneY = t.getSceneY();
               
                Rectangle c = (Rectangle) (t.getSource());
                c.toFront();
                });
                dorm.setOnMouseDragged((t) -> {
                double offsetX = t.getSceneX() - orgSceneX;
                double offsetY = t.getSceneY() - orgSceneY;

                Rectangle c = (Rectangle) (t.getSource());
      
                c.setX(c.getX() + offsetX);
                c.setY(c.getY() + offsetY);

                
                
                orgSceneX = t.getSceneX();
                orgSceneY = t.getSceneY();
                
               
                double newTranslateX = orgTranslateX + offsetX;
                double newTranslateY = orgTranslateY + offsetY;
                nam.setX(c.getX() + offsetX);
                nam.setY(c.getY() + offsetY + height + 10);
                
                });
                
                
                
                //Population and Slidebar
                
                
                //Vbox
                
                
                
                
		CampusProject.root.getChildren().addAll(nam, dorm);
		
	}
	  EventHandler<MouseEvent> circleOnMousePressedEventHandler = 
        new EventHandler<MouseEvent>() {
 
        @Override
        public void handle(MouseEvent t) {
            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
            orgTranslateX = ((Text)(t.getSource())).getTranslateX();
            orgTranslateY = ((Text)(t.getSource())).getTranslateY();
        }
    };
     
    EventHandler<MouseEvent> circleOnMouseDraggedEventHandler = 
        new EventHandler<MouseEvent>() {
 
        @Override
        public void handle(MouseEvent t) {
            double offsetX = t.getSceneX() - orgSceneX;
            double offsetY = t.getSceneY() - orgSceneY;
            double newTranslateX = orgTranslateX + offsetX;
            double newTranslateY = orgTranslateY + offsetY;
             
            ((Text)(t.getSource())).setTranslateX(newTranslateX);
            ((Text)(t.getSource())).setTranslateY(newTranslateY);
        }
    };
	
	
	
}
