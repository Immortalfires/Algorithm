public class N1344 {
    public static void main(String[] args) {
        int hour = 12;
        int minutes = 30;
        double angle = angleClock(hour,minutes);
        System.out.println(angle);
    }

    private static double angleClock(int hour, int minutes) {
        double degree = Math.abs(5.5*minutes - 30*hour);
        if(degree>180){
            degree = 360-degree;
        }
        return degree;
    }
}
