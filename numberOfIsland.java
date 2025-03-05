public class numberOfIsland
{
        int n = 0;
        int m = 0;

        public    int numIsLand(char grid[][])
        {
            int count=0;
            n = grid.length;
            m = grid[0].length;

            for(int i=0 ; i<n ; i++)
            {
                for(int j= 0 ; j<m;j++)
                {
                    if(grid[i][j]== '1')
                    {
                        dfs(grid,i,j);
                        count++;
                    }
                }
            }

            return count;
        }

    private void dfs(char[][] grid, int i, int j)
    {
        if(i <0 || i >= n || j <0 || j >= m)
        {
            return;
        }
        if(grid[i][j] =='0' || grid[i][j]=='2')
        {
            return;
        }

        grid[i][j]='2';

        dfs(grid, i-1 , j);
        dfs(grid, i , j+1);
        dfs(grid, i+1 , j);
        dfs(grid, i , j-1);


//        dfs(grid, i , j-1);
//        dfs(grid, i , j+1);
//        dfs(grid, i+1 , j);
//        dfs(grid, i-1 , j);



    }


    public static void main(String[] args)
    {
        numberOfIsland n = new numberOfIsland();

        char grid[][] = { { '1','1','0','0','0'},
                         { '1','1','0','0','0'},
                         { '0','0','1','0','0'},
                         { '0','0','0','1','1'}};

        System.out.println(n.numIsLand(grid));
    }

}
