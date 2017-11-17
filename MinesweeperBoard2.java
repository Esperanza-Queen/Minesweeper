        
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard2{
    Cell[] board;
    int rows;
    int columns;
    public MinesweeperBoard2( int row, int column, int bombs){
        //Put the constructor here.
        this.columns = column;
        this.rows = row;
        board = new Cell[rows*columns]; 
        
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        addBombs(bombs);
    }
                        
    public MinesweeperBoard2 (){
        this (10,10,10);
    }

    public void addBombs(int bombs) { //throws Exception{
        for (int a = 0; a < bombs; a++) {
            int bomb = (int) (Math.random() * (rows*columns));
            if ( board[index].getValue() == -1){
               
            }
            
            
        }
    }

    public void addNums(){ 
        
        // Top Right 
        for ( int i = 0; i < rows ; i++ ) {
            for ( int i = 0; i < columns; i++) {
            
            }
        
        }
    }
   
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        int k = 0 ;
       for (int i = 0 ; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
               System.out.print(board[k].getValue() + " "); 
               k++;
            }
            System.out.println();
        }
    }
    
    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        
        for(int i = 0; i< rows*columns; i++){
                board[i]= new Cell();
                panel.add(board[i].getButton());
            }
        return panel;
    }

   }
