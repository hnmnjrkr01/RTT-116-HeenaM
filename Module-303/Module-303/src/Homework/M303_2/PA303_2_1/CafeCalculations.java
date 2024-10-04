package Homework.M303_2.PA303_2_1;

public class CafeCalculations {

    final static float SALES_TAX = 8.25F;

    public static void main(String[] args){
        float caffeAmericano = 4.95F;
        float caffeMisto = 5.45F;
        float espresso = 2.97F;

        double subTotal,totalSale;
        float firstOrder,secondOrder,thirdOrder;

        firstOrder = caffeAmericano + caffeMisto + espresso;
        secondOrder = caffeAmericano + caffeMisto + espresso + caffeAmericano;
        thirdOrder = espresso + caffeMisto;

        subTotal = firstOrder + secondOrder + thirdOrder;
        totalSale = subTotal * SALES_TAX;

        System.out.println("*********Different kinds of coffees with its rates : ***********\n");

        System.out.println("Caffe Americano $"+caffeAmericano);
        System.out.println("Caffe Misto $"+caffeMisto);
        System.out.println("Espresso $"+espresso+"\n");

        System.out.println("First Order had Caffe-Americano, Caffe-Misto & Espresso total cost is $"+firstOrder);
        System.out.println("Second Order had 2 Caffe-Americano, Caffe-Misto & Espresso total cost is $"+ secondOrder);
        System.out.println("Third Order had Espresso, & Caffe-Misto  TOTAL cost is $"+ thirdOrder+"\n");

        System.out.println("Total Sale $"+totalSale);

    }

}
