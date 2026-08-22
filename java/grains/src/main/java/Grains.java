import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        //    throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        BigInteger grains = BigInteger.ONE;
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        for (int i = 1; i < square; i++) {
            grains = grains.multiply(BigInteger.TWO);

        }

        return grains;


    }

    BigInteger grainsOnBoard() {
        //    throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        BigInteger tong = BigInteger.ZERO;
        for (int i = 1; i <= 64; i++) {
            tong = tong.add(grainsOnSquare(i));
        }
        return tong;
    }

}
