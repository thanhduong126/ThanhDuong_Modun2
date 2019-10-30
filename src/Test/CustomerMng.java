package Test;

import java.util.LinkedList;
import java.util.List;

public class CustomerMng {
    public static void main(String[] args){
        Customers cus1 = new Customers("Binh",1999,"Quang nam");
        Customers cus2 = new Customers("Binh",1996,"Thai binh");
        Customers cus3= new Customers("Binh",1997,"Gia lai");

      /*  List<Customers> ds = new LinkedList<>();
        ds.add(cus1);
        ds.add(cus2);
        ds.add(cus3);*/
      // sử dụng mảng chứa đối tượng customer
        Customers[] cus = new Customers[]{cus1, cus2, cus3};


        //sử dụng compareTo để thực hiện sắp xếp
        for (int i=0; i<cus.length;i++)
            for(int j=i+1; j<cus.length; j++){
                if(cus[j].compareTo(cus[i])<0){
                    Customers temp = cus[i];
                    cus[i] = cus[j];
                    cus[j] = temp;
                }
            }
        //in danh sach customer
        System.out.println("danh sach da duonc sx");
        for (Customers item: cus){
            System.out.println(item.toString());

        }


    }
}
