# Spring Boot Actuator

Spring Boot Actuator is a sub-project of the Spring Boot Framework. It provides additional features to help monitor and manage Spring Boot applications. These features include endpoints, metrics, and audit capabilities, making it an essential tool for production-ready applications. Actuator allows interaction and monitoring of the application through HTTP or JMX endpoints.

---

## Features

### 1. Endpoints
Actuator endpoints allow monitoring and interaction with the application. Spring Boot includes several built-in endpoints, and developers can create custom endpoints as needed. Each endpoint can be enabled or disabled individually.

- **Example**: The `/health` endpoint provides basic health information about the application. By default, it is mapped to `/actuator/health`.

**Key Highlights:**
- Endpoints are accessible via HTTP, prefixed with `/actuator`.
- Fully customizable and extendable.

---

### 2. Metrics
Spring Boot Actuator provides dimensional metrics using [Micrometer](https://micrometer.io/), an instrumentation library integrated into Spring Boot.

**Key Features:**
- Vendor-neutral interfaces for metrics like timers, gauges, counters, distribution summaries, and long task timers.
- A dimensional data model for flexible metric collection and reporting.
- Seamless integration with monitoring tools like Prometheus, Grafana, and CloudWatch.

---

### 3. Audit
Spring Boot Actuator includes a flexible audit framework to publish and manage application events via an `AuditEventRepository`.

**Key Features:**
- Automatically publishes authentication-related events when Spring Security is active.
- Customizable for publishing additional application events.

---

## Getting Started

### Adding Actuator to Your Project
To use Spring Boot Actuator, add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

### Enabling Endpoints
By default, only a few endpoints are enabled. You can configure which endpoints to enable in your `application.properties` or `application.yml`:

```properties
management.endpoints.web.exposure.include=*
```

To enable specific endpoints, list them explicitly:

```properties
management.endpoints.web.exposure.include=health,info
```

### Accessing Endpoints
Once enabled, endpoints can be accessed using the `/actuator` prefix. Example:

- Health endpoint: `http://localhost:8080/actuator/health`
- Metrics endpoint: `http://localhost:8080/actuator/metrics`

---

## References
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
- [Micrometer Documentation](https://micrometer.io/)

---

Contributions are welcome! Feel free to open issues or submit pull requests for improvements.

