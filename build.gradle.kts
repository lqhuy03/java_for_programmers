plugins {
    java
    id("java-library")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "java-library")

    repositories { mavenCentral() }

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.2"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        testImplementation("org.assertj:assertj-core:3.26.3")
    }

    // QUAN TRỌNG: dùng JUnit Platform cho JUnit 5
    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

