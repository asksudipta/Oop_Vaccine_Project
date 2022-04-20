package se.lexicon.Inherit;

public class EmployeeIdSequence {
     private static int sequence=100;

     public static int nextId(){
          return sequence ++;
     }
}
