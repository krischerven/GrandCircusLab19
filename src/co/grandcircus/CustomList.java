package co.grandcircus;
public interface CustomList {
	public void addItem(String item);
	public boolean removeAt(int index);
	public boolean insertAt(int index, String item);
	public int count(String item);
	public String getFrequencyMap();
}