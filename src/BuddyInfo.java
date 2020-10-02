public class BuddyInfo {


    private String name;
    private String address;
    private String number;

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer","123 Lane", "613-555-1234");
        System.out.println("Hello " + buddy.getName() + ". You live on " + buddy.getAddress()
                + " and your phone number is " + buddy.getNumber());

    }
}
/* Deliverables

1. .idea folder, src folder and a .iml file
2. java.math, java.io, java.time
3. "C:\Program Files\Java\jdk-13.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.2\lib\idea_rt.jar=59125:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.2\bin" -Dfile.encoding=UTF-8 -classpath "F:\Documents\! School\University\Year 3\SYSC 3110\out\production\SYSC 3110" BuddyInfo
Hello Homer. You live on 123 Lane and your phone number is 613-555-1234

Process finished with exit code 0
 */