public class SalesTracker {
    public static void main(String[] args) {
      
        int[][] sales = {
            {120, 150, 90},  
            {100, 130, 80},   
            {110, 140, 70},   
            {90, 120, 60},   
            {95, 160, 85}     
        };

        int numProducts = sales[0].length;
        int[] totalSales = new int[numProducts];

       
        for (int day = 0; day < sales.length; day++) {
            for (int product = 0; product < numProducts; product++) {
                totalSales[product] += sales[day][product];
            }
        }

        for (int product = 0; product < numProducts; product++) {
            System.out.println("Product " + (product + 1) + " - Total Sales: " + totalSales[product]);

            if (totalSales[product] >= 500) {
                System.out.println("Status: Target Achieved\n");
            } else if (totalSales[product] >= 300) {
                System.out.println("Status: Average Performance\n");
            } else {
                System.out.println("Status: Needs Improvement\n");
            }
        }
    }
}