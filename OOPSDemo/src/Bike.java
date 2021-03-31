class Bike{
 final int SPEED_LIMIT=90;//final variable
 void run(){
 // SPEED_LIMIT=400;      // The final field Bike.SPEEDLIMIT cannot be assigned
System.out.println("The spped of a bike is :" +SPEED_LIMIT);
 }
 public static void main(String args[]){
 Bike obj=new  Bike();
 obj.run();
 }
}