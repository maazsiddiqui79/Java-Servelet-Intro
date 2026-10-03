
# Java Servlet Intro 🚀

A beginner-friendly Java Servlet project created to understand the fundamentals of **Java backend development** using **Jakarta Servlets** and **Apache Tomcat**.

This project demonstrates how a Java Servlet receives an HTTP request and dynamically generates an HTML response that is displayed in the browser.

## 📌 Project Overview

This project contains two simple Servlets:

- `maazclass` → Displays a **Hello Dear!** page.
- `maazclass2` → Displays a **Bye Dear!** page.

Both pages are connected through buttons/links, allowing navigation between the two Servlets.

The project is designed as an introduction to the **Servlet request-response cycle** and basic Java backend development.

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| ☕ Java | Backend programming |
| Jakarta Servlet | Handling HTTP requests and responses |
| Apache Tomcat | Servlet container / application server |
| Eclipse IDE | Development environment |
| HTML5 | Dynamic webpage structure |
| CSS3 | UI styling |

---

## 📂 Project Structure

```text
Java-Servelet-Intro/
│
└── MAAZ FIRST JAVA BACKEND/
    │
    └── Java Resources/
        │
        └── src/
            │
            └── MAAZPACKAGE/
                ├── maazclass.java
                └── maazclass2.java
```

### Servlet Classes

#### `maazclass.java`

Mapped to:

```text
/maazHello
```

This Servlet generates the Hello page.

#### `maazclass2.java`

Mapped to:

```text
/maazBye
```

This Servlet generates the Bye page.

---

## 🔄 How It Works

The application follows a basic HTTP request-response flow:

```text
User
  │
  │ HTTP Request
  ▼
Apache Tomcat
  │
  ▼
@WebServlet Mapping
  │
  ▼
Java Servlet
  │
  │ HTML Response
  ▼
Web Browser
```

For example:

```text
/maazHello
      ↓
maazclass
      ↓
doGet()
      ↓
HTML Response
      ↓
Browser
```

---

## 🌐 Servlet URLs

If the application is deployed with the context path:

```text
MAAZ_FIRST_JAVA_BACKEND
```

the Servlets can be accessed using:

### Hello Servlet

```text
http://localhost:8080/MAAZ_FIRST_JAVA_BACKEND/maazHello
```

### Bye Servlet

```text
http://localhost:8080/MAAZ_FIRST_JAVA_BACKEND/maazBye
```

---

## 💻 Example Servlet Mapping

The Servlet uses the `@WebServlet` annotation:

```java
@WebServlet("/maazHello")
public class maazclass extends HttpServlet {
```

This tells Tomcat that requests to:

```text
/maazHello
```

should be handled by `maazclass`.

Similarly:

```java
@WebServlet("/maazBye")
public class maazclass2 extends HttpServlet {
```

handles:

```text
/maazBye
```

---

## ⚙️ Running the Project

### 1. Install Java

Install a compatible **JDK** and verify it:

```bash
java -version
```

### 2. Install Eclipse

Use **Eclipse IDE for Enterprise Java and Web Developers**.

### 3. Install Apache Tomcat

Configure Apache Tomcat in Eclipse.

This project uses the Jakarta Servlet API, so use a compatible modern Tomcat version.

### 4. Import the Project

Open Eclipse and import the project.

### 5. Configure Tomcat

Add the project to the Tomcat server:

```text
Servers
   ↓
Tomcat
   ↓
Add and Remove...
   ↓
Add the project
```

### 6. Start Tomcat

Start the server from Eclipse.

### 7. Open the Servlet

Open:

```text
http://localhost:8080/MAAZ_FIRST_JAVA_BACKEND/maazHello
```

---

## 🧠 Concepts Learned

This project introduces the following concepts:

- Java Servlets
- `HttpServlet`
- `doGet()`
- `HttpServletRequest`
- `HttpServletResponse`
- `PrintWriter`
- HTTP GET requests
- HTTP responses
- `@WebServlet`
- Servlet URL mapping
- Dynamic HTML generation
- Jakarta Servlet API
- Apache Tomcat
- Eclipse Web Development
- Basic Servlet navigation
  
---

## 🔗 Navigation

The two Servlets are connected:

```text
┌───────────────┐
│   maazHello   │
│               │
│ "Hello Dear!" │
└───────┬───────┘
        │
        │ Continue
        ▼
┌───────────────┐
│    maazBye    │
│               │
│  "Bye Dear!"  │
└───────┬───────┘
        │
        │ Go Back
        └──────────────► maazHello
```
---

## ⭐ Purpose

This repository is primarily a **learning project** created to understand the fundamentals of Java Servlets, Apache Tomcat, HTTP request handling, and dynamic server-side HTML generation.
```

One thing to fix in the repository: **“Servelet” is misspelled in the repository name.** The standard spelling is **“Servlet.”** Your repository is currently named `Java-Servelet-Intro`. :chatgpt-content-reference{index="2"}
