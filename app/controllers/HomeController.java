package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.PersistenceException;

import controllers.security.*;

import views.html.*;

// Import models
import models.*;
import models.users.*;
import models.users.Users;

public class HomeController extends Controller {

    // Declare a private FormFactory instance
    private static long idmake = 0;
    private FormFactory formFactory;


    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    public Users getUserFromSession(){
        return Users.getUserById(session().get("email"));
    }

    public Result index() {

        return ok(index.render(getUserFromSession()));
    }

    public Result about() {

        return ok(about.render(getUserFromSession()));
    }

    public Result signup() {
        Form<Users> addUsersForm = formFactory.form(Users.class);

        return ok(signup.render(addUsersForm));
    }


    //#####################Products###############################################
     public Result products(Long cat) {

        // Get list of all categories in ascending order



            List<Category> categoriesList = Category.findAll();
            List<Product> productsList = new ArrayList<Product>();

            if (cat == 0) {
                // Get list of all categories in ascending order
                productsList = Product.findAll();
            } else {
                // Get products for selected category
                // Find category first then extract products for that cat.
                productsList = Category.find.ref(cat).getProducts();
            }

            return ok(products.render(productsList, categoriesList, getUserFromSession()));
        
    }


    // Render and return  the add new product page
    // The page will load and display an empty add product form
    @Security.Authenticated(Secured.class)
    public Result addProduct() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addProductForm = formFactory.form(Product.class);

