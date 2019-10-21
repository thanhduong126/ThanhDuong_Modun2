package AdvancedObjectOrientedDesign.CircleComparator;

import KeThua.DoiTuongHinhHoc.Circle;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CircleComparator implements Comparator<KeThua.DoiTuongHinhHoc.Circle> {
//	@Override
//	public int compare(Circle o1, Circle o2) {
//		return 0;
//	}

	@Override
	public Comparator<Circle> reversed() {
		return null;
	}

	@Override
	public Comparator<Circle> thenComparing(Comparator<? super Circle> other) {
		return null;
	}

	@Override
	public <U> Comparator<Circle> thenComparing(Function<? super Circle, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
		return null;
	}

	@Override
	public <U extends Comparable<? super U>> Comparator<Circle> thenComparing(Function<? super Circle, ? extends U> keyExtractor) {
		return null;
	}

	@Override
	public Comparator<Circle> thenComparingInt(ToIntFunction<? super Circle> keyExtractor) {
		return null;
	}

	@Override
	public Comparator<Circle> thenComparingLong(ToLongFunction<? super Circle> keyExtractor) {
		return null;
	}

	@Override
	public Comparator<Circle> thenComparingDouble(ToDoubleFunction<? super Circle> keyExtractor) {
		return null;
	}


	@Override
	public int compare(Circle c1, Circle c2) {
		if (c1.getRadius() > c2.getRadius()) return 1;
		else if (c1.getRadius() < c2.getRadius()) return -1;
		else return 0;
	}
}

