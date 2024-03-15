plugins {
    id("java")
}

group = "project.bot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("com.github.pengrad:java-telegram-bot-api:5.0.0")
    compileOnly ("org.projectlombok:lombok:1.18.20")
    annotationProcessor ("org.projectlombok:lombok:1.18.20")
    implementation ("org.telegram:telegrambots-meta:5.3.0")
    implementation ("org.telegram:telegrambots:5.3.0")
}

tasks.test {
    useJUnitPlatform()
}