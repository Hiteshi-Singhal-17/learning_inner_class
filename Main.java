
class Animal {
   public void setHungerListener(Animal.HungerListener listener) {
      System.out.println("I am hungry");
   }

   public interface HungerListener {
      public void onHungry();
   }
}

class Dog implements Animal.HungerListener {
   @Override
   public void onHungry() {
      System.out.println("Dog is hungry :)");
   }
}

public class Main {
   public static void main(String[] args) {
      Animal cat = new Animal();
      // First Implementation
      // cat.setHungerListener(new Dog());
      // dog.setHungerListener(d);

      
      // Second implementation
      cat.setHungerListener(new Animal.HungerListener() {
         public void onHungry() {
            System.out.println("Gotcha, you are hungry :)");
         }
      });
   }
}
