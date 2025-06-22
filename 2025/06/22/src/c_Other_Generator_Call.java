public class c_Other_Generator_Call {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public c_Other_Generator_Call() {
        this("","");
        System.out.println("생성자 호출");
    }

    public c_Other_Generator_Call(String title) {
        this(title,"작자 미상");
    }

    public c_Other_Generator_Call(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        c_Other_Generator_Call littlePrince = new c_Other_Generator_Call("어린왕자", "생택쥐페리");
        c_Other_Generator_Call loveStory = new c_Other_Generator_Call("춘향전");
        c_Other_Generator_Call emptyBook = new c_Other_Generator_Call();
        loveStory.show();
    }
}
