/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andt;

import javax.inject.Named;

/**
 *
 * @author andt
 */
@Named("helloWorld")
public class HelloWorld {
    private String words = "hello world!";

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
