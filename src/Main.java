public class Main {
    public static void main(String[] args) {
        //powerOn
        //call to another phone,is ringing
        //answer phone call,dial a number

//        DeskPhone dp=new DeskPhone("123456");
//        dp.powerOn();
//        dp.callPhone("123456");
//        dp.answer();

        MobilePhone mp=new MobilePhone("12345");
        mp.powerOn();
        mp.callPhone("12345");
        mp.answer();
    }
}