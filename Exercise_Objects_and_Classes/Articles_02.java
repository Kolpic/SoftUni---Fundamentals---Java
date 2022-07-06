package Exercise_Objects_and_Classes;
import java.util.Scanner;
public class Articles_02 {

 static class Article {
                String title;
                String content;
                String author;

 public Article(String title, String content, String author) {
    this.title = title;
    this.content = content;
    this.author = author;
   }
   public void edit(String newContent){
   this.content = newContent;
 }
    public void changeAuthor(String newAuthor){
    this.author = newAuthor;
    }
     public void rename (String newTitle){
     this.title = newTitle;
      }
      @Override
     public String toString(){
     return this.title + " - " + this.content + ": " + this.author;
      }

 }
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     String readingTitle = scanner.nextLine();

     int n = Integer.parseInt(scanner.nextLine());

     String currentTile = readingTitle.split(", ")[0];
     String currentContent = readingTitle.split(", ")[1];
     String currentAuthor = readingTitle.split(", ")[2];

     Article article = new Article(currentTile,currentContent,currentAuthor);

     while (n != 0){
         String command = scanner.nextLine();

         String commandFunction = command.split("\\: ")[0];
         String commandName = command.split("\\: ")[1];

         switch (commandFunction){
             case "Edit":
                 article.edit(commandName);
                 break;

             case "ChangeAuthor":
                 article.changeAuthor(commandName);
                 break;

             case "Rename":
                 article.rename(commandName);
                 break;
         }
         n--;
     }
     System.out.println(article);
 }
}

