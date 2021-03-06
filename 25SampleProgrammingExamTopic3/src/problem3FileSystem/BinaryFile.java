package problem3FileSystem;

import java.util.Date;

public class BinaryFile extends File{
	
	private byte[] content;

	public BinaryFile(String name, Date dateCreated, Date lastChanged,
			byte[] content) {
		super(name, dateCreated, lastChanged, content, FilesType.Binary);
		this.content = content;
	}

	/**
	 * @return the content
	 */
	public byte[] getContent() {
		return content;
	}
	
	public int getSize() {
		return content.length;
	}
	
	public byte getContentByIndex(int index) {
		return content[index];
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(byte[] content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return super.getName();
	}
}
