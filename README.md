### About project

This is simple docker compose project which uses 3 containers to communicate with each other. 
Nginx is entrypoint to the server, which retrieves message from database.

### How to run
1. Start your local docker engine
2. Go to docker directory `cd docker`
3. Execute `bash run-compose.sh` from repository root
4. Open http://localhost/hello to see message redirected by nginx
5. Stop compose by executing `docker-compose down` in terminal
