//		It archives test reports 
package mslt.verification;

import java.io.File;
import java.io.IOException;

import org.apache.maven.wagon.util.FileUtils;
import org.testng.annotations.Test;

public class ArchiveReport  {
	
	@Test 
	  public void archiveTestReport() throws IOException {
			File source = new File(System.getProperty("user.dir")+"/test-output/emailable-report.html");
			File destination = new File("/Users/admin/Desktop/emailable-report_"+System.currentTimeMillis()+".html");
	        FileUtils.copyFile(source, destination);
	        System.out.println("Report copied to the path "+destination);
	}
}