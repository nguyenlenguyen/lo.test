set HUB_HOST=localhost
set HUB_PORT=4444
set IP_TEST_MACHINE=localhost
set NODE_PORT=5556
set NODE_PORT_2=5557
set BROWSER=chrome
set BROWSER_2=firefox
set VERSION=23
set VERSION_2=8
set MAXINSTANCES=5 
set MAXINSTANCES_2=5
set PLATFORM_WIN=WINDOWS
	 
java -jar selenium-server-standalone-2.45.0.jar -role webdriver -hubHost %HUB_HOST% -hubPort %HUB_PORT% -hub http://%HUB_HOST%:%HUB_PORT% -host %IP_TEST_MACHINE% -port %NODE_PORT_2% -browser browserName=%BROWSER_2%,version=%VERSION_2%,maxInstances=%MAXINSTANCES_2%,platform=%PLATFORM_WIN%

::-Dwebdriver.chrome.driver=chromedriver.exe 