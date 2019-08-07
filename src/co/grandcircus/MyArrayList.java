package co.grandcircus;
import java.util.ArrayList;
import java.util.HashMap;

public final class MyArrayList
	extends ArrayList<String>
	implements CustomList {
		// O(1)
		public void addItem(String item) {
			this.add(item);
		}
		// O(n*2)
		@Override
		public boolean removeAt(int index) {
			for (int i = 0; i <= index; ++i) {
				if (i == index) {
					this.remove(this.get(i));
					return true;
				}
			}
			return false;
		}
		// O(n)
		@Override
		public boolean insertAt(int index, String item) {
			this.add(index, item);
			return true;
		}
		// O(n)
		@Override
		public int count(String item) {
			int ret = 0;
			for (String i : this) {
				if (i == item) {
					++ret;
				}
			}
			return ret;
		}
		// O(n)
		@Override
		public String getFrequencyMap() {
			HashMap<String, Integer> map = new HashMap<>();
			for (String item : this) {
				map.put(item, count(item));
			}
			String ret = "\n";
			for (String key : map.keySet()) {
				ret += "["+key+"]: " + map.get(key) + "\n";
			}
			return ret;
		}
}