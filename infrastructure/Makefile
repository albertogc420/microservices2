build-images:
	@echo Build Images.
	mvn spring-boot:build-image -f ../eureka_server/pom.xml
	mvn spring-boot:build-image -f ../configuration_server/pom.xml
docker-up:
	@echo Docker-compose up
	docker-compose up
docker-delete:
	@echo Docker Delete all
	docker volume prune
	docker system prune -a

api-gateway:
	mvn spring-boot:run -f ../api_gateway/pom.xml

microservice:
	mvn spring-boot:run -f ../microservice/pom.xml
