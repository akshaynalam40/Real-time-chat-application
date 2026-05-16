# 💬 Real-Time Chat Application

## 📌 Overview
The Real-Time Chat Application is a web-based messaging platform developed using Java Spring Boot and WebSocket technology. The application allows multiple users to communicate instantly through a modern and responsive chat interface without refreshing the webpage.

---

# 🚀 Features

- Real-time messaging
- Instant message broadcasting
- Multiple user communication
- Responsive and attractive UI
- WebSocket-based communication
- Fast and smooth interaction
- Dynamic message updates
- Lightweight application architecture

---

# 🛠️ Technologies Used

## Backend
- Java
- Spring Boot
- Spring WebSocket
- STOMP Protocol
- Maven

## Frontend
- HTML5
- CSS3
- Bootstrap 5
- JavaScript

## Communication
- WebSocket
- SockJS

---

# 📂 Project Structure

```text
src
 └── main
      ├── java
      │    └── com.chat.app
      │          ├── config
      │          │      └── WebSocketConfig.java
      │          ├── controller
      │          │      └── ChatController.java
      │          └── model
      │                 └── ChatMessage.java
      │
      └── resources
            └── templates
                   └── chat.html
```

---

# ⚙️ How It Works

1. User opens the chat application.
2. WebSocket connection is established.
3. User enters name and message.
4. Message is sent to the Spring Boot backend.
5. Server broadcasts the message to all connected users.
6. Messages appear instantly in the chat window.

---

# 🔗 WebSocket Endpoints

| Endpoint | Description |
|---|---|
| `/chat` | WebSocket connection endpoint |
| `/app/sendMessage` | Send message to server |
| `/topic/messages` | Receive broadcast messages |

---

# ▶️ Run the Project

## Clone Repository

```bash
git clone <repository-url>
```

## Open Project
Open the project using:
- IntelliJ IDEA
- Eclipse
- VS Code

## Run Application

```bash
mvn spring-boot:run
```

OR run the main Spring Boot application class.

---

# 🌐 Open in Browser

```text
http://localhost:8080/chat
```

---

# 📦 Maven Dependencies

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-websocket</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

---

# 🔮 Future Enhancements

- User authentication
- Private chat rooms
- File sharing
- Emoji support
- Online/offline status
- Chat notifications
- Database message storage

---

# 🎯 Applications

- Online communication systems
- Team collaboration platforms
- Educational discussion forums
- Customer support systems
- Live event messaging platforms

---

# 📖 Conclusion

This project demonstrates real-time communication using Spring Boot WebSocket technology and provides practical experience in frontend-backend integration, WebSocket programming, responsive UI design, and modern web application development.
