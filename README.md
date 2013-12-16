scala-js-anonymous-ffi-client
=====================

This project demonstrates how to use "scala-js-anonymous-ffi", a scala-js wrapper to a Javascript function 
that uses an anonymous object as parameter.

In "js/startup.js" we define the doSomething() function.  This function should be part of an external javascript API.

The rest is normal scala-js code.

Note: it's unfortunate it's impossible to use the following style:

    val params = new Params () {
      id = "scala-js"
    }

The reason is that the compiler will generate a new Scala class that won't be defined in Javascript. 

How to use
==========

Download the wrapper lib and publish it to the local ivy repository

    https://github.com/fbertra/scala-js-anonymous-ffi.git
    sbt
    packageJS
    publish-local
    
Download and compile this client

    https://github.com/fbertra/scala-js-anonymous-ffi-client.git
    sbt
    packageJS
    
Open index-dev.html in a browser
