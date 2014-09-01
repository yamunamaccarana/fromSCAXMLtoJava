package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.runtime.*;
import compilerPackage.*;

public class ParserTester  {
	public static void main(String[] args) {

		//--Fields----------------------------------------------------------
		String inputPath = null;
		
		//--Initialize inputPath--------------------------------------------
		if(args.length != 0)
			inputPath = args[0];
		else
			inputPath = "./inputResources/robot.composite";
		
		//--Start the execution---------------------------------------------
		try {
			System.out.println ("Parsing with ANTLR lexer");
			System.out.println ("------------------------");
			myScannerLexer lexer = new myScannerLexer(new ANTLRInputStream(new FileInputStream(inputPath)));
			CommonTokenStream stream = new CommonTokenStream(lexer);
			myScannerParser parser = new myScannerParser(stream);
			parser.start();
		} catch (FileNotFoundException e) {
			System.out.println ("Parsing failed: FileNotFound\n\n");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println ("Parsing failed: IOException\n\n");
			e.printStackTrace();
		} catch (RecognitionException e) {
			System.out.println ("Parsing failed: RecognitionException\n\n");
			e.printStackTrace();
		}
	}
}
