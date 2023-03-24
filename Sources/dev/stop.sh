#!/bin/bash
sleep 5&
echo -------------------------------------------
DOCKER_IMAGES=$(docker ps | grep java | cut -d' ' -f1)
echo Have to stop $DOCKER_IMAGES 
docker stop $DOCKER_IMAGES 
echo processing...
wait
echo $DOCKER_IMAGES stopped
echo ===========================================
echo +++++++++++++++++++++++++++++++++++++++++++
echo SUMMARY
docker ps
echo +++++++++++++++++++++++++++++++++++++++++++
