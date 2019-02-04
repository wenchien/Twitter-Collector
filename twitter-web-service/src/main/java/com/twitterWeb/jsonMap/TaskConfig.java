package com.twitterWeb.jsonMap;

public class TaskConfig {
	private String id;
	
	//OAuth Consumer and AccessToken
	private String OAuthConsumerKey;
	private String OAuthConsumerSecret;
	private String OAuthAccessToken;
	private String OAuthAccessTokenSecret;
	
	//Location Long/Lat Strings
	private String latitude;
	private String longtitude;
	
	//Language Strings
	//language are usually in the format of "langtag:language code" 
	//Example: "lang:ja"
	//There is a default value for this
	private String language = "lang:en";
	
	//Query Count
	private int queryCount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOAuthConsumerKey() {
		return OAuthConsumerKey;
	}

	public void setOAuthConsumerKey(String oAuthConsumerKey) {
		OAuthConsumerKey = oAuthConsumerKey;
	}

	public String getOAuthConsumerSecret() {
		return OAuthConsumerSecret;
	}

	public void setOAuthConsumerSecret(String oAuthConsumerSecret) {
		OAuthConsumerSecret = oAuthConsumerSecret;
	}

	public String getOAuthAccessToken() {
		return OAuthAccessToken;
	}

	public void setOAuthAccessToken(String oAuthAccessToken) {
		OAuthAccessToken = oAuthAccessToken;
	}

	public String getOAuthAccessTokenSecret() {
		return OAuthAccessTokenSecret;
	}

	public void setOAuthAccessTokenSecret(String oAuthAccessTokenSecret) {
		OAuthAccessTokenSecret = oAuthAccessTokenSecret;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getQueryCount() {
		return queryCount;
	}

	public void setQueryCount(int queryCount) {
		this.queryCount = queryCount;
	}
	
	@Override
	public String toString() {
		return 	"--------------Summary---------------" + "\n" +
				"ID: " + id + "\n" + 
				"Latitude: " + latitude + "\n" + 
				"Longtitude: " + longtitude + "\n" + 
				"Language: " + language + "\n" + 
				"Query Count: " + queryCount + "\n" + 
				"---------------OAuth----------------" + "\n" + 
				"OAuthConsumerKey: " + OAuthConsumerKey + "\n" +
				"OAuthConsumerKeySecret: " + OAuthConsumerSecret + "\n" +
				"OAuthConsumerAccessToken: " + OAuthAccessToken + "\n" +
				"OAuthConsumerAccessTokenSecret: " + OAuthAccessTokenSecret + "\n";
	}
}
