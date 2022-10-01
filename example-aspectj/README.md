# example-aspectj

This project implements a simple aspect to print some messages using aspectj.

# Requirements
- Maven (installed and configured)
- Java 16 (the project might run with minor versions)

## Installation

Use [maven](https://maven.apache.org/) to run the samples.

```bash
mvn test
```

## Usage

```java
import com.indevsolutions.example.aspectj.Console

// create the console instance
Console user = new Console();

// print a message and the aspect is going to be performed.
user.printMessage();

```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
