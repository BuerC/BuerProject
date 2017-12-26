import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/***************************************************
 * FileLogger.java
 * ---------------
 *
 * Author:  YOUR_NAME
 * Company: YOUR_COMPANY
 * Date:    10/18/2017
 *
 * Copyright (c), 2017, YOUR_COMPANY
 **************************************************/    

//#ACD# M(UDIS::UID_DF0AC842-734C-43d6-90F6-90EE16F1FE2A) ---- additional import statements
//user defined code to be added here ...

//#end ACD#

public class FileLogger implements Observer {
FileWriter writer;
PrintWriter printwriter;
  //#ACD# M(UDAT::UID_DF0AC842-734C-43d6-90F6-90EE16F1FE2A) ---- additional attributes
  //user defined code to be added here ...

  //#end ACD#

  // ------------------------------------------------------------
  // constructors
  // ------------------------------------------------------------
  public FileLogger(String filename) {
    //#ACD# M(UDCC::UID_2CF1709C-1FF9-4680-AEC6-8D5F6D145A22) ---- constructor body
    //user defined code to be added here ...
	  try {
			writer = new FileWriter(filename);
			printwriter = new PrintWriter(writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  
	  }
    //#end ACD#
	

  /**
   * Default constructor
   */
  public FileLogger() {
    //#ACD# M(UDCC::UID_DF0AC842-734C-43d6-90F6-90EE16F1FE2A-def-ctor) ---- constructor body
    //user defined code to be added here ...

    //#end ACD#
  }

  //#ACD# M(UDCO::UID_DF0AC842-734C-43d6-90F6-90EE16F1FE2A) ---- additional constructors
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
	  printwriter.println(observable.toString());
		printwriter.flush();
    //#end ACD#
	 
	
  }

  //#ACD# M(UDOP::UID_DF0AC842-734C-43d6-90F6-90EE16F1FE2A) ---- additional operations
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
    
    //#ACD# M(UID_DF0AC842-734C-43d6-90F6-90EE16F1FE2A-toString) ---- method body
    //user defined code to be added here ...
	  StringBuffer strbuf = new StringBuffer();
	    strbuf.append("FileLogger:\n");
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
    if (! (o instanceof FileLogger))
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
    FileLogger obj = new FileLogger();
    return obj;
  }

}