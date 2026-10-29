// Q095
package multiarrays;
public class Q095 {
    public static void main(String[] args) {
        int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
        for(int i=0;i<3;i++){
            int rs = 0;
            for(int j=0;j<3;j++)
                rs = rs + a[i][j];
            System.out.println("Row "+(i+1)+" ka sum = "+rs);
        }
        for(int j=0;j<3;j++){
            int cs = 0;
            for(int i=0;i<3;i++)
                cs = cs + a[i][j];
            System.out.println("Column "+(j+1)+" ka sum = "+cs);
        }
    }
}
