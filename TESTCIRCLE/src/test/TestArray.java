package test;

public class TestArray {
	public static void main(String[] args) {
		int[] a = new int[args.length];
		for (int i = 0; i < args.length - 1; i++) {
			a[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int change;
				if (a[i] > a[j]) {
					change = a[j];
					a[j] = a[i];
					a[i] = change;

				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int change;
				if (a[i] > a[j]) {
					change = a[j];
					a[j] = a[i];
					a[i] = change;

				}
			}

		}
	}
	}
