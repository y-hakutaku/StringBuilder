package tsv;
public class TSVSampleCreator extends Creator {
	public ITSV<?,?,?> createTSV(String string) {
		
		String action = createPart(string, Part.Action, Api.Sample);
		String common = createPart(string, Part.Common, Api.Sample);
		String contents = createPart(string, Part.Contents, Api.Sample);
		
		ITSV<String, String, String> tsv = new TSV<String, String, String>(action,common,contents);
		
		return tsv; 
	}
}
