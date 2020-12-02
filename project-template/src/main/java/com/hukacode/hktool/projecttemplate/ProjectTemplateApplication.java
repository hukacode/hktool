package com.hukacode.hktool.projecttemplate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.io.FileUtils;

public class ProjectTemplateApplication {

  public static void main(String[] args) throws Exception {

    var rootFolder = System.getProperty("user.dir");
    var group = "__package__";
    var artifact = "__projectname__";

    Path currentPath = Paths.get(System.getProperty("user.dir"));
    Path coreProjectPath = Paths.get(currentPath.toString(), "core");

    // TODO
    FileUtils.deleteDirectory(new File(Paths.get(currentPath.toString(), "port").toString()));
    FileUtils.deleteDirectory(new File(Paths.get(currentPath.toString(), "core").toString()));
    FileUtils.deleteDirectory(new File(Paths.get(currentPath.toString(), "infrastructure").toString()));
    FileUtils.deleteDirectory(new File(Paths.get(currentPath.toString(), "presentation").toString()));
    FileUtils.deleteDirectory(new File(Paths.get(currentPath.toString(), "integration-test").toString()));
    FileUtils.deleteDirectory(new File(Paths.get(currentPath.toString(), "frontend").toString()));

    createFolder(Paths.get(currentPath.toString(), "port", "src/main/java", group, artifact, "command"));
    createFolder(Paths.get(currentPath.toString(), "port", "src/main/java", group, artifact, "query"));
    createFolder(Paths.get(currentPath.toString(), "port", "src/main/java", group, artifact, "search"));
    createFolder(Paths.get(currentPath.toString(), "port", "src/main/java", group, artifact, "persistence"));
    createFolder(Paths.get(currentPath.toString(), "core", "src/main/java", group, artifact, "handler"));
    createFolder(Paths.get(currentPath.toString(), "core", "src/main/java", group, artifact, "domain"));
    createFolder(Paths.get(currentPath.toString(), "core", "src/main/resources"));
    createFolder(Paths.get(currentPath.toString(), "core", "src/test/java", group, artifact, "handler"));
    createFolder(Paths.get(currentPath.toString(), "core", "src/test/resources"));
    createFolder(Paths.get(currentPath.toString(), "infrastructure", "src/main/java", group, artifact, "database"));
    createFolder(Paths.get(currentPath.toString(), "infrastructure", "src/test/java", group, artifact, "database"));
    createFolder(Paths.get(currentPath.toString(), "infrastructure", "src/main/resources"));
    createFolder(Paths.get(currentPath.toString(), "infrastructure", "src/test/resources"));
    createFolder(Paths.get(currentPath.toString(), "presentation", "src/main/java", group, artifact, "rest"));
    createFolder(Paths.get(currentPath.toString(), "presentation", "src/test/java", group, artifact, "rest"));
    createFolder(Paths.get(currentPath.toString(), "presentation", "src/main/resources"));
    createFolder(Paths.get(currentPath.toString(), "presentation", "src/test/resources"));
    createFolder(Paths.get(currentPath.toString(), "integration-test", "src/test/java", group, artifact, "database"));
    createFolder(Paths.get(currentPath.toString(), "integration-test", "src/test/resources"));
    createFolder(Paths.get(currentPath.toString(), "frontend"));
  }

  private static void createFolder(Path path) throws IOException {
    FileUtils.forceMkdir(new File(path.toString()));
  }
}
