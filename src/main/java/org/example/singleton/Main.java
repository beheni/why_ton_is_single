package org.example.singleton;

import org.example.singleton.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Yaroslav", "ya.prytula", 18);
        user.save();
    }
}
