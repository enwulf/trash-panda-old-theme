plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "1.9.25"
  id("org.jetbrains.intellij") version "1.17.4"
}

group = "ru.enwulf"
version = "1.0.0"

repositories {
  mavenCentral()
}

intellij {
  version.set("2024.1.7")
}

tasks {
  withType<JavaCompile> {
    sourceCompatibility = "17"
    targetCompatibility = "17"
  }

  patchPluginXml {
    sinceBuild.set("241")
    untilBuild.set("266.*")
  }
}
