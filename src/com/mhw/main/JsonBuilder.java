package com.mhw.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.mhw.gear.Gear;

public class JsonBuilder {
	@SuppressWarnings("unchecked")
	public JsonBuilder(Gear gear, String gearType) {
		String headPath = "src\\headgear.json";
		String chestPath = "src\\chestgear.json";
		String gauntletPath = "src\\gauntletgear.json";
		String waistPath = "src\\waistgear.json";
		String feetPath = "src\\feetgear.json";

		String path = null;

		JSONObject object = new JSONObject();
		JSONObject slotObject = new JSONObject();
		JSONObject skillsObject = new JSONObject();
		JSONObject skill1Object = new JSONObject();
		JSONObject skill2Object = new JSONObject();
		JSONObject materialsObject = new JSONObject();
		JSONObject materials1Object = new JSONObject();
		JSONObject materials2Object = new JSONObject();
		JSONObject materials3Object = new JSONObject();
		JSONObject materials4Object = new JSONObject();

		object.put("name", gear.getName());
		object.put("price", gear.getPrice());
		object.put("defense", gear.getDefense());

		if (gear.getSlotType1() != "") {
			slotObject.put("slotType1", gear.getSlotType1());
		}
		if (gear.getSlotType2() != "") {
			slotObject.put("slotType2", gear.getSlotType2());
		}
		if (gear.getSlotType3() != "") {
			slotObject.put("slotType3", gear.getSlotType3());
		}
		object.put("slots", slotObject);

		object.put("fireDef", gear.getFireDef());
		object.put("waterDef", gear.getWaterDef());
		object.put("thunderDef", gear.getThunderDef());
		object.put("iceDef", gear.getIceDef());
		object.put("draongDef", gear.getDragonDef());

		if (gear.getSkill1Name() != "") {
			skill1Object.put("name", gear.getSkill1Name());
			skill1Object.put("quantity", gear.getSkill1Quantity());
			skillsObject.put("skill1", skill1Object);
		}

		if (gear.getSkill2Name() != "") {
			skill2Object.put("name", gear.getSkill2Name());
			skill2Object.put("quantity", gear.getSkill2Quantity());
			skillsObject.put("skill2", skill2Object);
		}

		object.put("skills", skillsObject);

		if (gear.getMaterial1() != "") {
			materials1Object.put("name", gear.getMaterial1());
			materials1Object.put("quantity", gear.getMaterial1Quantity());
			materialsObject.put("materials1", materials1Object);
		}
		if (gear.getMaterial2() != "") {
			materials2Object.put("name", gear.getMaterial2());
			materials2Object.put("quantity", gear.getMaterial2Quantity());
			materialsObject.put("materials2", materials2Object);
		}
		if (gear.getMaterial3() != "") {
			materials3Object.put("name", gear.getMaterial3());
			materials3Object.put("quantity", gear.getMaterial3Quantity());
			materialsObject.put("materials3", materials3Object);
		}
		if (gear.getMaterial4() != "") {
			materials4Object.put("name", gear.getMaterial4());
			materials4Object.put("quantity", gear.getMaterial4Quantity());
			materialsObject.put("materials4", materials4Object);
		}
		object.put("materials", materialsObject);

		if (gearType == "headgear") {
			path = headPath;
		} else if (gearType == "chestgear") {
			path = chestPath;
		} else if (gearType == "gauntletgear") {
			path = gauntletPath;
		} else if (gearType == "waistgear") {
			path = waistPath;
		} else if (gearType == "feetgear") {
			path = feetPath;
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.write(object.toJSONString() + ",");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
