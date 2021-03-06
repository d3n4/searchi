package pagerank.phase1;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class PRInitMapper extends Mapper<Text, Text, Text, Text> {

	@Override
	public void map(Text key, Text value, Context context) 
		throws IOException, InterruptedException {
		
		/* Removing self links - Moved to URLsFromJsonReader*/
		/*String [] outLinks = value.toString().split(" ");
		List<String> updOutLinks = new ArrayList<>();
		String srcLink = key.toString().trim();
		for (int i = 0; i < outLinks.length; ++i) {
			if (!outLinks[i].trim().equals(srcLink)) {
				updOutLinks.add(outLinks[i].trim());				
			}
		}*/
		
		/* Map output in format L1		L2 L3 L5 L7 */		
		context.write(key, new Text(value));
	}
	
	
}
