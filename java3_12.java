class java3_12
{
public static void main(String arg[])
{

if (args.length == 0)
{
            System.out.println("Please provide a limit (n) as a command-line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + " are:");

        for (int i = 2; i <= n; i++)
        {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.print(i + " ");
            }
        }

}
}
