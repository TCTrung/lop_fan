package src;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = 1;
    private boolean fanOff = false;
    private int radius = 5;
    private String color = "blue";

    public int getSlow() {
        return slow;
    }
    public  int getMedium() {
        return medium;
    }
    public int getFast() {
        return fast;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean getFanOff() {
        return fanOff;
    }
    public int getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setFanOn(boolean fanOn) {
        this.fanOff = fanOff;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
    }
    public Fan(boolean fanOff,int speed, int radius, String color){
        this.speed = speed;
        this.fanOff = fanOff;
        this.radius = radius;
        this.color = color;
    }
    @Override

    public String toString () {
        String status = "";
        if(this.getFanOff()){
            status += "Quat dang bat"+ "\n";
        }else{
            status += "Quat dang tat"+ "\n";
        }
        status += "Toc do : " + this.speed + "\n";
        status += "Ban kinh : "+ this.radius + "\n";
        status += "Mau quat : "+ this.color;
        return status;
    }
}
