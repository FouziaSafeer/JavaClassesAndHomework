package homeWork04ForLoops;

public class ForLoopsHomeWork {
    public static void main(String[] args) {
        /* Create a boolean variable workDay and assign true create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off any more”
Print numbers from 1 to 100 in 1 line with space
*/
        boolean workday=true;
        for(int day=1;day<=5; day++){
            System.out.println(" I need day off");
        }
        System.out.println("I dont need a day off any more");
//Print numbers from 100 to 1

        for(int i=100; i>=1; i--){
            System.out.print(i+ " ");
        }



    }
}
