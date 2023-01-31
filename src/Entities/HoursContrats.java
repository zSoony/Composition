package Entities;

import java.util.Date;

public class HoursContrats {
     private Date date;
     private Double valuePerHour;
     private Integer hours;

     public HoursContrats (){

     }

     public HoursContrats (Date date, Double valuePerHour, Integer hours ){
this.date = date;
this.valuePerHour = valuePerHour;
this.hours = hours;
     }

     public Date getDate() {
         return date;
     }
     public Integer getHours() {
         return hours;
     }
     public Double getValuePerHour() {
         return valuePerHour;
     }
     public void setDate(Date date) {
         this.date = date;
     }
     public void setHours(Integer hours) {
         this.hours = hours;
     }
     public void setValuePerHour(Double valuePerHour) {
         this.valuePerHour = valuePerHour;
     }     

     public double totalValue(){
        return valuePerHour * hours;
        
     }


}
