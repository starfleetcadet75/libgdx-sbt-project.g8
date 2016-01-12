# libgdx-sbt Project for Desktop Only

This is a template to be used with [g8](http://github.com/n8han/giter8) for configuring and generating a Scala project for [libgdx](http://libgdx.badlogicgames.com/) using [sbt](http://www.scala-sbt.org/) as a build system. This template only generates the core and desktop projects for libgdx. See the [original project](https://github.com/ajhager/libgdx-sbt-project.g8) for a template that generates all supported libgdx project types.

## Setting Up a New Project

Install [g8](http://github.com/n8han/giter8#readme)  
Then run the following:

    $ g8 starfleetcadet75/libgdx-sbt-project

You will be prompted to enter some basic information about your project.

Once that is complete, your project is ready for development. See [here](https://github.com/ajhager/libgdx-sbt-project.g8/wiki/IDE-Plugins) for details about sbt plugins for each editor.

## Current Version Defaults

[sbt](http://www.scala-sbt.org/): 0.13.9  
[scala](http://www.scala-lang.org/): 2.11.7  
[libgdx](http://libgdx.badlogicgames.com/): 1.8.0  
Java: 1.8  

During setup you will be prompted to enter version information. These are the current defaults that it will suggest. To use a newer or older version simply specify it instead.

## Managing your project

Start `sbt` in project root:

    $ sbt

Run the desktop project:

    > desktop/run

Package the desktop project into a single jar:

    > assembly

Add a library dependency:  
Edit ${PROJECT}/project/build.scala and add to the following:

    libraryDependencies ++= Seq(
      "com.badlogicgames.gdx" % "gdx" % libgdxVersion.value,
      "com.badlogicgames.ashley" % "ashley" % "1.7.0" % "compile",
      Your dependency ...
    )

