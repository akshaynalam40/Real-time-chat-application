Project Description

The Real-Time Chat Application is a web-based messaging platform developed using Java Spring Boot, WebSocket, STOMP Protocol, SockJS, HTML, CSS, JavaScript, Bootstrap, Maven, and Thymeleaf. The main objective of this project is to enable instant communication between multiple users without refreshing the webpage. The application uses WebSocket technology to establish a continuous connection between the client and server, allowing real-time message exchange with fast response and smooth interaction.

The frontend of the application is designed using HTML, CSS, Bootstrap, and JavaScript to create a modern, responsive, and user-friendly chat interface. Users can enter their names, type messages, and send them instantly through the chat window. Messages are dynamically displayed in real time without reloading the page. Bootstrap is used to improve the appearance and responsiveness of the interface across different devices.

The backend of the application is developed using Spring Boot and Spring WebSocket. STOMP (Simple Text Oriented Messaging Protocol) is used for message communication, while SockJS provides fallback support for browsers that do not support WebSocket connections. A WebSocketConfig class is implemented to configure WebSocket endpoints and message brokers. A ChatController class handles incoming messages using @MessageMapping and broadcasts them to all connected users using @SendTo.

Whenever a user sends a message, the message is transmitted to the backend server and instantly delivered to all active users connected to the application. This project demonstrates real-time frontend-backend communication, WebSocket integration, responsive UI development, and client-server architecture.

Technologies Used
Java – Core programming language used for backend development
Spring Boot – Framework used to build and manage the application
Spring WebSocket – Enables real-time communication
STOMP Protocol – Used for sending and receiving chat messages
SockJS – Provides browser compatibility and fallback support
HTML5 – Structures the frontend interface
CSS3 – Used for styling and UI design
Bootstrap 5 – Creates responsive and attractive frontend layouts
JavaScript – Handles frontend functionality and dynamic updates
Maven – Dependency management and project build tool
Thymeleaf – Used to render HTML pages in Spring Boot
Features
Real-time messaging
Instant message broadcasting
Multiple user communication
Responsive and modern UI
WebSocket-based communication
Smooth and fast interaction
Dynamic message display
Lightweight application architecture
Project Workflow
User opens the chat application.
WebSocket connection is established between client and server.
User enters name and message.
Message is sent to the Spring Boot backend using STOMP.
Server broadcasts the message to all connected users.
Messages appear instantly in the chat interface.
Applications
Online communication platforms
Team collaboration systems
Educational discussion forums
Customer support chat systems
Live event messaging applications
Conclusion

This project helped improve practical knowledge in Spring Boot, WebSocket communication, frontend-backend integration, responsive UI development, and real-time web application architecture. It demonstrates how modern web technologies can be used to build scalable and interactive real-time communication systems.
