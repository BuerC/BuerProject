/***************************************************
 * Observer.java
 * -------------
 *
 * Author:  YOUR_NAME
 * Company: YOUR_COMPANY
 * Date:    10/18/2017
 *
 * Copyright (c), 2017, YOUR_COMPANY
 **************************************************/    

//#ACD# M(UDIS::UID_C27DB187-67A4-4c47-8EFD-15704184C2D0) ---- additional import statements
//user defined code to be added here ...

//#end ACD#

public interface Observer {
  //#ACD# M(UDAT::UID_C27DB187-67A4-4c47-8EFD-15704184C2D0) ---- additional static attributes
  //user defined code to be added here ...

  //#end ACD#

  // ------------------------------------------------------------
  // methods
  // ------------------------------------------------------------
  public void report(Observable observable);
  //#ACD# M(UDOP::UID_C27DB187-67A4-4c47-8EFD-15704184C2D0) ---- additional operations
  //user defined code to be added here ...
  	
  //#end ACD#
}