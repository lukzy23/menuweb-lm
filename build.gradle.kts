plugins {
    id("java")
    id("org.springframework.boot") version "2.7.8"  // Versão do Spring Boot compatível com Java 8
    id("io.spring.dependency-management") version "1.0.13.RELEASE"  // Gerenciador de dependências do Spring
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Dependências do Spring Boot Web para criar APIs REST
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Dependência do Spring Boot Core
    implementation("org.springframework.boot:spring-boot-starter")

    // Dependências de testes
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
