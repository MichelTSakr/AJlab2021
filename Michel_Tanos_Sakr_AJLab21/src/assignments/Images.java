package assignments;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 *
 * @author HP
 */
public class Images extends Pane
{

    private int i = 0;
    private final Timeline animation;

    Images() {
        Slideshow();
        animation = new Timeline(
                new KeyFrame(Duration.millis(4000), e -> {
                    nextSlide();
                }));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

    }

    private void Slideshow() {
        getChildren().clear();
        getChildren().add(new ImageView("File:///C:\\Users\\user\\Documents\\NetBeansProjects\\AJ2021\\src\\aj2021\\example\\slide" + i + ".jpg"));
    }

    protected void nextSlide()
            
    {
        
     if (i < 10) i++;
        
    else i = 0;
               
    Slideshow();
    
    }
    
}
