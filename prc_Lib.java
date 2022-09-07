class Library{
    String [] books;
    int number_of_books;
    Library() {
        this.books = new String[100];
        this.number_of_books = 0;
    }
    public void addBooks(String book){
        this.books[number_of_books]=book;
        System.out.println(book+" is added");
        number_of_books++;
    }
    public void issueBook(String book) {
            for (int i=0;i<this.books.length;i++) {
                if (this.books[i].equals(book)) {
                    System.out.println(book + " book has been issued");
                    this.books[i] = null;
                    return;
                }
            }
        System.out.println("this book doesn't exist");
        }

        public void returnBook(String book){
          addBooks(book);
        }
        public void showAvailableBooks() {
            System.out.println("Available books are");
            for (String book : this.books) {
                if (book == null) {
                    continue;
                }
                System.out.println("* " + book);
            }
        }
    }
public class prc_Lib {
    public static void main(String[] args) {
      Library lib=new Library();
      lib.addBooks("C++");
      lib.addBooks("Digital Electronics");
      lib.addBooks("Engineering Mathematics");
      lib.addBooks("Control System");
      lib.showAvailableBooks();
      lib.issueBook("C++");
      lib.showAvailableBooks();
      lib.returnBook("C++");
      lib.showAvailableBooks();
    }
}
