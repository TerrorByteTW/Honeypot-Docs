# Commands & Permissions

Honeypot contains a variety of commands & permissions. Reference the chart below for those commands

## Main Commands

Staff will require the `honeypot.commands` permission to use any commands, including `/honeypot help`.

| Command                        | Permission       | Description                                                                                                |
|--------------------------------|------------------|------------------------------------------------------------------------------------------------------------|
| /honeypot                      | honeypot.gui     | Alias for `/honeypot gui`                                                                                  |
| /honeypot create \<type\>      | honeypot.create  | Creates a honeypot of type `type`                                                                          |
| /honeypot remove (near \| all) | honeypot.remove  | Remove the honeypot you're looking at. Specify `near` or `all` to remove nearby Honeypots or all Honeypots |
| /honeypot reload               | honeypot.reload  | Reloads the honeypot config. This is the only command that'll work in the console                          |
| /honeypot locate               | honeypot.locate  | Locate nearby Honeypots                                                                                    |
| /honeypot help                 |                  | Display the help menu                                                                                      |
| /honeypot gui                  | honeypot.gui     | Opens the GUI menu                                                                                         |
| /honeypot history              | honeypot.history | Allows looking up a players honeypot history                                                               |
| /honeypot migrate              | honeypot.migrate | Migrates a server from SQLite to PDC if they chose to use that new experimental storage method             |

## Other Permissions

| Permission      | Description                                                                                                    |
|-----------------|----------------------------------------------------------------------------------------------------------------|
| honeypot.*      | Gives access to all Honeypot commands and permissions                                                          |
| honeypot.break  | Allows players to break Honeypots, regardless of config values.<br /> They still cannot use `/honeypot remove` |
| honeypot.notify | Anyone with this permission will be notified if players break "notify" honeypots                               |
| honeypot.exempt | Players with this permission will not be affected by Honeypots                                                 |
