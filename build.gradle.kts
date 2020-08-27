import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "org.example"
version = "1.0-SNAPSHOT"

plugins {
    application
    java
    kotlin("jvm") version "1.4.0-rc"
    id("org.openjfx.javafxplugin") version "0.0.8"
}

application {
    mainClassName = "org.example.MyAppKt"
}
kotlin {
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "14"
        }
    }
}

javafx {
    version = "14"
    modules = mutableListOf(
            "javafx.controls",
            "javafx.graphics",
            "javafx.fxml")
}

repositories {
    maven {
        setUrl("https://oss.sonatype.org/content/repositories/snapshots/")
    }
    mavenCentral()
}

dependencies {
    implementation ("no.tornado:tornadofx:2.0.0-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.0")
    testImplementation("org.testfx:testfx-core:4.0.16-alpha")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.1")
    testImplementation("org.testfx:testfx-junit5:4.0.16-alpha")
    testImplementation("org.hamcrest:hamcrest:2.1")
}