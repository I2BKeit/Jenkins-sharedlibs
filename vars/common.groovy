def jenklib(String stageName) {
  if ("${stageName}" == "Build") {
    sh "mvn clean package"
  }
  else if("${stageName}" == "SonarQube Check") {
    sh "mvn sonar:sonar"
  }
  else if("${stageName}" == "AprovalGate") {
    timeout(time: 5,unit: 'DAYS'){
      input message: 'Please revise and update me'
    }
    
  }

  
}