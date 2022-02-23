public class ByteIntShortLong {
    public static void  main(String[] args) {
        int myValue = 10000;
        int myMinINtValue = Integer.MIN_VALUE;
        int myMaxINtValue = Integer.MAX_VALUE;
        System.out.println("Interger Min Value = "+myMaxINtValue);
        System.out.println("Interger Max Value = "+myMinINtValue);
        System.out.println("Busted Max Value = "+ (myMaxINtValue + 1));
        System.out.println("Busted Min Value = "+(myMinINtValue -1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte Min Value = "+myMinByteValue);
        System.out.println("byte Max Value = "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = "+myMinShortValue);
        System.out.println("Short Max Value = "+myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = "+myMinLongValue);
        System.out.println("Long Max Value = "+myMaxLongValue);

        int mytotal = myMinINtValue /2;
        byte mynewByteValue =   (byte) (myMinByteValue / 2);
        System.out.println("Casting = "+mynewByteValue);
    }
}
