set ProjectPath=%CD%

set classpath=%ProjectPath%\target\classes;%ProjectPath%\target\test-classes;%ProjectPath%\Libs\*

java org.testng.TestNG "%ProjectPath%\Test Suites\QTiumDashboard\Demo\Windows_Chrome.xml"
echo .
pause