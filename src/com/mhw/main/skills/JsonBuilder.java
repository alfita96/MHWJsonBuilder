package com.mhw.main.skills;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.mhw.objects.Skill;

public class JsonBuilder {
	@SuppressWarnings("unchecked")
	public JsonBuilder(Skill skill) {
		String path = "src\\skills.json";

		JSONObject object = new JSONObject();
		JSONObject levelsObject = new JSONObject();
		JSONObject level1Object = new JSONObject();
		JSONObject level2Object = new JSONObject();
		JSONObject level3Object = new JSONObject();
		JSONObject level4Object = new JSONObject();
		JSONObject level5Object = new JSONObject();
		JSONObject level6Object = new JSONObject();
		JSONObject level7Object = new JSONObject();

		object.put("name", skill.getName());
		object.put("maxLevel", skill.getMaxLevel());

		if (skill.getLevel1Desc().length() != 0) {
			level1Object.put("description", skill.getLevel1Desc());
			levelsObject.put("1", level1Object);
		}

		if (skill.getLevel2Desc().length() != 0) {
			level2Object.put("description", skill.getLevel2Desc());
			levelsObject.put("2", level2Object);
		}

		if (skill.getLevel3Desc().length() != 0) {
			level3Object.put("description", skill.getLevel3Desc());
			levelsObject.put("3", level3Object);
		}

		if (skill.getLevel4Desc().length() != 0) {
			level4Object.put("description", skill.getLevel4Desc());
			levelsObject.put("4", level4Object);
		}

		if (skill.getLevel5Desc().length() != 0) {
			level5Object.put("description", skill.getLevel5Desc());
			levelsObject.put("5", level5Object);
		}

		if (skill.getLevel6Desc().length() != 0) {
			level6Object.put("description", skill.getLevel6Desc());
			levelsObject.put("6", level6Object);
		}

		if (skill.getLevel7Desc().length() != 0) {
			level7Object.put("description", skill.getLevel7Desc());
			levelsObject.put("7", level7Object);
		}
		
		object.put("levels", levelsObject);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.write(object.toJSONString() + ",");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
