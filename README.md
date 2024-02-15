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


- Docker Setup and MySQL Container Launch: The Docker environment was configured, and a MySQL container was launched to host the database.
- Database Deployment: The database was deployed using the provided dump file.
- Project Setup in IntelliJ IDEA: A new project was created in IntelliJ IDEA, and Maven dependencies were added to manage project libraries.
- Domain Layer Creation: The domain layer was established, and a method to retrieve data from MySQL was implemented.
- Data Transformation and Redis Storage: A method to transform and store data in Redis was developed to improve query performance.
- Redis Container Initialization: The Redis container was started to be utilized it as a cache for frequently queried data.
- Optional: redis-insight Installation: For visualizing data in Redis, redis-insight was installed (if needed).
- Data Retrieval and Performance Comparison: Methods to retrieve data from MySQL and Redis were written, and a performance comparison was conducted to assess the efficiency of each approach.

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
