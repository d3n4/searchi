package indexer.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="DocumentIDs")
public class DocumentIDRow {
	private int docId;
	private String url;
	
	public DocumentIDRow(int id, String u) {
		docId = id;
		url = u;
	}
	
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}