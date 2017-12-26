/***************************************************
 * Application.java
 * ----------------
 *
 * Author:  YOUR_NAME
 * Company: YOUR_COMPANY
 * Date:    10/18/2017
 *
 * Copyright (c), 2017, YOUR_COMPANY
 **************************************************/    

//#ACD# M(UDIS::UID_6CA783D0-36C4-49bc-A5EA-E9D487B7E691) ---- additional import statements
//user defined code to be added here ...

//#end ACD#

public class Application {

  //#ACD# M(UDAT::UID_6CA783D0-36C4-49bc-A5EA-E9D487B7E691) ---- additional attributes
  //user defined code to be added here ...

  //#end ACD#

  // ------------------------------------------------------------
  // constructors
  // ------------------------------------------------------------
  /**
   * Default constructor
   */
  public Application() {
    //#ACD# M(UDCC::UID_6CA783D0-36C4-49bc-A5EA-E9D487B7E691-def-ctor) ---- constructor body
    //user defined code to be added here ...

    //#end ACD#
  }

  //#ACD# M(UDCO::UID_6CA783D0-36C4-49bc-A5EA-E9D487B7E691) ---- additional constructors
  //user defined code to be added here ...

  //#end ACD#

  // ------------------------------------------------------------
  // methods
  // ------------------------------------------------------------
  public static void main(String[] args) {
    //#ACD# M(UDOP::UID_5C6FD192-4ECC-40aa-B525-69520821CBD1) ---- method body
    //user defined code to be added here ...
	  PercentCounter counter = new PercentCounter();
	  StdOutLogger StdLogger = new StdOutLogger();
	  FileLogger FLogger =  new FileLogger("C:\\Users\\Buertc\\workspace\\UmlJava\\Test.txt");
	 counter.register(StdLogger);
	 counter.register(FLogger);
	 counter.run();
    //#end ACD#
	  
	 
  }

  //#ACD# M(UDOP::UID_6CA783D0-36C4-49bc-A5EA-E9D487B7E691) ---- additional operations
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
    
    //#ACD# M(UID_6CA783D0-36C4-49bc-A5EA-E9D487B7E691-toString) ---- method body
    //user defined code to be added here ...
	  StringBuffer strbuf = new StringBuffer();
	    strbuf.append("Application:\n");
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
    if (! (o instanceof Application))
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
    Application obj = new Application();
    return obj;
  }

}