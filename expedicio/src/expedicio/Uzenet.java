/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expedicio;

/**
 *
 * @author Hp
 */
public class Uzenet {
    private int nap;
    private int amator;
    private String uzenet;

     public Uzenet(int nap, int amator, String uzenet) {
          this.nap = nap;
          this.amator = amator;
          this.uzenet = uzenet;
     }
     
     public Uzenet(String szamok, String uzenet){
          this.nap = Integer.parseInt(szamok.split(" ")[0]);
          this.amator =Integer.parseInt(szamok.split(" ")[1]) ;
          this.uzenet = uzenet;
     }

     @Override
     public String toString() {
          return "Uzenet{" + "nap=" + nap + ", amator=" + amator + ", uzenet=" + uzenet + '}';
     }

     public int getNap() {
          return nap;
     }

     public void setNap(int nap) {
          this.nap = nap;
     }

     public int getAmator() {
          return amator;
     }

     public void setAmator(int amator) {
          this.amator = amator;
     }

     public String getUzenet() {
          return uzenet;
     }

     public void setUzenet(String uzenet) {
          this.uzenet = uzenet;
     }
     
     
     
     public String tisztaUzenet2(){
          return this.uzenet.replaceAll("\\$", "");
     }
     
     public String tisztaUzenet(){
          return this.uzenet.substring(0, this.uzenet.indexOf("$"));
     }

     @Override
     public int hashCode() {
          int hash = 7;
          hash = 53 * hash + this.nap;
          hash = 53 * hash + this.amator;
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
          final Uzenet other = (Uzenet) obj;
          if (this.nap != other.nap) {
               return false;
          }
          return this.amator == other.amator;
     }
     
     
}
