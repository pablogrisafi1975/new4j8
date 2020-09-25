package org.pgris;

import java.util.*;

public class New {

    public static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");

    public static <E> List<E> list(){
        return Collections.emptyList();
    }

    public static <E> List<E> list(E e0){
        return Collections.singletonList(e0);
    }

    public static <E> List<E> list(E e0, E e1){
        return Collections.unmodifiableList(Arrays.asList(e0, e1));
    }

    public static <E> List<E> list(E e0, E e1, E e2){
        return Collections.unmodifiableList(Arrays.asList(e0, e1, e2));
    }

    public static <E> List<E> list(E e0, E e1, E e2, E e3){
        return Collections.unmodifiableList(Arrays.asList(e0, e1, e2, e3));
    }

    public static <E> List<E> list(E e0, E e1, E e2, E e3, E e4){
        return Collections.unmodifiableList(Arrays.asList(e0, e1, e2, e3, e4));
    }

    public static <E> List<E> list(E e0, E e1, E e2, E e3, E e4, E e5){
        return Collections.unmodifiableList(Arrays.asList(e0, e1, e2, e3, e4, e5));
    }

    public static <E> List<E> list(E e0, E e1, E e2, E e3, E e4, E e5, E e6){
        return Collections.unmodifiableList(Arrays.asList(e0, e1, e2, e3, e4, e5, e6));
    }

    public static <E> List<E> list(E e0, E e1, E e2, E e3, E e4, E e5, E e6, E e7){
        return Collections.unmodifiableList(Arrays.asList(e0, e1, e2, e3, e4, e5, e6, e7));
    }

    @SafeVarargs
    public static <E> List<E> list(E e0, E e1, E e2, E e3, E e4, E e5, E e6, E e7, E... es){
        List<E> list = new LinkedList<>();
        list.add(e0);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        for(E e : es){
            list.add(e);
        }
        return Collections.unmodifiableList(list);
    }

    public static <E> List<E> arrayList(){
        return new ArrayList<>();
    }

    public static <E> List<E> arrayList(E e0){
        List<E> list = new ArrayList<>();
        list.add(e0);
        return list;
    }

    public static <E> List<E> arrayList(E e0, E e1){
        List<E> list = new ArrayList<>();
        list.add(e0);
        list.add(e1);
        return list;
    }

    public static <E> List<E> arrayList(E e0, E e1, E e2){
        List<E> list = new ArrayList<>();
        list.add(e0);
        list.add(e1);
        list.add(e2);
        return list;
    }

    public static <E> List<E> arrayList(E e0, E e1, E e2, E e3){
        List<E> list = new ArrayList<>();
        list.add(e0);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        return list;
    }

    public static <E> List<E> arrayList(E e0, E e1, E e2, E e3, E e4){
        List<E> list = new ArrayList<>();
        list.add(e0);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        return list;
    }

    public static <E> List<E> arrayList(E e0, E e1, E e2, E e3, E e4, E e5){
        List<E> list = new ArrayList<>();
        list.add(e0);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        return list;
    }

    public static <E> List<E> arrayList(E e0, E e1, E e2, E e3, E e4, E e5, E e6){
        List<E> list = new ArrayList<>();
        list.add(e0);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        return list;
    }

    public static <E> List<E> arrayList(E e0, E e1, E e2, E e3, E e4, E e5, E e6, E e7){
        List<E> list = new ArrayList<>();
        list.add(e0);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        return list;
    }
    @SafeVarargs
    public static <E> List<E> arrayList(E e0, E e1, E e2, E e3, E e4, E e5, E e6, E e7, E... es){
        List<E> list = new ArrayList<>();
        list.add(e0);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        for(E e : es){
            list.add(e);
        }
        return list;
    }

    public static <E> Set<E> set(){
        return Collections.emptySet();
    }

    public static <E> Set<E> set(E e0){
        Set<E> set = new LinkedHashSet<>();
        set.add(e0);
        return Collections.unmodifiableSet(set);
    }

    public static <E> Set<E> set(E e0, E e1){
        Set<E> set = new LinkedHashSet<>();
        set.add(e0);
        set.add(e1);
        return Collections.unmodifiableSet(set);
    }

    public static <E> Set<E> set(E e0, E e1, E e2){
        Set<E> set = new LinkedHashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        return Collections.unmodifiableSet(set);
    }

    public static <E> Set<E> set(E e0, E e1, E e2, E e3){
        Set<E> set = new LinkedHashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        return Collections.unmodifiableSet(set);
    }

    public static <E> Set<E> set(E e0, E e1, E e2, E e3, E e4){
        Set<E> set = new LinkedHashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        return Collections.unmodifiableSet(set);
    }

    public static <E> Set<E> set(E e0, E e1, E e2, E e3, E e4, E e5){
        Set<E> set = new LinkedHashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        return Collections.unmodifiableSet(set);
    }

    public static <E> Set<E> set(E e0, E e1, E e2, E e3, E e4, E e5, E e6){
        Set<E> set = new LinkedHashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        return Collections.unmodifiableSet(set);
    }

