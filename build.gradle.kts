plugins {
    id("java")
}

group = "dev.blaz06"
version = "0.0.0"
val spigotApi = "org.spigotmc:spigot-api:1.20.4-R0.1-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots")
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
}

dependencies {
    compileOnly("org.spigotmc:plugin-annotations:1.2.3-SNAPSHOT")
    annotationProcessor("org.spigotmc:plugin-annotations:1.2.3-SNAPSHOT")

    compileOnly(spigotApi)
}