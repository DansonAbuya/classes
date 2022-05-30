public class Employer extends Person
{
   private int id;
   public static int nextId = 20;

   public Employer(String Name)
   {
      super(Name);
      id = nextId;
      nextId++;
   }

   public int getId()
   {
      return id;
   }

   public static void main(String[] args)
   {
      Employer emp = new Employer("Danson");
      //System.out.println(emp.getName());
      System.out.println("The dog is barking");
   }
}
