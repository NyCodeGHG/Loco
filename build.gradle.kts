plugins {
    kotlin("jvm") version "1.5.10"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.codemc.io/repository/maven-snapshots/")
    mavenLocal()
}

dependencies {
    implementation("net.axay", "kspigot", "1.16.27")
    compileOnly("com.destroystokyo.paper", "paper", "1.16.5-R0.1-SNAPSHOT")
}

tasks {
    jar {
        enabled = false
    }
    shadowJar {
        relocate("net.axay.kspigot", "com.github.warriorzz.shadow.net.axay.kspigot")
    }
    build {
        dependsOn(shadowJar)
    }
}
