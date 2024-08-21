package Notes.Bit_Manupulation;

public class FinfithBit {
    public static void main(String[] args) {
        byte x = (byte) 1010010010;
        int n = 4;
        byte ans = (byte) findithbit(x, n);
        System.out.println(ans);
    }

    private static int findithbit(byte x, int n) {
        int bit = -1;
        bit = (n & (1 << (n - 1)));
        return bit;
    }
}
