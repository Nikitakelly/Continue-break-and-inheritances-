class fabbs {
    public static void main(String[] args) {
        pen mypen = new pen();
        book mybook = new book();
        shoe myshoe= new shoe();

        
        mypen.write();
        mybook.redd();
        myshoe.clean();
        myshoe.redd();
    }
}

interface writes {
    void write();
}

interface red{
    void redd();
}
class pen implements writes {
    public void write() {
        System.out.println("pen is writting");
    }
}
class book implements redd {
    public void red() {
        System.out.println("Fish is swimming");
    }
}

class shoe implements clean, redd{
    public void redd() {
        System.out.println("well done");
    }
    public void write() {
        System.out.println("book is red");
    }
}

