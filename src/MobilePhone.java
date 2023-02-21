public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;

    }

    @Override
    public void powerOn() {
        isPowerOn=true;
        System.out.println("mobilePhone is  powered");


    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("now ringing"+phoneNumber+"on mobilephone");
    }

    @Override
    public void answer() {
        if(isRinging  && isPowerOn){
            System.out.println("answering the mobilephone");
            isRinging=false;
        }
        else{
//            System.out.println("not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber==myNumber && isPowerOn){
            isRinging=true;
            System.out.println("phone is ringing");
        }
        else{
            System.out.println("either wrong num entered or phone is off");
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
