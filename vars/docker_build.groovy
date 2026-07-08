def call(String ProjectName, String DockerHubuser, String ImageTag)
{
  sh 'docker build -t ${DockerHubuser}/${ProjectName}:${ImageTag} .

}
