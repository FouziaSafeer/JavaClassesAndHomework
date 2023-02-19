package classNo24;

public final class FinalDemo {
    public static void main(String[] args) {
        final int num;// only creating
        num=20;// oncee assign cannot change.
       // num=30; now we have error we cant chnage
        System.out.println(num);
    }
   final void noOneShouldOverride(){
        System.out.println("This medthos never be override it might break the codebase");
    }
}
/*class Nelson extends  FinalDemo{// cannot inherit as class was final
   *//* @Override// we cant override this methos as declared as final
    void noOneShouldOverride() {
        System.out.println("ley me do that");
   *//* }
}*/
