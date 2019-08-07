package co.grandcircus;
import java.util.ArrayList;
import java.util.HashMap;

public final class MyArrayList
	extends ArrayList<String>
	implements CustomList {
		public void addItem(String item) {
			this.add(item);
		}
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
		@Override
		public boolean insertAt(int index, String item) {
			this.add(index, item);
			return true;
		}
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