package shota;

public class Basic {
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        int a = 1;
        // Precision 32 bit
        float b = 1.1F;
        // Precision 64 bit
        double c = 2.2;

        String str = "Hello World";

        System.out.println(str + 1);

        System.out.println(1 + str);

        System.out.println(1 + 1 + str);

        System.out.println(1 + 1 + "");

        System.out.println("" + 1 + 1);

        int sum = 0;
        for(int i = 0; i < 10; i++)
        {
            if(i % 2 == 0)
                continue;
            sum += i;
        }
        System.out.println(sum);

//        sum = 0;
        int counter = 0;
        while(true)
        {
            counter++;
            System.out.println("Hello World");
            if(counter >= 5)
                break;
        }

        System.out.println();
        counter = 0;
        for(;;) {
            counter++;
            System.out.println("Hello World");
            if(counter >= 5)
                break;
        }

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++)
        {
            arr[i] = i * i;
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println(arr[i] * 2);
        }

        // 5 x 5
        // 5, 3, 7, 10
        int[][] arr_2d = new int[5][];

        for(int i = 0; i < 5; i++)
        {
            arr_2d[i] = new int[5];
        }

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                arr_2d[i][j] = i * 5 + j;
            }
        }

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(arr_2d[i][j] + ", ");
            }
            System.out.println();
        }


        int input = 2;

        String mode = "Alpha";
        switch(mode)
        {
            case "Alpha" -> System.out.println("User Input 1 : Menu Mode");
            case "Bete" -> System.out.println("User Input 2 : Game Mode");
            case "Omega" -> System.out.println("User Input 3 : Finance App");
        }

        sum = 0;
        for(int i = 0; i < 30; i++)
        {
            if(i % 3 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
