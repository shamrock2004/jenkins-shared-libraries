def call(String ProjectName, String dockerHubUser, String ImageTag )
{
withCredentials([usernamePassword(
credentialsId: 'docker_login_credentials',
usernameVariable: 'dockerHubUser',
passwordVariable: 'dockerHubPass'
)])
  {
   sh "docker login -u $dockerHubUser -p $dockerHubPass"
     sh  "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
  }
}
