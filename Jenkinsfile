pipeline{
    agent any
    
    stages{
        stage ('build'){
            steps{
            input 'Proceed with Clean ?'
            mvn clean
            }
        }
        stage ('test'){
            steps{
                input 'Proceed with Test ?'
                mvn test
                
            }

        }
        
    }
    
}
