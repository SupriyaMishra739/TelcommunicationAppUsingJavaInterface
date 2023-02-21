public class DeskPhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    public DeskPhone(String myNumber){
        this.myNumber=myNumber;

    }

    @Override
    public void powerOn() {
        System.out.println("deskPhone is always powered");

    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("now ringing"+phoneNumber+"on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answering the deskphone");
            isRinging=false;
        }
        else{
            System.out.println("not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging=true;
            System.out.println("phone is ringing");
        }
        else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
