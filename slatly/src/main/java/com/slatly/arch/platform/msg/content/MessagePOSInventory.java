package com.slatly.arch.platform.msg.content;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessagePOSInventory {

	private static final Logger logger = LoggerFactory
			.getLogger(MessagePOSInventory.class);

	private POSTaggerMap<String, Integer> nouns;
	private POSTaggerMap<String, Integer> places;

	@PostConstruct
	public void init() {
		nouns = new POSTaggerMap<>();
		places = new POSTaggerMap<>();
	}

	@PreDestroy
	public void destroy() {
		nouns.clear();
		places.clear();
	}

	public void addTrend(String trend, String tag, String additionalInfo) {
		switch (additionalInfo) {
		case "LOCATION":
		case "ORGANIZATION":
			places.put(trend);
			break;
		default:
			switch (tag) {
			case "NN":
			case "NNS":
			case "NNP":
			case "NNPS":
				nouns.put(trend);
				break;
			}
		}

		logger.info("nouns:" + nouns.size() + "| places:" + places.size());
	}

	public void getNumOfPopularTrends(int numOfPopularTrends) {

	}
}
