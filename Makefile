PRONY: build

_clean:
	./gradlew clean

build: _clean
	./gradlew build

run: _clean
	docker image build -t learning-micronauts .
	docker container run --rm --detach -p 8080:8080 --name micronauts-application learning-micronauts

stop:
	docker container stop micronauts-application
	docker image rm learning-micronauts