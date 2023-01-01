def call(String stageValue){
  
  if ("${stageValue}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stageValue}" == "SonarQube Report")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageValue}" == "Upload Into Nexus")
     {
       sh "mvn clean deploy"
     }
}