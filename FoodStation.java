public class FoodStation {
    private double x;
    private double y;
    private int colorR;
    private int colorG;
    private int colorB;
    private double size;
    private int capacity;
    private boolean faded;

    public FoodStation(double x, double y, int colorR, int colorG, int colorB, double size, int capacity) {
        this.x = x;
        this.y = y;
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
        this.size = size;
        this.capacity = capacity;
        this.faded = false;
    }

    public void setFaded(boolean faded) {
        this.faded = faded;
    }

    public String toString() {
        return "FoodStation: loc=" + x + "," + y + " color=[" + colorR + "," + colorG + "," + colorB + "] " +
                "size=" + size + " capacity=" + capacity;
    }

    public static void main(String[] args) {
        FoodStation station = new FoodStation(350.8, 350.6, 0, 255, 0, 15.0, 15);
        System.out.println(station);
    }
}



