public class SmallKey {
    private double width;

    public SmallKey(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getKey() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }

}
