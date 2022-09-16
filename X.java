package HWorks;

public class X extends Y {
	int i, j;
	X(int k) {
		this(k, 1);
		j = k;
	}
	X(int a, int b) {
		i = a*b;
		j = i;
	}
}
