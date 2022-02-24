public class NumberinWord {
    public static void main(String args[]) {
        printNumberInWord(5);
    }
    public static void printNumberInWord(int number){
        if(number==0)
        {System.out.print("ZERO");}
        else if(number==1 || number== -1)
        {System.out.print("ONE");}
        else if(number==2|| number==-2)
        {System.out.print("TWO");}
        else if(number==3 || number== -3)
        {System.out.print("THREE");}
        else if(number==4 || number== -4)
        {System.out.print("FOUR");}
        else if(number==5 || number== -5)
        {System.out.print("FIVE");}
        else if(number==6 || number== -6)
        {System.out.print("SIX");}
        else if(number==7 || number== -7)
        {System.out.print("SEVEN");}
        else if(number==8 || number== -8)
        {System.out.print("EIGHT");}
        else if(number==9 || number== -9)
        {System.out.print("NINE");}
        else{System.out.print("OTHER");}
    }
}
