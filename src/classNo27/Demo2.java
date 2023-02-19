package classNo27;

public class Demo2 {
    public static void main(String[] args) {
        String[] names = {"hiral", "nima", "Haider", "Hassan"};

        String name = "haider";
        // System.out.println(searchName(names,"Haider"));
        System.out.println(conatains(name, names));
    }


    public static boolean conatains(String nameToBeSearch, String[] names) {
        for (String name : names) {
            if (nameToBeSearch.equalsIgnoreCase(name)) {
                return true;
            }

        }
        return false;//hash code,native low level lanaguage @681 method return it
        //array occupy  times less memoery
    }
}


   /* public static String searchName(String[] names,String name ){
        for (int i = 0; i < names.length; i++) {
            if (names[i]==name) {
                System.out.println("Name is present");

            }
            // return name;
        }return name;
    }*/





