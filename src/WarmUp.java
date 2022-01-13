public class WarmUp {
    public static void main(String[] args) {
//        for (int i=100; i>=0 ; i -= 5)
//            System.out.println(i);

//        System.out.printf("%5s %5s %5s%n","i","i/20","i%20");
        for (int i=0; i<=100 ; i += 10) {
            System.out.printf("%3d", i);
            if (i%20==0)
                System.out.printf("-Java");
            System.out.println();
        }
//            System.out.printf("%5d %5d %5d%n", i, i/20, i%20);

        //the 2 line version
        for (int i=0; i<=100 ; i+=10)
            System.out.printf("%3d%s%n",i,(i%20==0)?"-Java":"");

        System.out.println("The initials for Jaret Wright are: "+getInitials("Jaret","Wright"));

        if (timeToSkiBoolean(34))
            System.out.println("Awesome I love skiing");

        if (timeToSkiString(34)=="True")
            System.out.println("Awesome I love skiing");
        else
            System.out.println("I'll do some coding instead");
    }

    /**
     * This method will return a users intials
     * public static (that means the method can be called from any other class)
     * public static String (this means that the method will return a String
     * getIntials() - this is the methods' name
     * (String first, String last) - these are the "arguments" This is how we pass
     *                              information into a method.
     */
    public static String getInitials(String first, String last)
    {
        return String.format("%s.%s.", first.charAt(0), last.charAt(0));
    }

    /**
     * timeToSki() returns true if the snow depth is over 30cm, false otherwise
     *
     */
    public static String timeToSkiString(int snowDepth)
    {
        return String.format("%s",(snowDepth>30)?"true":"false");
    }

    public static boolean timeToSkiBoolean(int snowDepth)
    {
        return snowDepth>30;
    }

}
