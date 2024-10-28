# Welcome to the Honeypot Wiki

## Why Honeypot?

* **👀 Privacy focused.** We don't want your data! Most plugins are open source, but those that aren't are difficult to
  review, meaning you can't check what they're doing! This plugin only collects basic statistics using bStats and
  nothing more. bStats is a trusted analytics system, and is used everywhere. It's even embedded in Paper and the
  Velocity proxy. If you want to know more about this in layman's terms, I'm happy to share! You can view all
  stats [here](https://bstats.org/plugin/bukkit/Honeypot/15425)
* **💪 Lightweight.** Honeypot is feature packed, but still manages to be lightweight. It's extremely quick at data
  lookups, preventing unnecessary lag while protecting your server at the same time. Is Honeypot *too* lightweight for
  you? Lucky you! There are plenty of extra events packed into Honeypot that can be enabled with the flip of a config
  switch!
* **😄 Easy to update.** Honeypot does its work using simple Bukkit APIs, avoiding complex systems such as NMS. This
  makes easy to understand and update if/when breaking changes occur. An example is the `/honeypot locate` command,
  which summons a No-AI, glowing, invincible slime instead of NMS to visually highlight the block!
* **🔨 Easy to build upon.** For the software developers out there, Honeypot uses Dependency Injection and dynamically
  loads storage and behavior managers at load time dynamically. Not only does this make it possible for plugin
  developers to add functionality to Honeypot, but it also makes it extremely easy to update for the maintainers.
  Everything has been written in a way that allows a developer to just add new code instead of having to modify vast
  swaths of existing code.
* **🏋️‍♂️ Does the heavy lifting.** Once Honeypot is set up in a way you like it, it does the heavy lifting for you. It
  is virtually a "set it and forget it" system. You are in charge of how much or how little power Honeypot has on your
  server. You could, theoretically, configure it in a way to never have to touch it ever again.

The plugin is still a work-in-progress. That's not to say it isn't functional because it is very much so in a production
ready state, but new features are always being added, and you can't say something is finished if you're still working on
it, can you? 😉

## FAQ

Q) Is Honeypot efficient?<br />
A) Honeypot tries to be as efficient as possible. It caches Honeypots in memory to prevent costly database transactions,
it does its best to return early if it doesn't need to continue processing an event or events, and other features to
help with speed. More recently (v3.2.0), Honeypot supports the Spigot PDC API, which removes the dependency on SQLite
for storing block data (Player and Player History are still stored in the DB, but they are *way* less resource
intensive). As of v3.4.0, Honeypot's internal DB uses R*Tree,
which [increased performance by 97% in testing](https://github.com/TerrorByteTW/Honeypot/issues/187)!!! It shouldn't
cause too much lag on your server, however I'm always optimizing. If you have an issue with the plugin or a suggestion
on how to improve it, please let me know!

Q) Is Honeypot secure?<br />
A) I've taken all precautionary steps to ensure Honeypot is secure. Honeypot is obviously a Spigot plugin so it is only
as secure as Spigot. It doesn't store any personal information about players or servers, and only collects anonymous
statistics via [bStats](https://bstats.org/plugin/bukkit/Honeypot/15425). The plugin is open source for peer review.
SonarCloud used to be used but I haven't succeeded in configuring it yet when I switched to Gradle. Once I get it back
running it will be available for public review.

Q) How does Honeypot work?<br />
A) Great question! Honeypot, at its core, is simply a tool for storing and retrieving block information from a database,
and running actions depending on that data. A staff member creates a Honeypot and defines an action which is then stored
in either a SQLite database, the world's Persistent Data Container (PDC), or any other storage method that is provided.
Then, when a player interacts with that Honeypot, the action is retrieved, the plugin looks up the code for how the
action should be processed, and finally the action is ran against the player. That's the simple definition, there's a
lot more to it, of course 😉