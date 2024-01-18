resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "1.15.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "1.3.2")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.3.2")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.4.16")
addSbtPlugin("org.scoverage"      % "sbt-scoverage"                 % "2.0.9")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"                       % "0.4.6")
addSbtPlugin("com.47deg"          % "sbt-microsites"                % "1.4.4")
addSbtPlugin("com.github.sbt"     % "sbt-unidoc"                    % "0.5.0")
addSbtPlugin("com.typesafe"       % "sbt-mima-plugin"               % "1.1.3")
addSbtPlugin("de.heikoseeberger"  % "sbt-header"                    % "5.9.0")
addSbtPlugin("org.scalameta"      % "sbt-scalafmt"                  % "2.5.2")
addSbtPlugin("com.github.sbt"     % "sbt-ci-release"                % "1.5.12")
addSbtPlugin("ch.epfl.scala"      % "sbt-scalajs-bundler"           % "0.21.1")
addSbtPlugin("com.github.sbt"     % "sbt-github-actions"            % "0.19.0")
libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
