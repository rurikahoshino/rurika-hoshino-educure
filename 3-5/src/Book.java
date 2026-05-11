class Book {
    int id;
    String title;
    String author;
    int pages;

    Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
        this.pages=0;
    }

    Book(int id,String title,String author,int pages){
        this.id=id;
        this.title=title;
        this.author=author;
        this.pages=pages;
    }

    void displayInfo(){
        System.out.println("本"+id+":"+title+"-"+author+"("+pages+"ページ)");
    }
}
