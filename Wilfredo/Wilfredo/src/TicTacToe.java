/*
1. Implement Tic-Tac-Toe game
2. Use JOptionPane to display the gameboard
3. Include the outline of how you implement the game
*****************************
STUDENT: WILFREDO HENRIQUEZ
*****************************
 */
import javax.swing.JOptionPane; // import class JoptionPane
public class TicTacToe 
{
 public static void main ( String[] args)
 {
  String answer="y";    //  global variable 

  do { // **  LOOP #1  MAIN LOOP; EXIT BY USER WHEN ANSWER: y/n  
   
   int  player = 0;
   char number1 = '1';
   char number2 = '2';
   char number3 = '3';
   char number4 = '4';
   char number5 = '5';
   char number6 = '6';
   char number7 = '7';
   char number8 = '8';
   char number9 = '9';
   char playerMarker = 'X';
   char systemMarker = 'O';
   String winnerMessage = "";
   int  gameOver = 0;
   int  validMove= 0;
   int  systemMove = 0;
   
   int initial = 1 + (int)(Math.random()* (9) ); // generate a number 1 thru 9
  
   // *********   System Start  Playing  *********************
   // ********************************************************
    if (initial == 1) number1 = systemMarker;
    else if (initial == 2) number2 = systemMarker;
    else if (initial == 3) number3 = systemMarker;
    else if (initial == 4) number4 = systemMarker;
    else if (initial == 5) number5 = systemMarker;
    else if (initial == 6) number1 = systemMarker;
    else if (initial == 7) number1 = systemMarker;
    else if (initial == 8) number1 = systemMarker;
    else if (initial == 9) number1 = systemMarker;
  
   // ******* LOOP #2   MAIN LOOP FOR THE GAME **************
   do{  
  
    //********* LOOP #3  INTERNAL  PLAYER  ENTRY  ************************
    do {    
     String playerEntry = JOptionPane.showInputDialog
       ("TIC-TAC-TOE GAME, System='O',  Player='X' \n  " + "Choose your SQUARE by Chosing a Number' \n"+ 
                    "__" + number1 + "__|__" + number2 + "__|__" + number3 + "__" + "\n" +
                    "__" + number4 + "__|__" + number5 + "__|__" + number6 + "__" + "\n" + 
              "__" + number7 + "__|__" + number8 + "__|__" + number9 + "__");
     player = Integer.parseInt(playerEntry);
    
     if (player == 1 && number1 !='X' && number1 !='O')
      {number1 = playerMarker; validMove = 1;}
     else if (player == 2  && number2 !='X' && number2 !='O')
      {number2 =  playerMarker;validMove = 1;}
     else if (player == 3 && number3 !='X' && number3 !='O')
      {number3 =  playerMarker;validMove = 1;} 
     else if (player == 4 && number4 !='X' && number4 !='O')
      {number4 =  playerMarker;validMove = 1;} 
     else if (player == 5 && number5 !='X' && number5 !='O')
      {number5 =  playerMarker;validMove = 1;} 
     else if ( player == 6 && number6 !='X' && number6 !='O')
      {number6 =  playerMarker;validMove = 1;}
     else if (player == 7 && number7 !='X' && number7 !='O')
      {number7 =  playerMarker;validMove = 1;} 
     else if (player == 8 && number8 !='X' && number8 !='O')
      {number8 =  playerMarker;validMove = 1;}
     else if (player == 9 && number9 !='X' && number9 !='O')
      {number9 =  playerMarker;validMove = 1;}
     else 
      {
      validMove = 0; 
      JOptionPane.showMessageDialog (null,  
      "__" + number1 + "__|__" + number2 + "__|__" + number3 + "__" + "\n" +
      "__" + number4 + "__|__" + number5 + "__|__" + number6 + "__" + "\n" + 
      "__" + number7 + "__|__" + number8 + "__|__" + number9 + "__", "PLAYER CHOSE = "+
      playerEntry + ", ENTRY TAKEN",  JOptionPane.INFORMATION_MESSAGE );
      }
                   
     }  while (validMove != 1); 
     // ******* END LOOP #3: 'DO/WHILE' USER ENTRY *************************
  
  
     do {
      //******* LOOP #4  'DO/WHILE,   SYSTEM  TRYING BEAT USER *********
      //*************************************************************************
      switch (player)
      {
      case 1:
       if (number2 =='2'){number2 = systemMarker; systemMove = 1;}
       else if (number4 =='4'){number4 = systemMarker; systemMove = 1;}
       else if (number5 =='5'){number5 = systemMarker; systemMove = 1;}
       break;
      case 2:
       if (number1 =='1'){number1 = systemMarker; systemMove = 1;}
       else if (number3 =='3'){number3 = systemMarker; systemMove = 1;}
       else if (number5 =='5'){number5 = systemMarker; systemMove = 1;}
       break;
      case 3:
       if (number2 =='2'){number2 = systemMarker; systemMove = 1;}
       else if (number5 =='5'){number5 = systemMarker; systemMove = 1;}
       else if (number6 =='6'){number6 = systemMarker; systemMove = 1;}
       break;
      case 4:
       if (number1 =='1'){number1 = systemMarker; systemMove = 1;}
       else if (number5 =='5'){number5 = systemMarker; systemMove = 1;}
       else if (number7 =='7'){number7 = systemMarker; systemMove = 1;}
       break;
      case 5:     // this number is in the center  with 8 posibilities
       if  ((number1 =='1') && (number9=='X')){number1 = systemMarker; systemMove = 1;} 
       else if ((number2 =='2') && (number8=='X')){number2 = systemMarker; systemMove = 1;}
       else if ((number3 =='3') && (number7=='X')){number3 = systemMarker; systemMove = 1;}
       else if ((number4 =='4') && (number6=='X')){number4 = systemMarker; systemMove = 1;}
       else if ((number6 =='6') && (number4=='X')){number6 = systemMarker; systemMove = 1;} 
       else if ((number7 =='7') && (number3=='X')){number7 = systemMarker; systemMove = 1;} 
       else if ((number8 =='8') && (number2=='X')){number8 = systemMarker; systemMove = 1;} 
       else if ((number9 =='9') && (number1=='X')){number9 = systemMarker; systemMove = 1;} 
       else if ((number1 =='O') && (number2=='2')){number2 = systemMarker; systemMove = 1;} 
       else if ((number1 =='O') && (number4=='4')){number4 = systemMarker; systemMove = 1;}
       else if ((number3 =='O') && (number2=='2')){number2 = systemMarker; systemMove = 1;} 
       else if ((number3 =='O') && (number6=='6')){number6 = systemMarker; systemMove = 1;}
       else if ((number7 =='O') && (number8=='8')){number8 = systemMarker; systemMove = 1;} 
       else if ((number7 =='O') && (number4=='4')){number4 = systemMarker; systemMove = 1;}
       else if ((number9 =='O') && (number6=='6')){number6 = systemMarker; systemMove = 1;} 
       else if ((number9 =='O') && (number8=='8')){number8 = systemMarker; systemMove = 1;}
       else if ((number2 =='O') && (number1=='1')){number1 = systemMarker; systemMove = 1;} 
       else if ((number2 =='O') && (number3=='3')){number3 = systemMarker; systemMove = 1;}
       else if ((number4 =='O') && (number1=='1')){number1 = systemMarker; systemMove = 1;} 
       else if ((number4 =='O') && (number7=='7')){number7 = systemMarker; systemMove = 1;}
       else if ((number6 =='O') && (number9=='9')){number9 = systemMarker; systemMove = 1;} 
       else if ((number6 =='O') && (number3=='3')){number3 = systemMarker; systemMove = 1;}
       else if ((number8 =='O') && (number7=='7')){number7 = systemMarker; systemMove = 1;} 
       else if ((number8 =='O') && (number9=='9')){number9 = systemMarker; systemMove = 1;}
       break;
      case 6:
       if   (number3 =='3'){number3 = systemMarker; systemMove = 1;}
       else if (number5 =='5'){number5 = systemMarker; systemMove = 1;}
       else if (number9 =='9'){number9 = systemMarker; systemMove = 1;}
       break;
      case 7:
       if   (number4 =='4'){number4 = systemMarker; systemMove = 1;}
       else if (number5 =='5'){number5 = systemMarker; systemMove = 1;}
       else if (number8 =='8'){number8 = systemMarker; systemMove = 1;}
       break;
      case 8:
       if   (number7 =='7'){number7 = systemMarker; systemMove = 1;}
       else if (number5 =='5'){number5 = systemMarker; systemMove = 1;}
       else if (number9 =='9'){number9 = systemMarker; systemMove = 1;}    
       break;
      case 9:
       if   (number6 =='6'){number6 = systemMarker; systemMove = 1;}
       else if (number5 =='5'){number5 = systemMarker; systemMove = 1;}
       else if (number8 =='8'){number8 = systemMarker; systemMove = 1;}    
       break;
      }
     } while (systemMove != 1);
     //  **** END LOOP #4  'DO/WHILE'  SYSTEM MOVE SQUARE ENTRY***
 
  
   // ****checking for row or colunm or Diagonal  Player Winner ********
   // ******************************************************************
     if ( number1=='X' && number4=='X' && number7=='X')
       { winnerMessage = "Player Win" ; gameOver=1;}  // col 1
     else if ( number2=='X' && number5=='X' && number8=='X') 
       { winnerMessage = "Player Win" ; gameOver=1;}   // col 2
     else if ( number3=='X' && number6=='X' && number9=='X')
       { winnerMessage = "Player Win" ; gameOver=1;}  // col 3
     else if ( number1=='X' && number2=='X' && number3=='X')
       { winnerMessage = "Player Win" ; gameOver=1;}  // row 1
     else if ( number4=='X' && number5=='X' && number6=='X')  
       { winnerMessage = "Player Win" ; gameOver=1;}   // row 2
     else if ( number7=='X' && number8=='X' && number9=='X') 
       { winnerMessage = "Player Win" ; gameOver=1;}   // row 3 
     else if ( number1=='X' && number5=='X' && number9=='X')  
       { winnerMessage = "Player Win" ; gameOver=1;}   // diagonal  1                    
     else if ( number3=='X' && number5=='X' && number7=='X') 
       { winnerMessage = "Player Win" ; gameOver=1;}   //  diagonal 2
          
  // ********* checking for row or column or diagonal System win ******
  //*******************************************************************  
   if ( number1=='O' && number4=='O' && number7=='O') 
    { winnerMessage = "System Win" ; gameOver=1;}       // col 1
   else if ( number2=='O' && number5=='O' && number8=='O') 
    { winnerMessage = "System Win" ; gameOver=1;}       // col 2
   else if ( number3=='O' && number6=='O' && number9=='O') 
    { winnerMessage = "System Win" ; gameOver=1;}       // col 3
   else if ( number1=='O' && number2=='O' && number3=='O') 
    { winnerMessage = "System Win" ; gameOver=1;}       // row 1
   else if ( number4=='O' && number5=='O' && number6=='O')  
    { winnerMessage = "System Win" ; gameOver=1;}       // row 2
   else if ( number7=='O' && number8=='O' && number9=='O') 
    { winnerMessage = "System Win" ; gameOver=1;}       // row 3 
   else if ( number1=='O' && number5=='O' && number9=='O')  
    { winnerMessage = "System Win" ; gameOver=1;}       // diagonal  1                    
   else if ( number3=='O' && number5=='O' && number7=='O') 
   { winnerMessage = "System Win" ; gameOver=1;}        //  diagonal 2
          
  // *****searching in the case we filled all the boxes and there was no winner  ***************
  // *******************************************************************************************
   if (((number1 =='X')||(number1 =='O')) && ((number2=='X')||(number2=='O')) && ((number3=='X')||(number3=='O')) &&
               ((number4 =='X')||(number4 =='O')) && ((number5=='X')||(number5=='O')) && ((number6=='X')||(number6=='O')) &&
               ((number7 =='X')||(number7 =='O')) && ((number8=='X')||(number8=='O')) && ((number9=='X')||(number9=='O')) )
    
           { winnerMessage = "GAME TIE " ; gameOver=1;} // nobody wins, all boxes filled 
           
    } while (gameOver== 0) ;
    // ***** END LOOP #2,  'DO/WHILE' GAME IS OVER  ************
 
    JOptionPane.showMessageDialog (null,  
   "__" + number1 + "__|__" + number2 + "__|__" + number3 + "__" + "\n" +
   "__" + number4 + "__|__" + number5 + "__|__" + number6 + "__" + "\n" + 
   "__" + number7 + "__|__" + number8 + "__|__" + number9 + "__", "GAME OVER ! " +
   winnerMessage ,  JOptionPane.INFORMATION_MESSAGE ); 
 
    answer = JOptionPane.showInputDialog( null, "Would you like to play again? y/n"); 
    
  } while (answer.equalsIgnoreCase("y"));
      // ******** END OF LOOP #1, TERMINATE THE GAME, DO NOT WANT PLAYING **************
  
   JOptionPane.showMessageDialog (null, "SORRY YOU DO NOT WANT TO KEEP PLAYING, GOODBYE ! " ); 
 
  
 } // end of Main
} // end of Class
 
