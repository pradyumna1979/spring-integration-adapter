node {
    stage('SCM Checkout') {
         checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'gitUser', url: 'https://github.com/pradyumna1979/spring-integration-adapter.git']]])

    }
    stage('Build') {
        if(isUnix()){
            echo 'Unix'
            sh 'maven clean build -x test'
        }else{
            echo 'window'
            
             bat "mvn clean install"
            
        }
    }
    stage('TEST'){
        echo 'Test Done'
    }
    stage('Sonar Check'){
        echo 'Sonar done'
    }
    stage('Deploy'){
            echo 'Deploy done'
    }
}
