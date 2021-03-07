
package singleresponsabilitysolution;

import java.util.Scanner;

public class SingleResponsabilitySolution {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int id, price;
        String productName, brandName;
        
        ProductEntity prod = new ProductEntity();
        SaleDao dao = new SaleDao();
        
        System.out.print("Id: ");
        id = in.nextInt();
        
        in.nextLine();
        
        System.out.print("Producto: ");
        productName = in.nextLine();
        
        System.out.print("Marca: ");
        brandName = in.nextLine();
        
        System.out.print("Precio: ");
        price = in.nextInt();
        
        
        prod.setId(id);
        prod.setProductName(productName);
        prod.setBrandName(brandName);
        prod.setPric(price);

        dao.SaveSale(prod);
        dao.DeleteSale(prod);
        
        
                
                
    }
    
}
