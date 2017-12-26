/***************************************************
 * StdOutLogger.java
 * -----------------
 *
 * Author:  YOUR_NAME
 * Company: YOUR_COMPANY
 * Date:    10/18/2017
 *
 * Copyright (c), 2017, YOUR_COMPANY
 **************************************************/    

//#ACD# M(UDIS::UID_3C46674D-4EEC-49dd-A6A2-B4EB61BAFCBA) ---- additional import statements
//user defined code to be added here ...

//#end ACD#

public class StdOutLogger implements Observer {

  //#ACD# M(UDAT::UID_3C46674D-4EEC-49dd-A6A2-B4EB61BAFCBA) ---- additional attributes
  //user defined code to be added here ...

  //#end ACD#

  // ------------------------------------------------------------
  // constructors
  // ------------------------------------------------------------
  /**
   * Default constructor
   */
  public StdOutLogger() {
    //#ACD# M(UDCC::UID_3C46674D-4EEC-49dd-A6A2-B4EB61BAFCBA-def-ctor) ---- constructor body
    //user defined code to be added here ...

    //#end ACD#
  }

  //#ACD# M(UDCO::UID_3C46674D-4EEC-49dd-A6A2-B4EB61BAFCBA) ---- additional constructors
  //user defined code to be added here ...

  //#end ACD#

  // ------------------------------------------------------------
  // methods
  // ------------------------------------------------------------
  /**
   * Implements method <code>report(Observable)</code> 
   * from interface <code>Observer</code>.
   * 
   * @see Observer#report(Observable)
   */
  public void report(Observable observable) {
    //#ACD# M(UDOP::UID_BBB30EF3-C5A1-432e-9DB9-16D00CAC88C2-impl) ---- method body
    //user defined code to be added here ...
	  System.out.println(observable.toString());
    //#end ACD#
	
  }

  //#ACD# M(UDOP::UID_3C46674D-4EEC-49dd-A6A2-B4EB61BAFCBA) ---- additional operations
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
    StringBuffer strbuf = new StringBuffer();
    strbuf.append("StdOutLogger:\n");
    //#ACD# M(UID_3C46674D-4EEC-49dd-A6A2-B4EB61BAFCBA-toString) ---- method body
    //user defined code to be added here ...
    
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
    if (! (o instanceof StdOutLogger))
      return false;
    else {
      return true;
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
    StdOutLogger obj = new StdOutLogger();
    return obj;
  }

}