        // Render the Add Product View, passing the form object
        return ok(addProduct.render(addProductForm, getUserFromSession()));
    }


    public Result rent(Long cat) {

        // Get list of all categories in ascending order

        if(getUserFromSession() != null) {


            List<Category> categoriesList = Category.findAll();
            List<Product> productsList = new ArrayList<Product>();

            if (cat == 0) {
                // Get list of all categories in ascending order
                productsList = Product.findAll();
            } else {
                // Get products for selected category
                // Find category first then extract products for that cat.
                productsList = Category.find.ref(cat).getProducts();
            }

            return ok(rent.render(productsList, categoriesList, getUserFromSession()));
        }
        else{
            return redirect("http://www.google.com");

        }
    }

    //##################### End OF Products###############################################













    //#####################  USER PROFILE EDITS ###############################################

    public Result profile(Long cat){
        List<Users> usersList = Users.findAll();
        List<Product> productsList = new ArrayList<Product>();
        List<Users_library> UserTransactionList = new ArrayList<>();

        if(cat == 0){
            usersList = Users.findAll();
            UserTransactionList = Users_library.findAll();
        }

        return ok(profile.render(usersList,productsList,UserTransactionList,getUserFromSession()));
    }



    public Result profileUpdate() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Users> addUsersForm = formFactory.form(Users.class);

        // Render the Add Product View, passing the form object
        return ok(profileUpdate.render(addUsersForm, getUserFromSession()));
    }


    public Result transactionUpdate(){
        Form<Users_library>UsersLibraryForm =formFactory.form(Users_library.class);

        return ok(transactionUpdate.render(UsersLibraryForm,getUserFromSession()));
    }


    //#####################  END USER PROFILE EDITS ###############################################










    //#####################  USER PROFILE FUNCTIONALITY  ###############################################

    public Result reserve() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addReserveForm = formFactory.form(Product.class);
       
        // Render the Add Product View, passing the form object
        return ok(reserve.render(addReserveForm, getUserFromSession()));
    }

    public Result loan() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addLoanForm = formFactory.form(Product.class);
       
        // Render the Add Product View, passing the form object
        return ok(loan.render(addLoanForm, getUserFromSession()));
    }

    /*
    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addProductSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for errors (based on Product class annotations)
        if(newProductForm.hasErrors()) {
            // Display the form again
            return badRequest(addProduct.render(newProductForm, getUserFromSession()));
        }

        // Extract the product from the form object
        Product p = newProductForm.get();

        if (p.getId() == null) {
            // Save to the database via Ebean (remember Product extends Model)
            p.save();
        }
        // Product already exists so update
        else if (p.getId() != null) {
            p.update();
        }

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Product " + p.getName() + " has been created/ updated");

        // Redirect to the admin home
        return redirect(controllers.routes.HomeController.products(0));
    }

    */

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addReserveSubmit() {
        
        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
      
        // Check for errors (based on Product class annotations)
        if(newProductForm.hasErrors()) {
            // Display the form again
            return badRequest(addProduct.render(newProductForm, getUserFromSession()));
        }

        // Extract the product from the form object
        Product p = newProductForm.get();


        if (p.getId() == null) {
            // Save to the database via Ebean (remember Product extends Model)
            p.save();
        }
        // Product already exists so update
        else if (p.getId() != null) {

            
        // check if the item is available
        // if not return to the product page
        if(p.getAvailable().equalsIgnoreCase("reserved")){ 
            flash("success", "Item  not reserve Item reserved via different user");
            return redirect(controllers.routes.HomeController.rent(0));
           
            // if the user enters the reserve key
            // reserve the item
         } else if(p.getvalidAvailable().equalsIgnoreCase("reserved")) {
             p.update();
            flash("success", "Item: " + p.getName() + " has been reserved");
            return redirect(controllers.routes.HomeController.rent(0));
            }
     }
         return redirect(controllers.routes.HomeController.rent(0));           
}
        

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addLoanSubmit(String email) {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)

        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
        Users un = Users.find.byId(email);


        Product ps1 = newProductForm.get();

        Date TransactionDate = new Date();

        Date ExpireDate = new Date();
        ExpireDate.setDate(TransactionDate.getDate()+3);

            // Save to the database via Ebean (remember Product extends Model)

             Users_library usl;


            usl = new Users_library((long) 0,ps1.getId(),getUserFromSession().getEmail(),TransactionDate,ExpireDate);
           //this.idmake = idmake+1;
            usl.save();

        // Check for errors (based on Product class annotations)
        if(newProductForm.hasErrors()) {
            // Display the form again
            return badRequest(addProduct.render(newProductForm, getUserFromSession()));
        }

        // Extract the product from the form object
        Product p = newProductForm.get();
        if (p.getId() == null) {


            // Save to the database via Ebean (remember Product extends Model)

            p.save();
        }
        // Product already exists so update
        else if (p.getId() != null) {

            // check if the item isn't reserved
           //  if the item is reserved return to the product page
        if(p.getvalidAvailable().equalsIgnoreCase("reserved")){
            flash("success", "Item  not loaned, Item reserved via a different user");
            return redirect(controllers.routes.HomeController.rent(0));

            // if the item is still in stock
            // if the stock is 0 return to the product page
         } else if(p.getStock() == 0) {
            
            flash("success", "Item not loaned, low in stock");
            return redirect(controllers.routes.HomeController.rent(0));

            // check if the user enters the correct loan key
            // if update the items availablity
            }else if(p.getAvailable().equalsIgnoreCase("loaned")){

            Product ps = new Product();

            //Stock checker
            if(ps.getQuantity() > ps.getStock()){
                ps.setQuantity(ps.getQuantity());
                flash("success","FAIL: Not enough in stock.");
                return redirect(controllers.routes.HomeController.rent(0));
            }

            //Point checker + deduction
            if(ps.getQuantity() > 1)
            {
                int multiplyPurchase= p.getQuantity()*10;

                if(multiplyPurchase > un.getPoints()){

                    flash("success","FAIL: You do not have sufficient points.");
                    return redirect(controllers.routes.HomeController.rent(0));
                }
                else{
                    un.setPoints(multiplyPurchase);
                    un.update();
                }
            }else


            {
                int multiplyPurchase = p.getQuantity() * 10;

                if (un.getPoints()>0  && un.getPoints()-multiplyPurchase >=0 ) {



                    un.setPoints(un.getPoints() - multiplyPurchase);
                    un.update();
                    p.setStock(p.getStock() - p.getQuantity());
                    p.update();
                }
            }



            flash("success","FAIL: You do not have sufficient points.");
            return redirect(controllers.routes.HomeController.rent(0));

            }else {
            flash("success","Item has not loaned please enter the correct required key");
            return redirect(controllers.routes.HomeController.rent(0));
            }
     }
         return redirect(controllers.routes.HomeController.rent(0));           
}



//##################### END OF  USER PROFILE FUNCTIONALITY  ###############################################






