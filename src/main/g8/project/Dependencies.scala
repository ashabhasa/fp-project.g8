import sbt._
object Dependencies {

  lazy val MiniTestVersion = "$mini_test_version$"
  lazy val Http4sVersion = "$http4s_version$"
  lazy val Specs2Version = "$specs2_version$"
  lazy val DoobieVersion = "$doobie_version$"
  lazy val PureConfigVersion = "$pure_conf_version$"
  lazy val miniTest   = "io.monix"              %% "minitest"    % MiniTestVersion
  lazy val spec       = "org.specs2"            %% "specs2-core" % Specs2Version    % Test
  lazy val pureconfig = "com.github.pureconfig" %% "pureconfig"  % PureConfigVersion

  val http4s: Seq[ModuleID] = {
    Seq(
      "org.http4s" %% "http4s-core"         % Http4sVersion,
      "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
      "org.http4s" %% "http4s-blaze-client" % Http4sVersion,
      "org.http4s" %% "http4s-dsl"          % Http4sVersion,
      "org.http4s" %% "http4s-circe"        % Http4sVersion
    )
  }

  val doobie: Seq[ModuleID] = {

    Seq(
        "org.tpolecat" %% "doobie-core"      % DoobieVersion
      , "org.tpolecat" %% "doobie-hikari"    % DoobieVersion
      , "org.tpolecat" %% "doobie-specs2"    % DoobieVersion % Test
      , "org.tpolecat" %% "doobie-scalatest" % DoobieVersion % Test
    )
  }



}