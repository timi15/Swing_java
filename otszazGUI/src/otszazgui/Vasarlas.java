/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otszazgui;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Hp
 */
public class Vasarlas {

     private int id;
     private List<String> cikkek = new ArrayList<>();

     public Vasarlas(int id) {
          this.id = id;
     }

     public Vasarlas(int id, String sor) {
          this.id = id;
          String[] darabok = sor.split("\t");

          for (String egyCikk : darabok) {
               cikkek.add(egyCikk);
          }
     }

     @Override
     public String toString() {
          return "Vasarlas{" + "id=" + id + ", cikkek=" + cikkek + '}';
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public List<String> getCikkek() {
          return cikkek;
     }

     public void setCikkek(List<String> cikkek) {
          this.cikkek = cikkek;
     }

     public void addCikk(String cikk) {
          this.cikkek.add(cikk);
     }

     @Override
     public int hashCode() {
          int hash = 5;
          hash = 79 * hash + this.id;
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
          final Vasarlas other = (Vasarlas) obj;
          return this.id == other.id;
     }
     
     public int vasarlasErteke(){
          int result = 0;
          TreeSet<String> egyediTermekek= new TreeSet<>();
          egyediTermekek.addAll(cikkek);
          
          for (String egyedi : egyediTermekek) {
               int darab= megszamol(egyedi, cikkek);
               result += darab*400;
               
               if(darab>1){
                    result+= 50;
               }
          }
          
          return result;
     }

     private int megszamol(String egyedi, List<String> cikkek) {
          int result =0;
          
          for (String cikk: this.cikkek) {
               if(cikk.equals(egyedi)){
                    result++;
               }
          }
          
          return result;
     }

     boolean vettekIlyen(String cikk) {
          return cikkek.contains(cikk);
     }

}
