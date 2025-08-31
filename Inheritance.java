class Basicphone {
void makecall() {
System.out.println("Making a call");
}
void senttext(){
System.out.println("Sending a text ");
}
}

class Smartphone extends Basicphone {
void takephoto() {
System.out.println ("Taking a phone");
}
}

public class Inheritance {
public static void main (String[]args) {
Smartphone mySmartphone = new Smartphone();
mySmartphone.makecall();
mySmartphone.senttext();
mySmartphone.takephoto();
}
}