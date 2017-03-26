package tsv;

public interface ITSV<ACTION,COMMON,CONTENTS> {
	ACTION getAction();
	COMMON getCommon();
	CONTENTS getContents();
}
