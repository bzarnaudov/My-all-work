package treesAndTreeLikeStructures;

public class Problem2TraverseAndSaveDirectoryContentsInATree {
	private static String startFolder = "C:\\windows";
	
	public static void main(String[] args) {
		Folder root = new Folder(startFolder);
		recursiveDirectorySearch(root);
		System.out.println(root.getSize());
	}

	public static void recursiveDirectorySearch(Folder folder) {
		java.io.File directoryInfo = new java.io.File(folder.getName());
		java.io.File[] directoryInfoList = directoryInfo.listFiles();
		if (directoryInfoList != null) {
			for (java.io.File info : directoryInfoList) {
				if (info.isFile()) {
					folder.addFile(new File(info.getAbsolutePath(),info.length()));
				}	
				if (info.isDirectory()) {
					Folder newFolder = new Folder(info.getAbsolutePath());
					folder.addFolder(newFolder);
					recursiveDirectorySearch(newFolder);
				}
			}
		}
	}
}
