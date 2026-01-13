# 🚗 EcoRide - Carpooling & Ride Sharing Backend

EcoRide ek robust RESTful API hai jise **Spring Boot** ka use karke banaya gaya hai. Ye platform drivers aur passengers ko connect karta hai taaki wo safar ke kharche baant sakein aur environment-friendly travel ko promote karein.

## 🌟 Key Features
- **User Authentication**: Spring Security aur JWT (JSON Web Token) ka use karke secure login/signup.
- **Role-Based Access**: Drivers rides post kar sakte hain aur Passengers rides search/book kar sakte hain.
- **Ride Management**: Drivers apni ride details (Source, Destination, Price, Seats) manage kar sakte hain.
- **Booking System**: Real-time seat booking system jo transactional integrity maintain karta hai.
- **Global Exception Handling**: Pure project mein centralized error handling implement ki gayi hai.

## 🛠️ Tech Stack
- **Language**: Java 21
- **Framework**: Spring Boot 3.x
- **Database**: MySQL
- **ORM**: Spring Data JPA (Hibernate)
- **Security**: Spring Security & JWT
- **Build Tool**: Maven

## 📂 Project Architecture
Maine isme **Layered Architecture** follow ki hai:
- `Controller`: API endpoints handle karne ke liye.
- `Service`: Saara business logic handle karne ke liye.
- `Repository`: Database ke sath interact karne ke liye.
- `DTO`: Data Transfer Objects secure data sharing ke liye.

## 📡 API Endpoints
| Feature | Method | Endpoint |
| :--- | :--- | :--- |
| User Signup | POST | `/api/auth/signup` |
| User Login | POST | `/api/auth/login` |
| Post a Ride | POST | `/api/rides/post` |
| Search Rides | GET | `/api/rides/search` |
| Book a Ride | POST | `/api/rides/book` |

## 🚀 How to Run Locally
1. Is repository ko clone karein: `git clone <repo-url>`
2. `src/main/resources/application.properties` mein apne MySQL credentials update karein.
3. Eclipse ya kisi bhi IDE mein project import karke `EcoRideBackendApplication.java` run karein.
