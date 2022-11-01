// This is just an example to why use interface

interface Camera{
    void takeSnap();
    void recordVideo();
    default void recordingEnd(){
        System.out.println("Recording Ended");
    }
}

interface Gps{
    void locate();
    void goTo(String location);
}

class CellPhone {
    public void call(String Name){
        System.out.println("Calling" + Name);
    }

    public void pickCall(){
        System.out.println("Picking call.....");
    }

}


class MySmartPhone extends CellPhone implements Camera, Gps{
    public void locate(){
        System.out.println("Your current location is Pune");
    };
    public void goTo(String location){
        System.out.println(location);
    };
    public void takeSnap(){
        System.out.println("Captured");

    };
    public void recordVideo(){
        System.out.println("recording Started");
    }
}

public class Main {
        public static void main(String[] args) {
            MySmartPhone Realme = new MySmartPhone();
            Realme.call("Gaurav");
            Realme.pickCall();
            Realme.locate();
            Realme.goTo("Ghazipur");
            Realme.takeSnap();
            Realme.recordVideo();
            Realme.recordingEnd();
        }
}
