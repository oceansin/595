package com.simplilearn.mavenproject;

import java.util.Objects;

public class Sample {
    public static void main(String[] args) {
        System.out.println(new MessageGenerator().generateMessage("Vipul"));
    }
}
 
class MessageGenerator {
    public String generateMessage(String username) {
        if (Objects.nonNull(username))
            return "Hello" + username + "!";
        else
            return "Hello world!";
    }
}