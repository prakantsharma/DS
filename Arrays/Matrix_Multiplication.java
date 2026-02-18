public class Matrix_Multiplication
{
    public static void matrixMul(int [][] A,int [][] B)
    {   // first matrix rows and cols
        int n=A.length;
        int m=A[0].length;
        // second matrix rows and cols
        int p=B.length;
        int q=B[0].length;
        if(m!=p)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        int [][] c=new int[n][q];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    c[i][j]+=A[i][k]*B[k][j];
                }
                
            }
        }
        for(int i=0;i<n;i++){ 
            for(int j=0;j<q;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
         
            
        }
    
    public static void main(String[] args) {
        int [][] A={{10,20,30},
                    {5,10,15},
                    {2,4,6}};
        int [][] B={{1,2,3},
    {4,5,6},
{7,8,9}};
matrixMul(A,B);
    }
}