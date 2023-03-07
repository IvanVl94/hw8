import homework8.Authors;
import homework8.Book;

    public class Main {
        public static void main(String[] args) {
            Authors lev = new Authors("Лев", "Толстой");
            Book war = new Book("Война и мир", lev, 1863);
            System.out.println("war.getTitle() = " + war.getTitle());
            System.out.println("war.getAuthors().getName() = " + war.getAuthors().getName());
            System.out.println("war.getAuthors().getSurname() = " + war.getAuthors().getSurname());
            System.out.println("war.getYear() = " + war.getYear());
            war.setYear(1895);
            System.out.println("war.getYear() = " + war.getYear());
            Authors nik = new Authors("Николай", "Гоголь");
            Book souls = new Book("Мертвые души", nik, 1835);
            System.out.println("souls.getTitle() = " + souls.getTitle());
            System.out.println("souls.getAuthors().getName() = " + souls.getAuthors().getName());
            System.out.println("souls.getAuthors().getSurname() = " + souls.getAuthors().getSurname());
            System.out.println("souls.getYear() = " + souls.getYear());

        }
    }