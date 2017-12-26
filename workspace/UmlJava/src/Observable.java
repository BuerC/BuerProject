import java.util.ArrayList;

/***************************************************
 * Observable.java
 * ---------------
 *
 * Author:  YOUR_NAME
 * Company: YOUR_COMPANY
 * Date:    10/18/2017
 *
 * Copyright (c), 2017, YOUR_COMPANY
 **************************************************/    

//#ACD# M(UDIS::UID_B38D46EB-7CA8-404f-BC3C-9B0ED4EE8B58) ---- additional import statements
//user defined code to be added here ...

//#end ACD#

public class Observable {

  // ------------------------------------------------------------
  // instance attributes
  // ------------------------------------------------------------
  protected java.util.ArrayList observers;

  //#ACD# M(UDAT::UID_B38D46EB-7CA8-404f-BC3C-9B0ED4EE8B58) ---- additional attributes
  //user defined code to be added here ...

  //#end ACD#

  // ------------------------------------------------------------
  // constructors
  // ------------------------------------------------------------
  /**
   * Default constructor
   */
  public Observable() {
    //#ACD# M(UDCC::UID_B38D46EB-7CA8-404f-BC3C-9B0ED4EE8B58-def-ctor) ---- constructor body
    //user defined code to be added here ...

    //#end ACD#
	  observers = new ArrayList();
  }

  /**
   * This constructor initializes all instance attributes,
   * which are not derived. Furthermore <code>final</code>
   * attributes with a default value aren't initialized either.
   */
  public Observable(java.util.ArrayList observers) {
    //#ACD# M(UDCC::UID_B38D46EB-7CA8-404f-BC3C-9B0ED4EE8B58-full-ctor) ---- constructor body
    //user defined code to be added here ...

    //#end ACD#
    this.observers = observers;
  }

  //#ACD# M(UDCO::UID_B38D46EB-7CA8-404f-BC3C-9B0ED4EE8B58) ---- additional constructors
  //user defined code to be added here ...

  //#end ACD#

  // ------------------------------------------------------------
  // methods
  // ------------------------------------------------------------
  public void register(Observer observer) {
    //#ACD# M(UDOP::UID_5EB60CFF-D980-40c3-9965-BD9F40C8D366) ---- method body
    //user defined code to be added here ...
      
    //#end ACD#
	  observers.add(observer);
	  }

  public void unregister(Observer observer) {
    //#ACD# M(UDOP::UID_9E2C4366-0639-42e1-943B-D7D7DED74783) ---- method body
    //user defined code to be added here ...
      
    //#end ACD#
	  observers.remove(observer);
  }

  public void reportToObservers() {
    //#ACD# M(UDOP::UID_10A4683D-42A9-4d8f-8984-BB09D1C21380) ---- method body
    //user defined code to be added here ...
      
    //#end ACD#
	  for(int i=0;i<observers.size();i++)
		  ((Observer) observers.get(i)).report(this);
  }

  /**
   * Automatically generated <code>set</code>-method 
   * from attribute <code>observers</code>.
   * 
   * @param observers Sets this instance's 
   *    <code>observers</code> to a new value.
   * @see #getObservers()
   */
  protected void setObservers(java.util.ArrayList observers) {
    //#ACD# M(UDOP::UID_535B5175-8AC2-4952-8BF1-2AB84FE86A65-assoc-setter) ---- method body
    //user defined code to be added here ...
	  this.observers = observers;
    //#end ACD#
  
  }

  /**
   * Automatically generated <code>get()</code>-method 
   * from attribute <code>observers</code>.
   * 
   * @return This instance's <code>observers</code>.
   * @see #setObservers(java.util.ArrayList)
   */
  protected java.util.ArrayList getObservers() {
    //#ACD# M(UDOP::UID_535B5175-8AC2-4952-8BF1-2AB84FE86A65-assoc-getter) ---- method body
    //user defined code to be added here ...
	  return observers;
    //#end ACD#
  
  }

  //#ACD# M(UDOP::UID_B38D46EB-7CA8-404f-BC3C-9B0ED4EE8B58) ---- additional operations
  //user defined code to be added here ...

  //#end ACD#
  // ------------------------------------------------------------
  // standard methods
  // ------------------------------------------------------------

  /**
   * Generates a String representation of this object.
   * Loops over all non-static fields of this object.
   *
   * Users are encouraged to accustom this function to
   * their specific needs!
   *
   * @return The content (state) of this object as string.
   */
  public String toString() {
    
    //#ACD# M(UID_B38D46EB-7CA8-404f-BC3C-9B0ED4EE8B58-toString) ---- method body
    //user defined code to be added here ...
	  StringBuffer strbuf = new StringBuffer();
	    strbuf.append("Observable:\n");
	    if (observers != null)
	      strbuf.append("observers: " + observers.toString()).append("\n");
	    else
	      strbuf.append("observers: null").append("\n"); 
    //#end ACD#
    return strbuf.toString();
  }

  /**
   * Tests this instance against another object for equality.
   * Rather to test for simple object reference equality as in
   * {@link java.lang.Object#equals(Object) Object.equals(Object o)} 
   * this function tests against <i>semantic</i> equivalence of the 
   * content of the two objects.<br><br>
   *
   * Note that instances of classes without instance attributes return
   * always <code>true</code>, since they <b>must</b> have the same
   * state.<br><br>
   *
   * Users are encouraged to customize this function to
   * their specific needs!
   *
   * @param o The object this instance is compared to.
   * @return <code>true</code>, if the two objects are equivalent semantically.
   */
  public boolean equals(Object o) {
    if (! (o instanceof Observable))
      return false;
    else {
      Observable c = (Observable) o;
      if (
          ((observers == null && c.observers == null) || (observers != null && c.observers != null && observers.equals(c.observers)))
         )
        return true;
      else
        return false;
    }
  }

  /**
   * Provides a (shallow) copy of this instance and returns it. 
   * It achieves that by looping over all non-static fields of 
   * this instance and assigning their values to the corresponding 
   * fields of the new object. <br><br>
   * Note, that there <b>must</b> be an accessible no-arg default 
   * constructor for this function to work, either explicitly in 
   * the class or by <b>not</b> defining any other constructors!
   *
   * @return The newly created object.
   */
  public Object clone() {
    Observable obj = new Observable();
    obj.observers = observers;
    return obj;
  }

}