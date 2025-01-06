package com.mycompany.holamundo;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOExamples {
//    public static void main(String[] args) throws IOException {
//        String pathString = System.getProperty("user.home");
//        Path path = Paths.get(pathString);
//        Stream<Path> fileNames = Files.list(path).filter(Files::isDirectory);
//        fileNames.limit(5).forEach( (item) -> {
//            System.out.println(item.toString());
//            try {
//                Stream<Path> fileNames2 = Files.list(item).filter(Files::isDirectory);
//                fileNames2.forEach(System.out::println);
//            } catch (IOException ioe) {}
//        });
//    }

//    public static void main(String[] args) throws IOException {
//        String pathString = System.getProperty("user.home");
//        List<Path> subDirectories = Files.walk(Paths.get(pathString), 2)
//                .filter(Files::isDirectory)
//                .collect(Collectors.toList());
//        for (int i = 0; i < 5; i++) {
//            Path filePath = subDirectories.get(i);
//            String fileType = Files.isDirectory(filePath) ? "Dir" : "Fil";
//            System.out.println(fileType + " " + filePath);
//        }
//    }

    public static void main(String[] args) throws IOException {
        Exercise01.main(args);
    }

    public class Exercise01 {
        public static void main(String[] args) throws IOException {
            Path path = Paths.get(System.getProperty("user.home"));

            Files.walkFileTree(path, Collections.emptySet(), 2, new SimpleFileVisitor<Path>() {

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                    System.out.println(dir.toString());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    System.out.println("visitFileFailed: " + file);
                    return FileVisitResult.CONTINUE;
                }
            });
        }
    }
}