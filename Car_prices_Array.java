import java.util.*;
class Car_prices_Array{
void array(){



do{
Scanner ob=new Scanner(System.in);
String array[]={"Mehran","Alto","Cultus","Jimny","Potohar","Carolla","Parado","Vigho","Civic"};

int num[]={600000,800000,1200000,1000000,900000,18000000,3500000,4000000,3500000,3200000};
System.out.println("Enter Car Index");
int i=ob.nextInt();
System.out.println(num[i] +","+array[i]);

}while(true);}
public static void main(String args[]){
Array2 ob=new Array2();
ob.array();
}

}