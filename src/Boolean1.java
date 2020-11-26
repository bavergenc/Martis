public class Boolean1 {
    public static void main(String[] args) {

        boolean passedDoor = true;
        boolean missedDoor  = false;
        boolean passedAllDoors = true;
        int doorcount = 0;

        if(missedDoor){
            System.out.println("we passed the first door");
            doorcount = doorcount + 1;
        }

        if(passedDoor){
            System.out.println("we passed the second door");
            doorcount = doorcount + 1;
        }

        if(passedDoor){
            System.out.println("we passed the third door");
            doorcount = doorcount + 1;
        }

        if(doorcount == 3){
            passedAllDoors = true;
        }

        if(passedAllDoors){
            System.out.println("congratualions you won the program");
        }
    }

}
