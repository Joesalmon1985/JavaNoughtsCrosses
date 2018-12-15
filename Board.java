public class Board 
{
    // This sets up a new 3x3 board.
    private int[][] Board = new int[3][3];

    public Board()
    {
        clearBoard();
    }

    public void clearBoard()
    {
        for(int line = 0 ; line < 3 ; line++)
            for(int column=0 ; column <3 ; column++)
                Board[line][column]=0;
    }

    public void showBoard()
    {
        System.out.println();
        for(int line=0 ; line<3 ; line++)
        {
            if(Board[line][column]==-1)
            {
                System.out.print("-1");
            }
            if(Board[line][column]==1
            {
                System.out.print("1");
            }
            if(Board[line][column]==0)
            {
                System.out.print("0");
            }
            System.out.println();
        }
    }

    public int getPosition(int[] attempt)
    {
        return Board[attempt[0]][attempt[1]]
    }

    public void setPosition(int[] attempt, int player)
    {
        if(player ==1)
            Board[attempt[0]][attempt[1]] = -1;
        else
            Board[attempt[0]][attempt[1]] = 1;
    }

    public int checkLines()
    {
        for(int line=0 ; line<3 ; line++)
        {
            if( (Board[line][0] + Board[line][1] + Board[line][2]) == -3)
                return -1;
            if( (Board[line][0] + Board[line][1] + Board[line[2]) == 3)
                return 1;
        }
        return 0;
    }
            

    }
}
