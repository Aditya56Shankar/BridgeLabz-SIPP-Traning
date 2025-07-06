import java.util.*;

public class SocialMediaFriendConnections {
    static class User {
        int userId;
        String name;
        int age;
        List<Integer> friendIds;
        User next;

        User(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friendIds = new ArrayList<>();
        }
    }

    static User head = null;

    public static void addUser(int id, String name, int age) {
        User user = new User(id, name, age);
        if (head == null) head = user;
        else {
            User temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = user;
        }
    }

    public static void addFriend(int userId, int friendId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                temp.friendIds.add(friendId);
                break;
            }
            temp = temp.next;
        }
    }

    public static void displayFriends(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                System.out.println("Friends of " + temp.name + ": " + temp.friendIds);
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addUser(1, "Alice", 22);
        addUser(2, "Bob", 23);
        addFriend(1, 2);
        addFriend(2, 1);
        displayFriends(1);
        displayFriends(2);
    }
}