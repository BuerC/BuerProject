/***************************************************
 * PercentCounter.java
 * -------------------
 *
 * Author:  YOUR_NAME
 * Company: YOUR_COMPANY
 * Date:    10/18/2017
 *
 * Copyright (c), 2017, YOUR_COMPANY
 **************************************************/    

//#ACD# M(UDIS::UID_632E3C51-447B-4279-AEE4-631EC05DD212) ---- additional import statements
//user defined code to be added here ...

//#end ACD#

public class PercentCounter extends Observable {

  // ------------------------------------------------------------
  // instance attributes
  // ------------------------------------------------------------


  //#ACD# M(UDAT::UID_632E3C51-447B-4279-AEE4-631EC05DD212) ---- additional attributes
  //user defined code to be added here ...
	  private int percent;
  //#end ACD#

  // ------------------------------------------------------------
  // constructors
  // ------------------------------------------------------------
  /**
   * Default constructor
   */
  public PercentCounter() {
    //#ACD# M(UDCC::UID_632E3C51-447B-4279-AEE4-631EC05DD212-def-ctor) ---- constructor body
    //user defined code to be added here ...

    //#end ACD#
  }

  /**
   * This constructor initializes all instance attributes,
   * which are not derived. Furthermore <code>final</code>
   * attributes with a default value aren't initialized either.
   */
  public PercentCounter(int percent) {
    //#ACD# M(UDCC::UID_632E3C51-447B-4279-AEE4-631EC05DD212-full-ctor) ---- constructor body
    //user defined code to be added here ...

    //#end ACD#
    this.percent = percent;
  }

  //#ACD# M(UDCO::UID_632E3C51-447B-4279-AEE4-631EC05DD212) ---- additional constructors
  //user defined code to be added here ...

  //#end ACD#

  // ------------------------------------------------------------
  // methods
  // ------------------------------------------------------------
  public void run() {
    //#ACD# M(UDOP::UID_224A7AEB-AA13-483e-9B3F-4AD829638BA8) ---- method body
    //user defined code to be added here ...
      
    //#end ACD#
	  
	  
	  while(percent<100)
	  {
		  percent++;
		  if(percent%10==0) {
			  reportToObservers();
		  }
		
	  }
	  
  }

  /**
   * Automatically generated <code>set</code>-method 
   * from attribute <code>percent</code>.
   * 
   * @param percent Sets this instance's 
   *    <code>percent</code> to a new value.
   * @see #getPercent()
   */
  private void setPercent(int percent) {
    //#ACD# M(UDOP::UID_A79CFBDD-47EB-4371-80EF-20CD51039338-setter) ---- method body
    //user defined code to be added here ...
      
    //#end ACD#
    this.percent = percent;
  }

  /**
   * Automatically generated <code>get()</code>-method 
   * from attribute <code>percent</code>.
   * 
   * @return This instance's <code>percent</code>.
   * @see #setPercent(int)
   */
  private int getPercent() {
    //#ACD# M(UDOP::UID_A79CFBDD-47EB-4371-80EF-20CD51039338-getter) ---- method body
    //user defined code to be added here ...
      
    //#end ACD#
    return percent;
  }

  //#ACD# M(UDOP::UID_632E3C51-447B-4279-AEE4-631EC05DD212) ---- additional operations
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
    //strbuf.append("PercentCounter:\n");
    strbuf.append("percent: " + percent+"%").append("\n");
    //#ACD# M(UID_632E3C51-447B-4279-AEE4-631EC05DD212-toString) ---- method body
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
    if (! (o instanceof PercentCounter))
      return false;
    else {
      PercentCounter c = (PercentCounter) o;
      if (
          this.percent == c.percent
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
    PercentCounter obj = new PercentCounter();
    obj.percent = percent;
    return obj;
  }

}