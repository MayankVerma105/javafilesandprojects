class DrumKitTestDrive{
boolean topHat = true;
boolean snare = true;
void playTopHat(){
System.out.println("ding ding di-ding");
}
void playSnare(){
System.out.println("bang bang ba-bang");
}
}


class DrumKit{
public static void main (String [] agrs){
DrumKitTestDrive d = new DrumKitTestDrive();
d.playSnare();
d.snare = false;
d.playTopHat();

if (d.snare == true){
d.playSnare();
}
}
}