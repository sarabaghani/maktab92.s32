public class MinMaxAccount extends BankingAccount {
    public MinMaxAccount(Startup startup) {
        super(startup);
    }


    public int getMin() {
    double temp = Double.parseDouble(historyBalance.get(0).replace("$",""));
        int min = (int) temp*100;
        for (int i = 0; i <historyBalance.size() ; i++) {
             int n=(int) Double.parseDouble(historyBalance.get(i).replace("$",""))*100;
             if (n<min){
                 min=n;
             }
        }return min;

    }
    public int getMax() {
        double temp = Double.parseDouble(historyBalance.get(0).replace("$",""));
        int max =(int) temp*100;
        for (int i = 0; i <historyBalance.size() ; i++) {
            int n=(int) Double.parseDouble(historyBalance.get(i).replace("$",""))*100;
            if (n>max){
                max=n;
            }
        }return max;
    }
}
