package Lab_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {

    static class Song {
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }
        public String getTypeList() {
            return this.typeList;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return this.time;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] inputArr = scanner.nextLine().split("_");

            String inputList = inputArr[0];
            String inputName = inputArr[1];
            String inputTime = inputArr[2];

            Song currentSong = new Song();
            currentSong.setTypeList(inputList);
            currentSong.setName(inputName);
            currentSong.setTime(inputTime);

            songList.add(currentSong);

        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song item : songList){
                System.out.println(item.getName());
            }
        }else{
            for (Song item : songList){
                if(item.getTypeList().equals(command)){
                    System.out.println(item.getName());
                }
            }
        }
    }
}
