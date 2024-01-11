# Spring Dependency Injection Examples

This repository provides examples of dependency injection in the Spring Framework using various approaches such as constructor injection, setter injection, field injection, and method injection.

## Table of Contents

- [Introduction](#introduction)
- [Dependency Injection Types](#dependency-injection-types)
  - [1. Constructor Injection](#1-constructor-injection)
  - [2. Setter Injection](#2-setter-injection)
  - [3. Field Injection](#3-field-injection)
  - [4. Method Injection](#4-method-injection)
- [Usage](#usage)
- [License](#license)

## Introduction

In Spring, dependency injection is a key feature that promotes loose coupling between components in your application. It allows you to inject the dependencies of a class at runtime, making your code more modular and easier to maintain.

This repository provides simple examples of different types of dependency injection in Spring, using annotations like `@Autowired`.

## Dependency Injection Types

### 1. Constructor Injection

Constructor injection is a common and recommended approach. Dependencies are injected through the constructor of the class.

```java
@Service
public class MyService {
    private final SomeDependency someDependency;

    @Autowired
    public MyService(SomeDependency someDependency) {
        this.someDependency = someDependency;
    }

    // other methods...
}
