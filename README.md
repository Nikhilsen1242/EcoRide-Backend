# 🚗 EcoRide - Carpooling & Ride Sharing Backend

EcoRide is a robust RESTful API built using **Spring Boot 3.x**. The platform facilitates a seamless connection between drivers and passengers, enabling them to share travel costs and promote environment-friendly transportation.

## 🌟 Key Features
- **Secure Authentication**: Implemented stateless authentication using **Spring Security & JWT**.
- **Role-Based Access Control (RBAC)**: Distinct functionalities for **Drivers** (Posting Rides) and **Passengers** (Searching/Booking Rides).
- **Ride Management**: Complete CRUD operations for managing ride details like Source, Destination, Price, and available Seats.
- **Transactional Booking**: A real-time seat booking system ensuring data integrity using `@Transactional`.
- **Global Exception Handling**: Centralized error handling for consistent and user-friendly API responses.

## 🛠️ Tech Stack
- **Language**: Java 21
- **Framework**: Spring Boot 3.x
- **Security**: Spring Security & JWT (JSON Web Token)
- **Database**: MySQL
- **ORM**: Spring Data JPA (Hibernate)
- **Build Tool**: Maven
- **API Testing**: Postman

## 📂 Project Architecture
The project follows a **Layered Architecture** for better maintainability and scalability:
- **Controller Layer**: Handles incoming REST API requests.
- **Service Layer**: Contains core business logic and validations.
- **Repository Layer**: Manages database interactions via Spring Data JPA.
- **DTO (Data Transfer Objects)**: Ensures secure and optimized data transfer between layers.

## 📡 Key API Endpoints
| Feature | Method | Endpoint |
| :--- | :--- | :--- |
| User Signup | POST | `/api/auth/signup` |
| User Login | POST | `/api/auth/login` |
| Post a Ride | POST | `/api/rides/post` |
| Search Rides | GET | `/api/rides/search` |
| Book a Ride | POST | `/api/rides/book` |

## 🚀 How to Run Locally
1. Clone the repository:
   ```bash
   git clone [https://github.com/Nikhilsen1242/EcoRide-Backend.git](https://github.com/Nikhilsen1242/EcoRide-Backend.git)
