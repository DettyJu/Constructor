import java.util.Scanner;
class BloodData {
    private String bloodType;
    private String rhFactor;
    
    public BloodData() {
      bloodType = "O";  
      rhFactor = "+";
    }
    
    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }
    
    public void display () {
        System.out.println(bloodType + rhFactor + " is added to the blood bank");
    }
}

public class RunBloodData {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter blood type of patient (A, B, AB, O): ");
        String input1 = input.nextLine();
        
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = input.nextLine();
        
        BloodData bd;
        
        if (!input1.isEmpty()&&!input2.isEmpty()){
        bd = new BloodData(input1, input2);
        }else{
        bd = new BloodData();
    }
    bd.display();
    }
}