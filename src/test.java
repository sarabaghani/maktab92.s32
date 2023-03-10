public class test {
    public static void main(String[] args) {
        BankingAccount.Startup startup = new BankingAccount.Startup(1200);
        System.out.println(toString2());
    }
    public static String toString2() {
        int absBalance = Math.abs(-99998);
        return (-99998 < 0 ? "-" : "") + "$" + (absBalance / 100) + "." + (absBalance % 100 / 10) + (absBalance % 100 % 10);
    }

}
