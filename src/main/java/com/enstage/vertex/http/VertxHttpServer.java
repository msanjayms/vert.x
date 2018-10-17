package com.enstage.vertex.http;

import com.enstage.vertex.verticles.HttpServerVerticle;

import io.vertx.core.Vertx;

public class VertxHttpServer {

	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(new HttpServerVerticle());
	}
}
