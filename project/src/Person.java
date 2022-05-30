class Person
{
   private String name;

   public Person(String Name)
   {
      this.name = Name;
   }

   public String getName()
   {
      return name;
   }

   public boolean setName(String NewName)
   {
      if (NewName != null)
      {
         this.name = NewName;
         return true;
      }
      return false;
   }
}