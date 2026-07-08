def call(String ProjectName, String DockerHubuser, String ImageTag) {
    echo "ProjectName = ${ProjectName}"
    echo "DockerHubuser = ${DockerHubuser}"
    echo "ImageTag = ${ImageTag}"

    sh "docker build -t ${DockerHubuser}/${ProjectName}:${ImageTag} ."
}
