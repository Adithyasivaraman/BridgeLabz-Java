class FriendNode {
    int id;
    FriendNode next;

    FriendNode(int id) {
        this.id = id;
    }
}

class UserNode {
    int userId;
    String name;
    FriendNode friends;
    UserNode next;

    UserNode(int id, String name) {
        this.userId = id;
        this.name = name;
    }
}

class SocialNetwork {
    private UserNode head;

    public void addUser(int id, String name) {
        UserNode u = new UserNode(id, name);
        u.next = head;
        head = u;
    }

    public void addFriend(int u1, int u2) {
        UserNode user1 = findUser(u1);
        UserNode user2 = findUser(u2);
        if (user1 != null && user2 != null) {
            FriendNode f1 = new FriendNode(u2);
            f1.next = user1.friends;
            user1.friends = f1;

            FriendNode f2 = new FriendNode(u1);
            f2.next = user2.friends;
            user2.friends = f2;
        }
    }

    private UserNode findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void displayFriends(int id) {
        UserNode u = findUser(id);
        System.out.print("Friends of " + u.name + ": ");
        FriendNode f = u.friends;
        while (f != null) {
            System.out.print(f.id + " ");
            f = f.next;
        }
        System.out.println();
    }
}

public class SocialNetworkLL {
    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        sn.addUser(1, "Adi");
        sn.addUser(2, "Rahul");
        sn.addUser(3, "Kiran");

        sn.addFriend(1, 2);
        sn.addFriend(1, 3);

        sn.displayFriends(1);
    }
}
