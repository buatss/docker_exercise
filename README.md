### About project

This is simple docker compose project which uses 3 containers which are communicating with each other.
Communication chain looks like this: client <---> nginx <---> server <---> database


### How to run
1. Start your local docker engine
2. Go to docker directory `cd docker`
3. Execute `bash run-compose.sh` from repository root
4. Open http://localhost/hello to see message, which is served by hello-server container and retrieved from hello-db container
5. Stop compose by executing `docker-compose down` in terminal