    public static <E> Set<E> set(E e0, E e1, E e2, E e3, E e4, E e5, E e6, E e7){
        Set<E> set = new LinkedHashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        set.add(e7);
        return Collections.unmodifiableSet(set);
    }

    @SafeVarargs
    public static <E> Set<E> set(E e0, E e1, E e2, E e3, E e4, E e5, E e6, E e7, E... es){
        Set<E> set = new LinkedHashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        set.add(e7);
        for(E e : es){
            set.add(e);
        }
        return Collections.unmodifiableSet(set);
    }

    public static <E> Set<E> hashSet(){
        return new HashSet<>();
    }

    public static <E> Set<E> hashSet(E e0){
        Set<E> set = new HashSet<>();
        set.add(e0);
        return set;
    }

    public static <E> Set<E> hashSet(E e0, E e1){
        Set<E> set = new HashSet<>();
        set.add(e0);
        set.add(e1);
        return set;
    }

    public static <E> Set<E> hashSet(E e0, E e1, E e2){
        Set<E> set = new HashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        return set;
    }

    public static <E> Set<E> hashSet(E e0, E e1, E e2, E e3){
        Set<E> set = new HashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        return set;
    }

    public static <E> Set<E> hashSet(E e0, E e1, E e2, E e3, E e4){
        Set<E> set = new HashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        return set;
    }

    public static <E> Set<E> hashSet(E e0, E e1, E e2, E e3, E e4, E e5){
        Set<E> set = new HashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        return set;
    }

    public static <E> Set<E> hashSet(E e0, E e1, E e2, E e3, E e4, E e5, E e6){
        Set<E> set = new HashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        return set;
    }

    public static <E> Set<E> hashSet(E e0, E e1, E e2, E e3, E e4, E e5, E e6, E e7){
        Set<E> set = new HashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        set.add(e7);
        return set;
    }

