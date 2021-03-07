
package singleresponsabilitysolution;

public class SaleDao {
    
    
    public void SaveSale(ProductEntity product){
        
        System.out.println("Venta Generada");
        System.out.println("");
        System.out.println("---------------");
        System.out.println("Detalle");
        System.out.println("");
        System.out.println(product.getPric() + " " + product.getProductName() +" " + product.getBrandName() + " " + product.getPric());
       
    }
    
    
    
    public void DeleteSale(ProductEntity pro){
    
        System.out.println("SE HA ELIMINADO LA VENTA CON EL CODIGO " + pro.getId());
        
    }
    
}
