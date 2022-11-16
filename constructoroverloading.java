public class Person {
    String name;
    String address;
    int phonenumber;
    int age;
    Person()
    {
        name=null;
        address=null;
        phonenumber=0000000000;
        age=00;
    }
        Person(String n, String ad, int p, int a)
        {
            name=n;
            address=ad;
            phonenumber=p;
            age=a;
        }
        Person(String n, int p)
    {
        name=n;
        phonenumber=p;
    }
        void display()
        {
            System.out.println("Name:"+name+"\nAddress:"+address+"\nPhone Number:"+phonenumber+"\nAge:"+age);
        }
        public static void main(String [] args)
        {
            Person p1=new Person ("male","address",980000000,75);
            Person p2=new Person ("female",981111111);
        p1.display();
        p2.display();
        }

}
