package models;

import com.avaje.ebean.Model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.*;

/**
 * Created by ifeanyi on 10/04/17.
 */

    // Product Entity managed by the ORM
    @Entity
    @SequenceGenerator(name="users_library_seq", initialValue=0, allocationSize=100)
    public class Users_library extends Model {


    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="users_library_seq")
    @Id private Long id;

        @ManyToOne
        private Long user_product_id;

        @ManyToOne
        private String  user_email;

        private Date date_transaction;

        private Date expiring_date;




    public Users_library(Long id, Long user_product_id, String user_email, Date date_transaction, Date expiring_date) {
        this.id = id;
        this.user_product_id = user_product_id;
        this.user_email = user_email;
        this.date_transaction = date_transaction;
        this.expiring_date = expiring_date;
    }

    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Users_library> find = new Finder<Long,Users_library>(Users_library.class);

    // Filter product name
    public static List<Users_library> findAll() {
        return Users_library.find.all();
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_product_id() {
        return user_product_id;
    }

    public void setUser_product_id(Long user_product_id) {
        this.user_product_id = user_product_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Date getDate_transaction() {
        return date_transaction;
    }

    public void setDate_transaction(Date date_transaction) {
        this.date_transaction = date_transaction;
    }

    public Date getExpiring_date() {
        return expiring_date;
    }

    public void setExpiring_date(Date expiring_date) {
        this.expiring_date = expiring_date;
    }
}



