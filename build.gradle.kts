/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.12-rc-1/userguide/building_java_projects.html in the Gradle documentation.
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    kotlin("jvm") version "2.1.0"
    kotlin("plugin.assignment") version "2.1.0"
    kotlin("plugin.noarg") version "2.1.0"
    kotlin("plugin.allopen") version "2.1.0"
}
assignment {
  annotation("org.example.CustomAnnotation")
}

allOpen {
    annotation("org.example.CustomAnnotation")
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
}

testing {
    suites {
        // Configure the built-in test suite
        val test by getting(JvmTestSuite::class) {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.11.1")
        }
    }
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

kotlin {
    compilerOptions {
        extraWarnings = true
        allWarningsAsErrors = true
        verbose = true
    }
}