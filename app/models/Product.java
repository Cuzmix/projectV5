package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

// Product Entity managed by the ORM
@Entity
public class Product extends Model {

    // Properties
    // Annotate id as the primary key
    @Id
    private Long id;

    // Other fields marked as being required (for validation purposes)
    
    private String name;

    @ManyToOne
    private Category category;

    
    private String description;

    
    private int	stock;

    
    private double price;
    
    private String available;

    private String validAvailable;

    private int quantity;

    // Default constructor
    public  Product() {
    }

    // Constructor to initialise object
    public  Product(Long id, String name, Category category, String description, int stock, double price, String available, String validAvailable,int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.available = available;
        this.validAvailable = validAvailable;
        this.quantity = quantity;
    }

    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Product> find = new Finder<Long,Product>(Product.class);

    // Find all Products in the database
    // Filter product name 
    public static List<Product> findAll() {
        return Product.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAvailable(){
        return available;
    }

    public void setAvailable(String available){
        this.available = available;
    }

    public String getvalidAvailable(){
        return validAvailable;
    }

    public void setvalidAvailable(String validAvailable){
        this.validAvailable = validAvailable;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

}