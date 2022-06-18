public class Client {
    public static void main(String[] args) {
        BigKeyHole hole = new BigKeyHole(6);
        BigKey Bkey = new BigKey(6);
        if (hole.fits(Bkey)) {
            System.out.println(" Big Key p6 pasuje do Big Key Hole p6. ");

        }

        SmallKey sKey1 = new SmallKey(3);
        SmallKey sKey2 = new SmallKey(2);

        SmallKeyAdapter smallsKey1Adapter = new SmallKeyAdapter(sKey1);
        SmallKeyAdapter smallsKey2Adapter = new SmallKeyAdapter(sKey2);
        if (hole.fits(smallsKey1Adapter)) {
            System.out.println(" Small key w3 nie pasuje do Big Key hole p6. ");
        }
        if (!hole.fits(smallsKey2Adapter)) {
            System.out.println("Small key w2 nie psuje do Big Key hole p6. ");
        }
    }
}
