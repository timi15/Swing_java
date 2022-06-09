/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hianyzasok;

/**
 *
 * @author Hp
 */
public class Datum implements Comparable<Datum>{
     
    private int honap;
    private int nap;

     public Datum(int honap, int nap) {
          this.honap = honap;
          this.nap = nap;
     }
     
     public Datum(String sor){
         String [] darabok=  sor.split(" ");
          this.honap = Integer.parseInt(darabok[1]);
          this.nap = Integer.parseInt(darabok[2]);
     }

     public int getHonap() {
          return honap;
     }

     public void setHonap(int honap) {
          this.honap = honap;
     }

     public int getNap() {
          return nap;
     }

     public void setNap(int nap) {
          this.nap = nap;
     }

     @Override
     public String toString() {
          return String.format("%02d - %02d",this.honap, this.nap );
     }
     
     

     @Override
     public int hashCode() {
          int hash = 7;
          hash = 17 * hash + this.honap;
          hash = 17 * hash + this.nap;
          return hash;
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj) {
               return true;
          }
          if (obj == null) {
               return false;
          }
          if (getClass() != obj.getClass()) {
               return false;
          }
          final Datum other = (Datum) obj;
          if (this.honap != other.honap) {
               return false;
          }
          return this.nap == other.nap;
     }

     @Override
     public int compareTo(Datum masik) {
          int result= this.honap- masik.getHonap();
          
          if(result==0){
               result= this.nap-masik.getNap();
          }
          
          return result;
          
     }
     
     
     
     
}
