class Person{
         private int age;
         private String name; 

        Person(){
          age=18;
          
        }

        Person(int age,String name){
           this.age=age;
           this.name=name;

        }
        
        void show(){
          System.out.println(age+""+name);
          
          

        }

}


class PersonDemo{
    public static void main(String args[]){   
            Person P=new Person(23,"Supriya");
            P.show();

 }
}