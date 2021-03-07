
package singleresponsabiltyproblem;


public class Sale {
    
    private int id;
    private String productName;
    private String productBrand;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    public void SaveSale(){
        
        System.out.println("Se Ha guardado la venta:" + this.getId() + " " + this.getProductName()+ " " + this.getProductBrand()+ " " + this.getPrice());
    
    
    }
    
    
    public void DeleteSale(int  id){
        
        System.out.println("SE ELIMINO LA VENTA CON CODIGO: " + id);
    
    }
}
