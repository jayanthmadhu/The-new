public class A10 {

    public static void main(String[] args) {        
        String s = "jayanth";
        while (s.length() > 0) {
           
            char[] ch = s.toCharArray();

           
            for (int k = 1; k <= ch.length; k++) {
                for (int i = 0; i < k; i++) {
                    System.out.print(ch[i]);
                }
                System.out.println();  
            }         
            System.out.println("      ");
            s = s.substring(1);  
        }
    }
}
