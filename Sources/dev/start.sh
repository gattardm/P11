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
echo ===========================================
echo +++++++++++++++++++++++++++++++++++++++++++
echo SUMMARY
docker ps
echo +++++++++++++++++++++++++++++++++++++++++++
