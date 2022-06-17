package Security_Booth;
import Security_Booth.car;
import Security_Booth.SymbolTable;
import java.util.Scanner;

public class securityBooth {
    private boolean gameOver;
    private SymbolTable st;
    private car[] cars;

    public securityBooth(boolean gameOver) {
        this.gameOver = gameOver;
        this.st = new SymbolTable();
        //from the screenshots i went from up down, left to right
        //note, 0 with slash through is a zero
        //first page start
        this.st.put("James Farnam", "DU2 O92");
        this.st.put("Carl Mator", "GN2 C99");
        this.st.put("Keiren Banks", "NN0 O21");
        this.st.put("Kathy Lester", "AQ1 R11");
        this.st.put("Ruby-May Mcintosh", "KL2 U48");
        this.st.put("Gino Velez", "LL9 B67");
        this.st.put("Andreas Stavaas", "FA5 A48");
        this.st.put("Amy Ramsay", "BV2 V33");
        this.st.put("E. Spencer", "ZE5 E33");
        this.st.put("Mélanie Lane", "HU9 W73");
        //first page end, second page start
        this.st.put("Labib Shaheed", "CX8 Y01");
        this.st.put("Sidney Sutton", "LJ2 I41");
        this.st.put("Greg Hanson", "OI1 F01");
        this.st.put("Louie Woodhouse", "LE0 N31");
        this.st.put("Mario Vílchez", "XT2 M28");
        this.st.put("Sofía Sierra", "YT7 Q20");
        this.st.put("Gavriil Vasiliev", "MN9 O96");
        this.st.put("Kevin Caldwell", "LJ2 U54");
        this.st.put("Lei Yongzheng", "TR8 K52");
        this.st.put("Ned Day", "AA8 I76");
        //second page end, third page start
        this.st.put("Nina Klos", "JH0 E4");
        this.st.put("Ma Yaozu", "HJ1 F28");
        this.st.put("Eleanor Shaw", "AC8 E83");
        this.st.put("Sal Escalera", "KS2 D27");
        this.st.put("Caleb Yasin", "MN0 H24");
        this.st.put("Howell Cunningham", "CN4 P42");
        this.st.put("Stefan Oprisan", "GI2 69R");
        this.st.put("Enrico Kelm", "RY9 T07");
        this.st.put("George Phillips", "GUD B01");
        this.st.put("Tanabe Aki", "KS2 R88");
        //third page end, fourth page start
        this.st.put("Christopher Carrie", "YX2 L96");
        this.st.put("Amy Bowring", "WI1 N88");
        this.st.put("Ellen Brown", "AU8 7UI");
        this.st.put("Osada Goro", "ME8 G86");
        this.st.put("Mo Xia", "HS9 O1A");
        this.st.put("Melvin van Skateren", "DW2 F38");
        this.st.put("Natasha Singh", "RE8 O31");
        this.st.put("Cairo Goodbrand", "GI2 A48");
        this.st.put("Stacey Horwood", "BC7 K54");
        this.st.put("Ali Baba", "UQ3 G39");
        //fourth page end, fifth page start
        this.st.put("Sun Huiqing", "SD9 W77");
        this.st.put("Michele Cociarelli", "SM2 M28");
        this.st.put("Sal Blue", "UR2 I40");
        this.st.put("Kristof Malwalki", "SJ2 Y55");
        this.st.put("Luna De Groote", "KI7 B42");
        this.st.put("Kyle Harris", "CCG S10");
        this.st.put("Kobayashi Hisao", "YY8 N13");
        this.st.put("Michael Philp", "EQ8 B47");
        this.st.put("Craig Marnock", "JD9 V90");
        this.st.put("Lisa Salmon", "HA8 G69");
        //fifth page end
    }

    public static void jobRules() {
        System.out.println(
            "Job Rules!\n"+
            "-Make sure to talk to the person in the car, they must work here.\n"+
            "-Check persons license plate on front of their car.\n"+
            "-If the person's license plate is on the employee register let them in, "+
            "if they are NOT on the register YOU MUST tell them to leave.\n\n"+
            "ONLY OPEN THE GATE TO EMPLOYEE'S.\n"+
            "Keep gate closed until you've checked the person's plate ID."
        );
    }

    public static void openEmployeeRegister(SymbolTable st) {
        System.out.println(st.get("George Phillips"));
    }

    public static void carInteract() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        securityBooth sb = new securityBooth(false);
        //game starts here lmao
        while (sb.gameOver != true) {
            System.out.println("Choices: 1, read the job rules, 2, "+
            "open employee register, 3, interact with the car.");
            int ans = input.nextInt();
            switch(ans) {
                case 1:
                    jobRules();
                    break;
                case 2:
                    openEmployeeRegister(sb.st);
                    break;
                case 3:
                    carInteract();
                    break;
                case 9:
                    sb.gameOver = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        System.out.println("Thanks for playing!");
    }
}
