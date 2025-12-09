public class TrashCan 
{
	private double pounds;
    private double max;
    public TrashCan(double m) 
    {
    	max = m;
        pounds = m;
    }
    public double acceptTrash(double add)
    {
      pounds += add;
      if(pounds > max) pounds -= max;
      return max-pounds;
    }
  public static void main(String[] args) {
    double remaining;
    TrashCan kitchen = new TrashCan(10.0);
    System.out.println(kitchen.acceptTrash(2.5));
    System.out.println(kitchen.acceptTrash(3.5));
    System.out.println(kitchen.acceptTrash(6.0));
    TrashCan bedroom = new TrashCan(3.0);
    System.out.println(bedroom.acceptTrash(1.0));
    System.out.println(bedroom.acceptTrash(3.2));
  }
}