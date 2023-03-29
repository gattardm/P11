clear
echo -------------------------------------------
echo Starting Hospitals API
echo processing...
docker run -d -p 8181:8181 solarhis/apihospitals
echo API Hospitals started
echo -------------------------------------------
echo Starting Incidents API
echo processing...
docker run -d -p 8585:8585 solarhis/apiincidents 
echo API Incidents started
echo -------------------------------------------
echo Starting Operators API
echo processing...
docker run -d -p 8383:8383 solarhis/apioperators
echo API Incidents started
#echo -------------------------------------------
#echo Starting Ordonnanceur API
#echo processing...
#docker run -d -p 8888:8888 solarhis/apiordonnanceur
#echo API Ordonnanceur started
echo ===========================================
echo ===========================================
echo +++++++++++++++++++++++++++++++++++++++++++
echo SUMMARY
docker ps
echo +++++++++++++++++++++++++++++++++++++++++++
