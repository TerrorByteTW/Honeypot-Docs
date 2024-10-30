# PlaceholderAPI

## Placeholders

Honeypot, as of 3.1.0, now supports Placeholders and even provides three as well. If you want to use custom
placeholders, you may do so by adding them to your honeypots.yml file. As for the placeholders that Honeypot *provides*,
those are:

<list>
<li><code>&percnt;honeypot_current_count_broken&percnt;</code> -- This placeholder displays the count of Honeypots the player has
broken <emphasis>this cycle</emphasis>. This means that this value will <emphasis>never</emphasis> be more than <code>blocks-broken-before-action-taken</code> in
config.</li>
<li><code>&percnt;honeypot_breaks_before_action&percnt;</code> -- This placeholder displays the value of
<code>blocks-broken-before-action-taken</code>.</li>
<li><code>&percnt;honeypot_current_count_broken_&lt;player&gt;&percnt;</code> -- This placeholder will get the current amount of Honeypots
a specific player has broken <emphasis>this cycle</emphasis>. This value will <emphasis>never</emphasis> be more than <code>blocks-broken-before-action-taken</code> in
config.</li>
</list>

As a reminder, Honeypot does *not* currently keep track of the all-time total Honeypots a player has broken. It does,
however, keep track of how many they've broken before an action is taken. So, if you have
`blocks-broken-before-action-taken` set to 5, then they can break up to 5 before the counter is reset and an action is
taken against the player. These placeholders are meant to display that information to the player at any given time. You
can also query a different player using these placeholders.