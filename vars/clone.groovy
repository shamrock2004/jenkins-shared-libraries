def call(String url,string branch)
{
  echo "Cloning the code"
  git url: url , branch: branch
  echo "Finished cloning the code"
}
