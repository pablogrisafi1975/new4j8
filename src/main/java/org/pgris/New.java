package org.pgris;

import java.util.*;

/**
 * <h2><a id="unmodifiable">Unmodifiable Lists</a></h2>
 * <p>
 * The {@link New#list(Object...) New.list} methods provide a convenient way to create
 * unmodifiable lists. The {@code List} instances created by these methods have the
 * following characteristics:
 *
 * <ul>
 * <li>They are <a href="Collection.html#unmodifiable"><i>unmodifiable</i></a>. Elements
 * cannot be added, removed, or replaced. Calling any mutator method on the List will
 * always cause {@code UnsupportedOperationException} to be thrown. However, if the
 * contained elements are themselves mutable, this may cause the List's contents to appear
 * to change.
 * <li>They disallow {@code null} elements. Attempts to create them with {@code null}
 * elements result in {@code NullPointerException}.
 * <li>The order of elements in the list is the same as the order of the provided
 * arguments, or of the elements in the provided array.
 * <li>The lists and their {@link #subList(int, int) subList} views implement the
 * {@link RandomAccess} interface.
 * <li>They are <a href="../lang/doc-files/ValueBased.html">value-based</a>. Callers
 * should make no assumptions about the identity of the returned instances. Factories are
 * free to create new instances or reuse existing ones. Therefore, identity-sensitive
 * operations on these instances (reference equality ({@code ==}), identity hash code, and
 * synchronization) are unreliable and should be avoided.
 * </ul>
 *
 * <h2><a id="unmodifiableSets">Unmodifiable Sets</a></h2>
 * <p>
 * The {@link New#set(Object...) New.set} static factory methods provide a convenient way
 * to create unmodifiable sets. The {@code Set} instances created by these methods have
 * the following characteristics:
 *
 * <ul>
 * <li>They are <a href="Collection.html#unmodifiable"><i>unmodifiable</i></a>. Elements
 * cannot be added or removed. Calling any mutator method on the Set will always cause
 * {@code UnsupportedOperationException} to be thrown. However, if the contained elements
 * are themselves mutable, this may cause the Set to behave inconsistently or its contents
 * to appear to change.
 * <li>They disallow {@code null} elements. Attempts to create them with {@code null}
 * elements result in {@code NullPointerException}.
 * <li>They reject duplicate elements at creation time. Duplicate elements passed to a
 * static factory method result in {@code IllegalArgumentException}.
 * <li>The iteration order of set elements is unspecified and is subject to change.
 * <li>They are <a href="../lang/doc-files/ValueBased.html">value-based</a>. Callers
 * should make no assumptions about the identity of the returned instances. Factories are
 * free to create new instances or reuse existing ones. Therefore, identity-sensitive
 * operations on these instances (reference equality ({@code ==}), identity hash code, and
 * synchronization) are unreliable and should be avoided.
 * </ul>
 */
public final class New {

	/**
	 * Never create an instance
	 */
	private New() {
		// do not instantiate
	}

	public static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");

	/**
	 * Returns an unmodifiable list containing zero elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @return an empty {@code List}
	 */
	public static <E> List<E> list() {
		return Collections.emptyList();
	}

	/**
	 * Returns an unmodifiable list containing one element.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the single element
	 * @return a {@code List} containing the specified element
	 * @throws NullPointerException if the element is {@code null}
	 */
	public static <E> List<E> list(E e1) {
		Objects.requireNonNull(e1, "e1 can not be null");
		return Collections.singletonList(e1);
	}

