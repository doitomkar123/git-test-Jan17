#/bin/bash

if ps -ef | grep java-demo-app-1.0.0.jar | grep -v grep | awk '{print $2}'
then
  echo "Killing existing process"
  kill -9 $(ps -ef | grep java-demo-app-1.0.0.jar | grep -v grep | awk '{print $2}')
fi

if nohup java -jar -Dserver.port=8081 target/java-demo-app-1.0.0.jar &
then
  echo "Deployed New Application"
fi
