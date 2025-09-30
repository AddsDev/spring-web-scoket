# WebSocket

## Exportar variable de entorno
### 1. JDBC
```bash
export SPRING_DATASOURCE_URL="jdbc:postgresql://localhost:5432/app_db"
export SPRING_DATASOURCE_USERNAME="app_user"
export SPRING_DATASOURCE_PASSWORD="S3cr37A."
export SPRING_PROFILES_ACTIVE=prod
```

### 2. Ejecutar
```bash
java -jar websocket-1.0-SNAPSHOT.jar --server.port=8080
```

### 3. Ejecutar Web con Python
```bash
cd /Downloads/ws-client.html
python3 -m http.server 5500
```