	/**
	 * Returns an unmodifiable list containing two elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> list(E e1, E e2) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		return Collections.unmodifiableList(Arrays.asList(e1, e2));
	}

	/**
	 * Returns an unmodifiable list containing three elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> list(E e1, E e2, E e3) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		return Collections.unmodifiableList(Arrays.asList(e1, e2, e3));
	}

	/**
	 * Returns an unmodifiable list containing four elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> list(E e1, E e2, E e3, E e4) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		return Collections.unmodifiableList(Arrays.asList(e1, e2, e3, e4));
	}

	/**
	 * Returns an unmodifiable list containing five elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> list(E e1, E e2, E e3, E e4, E e5) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		return Collections.unmodifiableList(Arrays.asList(e1, e2, e3, e4, e5));
	}

	/**
	 * Returns an unmodifiable list containing six elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> list(E e1, E e2, E e3, E e4, E e5, E e6) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");
		return Collections.unmodifiableList(Arrays.asList(e1, e2, e3, e4, e5, e6));
	}

	/**
	 * Returns an unmodifiable list containing seven elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");
		Objects.requireNonNull(e7, "e7 can not be null");
		return Collections.unmodifiableList(Arrays.asList(e1, e2, e3, e4, e5, e6, e7));
	}

	/**
	 * Returns an unmodifiable list containing eight elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");
		Objects.requireNonNull(e7, "e7 can not be null");
		Objects.requireNonNull(e8, "e8 can not be null");
		return Collections.unmodifiableList(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8));
	}

	/**
	 * Returns an unmodifiable list containing nine elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @param e9 the ninth element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");
		Objects.requireNonNull(e7, "e7 can not be null");
		Objects.requireNonNull(e8, "e8 can not be null");
		Objects.requireNonNull(e9, "e9 can not be null");
		return Collections.unmodifiableList(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9));
	}

	/**
	 * Returns an unmodifiable list containing ten elements.
	 *
	 * See <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 * @param <E> the {@code List}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @param e9 the ninth element
	 * @param e10 the tenth element
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> List<E> list(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");
		Objects.requireNonNull(e7, "e7 can not be null");
		Objects.requireNonNull(e8, "e8 can not be null");
		Objects.requireNonNull(e9, "e9 can not be null");
		Objects.requireNonNull(e10, "e10 can not be null");
		return Collections.unmodifiableList(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
	}

	/**
	 * Returns an unmodifiable list containing an arbitrary number of elements. See
	 * <a href="#unmodifiableLists">Unmodifiable Lists</a> for details.
	 *
	 * @apiNote This method also accepts a single array as an argument. The element type
	 * of the resulting list will be the component type of the array, and the size of the
	 * list will be equal to the length of the array. To create a list with a single
	 * element that is an array, do the following:
	 *
	 * <pre>{@code
	 *     String[] array = ... ;
	 *     List<String[]> list = New.<String[]>list(array);
	 * }</pre>
	 *
	 * This will cause the {@link New#list(Object) New.list(E)} method to be invoked
	 * instead.
	 * @param <E> the {@code List}'s element type
	 * @param elements the elements to be contained in the list
	 * @return a {@code List} containing the specified elements
	 * @throws NullPointerException if an element is {@code null} or if the array is
	 * {@code null}
	 */
	@SafeVarargs
	@SuppressWarnings("varargs")
	public static <E> List<E> list(E... elements) {
		for (int i = 0; i < elements.length; i++) {
			Objects.requireNonNull(elements[i], "e" + (i + 1) + " can not be null");
		}
		List<E> list = new LinkedList<>();
		for (E e : elements) {
			list.add(e);
		}
		return Collections.unmodifiableList(list);
	}

	public static <E> ArrayList<E> arrayList() {
		return new ArrayList<>();
	}

