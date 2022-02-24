public class MegaByteConverter {
    public static void main(String args[]) {
        printMegaBytesandKiloBytes(2500);

    }
    public static void printMegaBytesandKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes/1024;
        int remKiloBytes = kiloBytes%1024;
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remKiloBytes+" KB");
        }
    }
}
