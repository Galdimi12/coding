public class IfStatement {
    public static void main( String[] args) {

        char gjinia = 'M'; int age = 19;
        if  (gjinia  == 'M') {
            if(age <= 14)
                System.out.println  ("Young female");
            else if( age > 14 || age < 19)
                System.out.println  ("Teenage female");
            else
                System.out.println  ("Woman");
        }
           else {
            if(age <= 14)
                System.out.println  ("Young male") ;
            else if( age > 14 && age < 19)
                System.out.println  ("Teenage male") ;
            else
                System.out.println  ("Man") ;
        }


    }
}
