package day5;

public class book implements Comparable <book> {
    private String title;

    public book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    private String author;
    private int price;

    public String toString()
    {
        return ("title "+title+" author : "+author+"  price : "+price);
    }
    public int compareTo(book b)
    {
        int i=this.title.compareTo(b.title);
        if(i!=0)
        {
            return i;
        }
        i=this.author.compareTo(b.author);
        if(i!=0)
        {
            return i;
        }
        return Integer.compare(this.price,b.price);
    }

}


