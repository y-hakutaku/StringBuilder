package tsv;
public class TSV<ACTION,COMMON,CONTENTS> implements ITSV<ACTION,COMMON,CONTENTS> {
	private ACTION action;
	private COMMON common;
	private CONTENTS contents;
	
	public TSV(ACTION action, COMMON common, CONTENTS contents) {
		this.action = action;
		this.common = common;
		this.contents = contents;
	}
	
	@Override
	public ACTION getAction() {
		return action;
	}
	
	@Override
	public COMMON getCommon() {
		return common;
	}
	
	@Override
	public CONTENTS getContents() {
		return contents;
	}
}