	public static <E> ArrayList<E> arrayList(E e1) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		return list;
	}

	public static <E> ArrayList<E> arrayList(E e1, E e2) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		return list;
	}

	public static <E> ArrayList<E> arrayList(E e1, E e2, E e3) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		return list;
	}

	public static <E> ArrayList<E> arrayList(E e1, E e2, E e3, E e4) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		return list;
	}

	public static <E> ArrayList<E> arrayList(E e1, E e2, E e3, E e4, E e5) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		return list;
	}

	public static <E> ArrayList<E> arrayList(E e1, E e2, E e3, E e4, E e5, E e6) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		return list;
	}

	public static <E> ArrayList<E> arrayList(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		return list;
	}

	public static <E> ArrayList<E> arrayList(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		return list;
	}

	public static <E> ArrayList<E> arrayList(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e8);
		list.add(e9);
		return list;
	}

	public static <E> ArrayList<E> arrayList(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
		ArrayList<E> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		return list;
	}

	@SafeVarargs
	public static <E> ArrayList<E> arrayList(E... elements) {
		ArrayList<E> list = new ArrayList<>();
		for (E e : elements) {
			list.add(e);
		}
		return list;
	}

	/**
	 * Returns an unmodifiable set containing zero elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @return an empty {@code Set}
	 */
	public static <E> Set<E> set() {
		return Collections.emptySet();
	}

	/**
	 * Returns an unmodifiable set containing one element. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the single element
	 * @return a {@code Set} containing the specified element
	 * @throws NullPointerException if the element is {@code null}
	 */
	public static <E> Set<E> set(E e1) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing two elements. See
	 * <a href="#unmodifiable">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if the elements are duplicates
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> set(E e1, E e2) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		checkRepeatedElement(set.add(e2), 1);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing three elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> set(E e1, E e2, E e3) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		checkRepeatedElement(set.add(e2), 1);
		checkRepeatedElement(set.add(e3), 2);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing four elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> set(E e1, E e2, E e3, E e4) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		checkRepeatedElement(set.add(e2), 1);
		checkRepeatedElement(set.add(e3), 2);
		checkRepeatedElement(set.add(e4), 3);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing five elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> set(E e1, E e2, E e3, E e4, E e5) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		checkRepeatedElement(set.add(e2), 1);
		checkRepeatedElement(set.add(e3), 2);
		checkRepeatedElement(set.add(e4), 3);
		checkRepeatedElement(set.add(e5), 4);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing six elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> set(E e1, E e2, E e3, E e4, E e5, E e6) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		checkRepeatedElement(set.add(e2), 1);
		checkRepeatedElement(set.add(e3), 2);
		checkRepeatedElement(set.add(e4), 3);
		checkRepeatedElement(set.add(e5), 4);
		checkRepeatedElement(set.add(e6), 5);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing seven elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> set(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");
		Objects.requireNonNull(e7, "e7 can not be null");

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		checkRepeatedElement(set.add(e2), 1);
		checkRepeatedElement(set.add(e3), 2);
		checkRepeatedElement(set.add(e4), 3);
		checkRepeatedElement(set.add(e5), 4);
		checkRepeatedElement(set.add(e6), 5);
		checkRepeatedElement(set.add(e7), 6);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing eight elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> set(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");
		Objects.requireNonNull(e7, "e7 can not be null");
		Objects.requireNonNull(e8, "e8 can not be null");

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		checkRepeatedElement(set.add(e2), 1);
		checkRepeatedElement(set.add(e3), 2);
		checkRepeatedElement(set.add(e4), 3);
		checkRepeatedElement(set.add(e5), 4);
		checkRepeatedElement(set.add(e6), 5);
		checkRepeatedElement(set.add(e7), 6);
		checkRepeatedElement(set.add(e8), 7);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing nine elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @param e9 the ninth element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> set(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");
		Objects.requireNonNull(e7, "e7 can not be null");
		Objects.requireNonNull(e8, "e8 can not be null");
		Objects.requireNonNull(e9, "e9 can not be null");

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		checkRepeatedElement(set.add(e2), 1);
		checkRepeatedElement(set.add(e3), 2);
		checkRepeatedElement(set.add(e4), 3);
		checkRepeatedElement(set.add(e5), 4);
		checkRepeatedElement(set.add(e6), 5);
		checkRepeatedElement(set.add(e7), 6);
		checkRepeatedElement(set.add(e8), 7);
		checkRepeatedElement(set.add(e9), 8);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing ten elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 * @param <E> the {@code Set}'s element type
	 * @param e1 the first element
	 * @param e2 the second element
	 * @param e3 the third element
	 * @param e4 the fourth element
	 * @param e5 the fifth element
	 * @param e6 the sixth element
	 * @param e7 the seventh element
	 * @param e8 the eighth element
	 * @param e9 the ninth element
	 * @param e10 the tenth element
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null}
	 */
	public static <E> Set<E> set(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
		Objects.requireNonNull(e1, "e1 can not be null");
		Objects.requireNonNull(e2, "e2 can not be null");
		Objects.requireNonNull(e3, "e3 can not be null");
		Objects.requireNonNull(e4, "e4 can not be null");
		Objects.requireNonNull(e5, "e5 can not be null");
		Objects.requireNonNull(e6, "e6 can not be null");
		Objects.requireNonNull(e7, "e7 can not be null");
		Objects.requireNonNull(e8, "e8 can not be null");
		Objects.requireNonNull(e9, "e9 can not be null");
		Objects.requireNonNull(e10, "e10 can not be null");

		Set<E> set = new LinkedHashSet<>();
		set.add(e1);
		checkRepeatedElement(set.add(e2), 1);
		checkRepeatedElement(set.add(e3), 2);
		checkRepeatedElement(set.add(e4), 3);
		checkRepeatedElement(set.add(e5), 4);
		checkRepeatedElement(set.add(e6), 5);
		checkRepeatedElement(set.add(e7), 6);
		checkRepeatedElement(set.add(e8), 7);
		checkRepeatedElement(set.add(e9), 8);
		checkRepeatedElement(set.add(e10), 9);
		return Collections.unmodifiableSet(set);
	}

	/**
	 * Returns an unmodifiable set containing an arbitrary number of elements. See
	 * <a href="#unmodifiableSets">Unmodifiable Sets</a> for details.
	 *
	 * @apiNote This method also accepts a single array as an argument. The element type
	 * of the resulting set will be the component type of the array, and the size of the
	 * set will be equal to the length of the array. To create a set with a single element
	 * that is an array, do the following:
	 *
	 * <pre>{@code
	 *     String[] array = ... ;
	 *     Set<String[]> list = New.<String[]>set(array);
	 * }</pre>
	 *
	 * This will cause the {@link New#set(Object) New.set(E)} method to be invoked
	 * instead.
	 * @param <E> the {@code Set}'s element type
	 * @param elements the elements to be contained in the set
	 * @return a {@code Set} containing the specified elements
	 * @throws IllegalArgumentException if there are any duplicate elements
	 * @throws NullPointerException if an element is {@code null} or if the array is
	 * {@code null}
	 */
	@SafeVarargs
	@SuppressWarnings("varargs")
	public static <E> Set<E> set(E... elements) {
		for (int i = 0; i < elements.length; i++) {
			Objects.requireNonNull(elements[i], "e" + (i + 1) + " can not be null");
		}
		Set<E> set = new LinkedHashSet<>();
		for (int i = 0; i < elements.length; i++) {
			checkRepeatedElement(set.add(elements[i]), i);
		}
		return Collections.unmodifiableSet(set);
	}

	public static <E> HashSet<E> hashSet() {
		return new HashSet<>();
	}

	public static <E> HashSet<E> hashSet(E e1) {
		HashSet<E> set = new HashSet<>();
		set.add(e1);
		return set;
	}

	public static <E> HashSet<E> hashSet(E e1, E e2) {
		HashSet<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		return set;
	}

	public static <E> HashSet<E> hashSet(E e1, E e2, E e3) {
		HashSet<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		return set;
	}

	public static <E> HashSet<E> hashSet(E e1, E e2, E e3, E e4) {
		HashSet<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		return set;
	}

	public static <E> HashSet<E> hashSet(E e1, E e2, E e3, E e4, E e5) {
		HashSet<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		return set;
	}

	public static <E> HashSet<E> hashSet(E e1, E e2, E e3, E e4, E e5, E e6) {
		HashSet<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		return set;
	}

	public static <E> HashSet<E> hashSet(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
		HashSet<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		return set;
	}

	public static <E> HashSet<E> hashSet(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
		HashSet<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		return set;
	}

	@SafeVarargs
	public static <E> HashSet<E> hashSet(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E... es) {
		HashSet<E> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		set.add(e8);
		Collections.addAll(set, es);
		return set;
	}

	public static <K, V> Map<K, V> map() {
		return Collections.emptyMap();
	}

	public static <K, V> Map<K, V> map(K k1, V v1) {
		Objects.requireNonNull(k1, "k1 can not be null");
		Objects.requireNonNull(v1, "v1 can not be null");
		return Collections.singletonMap(k1, v1);
	}

	public static <K, V> Map<K, V> map(K k1, V v1, K k2, V v2) {
		Objects.requireNonNull(k1, "k1 can not be null");
		Objects.requireNonNull(v1, "v1 can not be null");
		Objects.requireNonNull(k2, "k2 can not be null");
		Objects.requireNonNull(v2, "v2 can not be null");

		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		checkRepeatedKey(map.put(k2, v2));
		return Collections.unmodifiableMap(map);
	}

	private static <V> void checkRepeatedKey(V putResult) {
		if (putResult != null) {
			throw new IllegalArgumentException("duplicate key: " + putResult);
		}
	}

	public static <K, V> Map<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3) {
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7) {
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> map(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7,
			V v7, K k8, V v8) {
		Map<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> HashMap<K, V> hashMap() {
		return new HashMap<>();
	}

	public static <K, V> HashMap<K, V> hashMap(K k1, V v1) {
		HashMap<K, V> map = new HashMap<>();
		map.put(k1, v1);
		return map;
	}

	public static <K, V> HashMap<K, V> hashMap(K k1, V v1, K k2, V v2) {
		HashMap<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		return map;
	}

	public static <K, V> HashMap<K, V> hashMap(K k1, V v1, K k2, V v2, K k3, V v3) {
		HashMap<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		return map;
	}

	public static <K, V> HashMap<K, V> hashMap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
		HashMap<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		return map;
	}

	public static <K, V> HashMap<K, V> hashMap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
		HashMap<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		return map;
	}

	public static <K, V> HashMap<K, V> hashMap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
		HashMap<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		return map;
	}

	public static <K, V> HashMap<K, V> hashMap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6,
			K k7, V v7) {
		HashMap<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		return map;
	}

	public static <K, V> HashMap<K, V> hashMap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6,
			K k7, V v7, K k8, V v8) {
		HashMap<K, V> map = new HashMap<>();
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		return map;
	}

	public static <K extends Enum<K>, V> EnumMap<K, V> enumMap(Class<K> enumClass) {
		return new EnumMap<>(enumClass);
	}

	public static <K extends Enum<K>, V> EnumMap<K, V> enumMap(Class<K> enumClass, K k1, V v1) {
		EnumMap<K, V> map = new EnumMap<>(enumClass);
		map.put(k1, v1);
		return map;
	}

	public static <K extends Enum<K>, V> EnumMap<K, V> enumMap(Class<K> enumClass, K k1, V v1, K k2, V v2) {
		EnumMap<K, V> map = new EnumMap<>(enumClass);
		map.put(k1, v1);
		map.put(k2, v2);
		return map;
	}

	public static <K extends Enum<K>, V> EnumMap<K, V> enumMap(Class<K> enumClass, K k1, V v1, K k2, V v2, K k3, V v3) {
		EnumMap<K, V> map = new EnumMap<>(enumClass);
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		return map;
	}

	public static <K extends Enum<K>, V> EnumMap<K, V> enumMap(Class<K> enumClass, K k1, V v1, K k2, V v2, K k3, V v3,
			K k4, V v4) {
		EnumMap<K, V> map = new EnumMap<>(enumClass);
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		return map;
	}

	public static <K extends Enum<K>, V> EnumMap<K, V> enumMap(Class<K> enumClass, K k1, V v1, K k2, V v2, K k3, V v3,
			K k4, V v4, K k5, V v5) {
		EnumMap<K, V> map = new EnumMap<>(enumClass);
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		return map;
	}

	public static <K extends Enum<K>, V> EnumMap<K, V> enumMap(Class<K> enumClass, K k1, V v1, K k2, V v2, K k3, V v3,
			K k4, V v4, K k5, V v5, K k6, V v6) {
		EnumMap<K, V> map = new EnumMap<>(enumClass);
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		return map;
	}

	public static <K extends Enum<K>, V> EnumMap<K, V> enumMap(Class<K> enumClass, K k1, V v1, K k2, V v2, K k3, V v3,
			K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
		EnumMap<K, V> map = new EnumMap<>(enumClass);
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		return map;
	}

	public static <K extends Enum<K>, V> EnumMap<K, V> enumMap(Class<K> enumClass, K k1, V v1, K k2, V v2, K k3, V v3,
			K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
		EnumMap<K, V> map = new EnumMap<>(enumClass);
		map.put(k1, v1);
		map.put(k2, v2);
		map.put(k3, v3);
		map.put(k4, v4);
		map.put(k5, v5);
		map.put(k6, v6);
		map.put(k7, v7);
		map.put(k8, v8);
		return map;
	}

	public static <K, V> Map.Entry<K, V> entry(K key, V value) {
		return new AbstractMap.SimpleImmutableEntry<>(key, value);
	}

	public static <K, V> Map<K, V> mapOfEntries() {
		return Collections.emptyMap();
	}

	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e1) {
		Map<K, V> map = new HashMap<>();
		map.put(e1.getKey(), e1.getValue());
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
		Map<K, V> map = new HashMap<>();
		map.put(e1.getKey(), e1.getValue());
		map.put(e2.getKey(), e2.getValue());
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3) {
		Map<K, V> map = new HashMap<>();
		map.put(e1.getKey(), e1.getValue());
		map.put(e2.getKey(), e2.getValue());
		map.put(e3.getKey(), e3.getValue());
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3,
			Map.Entry<K, V> e4) {
		Map<K, V> map = new HashMap<>();
		map.put(e1.getKey(), e1.getValue());
		map.put(e2.getKey(), e2.getValue());
		map.put(e3.getKey(), e3.getValue());
		map.put(e4.getKey(), e4.getValue());
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3,
			Map.Entry<K, V> e4, Map.Entry<K, V> e5) {
		Map<K, V> map = new HashMap<>();
		map.put(e1.getKey(), e1.getValue());
		map.put(e2.getKey(), e2.getValue());
		map.put(e3.getKey(), e3.getValue());
		map.put(e4.getKey(), e4.getValue());
		map.put(e5.getKey(), e5.getValue());
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3,
			Map.Entry<K, V> e4, Map.Entry<K, V> e5, Map.Entry<K, V> e6) {
		Map<K, V> map = new HashMap<>();
		map.put(e1.getKey(), e1.getValue());
		map.put(e2.getKey(), e2.getValue());
		map.put(e3.getKey(), e3.getValue());
		map.put(e4.getKey(), e4.getValue());
		map.put(e5.getKey(), e5.getValue());
		map.put(e6.getKey(), e6.getValue());
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3,
			Map.Entry<K, V> e4, Map.Entry<K, V> e5, Map.Entry<K, V> e6, Map.Entry<K, V> e7) {
		Map<K, V> map = new HashMap<>();
		map.put(e1.getKey(), e1.getValue());
		map.put(e2.getKey(), e2.getValue());
		map.put(e3.getKey(), e3.getValue());
		map.put(e4.getKey(), e4.getValue());
		map.put(e5.getKey(), e5.getValue());
		map.put(e6.getKey(), e6.getValue());
		map.put(e7.getKey(), e7.getValue());
		return Collections.unmodifiableMap(map);
	}

	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3,
			Map.Entry<K, V> e4, Map.Entry<K, V> e5, Map.Entry<K, V> e6, Map.Entry<K, V> e7, Map.Entry<K, V> e8) {
		Map<K, V> map = new HashMap<>();
		map.put(e1.getKey(), e1.getValue());
		map.put(e2.getKey(), e2.getValue());
		map.put(e3.getKey(), e3.getValue());
		map.put(e4.getKey(), e4.getValue());
		map.put(e5.getKey(), e5.getValue());
		map.put(e6.getKey(), e6.getValue());
		map.put(e7.getKey(), e7.getValue());
		map.put(e8.getKey(), e8.getValue());
		return Collections.unmodifiableMap(map);
	}

	@SafeVarargs
	public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3,
			Map.Entry<K, V> e4, Map.Entry<K, V> e5, Map.Entry<K, V> e6, Map.Entry<K, V> e7, Map.Entry<K, V> e8,
			Map.Entry<K, V>... es) {
		Map<K, V> map = new HashMap<>();
		map.put(e1.getKey(), e1.getValue());
		map.put(e2.getKey(), e2.getValue());
		map.put(e3.getKey(), e3.getValue());
		map.put(e4.getKey(), e4.getValue());
		map.put(e5.getKey(), e5.getValue());
		map.put(e6.getKey(), e6.getValue());
		map.put(e7.getKey(), e7.getValue());
		map.put(e8.getKey(), e8.getValue());
		for (Map.Entry<K, V> e : es) {
			map.put(e.getKey(), e.getValue());
		}
		return Collections.unmodifiableMap(map);
	}

	public static Calendar calendar(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, TimeZone timeZone, Locale locale) {
		Calendar calendar = Calendar.getInstance(timeZone, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar;
	}

	public static Calendar calendarEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, TimeZone timeZone) {
		Calendar calendar = Calendar.getInstance(timeZone, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar;
	}

	public static Calendar calendarUTC(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, Locale locale) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar;
	}

	public static Calendar calendarUTCEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute,
			int second, int millisecond) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar;
	}

	public static Calendar calendar(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			TimeZone timeZone, Locale locale) {
		Calendar calendar = Calendar.getInstance(timeZone, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	public static Calendar calendarEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			TimeZone timeZone) {
		Calendar calendar = Calendar.getInstance(timeZone, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	public static Calendar calendarUTC(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			Locale locale) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	public static Calendar calendarUTCEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute,
			int second) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	public static Calendar calendar1(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, TimeZone timeZone, Locale locale) {
		Calendar calendar = Calendar.getInstance(timeZone, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar;
	}

	public static Calendar calendar1EN(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, TimeZone timeZone) {
		Calendar calendar = Calendar.getInstance(timeZone, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar;
	}

	public static Calendar calendar1UTC(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, Locale locale) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar;
	}

	public static Calendar calendar1UTCEN(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute,
			int second, int millisecond) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar;
	}

	public static Calendar calendar1(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			TimeZone timeZone, Locale locale) {
		Calendar calendar = Calendar.getInstance(timeZone, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	public static Calendar calendar1EN(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			TimeZone timeZone) {
		Calendar calendar = Calendar.getInstance(timeZone, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	public static Calendar calendar1UTC(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			Locale locale) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	public static Calendar calendar1UTCEN(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute,
			int second) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	public static Date date(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, TimeZone timeZone, Locale locale) {
		Calendar calendar = Calendar.getInstance(timeZone, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar.getTime();
	}

	public static Date dateEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, TimeZone timeZone) {
		Calendar calendar = Calendar.getInstance(timeZone, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar.getTime();
	}

	public static Date dateUTC(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, Locale locale) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar.getTime();
	}

	public static Date dateUTCEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar.getTime();
	}

	public static Date date(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			TimeZone timeZone, Locale locale) {
		Calendar calendar = Calendar.getInstance(timeZone, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date dateEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			TimeZone timeZone) {
		Calendar calendar = Calendar.getInstance(timeZone, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date dateUTC(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second,
			Locale locale) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date dateUTCEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date date1(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, TimeZone timeZone, Locale locale) {
		Calendar calendar = Calendar.getInstance(timeZone, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar.getTime();
	}

	public static Date date1EN(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, TimeZone timeZone) {
		Calendar calendar = Calendar.getInstance(timeZone, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar.getTime();
	}

	public static Date date1UTC(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond, Locale locale) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar.getTime();
	}

	public static Date date1UTCEN(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			int millisecond) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, millisecond);
		return calendar.getTime();
	}

	public static Date date1(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			TimeZone timeZone, Locale locale) {
		Calendar calendar = Calendar.getInstance(timeZone, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date date1EN(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			TimeZone timeZone) {
		Calendar calendar = Calendar.getInstance(timeZone, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date date1UTC(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second,
			Locale locale) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date date1UTCEN(int year, int monthBase2, int dayOfMonth, int hourOfDay, int minute, int second) {
		Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, monthBase2 - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	private static void checkRepeatedElement(boolean addResult, int i) {
		if (addResult == false) {
			throw new IllegalArgumentException("e" + (i + 1) + " repeats a previous element");
		}
	}

}
