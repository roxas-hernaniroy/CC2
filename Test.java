public class test { //public class [filename]
    public static void main(String[] args) {
        
        //single line comment
        
        /*
        multi line
        comment
        */
        
        //never forget the semicolon ;
        //text should always be between "", add a space after text string for readability
        
        System.out.println ("Sator \tArepo \nTenet \"Opera\" ");
        // println adds a line break after the code line
        // \t adds tabspace before the text
        // \n adds a new line before the text
        // \ followed by the symbol that would otherwise break code prevents it from doing so
        
        System.out.print ("Sator Arepo Tenet ");
        System.out.println ("Opera Rotas ");
        //print does not add a line break after the code line
        
        //1000 digit random number dependent if else print
        int X = (int)(Math.random() * 1001);
        int Y = (int)(Math.random() * 1001);
        if (X > Y){
            System.out.println("AWOOOOOOOOOGA");
        }
        else
            System.out.println("BOMBOOOOOCLAT");

        //boolean RNG two variables
        int Z = (int)(Math.random() * 11);
        int A = (int)(Math.random() * 11);
        System.out.println(Z > A);
        }
}
