package problem3FileSystem;

import java.util.*;

public class Device {
	private String name;
	private Directory root;

	public Device() {
		this("", new Directory());
	}

	public Device(String name, Directory root) {
		this.name = name;
		this.root = root;
	}

	public Device(String name, String rootName, Date rootLastChanged,
			Directory[]... children) throws Exception {
		this(name, rootName, rootLastChanged, new HashSet<File>(), children);
	}

	public Device(String name, String rootName, Date rootLastChanged,
			Iterable<File> files, Directory[]... children) throws Exception {
		this(name, new Directory(rootName, rootLastChanged, files, children));
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
	 * @return the root
	 */
	public Directory getRoot() {
		return root;
	}

	/**
	 * @param root
	 *            the root to set
	 */
	public void setRoot(Directory root) {
		this.root = root;
	}

	@Override
	public String toString() {
		return "Device: " + this.name + '\n' + dfsTraversal(root, "");
	}

	public static String dfsTraversal(Directory dir, String path) {
        StringBuilder result = new StringBuilder();
        StringBuilder sbPath = new StringBuilder(path);
        sbPath.append(dir.getName() + "\\");
        result.append(sbPath.toString() + "\n");

        for (File file : dir.getFiles()) {
            result.append(sbPath.toString() + file.toString() + "\n");
        }

        for (Directory subdir : dir.getDirectories()) {
            result.append(dfsTraversal(subdir, sbPath.toString()));
        }
        return result.toString();
    }
}
