public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int y = 0; y < 8; y++)
      {
         for (int x = 0; x < 8; x++)
         {
            if ((x + y)%2 == 0)
               chessboard[y][x] = '\u25A1';
            else
               chessboard[y][x] = '\u25A0';
         }
      }

      for (char[] row: chessboard)
      {
         for (char cell: row)
         {
            System.out.print(cell);
         }
         System.out.println();
      }
   }
}