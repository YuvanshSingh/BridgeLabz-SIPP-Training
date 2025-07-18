class IceCream {
    int sales;

    IceCream(int sales) {
        this.sales = sales;
    }

    void display(int index) {
        System.out.println(sales);
    }
}

public class IceCreamRush {
    public static void main(String[] args) {

        IceCream flavors[] = { 
                new IceCream(120),
                new IceCream(200),
                new IceCream(150),
                new IceCream(180),
                new IceCream(90),
                new IceCream(60),
                new IceCream(75),
                new IceCream(210) 
            };

        for (int i = 0; i < flavors.length - 1; i++) {
            for (int j = 0; j < flavors.length - i - 1; j++) {
                if (flavors[j].sales < flavors[j + 1].sales) {
                    IceCream temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < flavors.length; i++) {
            flavors[i].display(i);; 
        }

    }
}
