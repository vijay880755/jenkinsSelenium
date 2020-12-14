pipeline{
    agent any
    
    stages{
        stage ('build'){
            steps{
            input 'Hi'
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
