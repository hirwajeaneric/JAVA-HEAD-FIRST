class BooksTestDrive {
    public static void main(String[] args) {
        //This is an array of 3 Books with Datatype as the Book Class. 
        //Since a class can be a Datatype too.
        Books [] myBooks = new Books[3];
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java CookBook";
        myBooks[0].author = "Hirwa";
        myBooks[1].author = "Jean";
        myBooks[2].author = "Eric";

        while (x<3) {
            System.out.println(myBooks[x].title);
            System.out.println(" by ");
            System.out.println(myBooks[x].author);
            x++;
        }
    }
}
