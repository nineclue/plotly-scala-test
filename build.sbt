scalaVersion := "2.13.7"
scalaJSUseMainModuleInitializer := true

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

libraryDependencies ++= Seq(
      "org.plotly-scala" %%% "plotly-render" % "0.8.2"
)