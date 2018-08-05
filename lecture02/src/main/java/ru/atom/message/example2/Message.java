package ru.atom.message.example2;

import java.io.File;

/**
 * Created by sergey on 2/28/17.
 */
public class Message implements Storable {

    public Message(String content) {
        String content1 = content;
    }

    @Override
    public void saveTo(File file) {
        // some stuff to save Message to file
        System.out.println("Save to in action");
    }

    // ...
}
