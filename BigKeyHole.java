public class BigKeyHole {
    private double promien;

    public BigKeyHole(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public boolean fits(BigKey key) {
        boolean result;
        result = (this.getPromien() >= key.getPromien());
        return result;
    }
}
