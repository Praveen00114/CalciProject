interface Calci{
void int getSum(int n1,int n2);
}

class Add implements Calci{
    public int getSums(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
}
