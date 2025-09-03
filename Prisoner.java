package Prisoner;

public class Prisoner {
    public String name;
    public double height;
    public int sentence;

    public void think() {
    System.out.println("I'll have my revenge.");
    }

      public String toString() {
        return "Prisoner{name='" + name + "', height=" + height + ", sentence=" + sentence + "}";
    }  
}
  