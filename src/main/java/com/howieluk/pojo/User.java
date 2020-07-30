package com.howieluk.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
	private int user_id;
	private String username;
	private String password;
}
