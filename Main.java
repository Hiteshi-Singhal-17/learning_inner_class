interface Animal
{
   public class Dog
   {
      private String name ;
       
      public void setName(String name)
      {
         this.name=name ;
      }

      public String getName()
      {
         return name;
      }
   }
}

public class Main {
    public static void main (String[] args){
    Animal.Dog dog=new Animal.Dog() ;
    dog.setName("Tuffy") ;
    System.out.println(dog.getName()) ;
    }
}
