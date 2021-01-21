public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if (board[row][col] == true){
            System.out.println("There was a hit!");
            return true;
        }else{
            System.out.println("You missed the boat");
            return false;
        }
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        for ( int i = 0; i < boatLength; i++){
            if (direction == "down"){
                board[row + i][col] = true;
            }else{
                board[row][col + i] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) {
        boolean end = false; 
        for (int i = 0; i < words.length; i++){
            for (int j = 0; words[0].length - 1; j++){

                String a = words[row][col];
                char char1 = a.charAt(0);
                String b = words[row][col + 1];
                char char2 = b.charAt(0);
                int x = a.length();
                int y = b.length();
                if (char1 > char2 || x > y){
                    end = false;
                }
                else {
                    end = true;
                }                
            }
        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
