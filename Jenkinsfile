pipeline{
    agent any
    
    stages{
        stage ('build'){
            steps{
            mvn clean
            }
        }
        stage ('test'){
            steps{
                echo "Hello Maven"
                mvn test
            }

        }
        
    }
    
}
