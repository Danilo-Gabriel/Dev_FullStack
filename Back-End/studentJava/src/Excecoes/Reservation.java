package Excecoes;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;

public class Reservation {

    private Integer numeroQuarto;
    private Date date_in;
    private Date date_out;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){
        
    }

    public Reservation(Integer numeroQuarto, Date date_in, Date date_out) {

        this.numeroQuarto = numeroQuarto;
        this.date_in = date_in;
        
        if(date_out.after(date_in)){

            this.date_out = date_out;

        }

    }

    public long duration(){
        long diff = date_out.getTime() - date_in.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        
    }


    public void updateDates(Date date_in, Date date_out){
        
        Date date = new Date();
        

        if(date_in.after(date))
        this.date_in = date_in;

        if(date_out.after(date_in)){

            this.date_out = date_out;

        }else{
            System.out.println("Data de saida deve ser posterior a da entrada");
        }

        
    }



    public Integer getNumeroQuarto(){
        return this.numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto){
        this.numeroQuarto = numeroQuarto;
    }
  
    public Date getDate_in() {
        return date_in;
    }

    

    public Date getDa_out() {
        return date_out;
    }



    @Override
    public String toString(){
        return "Room " 
        + numeroQuarto 
        +", Check-in: "
        + sdf.format(date_in)
        +", Check-out: "
        + sdf.format(date_out)
        +", "
        + duration()
        + " nigths";
    }


    

    
}
