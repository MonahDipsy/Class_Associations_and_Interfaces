public class Flag extends GameObject {

    private int sequenceNumber;

    public Flag(double x, double y, int colorR, int colorG, int colorB, double size, int sequenceNumber) {
        super(x, y, colorR, colorG, colorB, size);
        this.sequenceNumber = sequenceNumber;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    @Override
    public String toString() {
        return "Flag: " + super.toString() + " seqNum=" + sequenceNumber;
    }

    public static void main(String[] args) {
        Flag flag = new Flag(200.0, 200.0, 0, 0, 255, 10.0, 1);
        System.out.println(flag);
    }
}



