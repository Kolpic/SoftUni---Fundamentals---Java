package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courseNames = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")){
            String[] commandArr = command.split(":");

            switch (commandArr[0]){
                case "Add":
                    if (courseNames.contains(commandArr[1])){
                        break;
                    }else {
                        courseNames.add(commandArr[1]);
                    }
                    break;

                case "Insert":
                    String lessonTitle = commandArr[1];
                    int index = Integer.parseInt(commandArr[2]);

                    if (courseNames.contains(commandArr[1])){
                        break;
                    }else{
                        courseNames.add(index,lessonTitle);
                    }
                    break;

                case "Remove":
                    String nameToRemove = commandArr[1];

                    if (courseNames.contains(nameToRemove)){
                        courseNames.remove(nameToRemove);
                    }else{
                        break;
                    }
                    break;

                case "Swap":
                    String lessonToChange = commandArr[1];
                    String lessonToChangeTheFirstWith = commandArr[2];

                    if (courseNames.contains(lessonToChange) && courseNames.contains(lessonToChangeTheFirstWith)){
                        int indexLessonToChange = courseNames.indexOf(lessonToChange);
                        int indexLessonToChangeTheFirstWith = courseNames.indexOf(lessonToChangeTheFirstWith);

                        courseNames.set(indexLessonToChange,lessonToChangeTheFirstWith);
                        courseNames.set(indexLessonToChangeTheFirstWith,lessonToChange);
                        ////////////////////////////////////////////////////////////////
                        if (courseNames.contains(lessonToChangeTheFirstWith + "-Exercise")){
                            int indexExerciseToChange = courseNames.indexOf(lessonToChangeTheFirstWith + "-Exercise");
                            courseNames.remove(indexExerciseToChange);
                            courseNames.add(indexLessonToChange + 1,lessonToChangeTheFirstWith + "-Exercise");
                        }else if(courseNames.contains(lessonToChange + "-Exercise")){
                            int indexExercise = courseNames.indexOf(lessonToChange + "-Exercise");
                            courseNames.remove(indexExercise);
                            courseNames.add(indexLessonToChangeTheFirstWith + 1,lessonToChange + "-Exercise");
                        }
                    }
                    break;

                case "Exercise":
                    String lessonTitleExercise = commandArr[1];

                    if (courseNames.contains(lessonTitleExercise)){
                        if (courseNames.contains(lessonTitleExercise + "-Exercise")){
                            continue;
                        }
                        int indexLessonTitle = courseNames.indexOf(lessonTitleExercise);
                        courseNames.add(indexLessonTitle + 1,lessonTitleExercise + "-Exercise");
                    }else{
                        courseNames.add(lessonTitleExercise);
                        courseNames.add(lessonTitleExercise + "-Exercise");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 1; i <= courseNames.size(); i++) {
            System.out.printf("%d.%s%n",i,courseNames.get(i-1));
        }
    }
}
