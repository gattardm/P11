#!/bin/bash
echo -------------------------------------------
DOCKER_IMAGES=$(docker images | grep solarhis | cut -d' ' -f1)
echo Have to remove $DOCKER_IMAGES 
docker rmi $DOCKER_IMAGES --force
echo processing...
sleep 5&
wait $!
wait
echo $DOCKER_IMAGES removed
echo ===========================================
echo +++++++++++++++++++++++++++++++++++++++++++
echo SUMMARY
docker images
echo +++++++++++++++++++++++++++++++++++++++++++
