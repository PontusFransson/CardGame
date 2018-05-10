package CardGame;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class BJButton extends Group{

	Circle bg;
	
	public BJButton(String str,Color c){
	
		bg = new Circle(30);
		bg.setTranslateX(bg.getRadius());
		bg.setTranslateY(bg.getRadius());
		bg.setFill(c);
		bg.setStroke(Color.BLACK);
		bg.setStrokeWidth(5);
		
		Text text = new Text();
		text.setTranslateX(15);
		text.setTranslateY(45);
		text.setFont(new Font(45));
		text.setText(str);
		
		
		this.getChildren().addAll(bg,text);

	}
	
	public void setFill(Color c){
		bg.setFill(c);
	}
}
