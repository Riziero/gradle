node('me') {
    // some block executing on a Jenkins slave node called 'wildfly'
    
    stage ('Clone') {
        checkout scm 
        bat 'gradle clean test'
    }
    
    stage('echo'){
        echo 'King is cool!'
    }
    
    stage('war_and_archive'){
        bat 'gradle war'
        archiveArtifacts '/*.war'
    }
    
}