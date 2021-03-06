package problem3FileSystem;

import java.util.*;

public class Directory implements Comparable<Directory> {

	private String name;
	private Date lastChanged;
	private TreeSet<File> files;
	private TreeSet<Directory> directories;
	private Directory parent;

	public Directory() {
		this("", Calendar.getInstance().getTime());
	}

	public Directory(String name, Date lastChanged) {
		super();
		this.name = name;
		this.lastChanged = lastChanged;
		this.files = new TreeSet<File>();
		this.directories = new TreeSet<Directory>();
	}

	public Directory(String name, Date lastChanged, Directory[]... directories) throws Exception {
		this(name, lastChanged, new ArrayList<File>(), directories);
	}

	public Directory(String name, Date lastChanged, Iterable<File> files,
			Directory[]... directories) throws Exception {
		this(name, lastChanged);
		for (File file : this.files) {
			addFile(file);
		}

		for (Directory dir : this.directories) {
			addDirectory(dir);
		}
	}

	/**
	 * @return the parent
	 */
	public Directory getParent() {
		return parent;
	}

	/**
	 * @param parrent
	 *            the parent to set
	 */
	public void setParent(Directory parent) {
		this.parent = parent;
	}

	/**
	 * @return the files
	 */
	public TreeSet<File> getFiles() {
		return files;
	}

	/**
	 * @param files
	 *            the files to set
	 */
	public void setFiles(TreeSet<File> files) {
		this.files = files;
	}

	/**
	 * @return the directories
	 */
	public TreeSet<Directory> getDirectories() {
		return directories;
	}

	/**
	 * @param directories
	 *            the directories to set
	 */
	public void setDirectories(TreeSet<Directory> directories) {
		this.directories = directories;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastChanged
	 */
	public Date getLastChanged() {
		return lastChanged;
	}

	/**
	 * @param lastChanged
	 *            the lastChanged to set
	 */
	public void setLastChanged(Date lastChanged) {
		this.lastChanged = lastChanged;
	}

	@Override
	public int compareTo(Directory other) {
		if (other == null) {
			return 1;
		}

		return this.name.compareTo(other.name);
	}

	public void addFile(File file) throws Exception {
		if (file.getParent() != null) {
			throw new Exception(
					"The file allready have parrent directory! File: "
							+ file.getName());
		}
		files.add(file);
		file.setParrent(this);
	}

	public void removeFile(File file) {
		if (files.remove(file)) {
			file.setParrent(null);
		}
	}

	public void addDirectory(Directory directory) throws Exception {
		if (directory.getParent() != null) {
			throw new Exception(
					"The file allready have parrent directory! File: "
							+ directory.getName());
		}
		directories.add(directory);
		directory.setParent(this);
	}

	public void removeDirectory(Directory directory) {
		if (directories.remove(directory)) {
			directory.setParent(null);
		}
	}

	@Override
	public String toString() {
		return this.name;
	}

	public String getFilesAndDirs() {
        StringBuilder result = new StringBuilder();

        for (File file : files) {
            result.append(file.toString() + "\n");
        }
        
        for (Directory dir : directories) {
            result.append(dir.toString() + "\n");
        }
        
        return result.toString();
    }
}
