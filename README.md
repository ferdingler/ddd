[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/ferdingler/ddd)

# Lab

You have to verify if a Credit Card has been reported as stolen before creating a new transaction. Imagine that there is an external API
that you can call with the credit card information and it returns whether the card has been reported as stolen or not. 

### Open Questions 

- In what part of the code would you implement this validation?
- Is this validation part of the business domain or is it an infrastructure detail? 

## Run project

```bash
./gradlew run
```