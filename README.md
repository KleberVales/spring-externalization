# Spring-Core

Study project for the **Spring Professional (VMware 2V0-72.22)** certification.

The objective is to apply fundamental concepts of **Spring Core**, **Java Configuration**, **External Properties**, **Environment Profiles**, and **SpEL (Spring Expression Language)** with a practical and educational focus.

---

## 📌 Technologies

- Java 21
- Spring Framework (Core)
- Spring Boot 3.2.x
- Gradle Kotlin DSL
- application.yml / Profiles
- Spring Expression Language (SpEL)

---

## 📚 Topics covered so far

| Section | Description                                | Status |
|-------|---------------------------------------------|--------|
| 1.1   | Introduction to Spring / IoC / Beans          | ✅     |
| 1.2   | Java Configuration, `@Bean`, `@Scope`       | ✅     |
| 1.3   | `@Value`, arquivos `.yml`, `@Profile`, SpEL | ✅     |

---

## 📁 Structure

```
src/
├── main/
│ ├── java/com.example.springintro/
│ │ ├── SpringIntroApplication.java
│ │ ├── config/ ← Java Config + @Profile
│ │ └── properties/ ← Classe com @Value + SpEL
│ └── resources/
│ ├── application.yml
│ ├── application-dev.yml
│ └── application-prod.yml
```

## 🧪 What is implemented

✅ Bean configuration via `@Configuration` + `@Bean`  
✅ Dependency injection between methods `@Bean`  
✅ Scoped Bean Lifecycle `singleton` e `prototype`  
✅ External properties com `@Value`  
✅ Profiles with `@Profile` (`dev` e `prod`)  
✅ Dynamic expressions with SpEL (`#{...}`)


## ▶️ How to run

```bash
./gradlew bootRun

```

🔁 The active profile can be set in application.yml:
```yml
spring:
  profiles:
    active: dev
```

📦 Test with prod too:
```yml
spring:
  profiles:
    active: prod

```
