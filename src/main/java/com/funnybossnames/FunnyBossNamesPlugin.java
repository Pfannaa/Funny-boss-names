package com.funnybossnames;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Funny Boss Names"
)
public class FunnyBossNamesPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ChatMessageManager chatMessageManager;

	@Inject
	private FunnyBossNamesConfig config;



	@Subscribe
	public void onClientTick(ClientTick event)
	{
		Widget bossName = client.getWidget(303,9);
		Widget colName = client.getWidget(621,12);
		Widget colNameBig = client.getWidget(621,19);
		Widget colNameSmall = client.getWidget(621,19);
		Widget scoreBoardName = client.getWidget(817,6);


	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{

	}

	@Provides
	FunnyBossNamesConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(FunnyBossNamesConfig.class);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Funny boss names plugin stopped!");
	}

	@Override
	protected void startUp() throws Exception
	{
		log.info("Funny boss names plugin started!");
	}
}