//################## USER SIGN UP##########################################




    @Transactional
    public Result addUsersSubmit(){

        Form<Users> newUsersForm = formFactory.form(Users.class).bindFromRequest();
    try{
        Users newUser = newUsersForm.get();
        newUser.setPoints(-100);

        newUser.save();

        flash("success","Account " + newUser.getName() + " has been created");
        return redirect(controllers.routes.HomeController.index());

    }catch(PersistenceException e){
        flash("success","Email has already been used.");
        return badRequest(signup.render(newUsersForm));
    }




    }


    @Transactional
    public Result addProfileSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Users> newUsersForm = formFactory.form(Users.class).bindFromRequest();

        // Check for errors (based on Product class annotations)
        if(newUsersForm.hasErrors()) {
            // Display the form again
            return badRequest(profileUpdate.render(newUsersForm, getUserFromSession()));
        }

        // Extract the product from the form object
        Users p = newUsersForm.get();

        if (p.getEmail().equals(" ")) {
            // Save to the database via Ebean (remember Product extends Model)
            p.save();
        }
        // Product already exists so update
        else {
            p.update();
        }

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Account: " + p.getName() + " has been updated");

        // Redirect to the admin home
        return redirect(routes.HomeController.profile(0));
    }


    //WORKING ON THIS ATM
    //NEED HELP TO GET THE DISTANCE OF TWO DATES

    @Transactional
    public Result addTransactionSubmit(){
        Form<Users_library>UserLibraryForm =formFactory.form(Users_library.class).bindFromRequest();
        Users_library ul = UserLibraryForm.get();

      //  int dDate = ul.getDate_transaction().compareTo(ul.getExpiring_date()) ;
        Date dateD1 = new Date();


        if (UserLibraryForm.hasErrors()){
            return badRequest(transactionUpdate.render(UserLibraryForm,getUserFromSession()));
        }


       //if (ul.getExpiring_date()!=ul.getExpiring_date() && ul.getExpiring_date() != ul.getDate_transaction()) {
           //if (totalDistance >=0 && totalDistance <=7){


        dateD1.setDate(ul.getExpiring_date().getDate()+6/2);

        ul.setExpiring_date(dateD1);
       // ul.getExpiring_date();
           ul.update();
      // }
           // }
//            else{
//                ul.save();
//            }





        flash("success", "Account: " + ul.getUser_email() + " has extended loan date");

        return redirect(routes.HomeController.profile(0));
    }









    //################## END OF USER SIGN UP##########################################









    //################## ADMIN  ##########################################

    // Update a product by ID
    // called when edit button is pressed
    @Security.Authenticated(Secured.class)
    @Transactional
    public Result updateProduct(Long id) {

        Product p;
        Form<Product> productForm;

        try {
            // Find the product by id
            p = Product.find.byId(id);

            // Create a form based on the Product class and fill using p
            productForm = formFactory.form(Product.class).fill(p);
        
            } catch (Exception ex) {
                // Display an error message or page
                return badRequest("error");
        }
        // Render the updateProduct view - pass form as parameter
        return ok(addProduct.render(productForm, getUserFromSession()));
    }

    @Transactional
    public Result updateLoan(Long id) {

        Product p;
        Form<Product> productForm;

        try {
            // Find the product by id
            p = Product.find.byId(id);

            // Create a form based on the Product class and fill using p
            productForm = formFactory.form(Product.class).fill(p);
        
            } catch (Exception ex) {
                // Display an error message or page
                return badRequest("error");
        }
        // Render the updateProduct view - pass form as parameter
        return ok(loan.render(productForm, getUserFromSession()));
    }

    @Transactional
    public Result updateProfile(String email) {

        Users p;
        Form<Users> userForm;
        try {
            // Find the product by id
            p = Users.find.byId(email);
            int initialPoint = p.getPoints();


                    // Create a form based on the Product class and fill using p
           userForm = formFactory.form(Users.class).fill(p);

//            userForm = formFactory.form(Users.class);
//            p.setPoints(initialPoint);
//            userForm.fill(p);

            //userForm.fill(p);
            //flash("success", userForm.get().getPoints());


            } catch (Exception ex) {
                // Display an error message or page
                return badRequest("error");
        }
        // Render the updateProduct view - pass form as parameter
        return ok(profileUpdate.render(userForm, getUserFromSession()));
    }

    public Result updateTransaction(Long id){
        Users_library ul;
        Form<Users_library> UsersLibraryForm;

        try{

            ul=Users_library.find.byId(id);

            UsersLibraryForm =formFactory.form(Users_library.class).fill(ul);

        } catch (Exception ex) {
            // Display an error message or page
            return badRequest("error");


        }

        return ok(transactionUpdate.render(UsersLibraryForm,getUserFromSession()));
    }




    public Result updateReserve(Long id) {

        Product p;
        Form<Product> productForm;
        
        try {
            // Find the product by id
            p = Product.find.byId(id);
           
            // Create a form based on the Product class and fill using p
            productForm = formFactory.form(Product.class).fill(p);
          
        
            } catch (Exception ex) {
                // Display an error message or page
                return badRequest("error");
        }
        // Render the updateProduct view - pass form as parameter
        return ok(reserve.render(productForm, getUserFromSession()));
    }

    // Delete Product by id
    @Transactional
    public Result deleteProduct(Long id) {

        // find product by id and call delete method
        Product.find.ref(id).delete();
        // Add message to flash session
        flash("success", "Product has been deleted");

        // Redirect to products page
        return redirect(routes.HomeController.products(0));
    }
}
//##################  END OF ADMIN  ##########################################
