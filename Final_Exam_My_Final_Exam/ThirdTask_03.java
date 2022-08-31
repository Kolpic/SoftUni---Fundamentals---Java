package Final_Exam_My_Final_Exam;

import java.util.*;

public class ThirdTask_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityOfMessages = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String,Message> mapUserAndMessage = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("Statistics")){
            String action = command.split("=")[0];
            switch (action){
                case"Add":
                    String username = command.split("=")[1];
                    int sent = Integer.parseInt(command.split("=")[2]);
                    int received = Integer.parseInt(command.split("=")[3]);
                    if (!mapUserAndMessage.containsKey(username)){
                        Message message = new Message(sent,received);
                        mapUserAndMessage.put(username,message);
                     }
                    break;

                case"Message":
                    String sender = command.split("=")[1];
                    String receiver = command.split("=")[2];
                    if (mapUserAndMessage.containsKey(sender) && mapUserAndMessage.containsKey(receiver)){
                        int currentSentMessage = mapUserAndMessage.get(sender).getSent();
                        mapUserAndMessage.get(sender).setSent(currentSentMessage + 1);

                        int currentReceivedMessage = mapUserAndMessage.get(receiver).getReceived();
                        mapUserAndMessage.get(receiver).setReceived(currentReceivedMessage + 1);
                    }
                    int allMessagesSenderS = mapUserAndMessage.get(sender).getSent();
                    int allMessagesSenderR = mapUserAndMessage.get(sender).getReceived();

                    if ((allMessagesSenderS + allMessagesSenderR) >= capacityOfMessages){
                        mapUserAndMessage.remove(sender);
                        System.out.printf("%s reached the capacity!%n",sender);
                    }

                    int allMessagesReceiverS = mapUserAndMessage.get(receiver).getSent();
                    int allMessagesReceiverR = mapUserAndMessage.get(receiver).getReceived();

                    if ((allMessagesReceiverS + allMessagesReceiverR) >= capacityOfMessages){
                        mapUserAndMessage.remove(receiver);
                        System.out.printf("%s reached the capacity!%n",receiver);
                    }
                    break;

                case"Empty":
                    String usernameEmpty = command.split("=")[1];
                    if (mapUserAndMessage.containsKey(usernameEmpty)){
                        mapUserAndMessage.remove(usernameEmpty);
                    }else if (usernameEmpty.equals("All")){
                        mapUserAndMessage.clear();
                    }
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Users count: %d%n",mapUserAndMessage.size());
        mapUserAndMessage.entrySet().forEach
                (e-> System.out.printf("%s - %d%n",e.getKey(),(e.getValue().getSent() + e.getValue().getReceived())));
    }
    static class Message{
        int sent;
        int received;

        public Message(int sent, int received) {
            this.sent = sent;
            this.received = received;
        }

        public int getSent() {
            return sent;
        }

        public void setSent(int sent) {
            this.sent = sent;
        }

        public int getReceived() {
            return received;
        }

        public void setReceived(int received) {
            this.received = received;
        }
    }
}
