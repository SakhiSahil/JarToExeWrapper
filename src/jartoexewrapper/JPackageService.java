package jartoexewrapper;

public class JPackageService {

    /**
     * Builds the jpackage command string based on the provided parameters.
     *
     * @param appName        The name of the application.
     * @param inputDir       The input directory containing the main JAR.
     * @param mainJar        The name of the main JAR file.
     * @param type           The type of package to create (e.g., "exe", "msi").
     * @param iconPath       The path to the application icon (.ico file). Can be null or empty.
     * @param appVersion     The version of the application.
     * @param destDir        The destination directory for the output package.
     * @param vendorName     The name of the vendor/publisher.
     * @return The fully constructed jpackage command string.
     */
    public static String buildJPackageCommand(String appName, String inputDir, String mainJar,
                                              String type, String iconPath, String appVersion,
                                              String destDir, String vendorName) {
        String command;
        // Ensure parameters that might contain spaces are handled by being quoted in the command string.
        // The String.format method will place the arguments into the \"%s\" placeholders.
        if (iconPath == null || iconPath.trim().isEmpty()) {
            command = String.format(
                    "jpackage --name \"%s\" --input \"%s\" --main-jar \"%s\" --type %s --app-version %s --dest \"%s\" --vendor \"%s\" --win-shortcut --win-dir-chooser",
                    appName, inputDir, mainJar, type, appVersion, destDir, vendorName
            );
        } else {
            command = String.format(
                    "jpackage --name \"%s\" --input \"%s\" --main-jar \"%s\" --type %s --icon \"%s\" --app-version %s --dest \"%s\" --vendor \"%s\" --win-shortcut --win-dir-chooser",
                    appName, inputDir, mainJar, type, iconPath, appVersion, destDir, vendorName
            );
        }
        return command;
    }
}
