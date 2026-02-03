🧩 # Microservices Architecture with Spring Boot, Spring Cloud & Docker
📌 Project Overview

This project demonstrates how to build a scalable microservices-based system using Spring Boot, Spring Cloud, and Docker.

The goal is to migrate from a monolithic architecture to a distributed, cloud-native architecture where services are:

Independently developed

Independently deployed

Loosely coupled

Easily scalable

The project applies modern microservices patterns such as service discovery, centralized configuration, API gateway routing, and containerization.

🏗️ System Architecture

The system consists of multiple independent microservices communicating through REST APIs.

Core Components
Component	Description
API Gateway	Single entry point for all client requests
Eureka Server	Service discovery and registration
Config Server	Centralized configuration management
Business Microservices	Domain-specific services (User, Department, etc.)
Docker	Containerization platform
