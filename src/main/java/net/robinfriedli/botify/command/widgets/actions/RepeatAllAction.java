package net.robinfriedli.botify.command.widgets.actions;

import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.robinfriedli.botify.audio.AudioPlayback;
import net.robinfriedli.botify.command.AbstractWidget;
import net.robinfriedli.botify.command.CommandContext;
import net.robinfriedli.botify.command.widgets.AbstractWidgetAction;

public class RepeatAllAction extends AbstractWidgetAction {

    private final AudioPlayback audioPlayback;

    public RepeatAllAction(String identifier, String emojiUnicode, boolean resetRequired, CommandContext context, AbstractWidget widget, GuildMessageReactionAddEvent event) {
        super(identifier, emojiUnicode, resetRequired, context, widget, event);
        audioPlayback = context.getGuildContext().getPlayback();
    }

    @Override
    public void doRun() {
        audioPlayback.setRepeatAll(!audioPlayback.isRepeatAll());
    }
}
