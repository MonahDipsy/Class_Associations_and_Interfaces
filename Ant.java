public class Ant {

    private int heading;
    private int speed;
    private int size;
    private int maxSpeed;
    private int foodConsumptionRate;

    public Ant(int heading, int speed, int size, int maxSpeed, int foodConsumptionRate) {
        this.heading = heading;
        this.speed = speed;
        this.size = size;
        this.maxSpeed = maxSpeed;
        this.foodConsumptionRate = foodConsumptionRate;
    }

    public int getHeading() {
        return heading;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSize() {
        return size;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFoodConsumptionRate() {
        return foodConsumptionRate;
    }

    @Override
    public String toString() {
        return "Ant: heading=" + heading + " speed=" + speed + " size=" + size + " maxSpeed=" + maxSpeed + " foodConsumptionRate=" + foodConsumptionRate;
    }

    public static void main(String[] args) {
        Ant ant = new Ant(0, 50, 40, 50, 2);
        System.out.println(ant);
    }
}



