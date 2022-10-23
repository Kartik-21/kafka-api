@echo off
cd C:\Users\kartik\dev\kafka_2.13-3.3.1\bin\windows
pause
kafka-topics.bat --create --topic jk --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3
exit
