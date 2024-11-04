class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello World !!!");
        System.out.println();
        System.out.println("Hello " + "World !!!" + 50 + 25);
        String m1, m2, m3;
        m1 = "Quest for the Holy Grail";
        m2 = m1.toLowerCase();
        //m3 = STR."\{m1} \{m2}";
        // System.out.println (m3.replace('h','z'));
        System.out.println(m2);
        for (int i = 0; i < 20; i++) {
            System.out.println(STR."I am i = \{i++ + i++} mama."); // Xoss
            /*
            I am i = 1 mama.
            I am i = 7 mama.
            I am i = 13 mama.
            I am i = 19 mama.
            I am i = 25 mama.
            I am i = 31 mama.
            I am i = 37 mama.
             */
        }
    }
}
