package day13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Bob");
        User user2 = new User("Igor");
        User user3 = new User("Nik");

        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Как дела");

        user2.sendMessage(user1, "Hi !");
        user2.sendMessage(user1, "How are you ?");
        user2.sendMessage(user1, "What are you doind ?");

        user3.sendMessage(user1, "Привет Bob");
        user3.sendMessage(user1, "Как дела Bob");
        user3.sendMessage(user1, "Что делаешь Bob");

        user1.sendMessage(user3, "Hi Nik!");
        user1.sendMessage(user3, "How are you Nik?");
        user1.sendMessage(user3, "What are you doind Nik?");

        user3.sendMessage(user1, "Все хорошо ...");



        MessageDatabase.showDialog(user1, user3);

        System.out.println("------------------");

        List<Message> messageList = MessageDatabase.getMessages();
        for( Message currentMessage:messageList){
            System.out.println(currentMessage);
        }

    }
}
