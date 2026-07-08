def call()
{
 sh 'sudo apt update'
 sh 'sudo apt install -y docker.io'
 sh 'sudo apt install -y docker-compose-v2'
}
