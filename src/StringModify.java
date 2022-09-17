import java.io.File;

public class StringModify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File updatePath = new File("/root/vertex_home/data/data");
		
		updatePath = "data".equals(updatePath.getName()) ? updatePath.getParentFile() : updatePath;
		System.out.println(updatePath.getPath());
		
		File newFile = new File(updatePath,"data");
		System.out.println(newFile.getPath());
	}

}
