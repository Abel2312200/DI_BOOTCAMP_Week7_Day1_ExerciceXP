public class MyPoint {

    // class attributes
    private int x = 0;
    private int y = 0;

    // constructor without parameters
    public MyPoint() {
        super();
    }
    // constructor using parameter(s)

    public MyPoint(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    // getters and setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] xyArray = new int[2];

        xyArray[0] = getX();
        xyArray[1] = getY();

        return xyArray;
    }

    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }

    // class methods
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y){
        double distance = 0.0;

        distance = Math.sqrt(getX() * x + getY() * y);

        return distance;
    }

    public double distance (MyPoint another){
        double distance = 0.0;

        int x = this.x - another.getX();
        int y = this.y - another.getY();

        distance = this.distance(x,y);

        return distance;
    }

    public double distance(){
        double distance = this.distance(0,0);

        return distance;
    }
}
