/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter10104;

public class LabsChapter10104 {
  String render(String aInputText);
} 

/** Wrapper (Decorator) design pattern. */
public final class WrapperDemo {
  
  public static void main(String... aArgs){
    TransformText transformer = new BaseWrapper(new Echo());
    show(transformer.render("blah.")); // 'blah.'
    
    transformer = new Capitalize(new Echo());
    show(transformer.render("blah.")); // 'BLAH.'
    
    transformer = new RemovePeriods(new Capitalize(new Echo()));
    show(transformer.render("blah.")); // 'BLAH'
    
    transformer = new RemovePeriods(new Echo());
    show(transformer.render("blah.")); // 'blah'
  }
  
  private static void show(String aText){
    System.out.println(aText);
  }
  
  private static final class Echo implements TransformText{
    public String render(String aText) {
      return aText;
    }
  }
  
  /**
   This class both implements the interface AND is constructed 
   with an implementation of the same interface.
  */
  private static class BaseWrapper implements TransformText {
    BaseWrapper(TransformText aTransformText){
      fShowText = aTransformText;
    }
    /** Template method, calls 'before' and 'after' methods. */
    public final String render(String aText) {
      String text = before(aText);
      text = fShowText.render(text); //call-forward
      return after(text);
    }
    /** This default implementation does nothing.*/
    String before(String aText){
      return aText;
    }
    /** This default implementation does nothing.*/
    String after(String aText){
      return aText;
    }
    private TransformText fShowText;
  }
  
  private static final class Capitalize extends BaseWrapper {
    Capitalize(TransformText aTransformText){
      super(aTransformText);
    }
    @Override String before(String aText) {
      String result = aText;
       if (aText != null){
         result = result.toUpperCase();
       }
       return result;
    }
  }

  private static final class RemovePeriods extends BaseWrapper {
    RemovePeriods(TransformText aTransformText){
      super(aTransformText);
    }
    @Override String after(String aText) {
      String result = aText;
       if (aText != null){
         result = result.replace(".", "");
       }
       return result;
    }
  }
} 
