package ke2.ea4;

class HagenGames {
	public K1618Restricted buyGame() {
		return new K1618();
	}

	public void udateK1618(K1618Restricted game) {
		((K1618) game).update();
	}
}