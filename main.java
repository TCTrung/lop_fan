import src.Fan;
public class main {
    public static void main(String[] args) {
        Fan fan = new Fan(true,3,10,"yellow");
        Fan fan1 = new Fan(false,2,5,"blue");

        System.out.println("---Quat 1---" +"\n"+fan.toString());
        System.out.println("---Quat 2---" +"\n"+fan1.toString());
    }
}
