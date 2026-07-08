def call(string ProjectName, string DockerHubuser, string ImageTag)
{
  sh 'docker build -t $(DockerHubuser)/$(ProjectName):$(ImageTag) .

}
