public class Main {
    public static int Counter = 0;

    public static void main(String args[]) {
        System.out.println("hello world");
        System.out.println("tweede zin");
        System.out.println("derde zin");
        System.out.println("vierde zin");

        VerschilllendeBerekeningen();

        NogMeerBerekeningen();

        System.out.println("The End");
    }

    public static void NogMeerBerekeningen()
    {
        float som = 0;
        float a = 34;
        float b = 43;
        float c = 24;
        float x = 32;
        float y = 42;
        float z = 41;
        float temp = a * x;
        temp = temp / y;
        temp = c * z;
        temp = temp / b;
        temp = temp / a;
        temp = temp * z;
        som = z / c;
        temp = temp + som;
    }

    public static void VerschilllendeBerekeningen()
    {
        // in welke rege is temp =
        int a = 3423;
        int b = 4323;
        int c = 3412;
        int x = 3442;
        int y = 3452;
        int z = 4323;
        int som = 0;
        Counter++;
        int temp = a + x;
        temp = temp - y;
        temp = c + z;
        temp = temp - b;
        temp = temp + a;
        temp = temp - z;
        som = z + c;
        temp = temp - som;
    }
}