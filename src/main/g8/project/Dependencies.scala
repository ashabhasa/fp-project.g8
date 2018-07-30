import sbt._

object Dependencies {
  val MiniTestVersion = "$mini_test_version$"
  lazy val miniTest = "io.monix" %% "minitest" % MiniTestVersion
}