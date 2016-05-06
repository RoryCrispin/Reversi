package com.rozzles;

import com.rozzles.board.Board;
import com.rozzles.view.Window;


public class Reversi {

    public static void main (String args[]){
        Reversi main = new Reversi();
        main.run();
    }

    public static Board board;

    private  void run(){
        board = new Board();
        Window black = new Window( true);
        black.displayView();
        Window white = new Window( false);
        white.displayView();
        board.addWindow(white,0);
        board.addWindow(black,1);

    }
}

