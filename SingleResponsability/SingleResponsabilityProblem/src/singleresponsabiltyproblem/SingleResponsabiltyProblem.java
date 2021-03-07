
package singleresponsabiltyproblem;

import java.util.Scanner;


public class SingleResponsabiltyProblem {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int id, preci;
        String name, brand;
        
         
        
        System.out.print("Id: ");
        id = in.nextInt();
        
        in.nextLine();
        
        System.out.print("Producto: ");
        name = in.nextLine();
        
        System.out.print("Marca; ");
        brand = in.nextLine();
         
        System.out.print("Precio: ");
        preci = in.nextInt();
        
        
        
        Sale venta = new Sale();
        
        venta.setId(id);
        venta.setProductName(name);
        venta.setProductBrand(brand);
        venta.setPrice(preci);
        
        venta.SaveSale();
        venta.DeleteSale(id);
        
        
        
    }
    
}
