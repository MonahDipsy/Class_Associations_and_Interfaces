import java.util.ArrayList;
import java.util.Random;

class GameObject {
    double x, y;
    int colorR, colorG, colorB;
    double size;

    public GameObject(double x, double y, int colorR, int colorG, int colorB, double size) {
        this.x = x;
        this.y = y;
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
        this.size = size;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": loc=" + x + "," + y + " color=[" + colorR + "," + colorG + "," + colorB + "] size=" + size;
    }
}

class Flag extends GameObject {
    int seqNum;

    public Flag(double x, double y, int colorR, int colorG, int colorB, double size, int seqNum) {
        super(x, y, colorR, colorG, colorB, size);
        this.seqNum = seqNum;
    }

    @Override
    public String toString() {
        return super.toString() + " seqNum=" + seqNum;
    }
}

class Ant extends GameObject {
    double heading, speed, maxSpeed, foodConsumptionRate;

    public Ant(double x, double y, int colorR, int colorG, int colorB, double size, double heading, double speed, double foodConsumptionRate) {
        super(x, y, colorR, colorG, colorB, size);
        this.heading = heading;
        this.speed = speed;
        this.maxSpeed = 50; // Set your max speed value here
        this.foodConsumptionRate = foodConsumptionRate;
    }

    @Override
    public String toString() {
        return super.toString() + " heading=" + heading + " speed=" + speed + " maxSpeed=" + maxSpeed + " foodConsumptionRate=" + foodConsumptionRate;
    }
}

public class GameWorld {
    private ArrayList<GameObject> gameObjects;

    public GameWorld() {
        gameObjects = new ArrayList<>();
    }

    public void init() {
        Random rand = new Random();

        // Add sample game objects (you can customize this)
        gameObjects.add(new Flag(200.0, 200.0, 0, 0, 255, 10, 1));
        gameObjects.add(new Flag(200.0, 800.0, 0, 0, 255, 10, 2));
        gameObjects.add(new Flag(700.0, 800.0, 0, 0, 255, 10, 3));
        gameObjects.add(new Flag(900.0, 400.0, 0, 0, 255, 10, 4));
        gameObjects.add(new Ant(180.2, 450.3, 255, 0, 0, 40, 355, 50, 2));
    }

    public void printMap() {
        for (GameObject obj : gameObjects) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        GameWorld world = new GameWorld();
        world.init();
        world.printMap();
    }
}