    @SafeVarargs
    public static <E> Set<E> hashSet(E e0, E e1, E e2, E e3, E e4, E e5, E e6, E e7, E... es){
        Set<E> set = new HashSet<>();
        set.add(e0);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);
        set.add(e7);
        Collections.addAll(set, es);
        return set;
    }

    public static <K, V> Map<K, V> map(){
        return Collections.emptyMap();
    }

    public static <K, V> Map<K, V> map(K key0, V value0){
        return Collections.singletonMap(key0, value0);
    }


    public static <K, V> Map<K, V> map(K key0, V value0, K key1, V value1){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> map(K key0, V value0, K key1, V value1, K key2, V value2){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> map(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> map(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        map.put(key4, value4);
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> map(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4, K key5, V value5){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        map.put(key4, value4);
        map.put(key5, value5);
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> map(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4, K key5, V value5, K key6, V value6){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        map.put(key4, value4);
        map.put(key5, value5);
        map.put(key6, value6);
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> map(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4, K key5, V value5, K key6, V value6, K key7, V value7){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        map.put(key4, value4);
        map.put(key5, value5);
        map.put(key6, value6);
        map.put(key7, value7);
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> hashMap(){
        return  new HashMap<>();
    }

    public static <K, V> Map<K, V> hashMap(K key0, V value0){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        return map;
    }

    public static <K, V> Map<K, V> hashMap(K key0, V value0, K key1, V value1){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        return map;
    }

    public static <K, V> Map<K, V> hashMap(K key0, V value0, K key1, V value1, K key2, V value2){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        return map;
    }

    public static <K, V> Map<K, V> hashMap(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        return map;
    }

    public static <K, V> Map<K, V> hashMap(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        map.put(key4, value4);
        return map;
    }

    public static <K, V> Map<K, V> hashMap(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4, K key5, V value5){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        map.put(key4, value4);
        map.put(key5, value5);
        return map;
    }

    public static <K, V> Map<K, V> hashMap(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4, K key5, V value5, K key6, V value6){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        map.put(key4, value4);
        map.put(key5, value5);
        map.put(key6, value6);
        return map;
    }

    public static <K, V> Map<K, V> hashMap(K key0, V value0, K key1, V value1, K key2, V value2, K key3, V value3, K key4, V value4, K key5, V value5, K key6, V value6, K key7, V value7){
        Map<K, V> map = new HashMap<>();
        map.put(key0, value0);
        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);
        map.put(key4, value4);
        map.put(key5, value5);
        map.put(key6, value6);
        map.put(key7, value7);
        return map;
    }

    public static <K, V> Map.Entry<K, V> entry(K key, V value){
        return new AbstractMap.SimpleImmutableEntry<>(key, value);
    }

    public static <K, V> Map<K, V> mapOfEntries(){
        return Collections.emptyMap();
    }


    public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e0, Map.Entry<K, V> e1){
        Map<K, V> map = new HashMap<>();
        map.put(e0.getKey(), e0.getValue());
        map.put(e1.getKey(), e1.getValue());
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e0, Map.Entry<K, V> e1, Map.Entry<K, V> e2){
        Map<K, V> map = new HashMap<>();
        map.put(e0.getKey(), e0.getValue());
        map.put(e1.getKey(), e1.getValue());
        map.put(e2.getKey(), e2.getValue());
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e0, Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3){
        Map<K, V> map = new HashMap<>();
        map.put(e0.getKey(), e0.getValue());
        map.put(e1.getKey(), e1.getValue());
        map.put(e2.getKey(), e2.getValue());
        map.put(e3.getKey(), e3.getValue());
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e0, Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3, Map.Entry<K, V> e4){
        Map<K, V> map = new HashMap<>();
        map.put(e0.getKey(), e0.getValue());
        map.put(e1.getKey(), e1.getValue());
        map.put(e2.getKey(), e2.getValue());
        map.put(e3.getKey(), e3.getValue());
        map.put(e4.getKey(), e4.getValue());
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e0, Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3, Map.Entry<K, V> e4, Map.Entry<K, V> e5){
        Map<K, V> map = new HashMap<>();
        map.put(e0.getKey(), e0.getValue());
        map.put(e1.getKey(), e1.getValue());
        map.put(e2.getKey(), e2.getValue());
        map.put(e3.getKey(), e3.getValue());
        map.put(e4.getKey(), e4.getValue());
        map.put(e5.getKey(), e5.getValue());
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e0, Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3, Map.Entry<K, V> e4, Map.Entry<K, V> e5, Map.Entry<K, V> e6){
        Map<K, V> map = new HashMap<>();
        map.put(e0.getKey(), e0.getValue());
        map.put(e1.getKey(), e1.getValue());
        map.put(e2.getKey(), e2.getValue());
        map.put(e3.getKey(), e3.getValue());
        map.put(e4.getKey(), e4.getValue());
        map.put(e5.getKey(), e5.getValue());
        map.put(e6.getKey(), e6.getValue());
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e0, Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3, Map.Entry<K, V> e4, Map.Entry<K, V> e5, Map.Entry<K, V> e6, Map.Entry<K, V> e7){
        Map<K, V> map = new HashMap<>();
        map.put(e0.getKey(), e0.getValue());
        map.put(e1.getKey(), e1.getValue());
        map.put(e2.getKey(), e2.getValue());
        map.put(e3.getKey(), e3.getValue());
        map.put(e4.getKey(), e4.getValue());
        map.put(e5.getKey(), e5.getValue());
        map.put(e6.getKey(), e6.getValue());
        map.put(e7.getKey(), e7.getValue());
        return Collections.unmodifiableMap(map);
    }

    @SafeVarargs
    public static <K, V> Map<K, V> mapOfEntries(Map.Entry<K, V> e0, Map.Entry<K, V> e1, Map.Entry<K, V> e2, Map.Entry<K, V> e3, Map.Entry<K, V> e4, Map.Entry<K, V> e5, Map.Entry<K, V> e6, Map.Entry<K, V> e7, Map.Entry<K, V>... es){
        Map<K, V> map = new HashMap<>();
        map.put(e0.getKey(), e0.getValue());
        map.put(e1.getKey(), e1.getValue());
        map.put(e2.getKey(), e2.getValue());
        map.put(e3.getKey(), e3.getValue());
        map.put(e4.getKey(), e4.getValue());
        map.put(e5.getKey(), e5.getValue());
        map.put(e6.getKey(), e6.getValue());
        map.put(e7.getKey(), e7.getValue());
        for(Map.Entry<K, V> e : es){
            map.put(e.getKey(), e.getValue());
        }
        return Collections.unmodifiableMap(map);
    }

    public static Calendar calendar(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond, TimeZone timeZone, Locale locale){
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar;
    }

    public static Calendar calendar1(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond, TimeZone timeZone, Locale locale){
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar;
    }

    public static Calendar calendar(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, TimeZone timeZone, Locale locale){
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

    public static Calendar calendar1(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, TimeZone timeZone, Locale locale){
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

    public static Calendar calendarUTC(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond, Locale locale){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar;
    }

    public static Calendar calendar1UTC(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond, Locale locale){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar;
    }

    public static Calendar calendarUTC(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, Locale locale){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

    public static Calendar calendar1UTC(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, Locale locale){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

    public static Calendar calendarUTCEN(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar;
    }

    public static Calendar calendar1UTCEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar;
    }

    public static Calendar calendarUTCEN(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

    public static Calendar calendar1UTCEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

    public static Date date(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond, TimeZone timeZone, Locale locale){
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
    }

    public static Date date1(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond, TimeZone timeZone, Locale locale){
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
    }

    public static Date date(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, TimeZone timeZone, Locale locale){
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date date1(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, TimeZone timeZone, Locale locale){
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date dateUTC(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond, Locale locale){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
    }

    public static Date date1UTC(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond, Locale locale){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
    }

    public static Date dateUTC(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, Locale locale){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date date1UTC(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, Locale locale){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, locale);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date dateUTCEN(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
    }

    public static Date date1UTCEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        return calendar.getTime();
    }

    public static Date dateUTCEN(int year, int month0, int dayOfMonth, int hourOfDay, int minute, int second){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month0);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date date1UTCEN(int year, int monthBase1, int dayOfMonth, int hourOfDay, int minute, int second){
        Calendar calendar = Calendar.getInstance(UTC_TIME_ZONE, Locale.ENGLISH);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthBase1 - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }


}
