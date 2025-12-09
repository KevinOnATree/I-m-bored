public class CupcakeMachine 
{
private int numofCakes;
private double cost;
private int OrderNum;
public CupcakeMachine(int num, double c) 
	{
	numofCakes = num;
	cost = c;
	}
public String takeOrder(int subnum) 
	{
		if (numofCakes >= subnum) 
        {
			numofCakes -= subnum;
    		OrderNum++;
    		double currcost = cost * subnum;
   			 return "Order number " + OrderNum + ", cost $" + currcost;
		} 
   		else 
    	{
			return "Order cannot be filled";
    	}
 	}
    
	public static void main(String[] args) 
	{
		String info;
        CupcakeMachine c1 = new CupcakeMachine(10, 1.75);
        info = c1.takeOrder(2);
        info = c1.takeOrder(3);
        info = c1.takeOrder(10);
        info = c1.takeOrder(1);
        CupcakeMachine c2 = new CupcakeMachine(10, 1.5);
        info = c2.takeOrder(10);

	}
}