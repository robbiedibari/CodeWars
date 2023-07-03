public class Main {
    public static void main(String[] args) {

       System.out.println(calculateYears(1000, 0.05, 0.18, 1100));
        System.out.println(calculateYears(1000,0.01625,0.18,1200));
        System.out.println(calculateYears(1000, 0.05, 0.18, 1000));

    }


    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int Year = 1;
        double interestAmount = principal * interest;
        double taxMoney = interestAmount * tax;
        if (principal == desired) {
            return 0;
        }

        while (principal <= desired) {

            principal += interestAmount - taxMoney;
            System.out.println(Year + " year = " + principal);

            if(principal > desired){
                break;
            } else{
                Year++;
            }

        }

        return Year;
    }

}


