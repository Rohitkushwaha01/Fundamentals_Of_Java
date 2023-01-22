interface maggie{
	public void maggie();
}

class masala{
    public void masala(){
    	System.out.println("masala");
    }
}

class cookedMaggie extends masala implements maggie{
	public void maggie(){
    	System.out.println("cooking");
    }
}

public class InterfaceClass {
  public static void main(String[] args) {
    cookedMaggie m = new cookedMaggie();
    m.maggie();
    m.masala();
  }
}

