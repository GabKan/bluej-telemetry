# BlueJ Telemetry Plugin

## Build and try the BlueJ extension locally

The extension uses the BlueJ API bundled with BlueJ. On the current Linux setup it is at `/opt/bluej/bluej.jar`; `pom.xml` uses `/opt/bluej` as the default `bluej.home`. If BlueJ is installed elsewhere, change that Maven property or override it with `-Dbluej.home=/path/to/bluej`.

1. Build the extension with Maven: `mvn package`.
2. Copy `target/bluej-telemetry-plugin-1.0-SNAPSHOT.jar` into `~/.bluej/extensions2/`. Create the `extensions2` directory if it does not exist. (BlueJ 6 uses `extensions2`; older BlueJ releases may use `extensions`.)
3. Restart BlueJ.
4. Open a BlueJ project and compile a class.
5. Check the BlueJ project's root directory for `bluej-telemetry.log`. Each line contains the event type, timestamp, session offset, and event data. The file is created the first time a compile event arrives.

The log path is found from the compiled source file by walking up to the folder containing BlueJ's `package.bluej` file, so it works across operating systems. `bluej-telemetry.log` is ignored by this repository's `.gitignore`; add the same ignore rule to another BlueJ project's `.gitignore` if you do not want that project's local log committed.

This is a simple human-readable log for checking that collection works. The extension also keeps events in memory. It does not write a telemetry JSON export yet; that work remains TODO.
