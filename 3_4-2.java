public class Sample3_4_2
{
    public static void main(String[] args)
    {
        Car42 car1;
        car1 = new Car42();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.show();
        car1.show();
    }
}

//Car類別 (必須在同一個檔案中)
class Car42
{
    int num;
    double gas;

    void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}