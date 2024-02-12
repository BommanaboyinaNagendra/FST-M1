package Activites;

abstract class Book1{
    String title;

    abstract public void setTitle(String title);

    public String getTitle(){
        return title;
    }

}
class MyBook extends Book1{

    @Override
    public void setTitle(String title) {
        this.title=title;
        System.out.println(this.title);
    }
}
public class Activity5 {
    public static void main(String[] args) {
        MyBook newNovel=new MyBook();
        newNovel.setTitle("Good Day Novel");
        System.out.println(newNovel.getTitle());
    }

}
