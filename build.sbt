/*
 * =========================================================================================
 * Copyright © 2013-2018 the kamon project <http://kamon.io/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 * =========================================================================================
 */

import microsites._

name := "kamon-agent-microsite"
scalaVersion := "2.12.3"

// Settings for sbt-microsites https://47deg.github.io/sbt-microsites/
micrositeName             := "kamon-agent"
micrositeDescription      := "Open Source Java Agent for the JVM"
micrositeAuthor           := "kamon-io"
micrositeGithubOwner      := "kamon-io"
micrositeGithubRepo       := "kamon-agent"
micrositeGitterChannel    := true
micrositeGitterChannelUrl := "kamon-io/Kamon"
micrositeBaseUrl          := "/kamon-agent"
micrositeHighlightTheme   := "atom-one-light"

micrositePalette := Map(
  "brand-primary"     -> "#E35D31",
  "brand-secondary"   -> "#2ab253",
  "brand-tertiary"    -> "#2ab253",
  "gray-dark"         -> "#453E46",
  "gray"              -> "#837F84",
  "gray-light"        -> "#E3E2E3",
  "gray-lighter"      -> "#F4F3F4",
  "white-color"       -> "#FFFFFF"
)

micrositeExtraMdFiles := Map(
  //file("README.md") -> ExtraMdFileConfig("index.md", "home", Map("title" -> "Home", "section" -> "home", "position" -> "0")),
  file("SCALA-API.md") -> ExtraMdFileConfig("scala-api.md", "page", Map("title" -> "Scala-Api", "section" -> "scala-api", "position" -> "1")),
  file("CHANGELOG.md") -> ExtraMdFileConfig("changelog.md", "page", Map("title" -> "Changelog", "section" -> "changelog", "position" -> "2")),
  file("LICENSE")      -> ExtraMdFileConfig("license.md",   "page", Map("title" -> "License",   "section" -> "license",   "position" -> "3"))
)

enablePlugins(MicrositesPlugin)
