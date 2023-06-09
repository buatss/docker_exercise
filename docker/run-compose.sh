echo "Building java project"
cd ..
./mvnw package
cd docker

# This is required to build hello-server image
echo "Copying hello-1.0.jar"
cp ../target/hello-1.0.jar hello-server/

echo "Starting docker-compose"
docker-compose up -d

echo "Removing hello-1.0.jar"
rm hello-server/hello-1.0.jar
