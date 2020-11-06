public class boolean1 {
    public static void main(String[] args) {

        boolean passeddoor = true;
        boolean misseddoor  = false;
        boolean passedalldoors = true;
        int doorcount = 0;

        if(misseddoor){
            System.out.println("we passed the first door");
            doorcount = doorcount + 1;
        }

        if(passeddoor){
            System.out.println("we passed the second door");
            doorcount = doorcount + 1;
        }

        if(passeddoor){
            System.out.println("we passed the third door");
            doorcount = doorcount + 1;
        }

        if(doorcount == 3){
            passedalldoors = true;
        }

        if(passedalldoors){
            System.out.println("congratualions you won the program");
        }
    }

}
