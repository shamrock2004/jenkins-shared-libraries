def call(String url,String branch)
{
  echo "Cloning the code"
  git url: "${url}" , branch: "${branch}"
  echo "Finished cloning the code"
}
