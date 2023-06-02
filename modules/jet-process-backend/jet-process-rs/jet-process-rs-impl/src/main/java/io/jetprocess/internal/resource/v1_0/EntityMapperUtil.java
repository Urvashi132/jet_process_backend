package io.jetprocess.internal.resource.v1_0;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class EntityMapperUtil {

	public static void mapClassFields(Map<Object, Object> map, Object entity) {
		for (Field field : entity.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			String fieldType = field.getType().getSimpleName();

			try {
				if (field.getName() != "id" && map.get(field.getName()) != null) {

					if (fieldType.equals("long")) {
						field.set(entity, Long.parseLong(map.get(field.getName()).toString()));
					} else if (fieldType.equals("int")) {
						field.set(entity, Integer.parseInt(map.get(field.getName()).toString()));
					} else if (fieldType.equals("float")) {
						field.set(entity, Float.parseFloat(map.get(field.getName()).toString()));
					} else {
						field.set(entity, map.get(field.getName()));
					}
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

	}

	public static void map(Object dto, Class entity) {

		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("dto-------" + dto);
		System.out.println("entity-------" + entity.getClass());
		try {
			System.out.println("entity-------" + dto.getClass().getDeclaredField("createDate"));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Field field : entity.getFields()){
			System.out.println("field-------" + field);
		}

		for (Field field1 : dto.getClass().getDeclaredFields()) {
			System.out.println("field1-------" + field1);
			for (Field field : entity.getClass().getDeclaredFields()) {

				System.out.println("field-------" + field);
				/*
				 * if(field.getName().equalsIgnoreCase(field1.getName())) { try {
				 * field.set(entity, map.get(field1.getName()));
				 * System.out.println("setfields---------"+field); } catch
				 * (IllegalArgumentException e) { e.printStackTrace(); } catch
				 * (IllegalAccessException e) { e.printStackTrace(); }
				 * 
				 * }
				 */

			}

		}

	}
}
