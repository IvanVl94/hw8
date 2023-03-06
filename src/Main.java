import homework8.Authors;
import homework8.Book;

    public class Main {
        public static void main(String[] args) {
            Book war = new Book("Война и мир", 1863);
            System.out.println("war.getTitle() = " + war.getTitle());
            System.out.println("war.getYear() = " + war.getYear());
            war.setYear(1895);
            System.out.println("war.getYear() = " + war.getYear());
            Authors lev = new Authors("Лев", "Толстой");
            System.out.println("lev.getName() = " + lev.getName());
            System.out.println("lev.getSurname() = " + lev.getSurname());
            Book souls = new Book("Мертвые души", 1835);
            System.out.println("souls.getTitle() = " + souls.getTitle());
            System.out.println("souls.getYear() = " + souls.getYear());
            Authors nik = new Authors("Николай", "Гоголь");
            System.out.println("nik.getName() = " + nik.getName());
            System.out.println("nik.getSurname() = " + nik.getSurname());
        }
    }