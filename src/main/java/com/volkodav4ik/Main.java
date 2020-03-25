package com.volkodav4ik;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static final String SAVE_FILE_NAME = "save.txt";
    private static Group group;

    public static void main(String[] args) {
        gsonFromFile();
        System.out.println(group.toString());
    }
    private static void gsonFromFile(){
        try (BufferedReader reader = new BufferedReader(new FileReader(SAVE_FILE_NAME))){
            String strForParsing = reader.readLine();
            Gson gson = new GsonBuilder().create();
            group = gson.fromJson(strForParsing, Group.class);
        } catch (IOException e){
            System.out.println("File hasn't been found!");
        }
    }
}
