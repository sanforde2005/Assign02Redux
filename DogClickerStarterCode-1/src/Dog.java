import processing.core.PApplet;
import processing.core.PImage;
/**
 * Represents a dog.  This class DOES NOT extends PApplet since a Dog is not a skectch(canvas)
 * To use Processing's methods in this class, you must pass the sketch object into its constructor
 * and then assign it to the instance variable (mySketch).
 * @author Elizabeth Sanford
 * @version 1.0
 * @since 1.0
 */
public class Dog {

    private PApplet mySketch; 
    private PImage img;         
    public float x;
    public float y;
    private int screenWidth;
    private int screenHeight;

    /* Assign values to all the instance variables in the constructor */
    public Dog(PApplet mySketch, int screenWidth, int screenHeight) {
        this.mySketch = mySketch;
        img = mySketch.loadImage("./assets/dog.png");
        x =  (int)(Math.random()*screenWidth-img.width);
        y =  (int)(Math.random()*screenHeight-img.height); 
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    /* Draws the dog */
    public void draw() {
        mySketch.image(img,x,y);
    }

    /* Returns the location of the right edge of the dog object */
    /* Call this is your isSelected method to tell you the right edge of the dog.
     * To find the width of the image, use "theNameOfYourPImageVariable.width"
     */
    public float rightEdge(){
        //TODO: return the location of the right edge of the dog
        return x+img.width;
    }
    /* Returns the location of the left edge of the dog object */
    /* Call this is your isSelected method to tell you the left edge of the dog */
    public float leftEdge(){
        //TODO: return the location of the left edge of the dog
        return x;
        
    }
    /* Returns the location of the top edge of the dog object */
    /* Call this is your isSelected method to tell you the top edge of the dog. */
    public float topEdge(){
        //TODO: return the location of the top edge of the dog   
        return y;
    }
    /* Returns the location of the top edge of the dog object */
    /* Call this is your isSelected method to tell you the bottom edge of the dog.
     * To find the height of the image, use "theNameOfYourPImageVariable.height
     */
    public float bottomEdge(){
        //TODO: return the location of the bottom edge of the dog  
        return x+img.height;
    }

    public void move(){
        x =  mySketch.random(0,screenWidth-img.width);
        y =  mySketch.random(0,screenHeight-img.height);
    }
}
