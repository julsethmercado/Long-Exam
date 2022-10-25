import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

     
        char[] Mercado = { 'M', 'E', 'R', 'C', 'A', 'D', 'O' };

        for (int i = 0; i < Mercado.length; i++) {
            System.out.println(Mercado[i]);
        }

       
        System.out.println(Mercado[0]);
        

        
        System.out.println(Mercado[6]);

        for (int i = Mercado.length - 1; i >= 0; i--) {
            System.out.println(Mercado[i]);
        }

       
        LinkedList<String> studentnumber = new LinkedList<>();

        studentnumber.add("1");
        studentnumber.add("0");
        studentnumber.add("9");
        studentnumber.add("3");
        studentnumber.add("5");
        studentnumber.add("7");

       



        
        studentnumber.addFirst("*");

 

        
        studentnumber.addLast("*");
        System.out.println(studentnumber);

      
        System.out.println(studentnumber.get(7));


        studentnumber.set(7, "!");

       
        studentnumber.remove(0);

        System.out.println(studentnumber);

        
        Stack<String> INF214 = new Stack<>();
        INF214.push("M");
        INF214.push("E");
        INF214.push("R");
        INF214.push("C");
        INF214.push("A");
        INF214.push("D");
        INF214.push("O");

       

      
     

      
        INF214.push("I");
        INF214.push("N");
        INF214.push("F");
        INF214.push("2");
        INF214.push("1");
        INF214.push("4");

        System.out.println(INF214);

        INF214.pop();
        INF214.pop();
        INF214.pop();
        INF214.pop();
        INF214.pop();
        INF214.pop();

        INF214.push("C");
        INF214.push("C");
        INF214.push("D");
        INF214.push("A");
        INF214.push("T");
        INF214.push("R");
        INF214.push("C");
        INF214.push("L");
        INF214.push("-");
        INF214.push("I");
        INF214.push("N");
        INF214.push("F");
        INF214.push("2");
        INF214.push("1");
        INF214.push("4");

 
        System.out.println(INF214);
    }
}
