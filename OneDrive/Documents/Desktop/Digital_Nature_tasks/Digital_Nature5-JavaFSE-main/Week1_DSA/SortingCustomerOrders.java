public class SortingCustomerOrders {

    public static void main(String[] args) {

        int orders[] = {500,100,300,200};

        for(int i=0;i<orders.length;i++) {

            for(int j=0;j<orders.length-i-1;j++) {

                if(orders[j] > orders[j+1]) {

                    int temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }

        for(int n : orders)
            System.out.print(n + " ");
    }
}
