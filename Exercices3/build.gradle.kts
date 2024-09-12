plugins {
    kotlin("jvm") version "2.0.10"
}

group = "org.Hudiakov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jsoup:jsoup:1.18.1")
    implementation ("com.sanctionco.jmail:jmail:1.6.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}