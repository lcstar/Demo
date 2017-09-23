package com.lc.test;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {

	@Test
	public void testJedisSingle() {

		Jedis jedis = new Jedis("10.244.171.37", 6379);
		jedis.set("name", "bar");
		String name = jedis.get("name");
		System.out.println(name);
		jedis.close();

	}



}
