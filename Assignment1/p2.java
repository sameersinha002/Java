// package Assignment1;

public class p2 {
    public static void main(String[] args) {
        int sum = 0;
        // for (int i = 0; i < args.length; i++)
        // sum += Integer.parseInt(args[i]);

        for (String arg : args)
            sum += Integer.parseInt(arg);

        System.out.println(sum);
    }
}
