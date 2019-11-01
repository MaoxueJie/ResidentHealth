ps -ef |grep 'java -jar health.jar'|grep -v grep|awk '{print $2}'|xargs kill -9
rm -rf health.jar
cd ResidentHealth
git pull https://github.com/Maoxuejie/ResidentHealth.git
mvn clean package -P prod
cp ./target/health.jar /opt/soft
cd /opt/soft
nohup java -jar health.jar > console.log &
