set ProjectPath=%CD%

set classpath=%ProjectPath%\target\classes;%ProjectPath%\target\test-classes;%ProjectPath%\Libs\*

java org.testng.TestNG "%ProjectPath%\Test Suites\TestSuite_Android_built-in_browser_sample.xml"
echo .
pause