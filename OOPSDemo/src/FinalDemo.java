class Final {
    
    public final void display() {
      System.out.println("This is a final method.");
    }
}

class FinalDemo extends Final {
  // try to override final method
  //public  void display()					// final method can not be override
  //{															//
    //System.out.println("The final method is overridden.");
  //}

  public static void main(String[] args) {
    FinalDemo obj = new FinalDemo();
    obj.display();
  }
}