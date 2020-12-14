pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    tools{
     maven 'Maven3'   
    }
    stages {
        stage('Build') {
            steps {
                input ('Start the build')
                echo 'Building'
                withMaven(maven: 'Maven3'){
                    sh 'mvn clean compile'
              }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
                withMaven(maven: 'Maven3'){
                    sh 'mvn test'
              }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
                input ('Proceed with Deployment ?')
                withMaven(maven: 'Maven3'){
                    sh 'mvn clean deploy'
              }
            }
        }
    }
}
