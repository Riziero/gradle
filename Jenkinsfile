node('me') {
    // some block executing on a Jenkins slave node called 'wildfly'
    
    stage ('Clone') {
        checkout scm 
        bat 'gradle clean test'
    }
    
    stage('echo'){
        echo 'We are done!'
    }
    
}