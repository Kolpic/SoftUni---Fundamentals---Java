package Exercise_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles20_04 {
    private String title;
    private String content;
    private String author;

    @Override
    public String toString(){
        return this.title + " - " + this.content + ": " + this.author;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Articles_02.Article> listOfArticles = new ArrayList<>();

        while (n != 0) {
            String[] article = scanner.nextLine().split(", ");
            String currentTile = article[0];
            String currentContent = article[1];
            String currentAuthor = article[2];

            Articles_02.Article articles = new Articles_02.Article(currentTile, currentContent, currentAuthor);
            listOfArticles.add(articles);

            n--;
        }
        String input = scanner.nextLine();

        for(Articles_02.Article items : listOfArticles){
            System.out.println(items);
        }
    }
}
