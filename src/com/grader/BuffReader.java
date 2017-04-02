package com.grader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffReader {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public BuffReader() {

    }

    public String ask() throws IOException {

        return reader.readLine();
    }

    public String ask(String question) throws IOException {

        return reader.readLine();
    }

}
