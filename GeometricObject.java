public class GeometricObject {
    String color;
    boolean filled;
    java.util.Date dateCreated;

    GeometricObject(){
    }

    GeometricObject(String color, boolean filled){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return toString();
    }
}
