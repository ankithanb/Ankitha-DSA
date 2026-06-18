package Queue;
public class Celebrity{
    int Celebrities(int M[][],int n) {
        int a = 0;
        int b = n-1;

        while(a < b)
        {
            if(M[a][b] == 1)
            {
                a++;
            }
            else{
                b--;
            }
        }
        int celebrity = a;

        for(int i = 0; i < n; i++)
        {
            if(i != celebrity && M[i][celebrity] == 0 || M[celebrity][i] == 1)
            {
                return -1;
            }
        }
        return celebrity;
    }
}