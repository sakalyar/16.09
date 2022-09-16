package HWorks;

public enum Civ {
	 UKN("inconnu"),
	 MR("Monsieur"),
	 MRS("Madame"),
	 MS("Mademoiselle");
	 private final String expand;
	 private Civ(String x) {
	 expand = x;
	 }
	 @Override public String toString() {
	 return expand;
	 }
	 public String welcome() {
	 return "Bienvenue " + this;
	 }
}