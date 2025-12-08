public class CupcakeMachine           // Write public class your classname here and delete comment
{
    // write instance variable declarations here
    private  int numofCakes; 
    private double cost;
    private int ordernum;
  
  
    // write the constructor and other methods here
    public CupcakeMachine(int n, double c) {
        numofCakes = n;
        cost = c;
    }
    public String takeOrder(int subnum) {
        if (numofCakes >= subnum) {
             numofCakes -= subnum;
             ordernum++;
        double currcost = cost * subnum;
            return "Order number " + ordernum + ", cost $" + currcost;
        } else {
            return "Order cannot be filled";
        }

        
    }
  
    public static void main(String[] args)
    {
        CupcakeMachine c1 = new CupcakeMachine(10, 1.75);
        System.out.println(c1.takeOrder(2)); // Order number 1, cost $3.5
        System.out.println(c1.takeOrder(3)); // Order number 2, cost $5.25
        System.out.println(c1.takeOrder(10)); // Order cannot be filled
        System.out.println(c1.takeOrder(1)); // Order number 3, cost $1.75

        CupcakeMachine c2 = new CupcakeMachine(10, 1.5);
        System.out.println(c2.takeOrder(10)); // Order number 1, cost $15.0
    }
  }
