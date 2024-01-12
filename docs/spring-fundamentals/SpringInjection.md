# What Is Spring?
Spring Framework started out as just an **inversion of control container**. This technique is often referred to as dependency injection. It was conceived to reduce or replace some of the complex configuration of the earlier Java Enterprise Edition. Spring was later built around using Java without EJBs, so its original concept was how to work better with EJBs, and then they realized they just didn't need those for a lot of situations. 
So it kind of transitioned into, okay, how can I do the same development without using Enterprise JavaBeans (EJB)?  Spring is now days used withput EJB.

Spring is a dependency injection container.  Dependency injection is very simply removing hard-coded wiring in your app and using a framework to inject dependency resources where they are needed.



![image](https://github.com/vikascjadhav/fusion/assets/3233682/335517f8-b34b-436c-b782-2d9036c45094)

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
