//Write a java program that has a Box class with one attribute width(float).to create getters and setters for the class
//Create a new instance of the Box class,get its width and update its width to anew value
public class Box {
    //width attribute
    private float width;

    //class constructor
    public Box(float width) {
        this.width = width;
    }
//getter for getting
    public float getWidth() {
        return width;
    }
//setter for updating
    public void setWidth(float width) {
        this.width = width;
    }
}
