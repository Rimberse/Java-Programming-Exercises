package io.github.rimberse.Java_Programming_Exercises.flows;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;


public class Main {
	public static void main(String[] args) {
		
//		Exercise: Read using a byte flow
		/*List<Integer> bytes = new ArrayList<>();
		Integer[] expected = {72, 101, 108, 108, 111, 44, 32, 119, 111, 114, 108, 100};
		List<Integer> expectedBytes = new ArrayList<>(Arrays.asList(expected));
		
		try (InputStream is = Files.newInputStream(Path.of("src", "main", "java", "io/github/rimberse/Java_Programming_Exercises", "in.txt"), StandardOpenOption.READ)) {
			while (true) {
				final int read = is.read();
				
				if (read == -1) {
					break;
				}
				
				bytes.add(read);
				System.out.print(read + " ");
			}
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		
		System.out.println("\n" + bytes.containsAll(expectedBytes));*/
		
		
//		Exercise: Determine encoding
		/*StringBuilder sb = new StringBuilder();
		
		try (InputStream is = Files.newInputStream(Path.of("encoding.txt"), StandardOpenOption.READ)) {
			while (true) {
				final int read = is.read();
				
				if (read == -1) {
					break;
				}
				
				sb.append(read + " ");
				System.out.print(read + " ");
			}
			
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		
		int index = sb.indexOf("195 169");
		System.out.println("\nEncoding: " + (index == -1 ? "ISO-8859-1" : "UTF-8"));*/
		
		
//		Exercise: Reading from character flows
		/*try (BufferedReader br = Files.newBufferedReader(Path.of("encoding.txt"))) {
			while (true) {
				final String line = br.readLine();
				
				System.out.println(line + " ");
			}
			
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}*/
		
		
//		Exercise: A more realistic exercise
		/*try (BufferedReader reader = Files.newBufferedReader(Path.of("persons.txt"))) {
			System.out.println(Person.readPersons(reader));
			
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}*/
		
		
//		Exercise: Write two files
		/*try {
			helloBye(Path.of(System.getProperty("user.dir") + "\\files"));
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}*/
		
		
//		Exercise: abstract path concept
		Path zipFilePath = Path.of("anewzipfile.zip");
		URI zipFileUri = zipFilePath.toUri();
		URI jarZipFileUri = URI.create("jar:" + zipFileUri.toString());
		
		ImmutableMap<String, String> env = ImmutableMap.of("create", "true");
		try (FileSystem fs = FileSystems.newFileSystem(jarZipFileUri, env)) {
			Path rootInsideZip = fs.getPath("myfolder");
			Files.createDirectories(rootInsideZip);
			helloBye(rootInsideZip);
			
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		
//		Impossible to modify helloBye, because Path.of returns a default FileSystem, while Path.resolve taken into account 
//		the existing FileSystem and path. In this example use of Path.of won't take into account parent path set to default
//		project directory with a creation of a zip file. It will only register myfolder and append to it subfolder/txt files
//		which results in creation of a folder myfolder without creation of a zip in the first place and placing it inside it
	}
	
	public static void helloBye(Path path) throws IOException {
		Path filePath = path.resolve("hello.txt");
//		Path filePath = Path.of(path.toString(), "hello.txt");
		Files.write(filePath, Lists.newArrayList("Hello, world"), StandardCharsets.UTF_8);
		
		Path subPath = path.resolve("subfolder/bye.txt");
//		Path subPath = Path.of(path.toString(), "subfolder", "bye.txt");
		Files.createDirectories(subPath.getParent());
		Files.write(subPath, Lists.newArrayList("Bye bye!"), StandardCharsets.UTF_8);
	}
}