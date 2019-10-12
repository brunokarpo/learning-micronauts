# learning-micronauts
Project to learn concepts of Micronauts


## Creating project

To create Micronaut project, use the follow command:
```
mn create-app -i --lang=kotlin nom.brunokarpo.learningmicronauts
```
- `mn`: Micronaut client
- `create-app`: command use to create application
- `-i`: parameter used to create service using current directory
- `--lang=kotlin`: define language project
- `nom.brunokarpo.learningmicronauts`: application identifier

## Executing application

The Make command line execution does all necessary tasks to build and execute application locally.

### Build application
```bash
make
```

### Run Application with Docker
It's possible run application with Docker container. The process can be executed by command:
```bash
make run
```

The command will build application, create an image and after that start container.

To stop application execute the following command:

```bash
make stop
```

This command will stop the docker container and after that will destroy the image.