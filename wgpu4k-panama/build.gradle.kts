import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    kotlin("jvm")
    id("publish")
    `java-library`
}

kotlin {

}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(22))
    }
    withJavadocJar()
    withSourcesJar()
}

