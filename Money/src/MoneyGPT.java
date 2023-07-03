public class MoneyGPT {
        public static int calculateYears(double principal, double interest, double tax, double desired) {
            int years = 1;

            if (principal == desired) {
                return 0;
            }

            while (principal < desired) {
                double interestAmount = principal * interest;
                double taxAmount = interestAmount * tax;
                principal += interestAmount - taxAmount;
                System.out.println(years + " year  = " + principal);

                if(principal >= desired){
                    break;
                }
                else{
                    years++;
                }
            }

            return years;
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(calculateYears(1000, 0.05, 0.18, 1100));  // Output: 3
            System.out.println(calculateYears(1000, 0.01625, 0.18, 1200));  // Output: 14
            System.out.println(calculateYears(1000, 0.05, 0.18, 1000));  // Output: 0
        }
    }
