package tsv;
public class TSVVoyagentCreator extends Creator {
	public ITSV<?,?,?> createTSV(String string) {
		
		String action = createPart(string, Part.Action, Api.Voyagent);
		String common = createPart(string, Part.Common, Api.Voyagent);
		String contents = createPart(string, Part.Contents, Api.Voyagent);
		
		ITSV<String, String, String> tsv = new TSV<String, String, String>(action,common,contents);
		
		return tsv; 
	}
}
