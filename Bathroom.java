public class Bathroom {
    private static String exhibit = "";
    private static String direction = "";
    public static void main(String exhibitName, String direct) {
        exhibit = exhibitName;
        direction = direct;
    }
    public static String getExhibit() {
        return exhibit;
    }
    public static String getDirection() {
        return direction;
    }
}