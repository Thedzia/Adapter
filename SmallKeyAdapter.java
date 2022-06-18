public class SmallKeyAdapter extends BigKey {
    private SmallKey key;

    public SmallKeyAdapter(SmallKey key) {
        this.key = key;
    }

    @Override
    public double getPromien() {
        double result;
        result = (Math.sqrt(Math.pow((key.getWidth() / 2), 2) * 2));
        return result;
    }

}
