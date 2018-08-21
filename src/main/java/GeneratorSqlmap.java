
import java.io.File;
import java.util.ArrayList;
import java.util.List;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlmap {

	public static void generator() throws Exception {

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		// 指定 逆向工程配置文件
		//使用绝对路径 
		//File configFile = new File("E:\\\\workspace\\\\generatorSqlmapCustom\\\\src\\\\main\\\\resources\\\\generatorConfig.xml");
		//使用相对路径
		File configFile = new File("src\\main\\resources\\generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		org.mybatis.generator.config.Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);


	}

	//直接执行main方法即可
	public static void main(String[] args) throws Exception {
		try { 
			generator();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
