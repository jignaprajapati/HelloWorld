public class BarkingDog {
    public static void main(String[] args){
        shouldWakeUp (true, 1);
        shouldWakeUp (false, 2);
        shouldWakeUp (true, 8);
        shouldWakeUp (true, -1);
        shouldWakeUp (true, 23);
    }
    public static void shouldWakeUp(boolean barking,int hourOfDay){
            boolean result=false;
            if((hourOfDay < 0) || (hourOfDay > 23)){
              result = false;
            }else {
                if (barking) {
                    if (hourOfDay < 8 || hourOfDay > 22)
                        result = true;
                } else {
                    result = false;
                }
            }
            System.out.println(result);
    }


}
