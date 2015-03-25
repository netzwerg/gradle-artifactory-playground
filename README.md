Demo Gradle/Artifactory build setup:
* `playground-util-lib`: A utility library, use `./gradlew artifactoryPublish` to upload to artifactory repo (or `./gradlew install` for local maven repo)
* `playground-app`: A multi-module JEE app which depends on the utility library
