# Simple Scala giter8 template [![Build Status](https://travis-ci.org/ashabhasa/fp-project.g8.svg)](https://travis-ci.org/ashabhasa/fp-project.g8)

Generate a simple sbt scala project.

1. [Install sbt](http://www.scala-sbt.org/1.0/docs/Setup.html)
2. `sbt new ashabhasa/fp-project.g8`
3. `cd quickstart`


Note:

We have enabled [sbt-partial-unification](https://github.com/fiadliel/sbt-partial-unification).
As well as [sbt-revolver](https://github.com/spray/sbt-revolver) for easier project reloading.
And the [sbt-tpolecat](https://github.com/DavidGregory084/sbt-tpolecat) plugin in the generated `project/plugins.sbt`.
We highly recommend it for projects, but it may not be a good baseline for new users.
