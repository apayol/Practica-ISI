public class Embotelladora {
	public int calculaBotellasPequenas(int pequenas, int grandes, int total) {
		if (pequenas < 0 || grandes < 0 || total < 0) {
			return -1;
		} else {
			int rest = total - (grandes * 5);
			if (rest >= 0) {
				if (pequenas >= rest) {
					return rest;
				} else {
					return -1;
				}
			} else {
				return 0;
			}
		}
	}
}
