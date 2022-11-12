package expression;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ExpressionToJava extends Expression{
	String result;
	String resultJavaArchiveDeclarations;
	String resultJavaArchive;
	File yaulFile;
	Writer fileWriter;
	
	String initializeArchive = "import java.util.Arrays; \n\npublic class Main {\r\n"
			+ "\r\n"
			+ "	public static void main(String[] args) {\r\n\r\n";
	
	String endArchive = "\r\n	}	\r\n \r\n"
			+ "	public static int[][] matrixSum(int[][] m1, int[][] m2) {\r\n"
			+ "		int[][] result = new int[m1.length][m1[0].length];\r\n"
			+ "        for(int i = 0; i < m1.length; i++) {\r\n"
			+ "            for (int j = 0; j < m1[0].length; j++) {\r\n"
			+ "            	result[i][j] = m1[i][j] + m2[i][j];\r\n"
			+ "            }\r\n"
			+ "        }\r\n"
			+ "		return result;\r\n"
			+ "	}\r\n"
			+ "	\r\n"
			+ "	public static int[][] matrixMult(int[][] m1, int[][] m2) {\r\n"
			+ "		int[][] result = new int[m1.length][m1[0].length];\r\n"
			+ "        for(int i = 0; i < m1.length; i++) {\r\n"
			+ "            for (int j = 0; j < m1[0].length; j++) {\r\n"
			+ "            	result[i][j] = m1[i][j] * m2[i][j];\r\n"
			+ "            }\r\n"
			+ "        }\r\n"
			+ "		return result;\r\n"
			+ "	}\r\n"
			+ "	\r\n"
			+ "	public static int[][] matrixSub(int[][] m1, int[][] m2) {\r\n"
			+ "		int[][] result = new int[m1.length][m1[0].length];\r\n"
			+ "        for(int i = 0; i < m1.length; i++) {\r\n"
			+ "            for (int j = 0; j < m1[0].length; j++) {\r\n"
			+ "            	result[i][j] = m1[i][j] - m2[i][j];\r\n"
			+ "            }\r\n"
			+ "        }\r\n"
			+ "		return result;\r\n"
			+ "	}\r\n"
			+ "	\r\n"
			+ "	public static int[][] matrixDiv(int[][] m1, int[][] m2) {\r\n"
			+ "		int[][] result = new int[m1.length][m1[0].length];\r\n"
			+ "        for(int i = 0; i < m1.length; i++) {\r\n"
			+ "            for (int j = 0; j < m1[0].length; j++) {\r\n"
			+ "            	result[i][j] = m1[i][j] / m2[i][j];\r\n"
			+ "            }\r\n"
			+ "        }\r\n"
			+ "		return result;\r\n"
			+ "	}\r\n"
			+ "	\r\n"
			+ "	public static int[][] matrixTranspose(int[][] m1) {\r\n"
			+ "		int[][] transposed = new int[m1.length][m1[0].length];\r\n"
			+ "		int[][] error = new int[0][0];\r\n"
			+ "		if(m1.length == m1[0].length) {\r\n"
			+ "			for (int i = 0; i < m1.length; i++){\r\n"
			+ "	        	for (int j = 0; j < m1[0].length; j++) {\r\n"
			+ "	        		transposed[i][j] = m1[j][i];\r\n"
			+ "	        	}    \r\n"
			+ "	        }\r\n"
			+ "			return transposed;\r\n"
			+ "		} else {\r\n"
			+ "			System.err.println(\"Error al transponer matriz: el tamaño de la matriz es irregular\");\r\n"
			+ "		}\r\n"
			+ "		return error;\r\n"
			+ "	}\r\n\n"
			+ "	public static void writeMatrix(int[][] m1) {\r\n"
			+ "		String result = Arrays.deepToString(m1);\r\n"
			+ "		System.out.println(result);\r\n"
			+ "	}\r\n"
			+ "}";
	
	public ExpressionToJava() {
	}
	
	public void addLinesToJava(String result) {
		result = "		" + result + "\r\n";
		if(resultJavaArchiveDeclarations != null) {
			resultJavaArchiveDeclarations = resultJavaArchiveDeclarations + result;
		} else {
			resultJavaArchiveDeclarations = result;
		}
	}
	
	public void printGeneratedString(){
		if(resultJavaArchive == null) {
			System.out.println(resultJavaArchiveDeclarations);	
		} else {
			System.out.println(resultJavaArchive);	
		}
	}
	
	public void endFile(){
		resultJavaArchive = initializeArchive + resultJavaArchiveDeclarations + endArchive;
	}
	
	public void createFile() throws IOException {
		boolean bool, existente;
	    File file = new File("C:\\YaulCompiler");   
	    if(file.exists()) {  
	    	bool = true;
	    	existente = true;
	    } else {
	    	bool = file.mkdir();  
	    	existente = false;
	    }
	    
	    
	    if(bool) {	
	    	if(existente) {
		    	fileWriter = new FileWriter("C:\\YaulCompiler\\Main.java", false);
		    } else {
		    	yaulFile = new File("C:\\YaulCompiler\\Main.java");
		    	fileWriter = new FileWriter("C:\\YaulCompiler\\Main.java", false);
		    }
	    } else{  
	        System.err.println("Error al crear Traduccion");  
	    } 
		
	}
	
	public void writeFile() {
		try {
			  fileWriter.write(resultJavaArchive);
			  fileWriter.close();
		    } catch (IOException e) {
		    	System.err.println("Error al crear Traduccion");  
		      e.printStackTrace();
		    }
		}
	}

