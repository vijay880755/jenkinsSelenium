pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                input ('Start the build')
                echo 'Building'
                withMaven(
                    maven: Maven3,
                    mavenLocalRepo: '.repository',
                    mavenSettingsConfig: 'my-maven-settings'){
               sh "mvn clean verify"
              }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
            }
        }
    }
}
