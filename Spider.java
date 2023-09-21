public class Spider {
    private double x;
    private double y;
    private int colorR;
    private int colorG;
    private int colorB;
    private double size;
    private double heading;
    private double speed;

    public Spider(double x, double y, int colorR, int colorG, int colorB, double size, double heading, double speed) {
        this.x = x;
        this.y = y;
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
        this.size = size;
        this.heading = heading;
        this.speed = speed;
    }

    public String toString() {
        return "Spider: loc=" + x + "," + y + " color=[" + colorR + "," + colorG + "," + colorB + "] " +
                "size=" + size + " heading=" + heading + " speed=" + speed;
    }

    public static void main(String[] args) {
        Spider spider = new Spider(70.3, 70.7, 0, 0, 0, 25.0, 45.0, 5.0);
        System.out.println(spider);
    }
}