/* OUTLINE OF THE TIC TAC TOE GAME 
 * 
 * Begin
 * Initialized global variables
 *  LOOP #1 with 'DO/WHILE (Want to keep playing the game)
 *     - Declare the variables used for the squares 1-thru-9
 *     - The system initialized on SQUARE, system move first
 *       we generate a random number and set the marker 'O'
 *       
 *     - LOOP #2 with 'DO/WHILE' (The Game is not over until Filled all 9 SQAURE)
 *           - It is the Turn of the USER to pick a SQAURE
 *           - LOOP #3 with 'DO/WHILE' (User Valid Entry, not picked a Slot by 'O' or 'X')
 *                  - Display the Board
 *                  - Get the Response from the user
 *                  - IF the user picked a Free SQUARE, set his marker, and Set the Boolean switch of Valid to end the Loop
 *                    ELSE display a message and re-display the BOARD
 *                  - If the  Switch Variable Boolean 'validMove' is true, exit the LOOP #3
 *                    else keep within the loop #2 for a valid entry
 *           - LOOP #3 END !!!!!
 *           
 *     - We are in loop #2, now and a user picked his SQUARE, now is the Turn for the SYSTEM
 *           - It is the turn of the System to pick a SQAURE
 *           - LOOP #4 with 'Do/While' ( System valid Entry for his next Move)
 *                  - Depending the SLOT SQAURE from the User PICKED
 *                    check all possibilities near adjacent SQAURE to make the next Move
 *                  - Depending the best Square, set the next SYSTEM MARKER 'O'
 *                     -Set the Boolean switch 'SystemMove"  Valid to end the Loop     
 *                  - If the  Switch Variable Boolean 'SystemMove' is true, 
 *           - LOOP #4 END!!!!
 * 
 *     - We are in Loop #2, now we need to check for a match of 3 SQAURE in lines
 *     - Check for match row, Column , and diagonal of the USER
 *            - if  match, set a message that the User Win
 *            - set the Boolean variable that the game is over to end LOOP #2
 *     - Check for match row, Column , and diagonal of the SYSTEM
 *            - if  match, set a message that the SSTEM Win
 *            - set the Boolean variable that the game is over to end LOOP #2
 *     - Check for match row, Column , and diagonal for a TIE !!!!
 *            - if  match, set a message that there is a TIE in the game
 *            - set the Boolean variable that the game is over to end LOOP #2
 *     - If the  Switch Variable Boolean 'gameOver' is true, exit the LOOP #2
 *     - LOOP #2 END !!!!!
 *      
 * - We are in LOOP #1 and must display results
 * - DISPLAY  THE RESULTS: Board, and all picked SQUARE with who whom the Match !!!!
 * - We need to check if the user wants to play another match
 * - Ask to the user if wants to play another MATCH against the system
 * - IF the user said "YES",  keep in the LOOP #1, and display again the Board 
 *      with initial conditions
 *   ELSE
 *      terminate the game
 *      
 *- LOOP #1 END !!!!!!
 *- Display a message of goodbye
 *- Terminate the program
 * 
 */
