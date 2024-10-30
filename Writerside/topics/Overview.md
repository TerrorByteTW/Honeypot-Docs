# Welcome to the Honeypot Wiki

## What is Honeypot?

<tooltip term="honeypot">Honeypot</tooltip> is a plugin designed to catch griefers and malicious players, not just protect against them. It's meant to
catch players who are enticed to grief builds. Simply turn a block into a Honeypot and wait for a player to interact
with it. Depending on your settings, it can either simply be a notification to staff, the player can get banned, a
custom command like `/jail` could be run.

If you're a developer, Honeypot lets you extend its functionality even further by providing a `BehaviorProvider` API
and publishing events that can be listened to for some other purpose.

<warning>
Honeypots in computing are not intended to _prevent_ malicious actions from occurring. In fact, one could argue that
having a Honeypot means you expect and welcome those attacks as a way of learning about threats and preventing them.

Honeypot, the plugin, is somewhat similar. If you care about preventing builds from being destroyed in the first
place, use something else such as WorldGuard, Lands, or GriefPrevention, and **always** implement a rollback system
like CoreProtect! Honeypot cannot proactively protect your builds.
</warning>

## Why Honeypot?

<list>
<li><control>👀 Privacy focused.</control> We don't want your data! Most plugins are open source, but those that aren't are difficult to
review, meaning you can't check what they're doing! This plugin only collects basic statistics using bStats and
nothing more. bStats is a trusted analytics system, and is used everywhere. It's even embedded in Paper and the
Velocity proxy. If you want to know more about this in layman's terms, I'm happy to share! You can view all
stats <a href="https://bstats.org/plugin/bukkit/Honeypot/15425">here</a>.</li>
<li><control>💪 Lightweight.</control> Honeypot is feature packed, but still manages to be lightweight. It's extremely quick to process
events, preventing unnecessary lag while protecting your server at the same time. Is Honeypot <emphasis>too</emphasis> lightweight for
you? Lucky you! There are plenty of extra events packed into Honeypot that can be enabled with the flip of a config
switch! These events may cause Honeypot to consume more resources, but help protect your server against even the
strangest events.</li>
<li><control>😄 Easy to update.</control> Honeypot does its work using simple, well known and documented Paper APIs or well-known
libraries, avoiding complex systems such as NMS (At least, within its own codebase). This makes it easy to understand
and update if/when breaking changes occur. If Honeypot does use complex systems like NMS, it does so with well known
and well maintained libraries such as ProtocolLib.</li>
<li><control>🔨 Easy to build upon.</control> For the software developers out there, Honeypot uses Dependency Injection and dynamically
loads storage and behavior providers at load time dynamically. Not only does this make it possible for plugin
developers to add functionality to Honeypot, but it also makes it extremely easy to update for the maintainers.
Everything has been written in a way that allows a developer to just add new code instead of having to modify vast
swaths of existing code.</li>
<li><control>🏋️‍♂️ Does the heavy lifting.</control> Once Honeypot is set up in a way you like it, it does the heavy lifting for you. It
is virtually a &quot;set it and forget it&quot; system. You are in charge of how much or how little power Honeypot has on your
server. You could, theoretically, configure it in a way to never have to touch it ever again.</li>
</list>

Honeypot is always getting better, with new features being added all the time and improvements made each day. However, I
am not a one-man band! If you have an idea, submit an enhancement request or even a Pull Request! I'm always happy to
have contributors 😄

## Installation

Installing Honeypot is simple. Just download it from one of the many locations it's available (The footer contains
all of those), then drop it in your server's Plugins folder.

On first boot Honeypot will generate all the configuration and database files needed to function. Changes to the
configuration files can be applied by using `/honeypot reload` in-game.

<note>
Some settings cannot be changed on the fly, such as event listeners and Behavior Providers, as those are required 
to be configured when the plugin starts up and are not meant to be modified during runtime. Attempting to use <code>/reload</code> 
or plugins such as PlugManX will cause the plugin to crash (As well as many other plugins. There are reasons <code>/reload</code> 
is not supported by even Paper).
</note>

## FAQ

<p>Q) Is Honeypot efficient?<br />
A) Honeypot tries to be as efficient as possible. It caches Honeypots in memory to prevent costly database queries,
it does its best to stop processing an event or events as early as it can, and has many other features to
help with speed. More recently, Honeypot supports the Spigot PDC API, which removes the dependency on SQLite
for storing block data (Player and Player History are still stored in the DB, but they are <emphasis>way</emphasis> more performant when
queried). As of v3.4.0, Honeypot's internal DB uses <code>R*Tree</code>,
which <a href="https://github.com/TerrorByteTW/Honeypot/issues/187">increased performance by 97% in testing</a> ! It shouldn't
cause too much lag on your server, however I'm always optimizing. If you have an issue with the plugin or a suggestion
on how to improve it, please let me know!</p>

<p>Q) Is Honeypot secure?<br />
A) I've taken all precautionary steps to ensure Honeypot is secure and doesn't provide any security vulnerabilities to
your server. Honeypot is obviously a Spigot plugin so it is only as secure as Spigot. It doesn't store any personal
information about players or servers, and only collects anonymous statistics
via <a href="https://bstats.org/plugin/bukkit/Honeypot/15425">bStats</a>. The plugin is open source for peer review. SonarCloud
used to be used, but I haven't succeeded in configuring it yet when I switched to Gradle. Once I get it back running it
will be available for public review.</p>

<p>Q) How does Honeypot work?<br />
A) When you mark a block as a Honeypot, its location and <tooltip term="action">action</tooltip> is stored in the
storage mechanism of choice (By default this is SQLite, but PDC is also natively supported. Other storage providers can
be programmatically added). Honeypot listens to up to 17 different events, such as Block Break, Block Burn, Entity
Explode (Such as TnT), and many more. These event <tooltip term="listener">listeners</tooltip> contain logic to determine whether the event was on a
Honeypot block and, if so, who caused the event and what action should be taken. Then, when a player interacts with that
Honeypot, the action is retrieved, the plugin looks up the code for how the action should be processed, and finally the
action is ran against the player. That's the simple definition, there's a lot more to it, of course 😉</p>