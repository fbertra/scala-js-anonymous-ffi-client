package anonymousfficlient

import scala.scalajs.js

import anonymousffi._

object Main {
  def main () : Unit = {
      
    // anonymous object are often used as "options" parameter
    val params = new Params ()
    params.id = "scala-js"
    // params.desc = "Scala compiling to Javascript"

    /* equivalent to the following javascript code:
    
       var msg = doSomething ("hello world", {"id" : "scala-js"}) ;
     */
        
    val msg = SuperJavascriptAPI.doSomething ("hello world", params)

    //     
    val document = js.Dynamic.global.document
    val paragraph = document.createElement("p")
    paragraph.innerHTML = "<strong>" + msg + " </strong>"
    document.getElementById("playground").appendChild(paragraph)    
  }
}


