/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.ahorcado.entities;

/**
 *
 * @author idmig
 */
public class AhorcadoEnt {
    
    private String [] searchedWord;
    private int findedLetters;
    private int maxTrys;

    public AhorcadoEnt() {
    }
        

    public AhorcadoEnt(String[] searchedWord, int findedLetters, int maxTrys) {
        this.searchedWord = searchedWord;
        this.findedLetters = findedLetters;
        this.maxTrys = maxTrys;
    }

    public String[] getSearchedWord() {
        return searchedWord;
    }

    public void setSearchedWord(String[] searchedWord) {
        this.searchedWord = searchedWord;
    }

    public int getFindedLetters() {
        return findedLetters;
    }

    public void setFindedLetters(int findedLetters) {
        this.findedLetters = findedLetters;
    }

    public int getMaxTrys() {
        return maxTrys;
    }

    public void setMaxTrys(int maxTrys) {
        this.maxTrys = maxTrys;
    }
    
    
    
}
