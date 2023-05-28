public class Reader {
    String Fullname;
    int numberticket;
    String faculty;
    String birthday;
    String phone;
    static int Counter = 1;
    Reader (String Fullname, String faculty, String birthday, String phone){
        this.Fullname = Fullname;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
        numberticket = Counter++;
    }
    public String TakeBook(int Quantity){
        return this.Fullname + " взял(а) " + Quantity + " книг";
    }
    public String TakeBook(String books){
        return this.Fullname + " взял(а) книги:" + books;
    }
    public String ReturnBook(int Quantity){

        return this.Fullname + " Вернул(а) " + Quantity + " книг";
    }
    public String ReturnBook(String books){
        return this.Fullname + " Вернул(а) книги: " + books;
    }
}