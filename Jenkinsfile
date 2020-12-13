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
                mvn test
            }
            steps{
                
                 input {
    message 'Proceed with Deployment?'
    id 'deployment'
    ok 'Proceed'
    submitterParameter 'approver'
    parameters {
      booleanParam defaultValue: false, description: '', name: 'Proceed'
    }
  }
            }

        }
        
    }
    
}