import java.util.*;
class PP77
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("-----Product List-----");
    String [][]Subject = {{"Snack","20"},{"Pepsi","15"},{"Jelly","10"}};
    System.out.println(Subject[0][0] +" : "+ Subject[0][1] +" Baht");
    System.out.println(Subject[1][0] +" : "+ Subject[1][1] +" Baht");
    System.out.println(Subject[2][0] +" : "+ Subject[2][1] +" Baht");
    String Product = "";
    String Number = "";
    System.out.println("---------Buy----------");
        
    ArrayList<ArrayList> arr = new Array<ArrayList>();
    int x=0;
        while(true){
        System.out.print("Enter Product : ");
        Product = sc.next();
        if (Product.equals("-1")) break;
        System.out.print("Enter Number To Buy : ");
        Number = sc.nextInt();
        System.out.println("----------------------");
        }
        System.out.println("-------Recipt---------");
        System.out.print("Total Price : ");

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(); j++) {
                System.out.print(arr.get(j));+
                
            }
            
        }
        
        
    }
}