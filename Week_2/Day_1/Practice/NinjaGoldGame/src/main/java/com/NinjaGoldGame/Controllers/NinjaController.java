package com.NinjaGoldGame.Controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaController {
	private final Map<String, int[]> locationRanges = new HashMap<>();
	private final Random randomGenerator = new Random();

	public NinjaController() {
		locationRanges.put("farm", new int[] { 10, 20 });
		locationRanges.put("cave", new int[] { 5, 10 });
		locationRanges.put("house", new int[] { 2, 5 });
		locationRanges.put("quest", new int[] { -50, 50 });
		locationRanges.put("spa", new int[] { -20, -5 });
	}

	@GetMapping("/")
	public String displayQuest(HttpSession session) {
		initializeSessionIfNeeded(session);
		return "index.jsp";
	}

	@PostMapping("/form")
	public String actions(@RequestParam("name") String location, HttpSession session) {
		if ("reset".equals(location)) {
			session.invalidate();
			return "redirect:/";
		}

		updateGoldAndLogs(location, session);
		return "redirect:/";
	}

	private void initializeSessionIfNeeded(HttpSession session) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			session.setAttribute("earns", new ArrayList<String>());
			session.setAttribute("lose", new ArrayList<String>());
		}
	}

	private void updateGoldAndLogs(String location, HttpSession session) {
		if (!locationRanges.containsKey(location))
			return;

		int[] range = locationRanges.get(location);
		int goldChange = calculateGold(range[0], range[1]);
		updateGold(session, goldChange);

		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM d yyyy h:mm a"));
		recordLogs(session, location, goldChange, timestamp);
	}
	
	private void updateGold(HttpSession session, int change) {
		int currentGold = (int) session.getAttribute("gold");
		session.setAttribute("gold", currentGold + change);
	}

	private int calculateGold(int min, int max) {
		return randomGenerator.nextInt(max - min + 1) + min;
	}
	
	private String formatLogsMessage(String location, int goldChange, String timestamp) {
		if (goldChange >= 0) {
			return String.format("You entered a %s and earned %d gold. (%s)",
					location, goldChange, timestamp);
		} else {
			return String.format("You %s a %s and lost %d gold. Ouch. (%s)",
					location.equals("spa") ? "visited" : "failed",
					location, Math.abs(goldChange), timestamp);
		}
	}

	

	private void recordLogs(HttpSession session, String location, int goldChange, String timestamp) {
		String message = formatLogsMessage(location, goldChange, timestamp);

		@SuppressWarnings("unchecked")
		ArrayList<String> activities = goldChange >= 0 ? (ArrayList<String>) session.getAttribute("earns")
				: (ArrayList<String>) session.getAttribute("lose");

		activities.add(message);
		session.setAttribute(goldChange >= 0 ? "earns" : "lose", activities);
	}

	
}
