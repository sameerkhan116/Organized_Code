/* 
  In object oriented programming, a singleton class is a class that can have only one object at a time.
  After first time, if we try to instantiate a singeltonclass, the new var also points to the first instance.
  Whatever modifications we do to any variable through any instance, it affects the variable of the single
  instance created and is visible if we access that variable through any variable that we defined.

  To define a singleton class:
  1. Make constructor private
  2. Write static method that returns type object of this singleton class. Here we use lazy initialization.
    * Lazy initialziation: tactic of delaying the creation of an object, the calculation of a value, or s
      ome other expensive process until the first time it is needed
  Normal class - we use constructor,
  Singleton class - we use getInstance().

  Most important applications:
  1. in configuration classes,
  2. In accessing resources in shared mode,
*/

class Singleton {
  private static Singleton singleInstance = null;
  public String s;

  private Singleton() {
    this.s = "Hello I am a string part of Singleton class";
  }

  /* 
    if singleistance is not null, the last instance is just repeated again which causes it to become a singleton class.
  */
  public static Singleton getInstance() {
    if (singleInstance == null)
      singleInstance = new Singleton();
    return singleInstance;
  }

  public static void main(String[] args) {
    Singleton x = Singleton.getInstance();
    Singleton y = Singleton.getInstance();
    Singleton z = Singleton.getInstance();

    x.s = (x.s).toUpperCase();

    System.out.println(x.s);
    System.out.println(y.s);
    System.out.println(z.s);
  }
}