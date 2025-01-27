// super class
class Book{
    // Attribute of this class
    String title;
    int publicationYear;

    // constructor
    Book(String title,int publicationYear){
        this.title = title;
        this.publicationYear= publicationYear;
    }

    // method for display information
    void displayInfo(){
        System.out.println();
        System.out.println("Title : "+title);
        System.out.println("Publication Year : "+publicationYear);
    }

}
// class Author is child class of book class
class Author extends Book{

    // Attribute of this class
    String name;
    String bio;

    // constructure
    Author(String title,int publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name= name;
        this.bio = bio;
    }
    // displayInfo method is same to super class we use override to call this same method
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name : "+name);
        System.out.println("Bio : "+bio);
        System.out.println();

    }
}




class LibrarySystem {
    public static void main (String[] args){

        // creating object for class
        Book authorBook = new Author("Pride and Prejudice",2024,"Jane Austen","pride and prejudice for human");
        authorBook.displayInfo();

        Author authorBook1 = new Author(
                "1984",
                1949,
                "George Orwell",
                "A renowned English novelist known for his dystopian and political works, including 'Animal Farm'."
        );
        authorBook1.displayInfo();
    }
}
