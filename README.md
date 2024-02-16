## Project: Database Query Optimization Tools Development

### Overview

The project aims to optimize queries to the MySQL database using Redis as a cache. The main goal is to improve query performance, especially those experiencing latency.

### Task

The project utilizes a relational MySQL database with a schema (country-city, language per country). One of the primary tasks is to move frequently queried data to Redis to enhance query processing speed.

### Required Software

- IntelliJ IDEA Ultimate
- MySQL Workbench or any other MySQL client
- Docker
- Optional: redis-insight

### Action Plan


- Docker Configuration and MySQL Container Launch: Firstly, I configured the Docker environment and launched the MySQL container to create the database environment.
- Database Deployment: Next, I deployed the database using the provided dump file to work with the project's data structure.
- IntelliJ IDEA Project Setup: Afterward, I created a new project in IntelliJ IDEA and added all necessary Maven dependencies for effective library management.
- Domain Layer Creation: Then, I proceeded to create the domain layer and wrote a method to retrieve data from MySQL to work with the project's core objects.
- Data Transformation and Storage in Redis: Subsequently, I implemented a method to transform and store data in Redis to enhance query processing performance.
- Redis Container Initialization: Following this, the Redis container was initialized to utilize it as a cache for frequently queried data.
- Data Retrieval and Speed Comparison: Methods were written to retrieve data from MySQL and Redis, and a comparative analysis of data retrieval speed from both sources was conducted to evaluate the efficiency of each approach.

### Instructions to Run

1. Clone the repository.
2. Launch Docker and MySQL container.
3. Deploy the database from a dump.
4. Open the project in IntelliJ IDEA.
5. Add Maven dependencies.
6. Start the Redis container.
7. Run methods to retrieve data from MySQL and Redis.
8. Compare the speed of data retrieval.

### Conclusion

The project allows for effective optimization of database queries, particularly those experiencing latency, by using Redis as a cache. This leads to improved software performance and efficiency.
