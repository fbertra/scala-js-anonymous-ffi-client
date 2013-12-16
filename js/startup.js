// assuming this function is part of an external javascript library 
function doSomething (msg, params) {
  var ret = '' ;
	
  if (typeof params.id != 'undefined') {
    ret = params.id ;
  }
  else {
    ret = "nobody" ;
  }
  
  if (typeof params.desc != 'undefined') {
    ret = ret + " (" + params.desc + ")" ;
  }
  
  ret = ret + " says " + msg ;
  
  return (ret) ;
}

ScalaJS.modules.anonymousfficlient_Main().main();
