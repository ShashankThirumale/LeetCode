class Solution {
private int x = 0, y = 0;
private int cB(char[][] B,int i,int j){
    int count = 0;
    if(j > 0){
        if(i > 0 && B[i - 1][j - 1] == 'M') count++;
        if(B[i][j - 1] == 'M') count++;
        if(i < x && B[i + 1][j - 1] == 'M') count++;
    }
    if(i > 0 && B[i - 1][j] == 'M') count++;
    if(j < y){
        if(i > 0 && B[i - 1][j + 1] == 'M') count++;
        if(B[i][j + 1] == 'M') count++;
        if(i < x && B[i + 1][j + 1] == 'M') count++;
    }
    if(i < x && B[i + 1][j] == 'M') count++;
    return count;
}
private void uB(char[][] B, int i, int j){
    if(i<0 || j<0 || i>x || j>y || B[i][j] != 'E')
        return;
    int count = cB(B, i, j);
    if(count != 0){
        B[i][j] = (char)(48 + count);
        return;
    }
    B[i][j] = 'B';
    uB(B, i - 1, j - 1);
    uB(B, i - 1, j);
    uB(B, i - 1, j + 1);
    uB(B, i, j - 1);
    uB(B, i, j + 1);
    uB(B, i + 1, j - 1);
    uB(B, i + 1, j);
    uB(B, i + 1, j + 1);
}
public char[][] updateBoard(char[][] B, int[] C) {
    x = B.length - 1;
    y = B[0].length - 1;
    if(B[C[0]][C[1]] == 'M'){
        B[C[0]][C[1]] = 'X';
        return B;
    }
    uB(B, C[0], C[1]);
    return B;
}
}