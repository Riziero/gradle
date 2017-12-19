node('me') {
    // some block executing on a Jenkins slave node called 'wildfly'
    
    stage ('Clone') {
        checkout scm 
        bat 'gradle clean test'
        junit '**/build/test-results/**/TEST-*.xml'
    }
    
    stage('echo'){
        echo 'King is cool!'
    }
    
    stage('war_and_archive'){
        bat 'gradle war'
        archiveArtifacts 'build/libs//*.war'
    }
    
}