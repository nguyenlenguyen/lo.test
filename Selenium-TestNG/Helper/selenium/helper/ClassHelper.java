package selenium.helper;

import com.logigear.qtium.driver.QTiumWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

public class ClassHelper {
	static Class<?>[] getClasses(String packageName)
			throws ClassNotFoundException, IOException, URISyntaxException {
		ClassLoader classLoader = QTiumWebDriver.class.getClassLoader();
		// assert classLoader != null;
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			// dirs.add(new File(resource.getFile()));
			dirs.add(new File(resource.toURI().getSchemeSpecificPart()));
		}
		ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}
		return classes.toArray(new Class[classes.size()]);
	}

	static List<Class<?>> findClasses(File directory, String packageName)
			throws ClassNotFoundException {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				// assert !file.getName().contains(".");
				classes.addAll(findClasses(file,
						packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(Class.forName(packageName
						+ '.'
						+ file.getName().substring(0,
								file.getName().length() - 6)));
			}
		}
		return classes;
	}
	@SuppressWarnings("rawtypes")
	static Class getClassToBind(Class<?> iClass, String variation,String packagePath) {
		//String packagePath = "rakuten.imp";
		Class<?>[] classes;
		Class<?> outClass = null;
		String iClassSimpleName= iClass.getSimpleName();
		
		try {
			classes = getClasses(packagePath);
			if (classes == null)
				return null;
			else {
				for (Class<?> cls : classes) {
					String currentClassSimpleName = cls.getSimpleName();
					if (iClassSimpleName.equals(currentClassSimpleName)) 
					{
						outClass =  cls;
					}
					String tempCurrentClass = currentClassSimpleName.replace("_" + variation, "");
					if (iClassSimpleName.equals(tempCurrentClass) && currentClassSimpleName.split("_").length > 1 && currentClassSimpleName.split("_")[1].toLowerCase().equals(variation.toLowerCase())) 
					{
						outClass= cls;
						break;
					} 
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return outClass;
	}
	
	
	public static Class<?> getVariationClass(String device)  
	{
		String packagePath ="selenium.helper.variation.imp";                    
        Reflections reflections = new Reflections(new ConfigurationBuilder()
            .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
            .setUrls(ClasspathHelper.forPackage(packagePath))); /*forPackage(basePackageName))); */
            /* and maybe */
            /*.filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(basePackageName))));*/
        
        Set<Class<? extends Object>> classes = reflections.getSubTypesOf(Object.class);
        String driverClassSuffifx = device.trim().equalsIgnoreCase("pc") ? "PC": "Device";
        
        if (classes == null)
			return null;
        String currentClassDriverSimpleName = "";
        for (Class<?> cls : classes) {
			currentClassDriverSimpleName = cls.getSimpleName();			
			if (currentClassDriverSimpleName.equals(driverClassSuffifx + "Variation"))
			{
				return cls;
			}
			
        }
        return null;
	}
}
