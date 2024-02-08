# Spring Boot Link Shortener

This project is a simple link shortener built with Spring Boot, demonstrating the use of Spring Web, Spring Data JPA, and PostgreSQL Database. It allows users to shorten URLs for easier sharing.

## Features

- URL shortening with a simple web interface
- Persistence of original and shortened URLs using Spring Data JPA
- PostgreSQL database for data persistence and testing

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.6.0 or later
- Spring boot 3

### Installation

1. **Clone the repository**

```bash
git clone https://github.com/Realwale/link-shortener.git
cd spring-boot-link-shortener
```

2. **Build the application**

```bash
mvn clean install
```

3. **Run the application**

```bash
java -jar target/shorturl-0.0.1-SNAPSHOT.jar
```

Alternatively, you can run the application directly using Spring Boot Maven plugin:

```bash
mvn spring-boot:run
```

## Usage

### Shortening a URL

To shorten a URL, send a POST request to `/api/link/shorten` with the original URL as a parameter.

**Example Request**

```bash
curl -X POST -F "originalUrl=https://www.example.com" http://localhost:8080/api/link/shorten
```

**Example Response**

```json
{
  "hasError": false,
  "statusCode": 201,
  "message": "Short link created successfully",
  "time": "2024-02-08 9:12:48 pm",
  "data": "http://localhost:8080/s/wgl8Pu"
}
```

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


## Contact

 [Olawale Agboola](https://www.linkedin.com/in/agboolawale) - agboolawale8@gmail.com

Project Link: [https://github.com/Realwale/link-shortener](https://github.com/Realwale/link-shortener)
