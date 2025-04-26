public class Stringimmutablity {

    public static void main(String[] args) {
        String s1  = "hello";
        String s2 ="hello";

        System.out.println(s1==s2);//true cause same refrence from pool
        System.out.println("//////////////////////////");

        String name ="deep";
        name.concat("seek");// concat return a new string and we didnt store it
      String c=  name.concat("seek"); //now here we created new string

        System.out.println(name);
        System.out.println(c);

        System.out.println("///////withe refrence ///////////");
          String a1= "conq";
          String a2=a1;
          a1= a1 +"quer";

        System.out.println(a1);
        System.out.println(a2);// still holds  old string cause java didnt change original string just created ne one


        System.out.println("String builder");

        StringBuilder stringBuilder  = new StringBuilder("hello");
        stringBuilder.append("king");
        System.out.println(stringBuilder);//mutable it is but fast

        System.out.println("String buffer");//mutable

        StringBuffer stringBuffer =new StringBuffer("hello");
        stringBuffer.append("king");

        System.out.println(stringBuffer);


    }
}
