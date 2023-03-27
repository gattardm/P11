clear
echo -------------------------------------------
echo Starting Hospitals API
echo processing...
docker run -d -p 8181:8181 solarhis/apihospitals
echo API Hospitals started
echo -------------------------------------------
echo Starting Web Client Hospitals API
echo processing...
docker run -d -p 8282:8282 solarhis/webclientapihospitals 
echo Web Client API Hospitals started
echo -------------------------------------------
echo Starting Incidents API
echo processing...
docker run -d -p 8585:8585 solarhis/apiincidents 
echo API Incidents started
echo -------------------------------------------
echo Starting Web Client Incidents API
echo processing...
docker run -d -p 8686:8686 solarhis/webclientapiincidents 
echo Web Client API Incidents started
echo -------------------------------------------
echo Starting Operators API
echo processing...
docker run -d -p 8383:8383 solarhis/apioperators
echo API Incidents started
echo -------------------------------------------
echo Starting Web Client Operators API
echo processing...
docker run -d -p 8484:8484 solarhis/webclientapioperators 
echo Web Client API Operators  started
echo -------------------------------------------
echo Starting Ordonnanceur API
echo processing...
docker run -d -p 8888:8888 solarhis/apiordonnanceur
echo API Ordonnanceur started
echo ===========================================
echo ===========================================
echo +++++++++++++++++++++++++++++++++++++++++++
echo SUMMARY
docker ps
echo +++++++++++++++++++++++++++++++++++++++++++
