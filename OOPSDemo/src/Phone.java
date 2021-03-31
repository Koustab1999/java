
public class Phone {
    void createContact(String name,long no) 
    {
        System.out.println("Name :"+name+" MobileNo :"+no);
    }
    void createContact(String name,long no1,long no2) 
    {
        System.out.println("Name :"+name+" MobileNO:"+no1+" "+no2);
    }
    public static void main(String[] args)
    {
        Phone p=new Phone();
        p.createContact("Koustab", 1234567L);
        p.createContact("Rahul", 12345567788L, 567727397L);

 

    }

 

}
