
class printName
  {
      String name;
        public void setName(String name)
    {
        this.name = name;
    }
    public void getName()
    {
        System.out.println("Hello my name is " + name);
    }
    
  }

public class naming
  {

    
      public static void main(String args[])
       {
                    printName pn = new printName();
                        pn.setName("Siddharth Goswami");
                        pn.getName(); //prints name
       }

  }
