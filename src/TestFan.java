public class TestFan {
    public static void main(String[] args) {
        FanClass Fan1 = new FanClass();
        FanClass Fan2 = new FanClass();

        Fan1.setOn(true);
        Fan1.setColor("yellow");
        Fan1.setRadius(10);
        Fan1.setSpeed(FanClass.FAST);

        Fan2.setOn(true);
        Fan2.setColor("blue");
        Fan2.setRadius(5);
        Fan2.setSpeed((FanClass.SLOW + FanClass.MEDIUM + FanClass.FAST)/3);

        System.out.println("Fan 1");
        System.out.println(Fan1.toString());
        System.out.println(" ");
        System.out.println("Fan 2");
        System.out.println(Fan2.toString());

    }
}
