
plugins {
    `java-library`
    id("net.minecraftforge.gradle") version "[6.0.24,6.2)"
}

version = "1.0"
group = "me.fortibrine"

minecraft {
    mappings("snapshot", "20171003-1.12")

    runs.create("client") {
        this.workingDirectory(project.file("run"))
    }
}

dependencies {
    minecraft("net.minecraftforge:forge:1.12.2-14.23.5.2859")
}

tasks {
    withType<JavaCompile>() {
        targetCompatibility = "1.8"
        sourceCompatibility = "1.8"
    }

    jar {
        finalizedBy("reobfJar")
    }
}