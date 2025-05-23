package ss4_class;

public class fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isON() {
        return on;
    }

    public void setON() {
        this.on = true;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        if(on){
            return "fan is on ="+speed + "color ="+color;
        }else{
            return "fan is off = "+color+ "color ="+radius ;
        }
    }
}
class fantext{
    public static void main(String[] args) {
        fan fan1 = new fan();
        fan1.setSpeed(fan.MEDIUM);
        fan1.setON();
        fan1.setRadius(5);
        fan1.setColor("blue");
        System.out.println(fan1);
    }

}