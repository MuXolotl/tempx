package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lٕٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14490l {
    public static final LinkedHashMap amazon;
    public static final C9217l crashlytics;
    public static final C9217l loadAd;
    public static final C9217l yandex = new C9217l(EnumC10249l.f20872l, false);

    static {
        EnumC10249l enumC10249l = EnumC10249l.f20871l;
        loadAd = new C9217l(enumC10249l, false);
        crashlytics = new C9217l(enumC10249l, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        C5183l c5183l = new C5183l(2);
        new C18396l(c5183l, "java/util/".concat("Iterator"), false, 20).pro("forEachRemaining", null, new C17264l(strConcat4, 0));
        new C18396l(c5183l, "java/lang/".concat("Iterable"), false, 20).pro("spliterator", null, new C2911l(14));
        C18396l c18396l = new C18396l(c5183l, "java/util/".concat("Collection"), false, 20);
        c18396l.pro("removeIf", null, new C17264l(strConcat2, 17));
        c18396l.pro("stream", null, new C17264l(strConcat8, 26));
        c18396l.pro("parallelStream", null, new C13333l(strConcat8, 1));
        C18396l c18396l2 = new C18396l(c5183l, "java/util/".concat("List"), false, 20);
        c18396l2.pro("replaceAll", null, new C13333l(strConcat7, 2));
        c18396l2.pro("addFirst", "2.1", new C13333l(strConcat, 3));
        c18396l2.pro("addLast", "2.1", new C13333l(strConcat, 4));
        c18396l2.pro("removeFirst", "2.1", new C13333l(strConcat, 5));
        c18396l2.pro("removeLast", "2.1", new C13333l(strConcat, 6));
        C18396l c18396l3 = new C18396l(c5183l, "java/util/".concat("LinkedList"), false, 20);
        c18396l3.pro("addFirst", "2.1", new C17264l(strConcat, 1));
        c18396l3.pro("addLast", "2.1", new C17264l(strConcat, 2));
        c18396l3.pro("removeFirst", "2.1", new C17264l(strConcat, 3));
        c18396l3.pro("removeLast", "2.1", new C17264l(strConcat, 4));
        C18396l c18396l4 = new C18396l(c5183l, "java/util/".concat("LinkedHashSet"), false, 20);
        c18396l4.pro("addFirst", "2.2", new C17264l(strConcat, 5));
        c18396l4.pro("addLast", "2.2", new C17264l(strConcat, 6));
        c18396l4.pro("removeFirst", "2.2", new C17264l(strConcat, 7));
        c18396l4.pro("removeLast", "2.2", new C17264l(strConcat, 8));
        c18396l4.pro("getFirst", "2.2", new C17264l(strConcat, 9));
        c18396l4.pro("getLast", "2.2", new C17264l(strConcat, 10));
        C18396l c18396l5 = new C18396l(c5183l, "java/util/".concat("Map"), false, 20);
        c18396l5.pro("forEach", null, new C17264l(strConcat6, 11));
        c18396l5.pro("putIfAbsent", null, new C17264l(strConcat, 12));
        c18396l5.pro("replace", null, new C17264l(strConcat, 13));
        c18396l5.pro("replace", null, new C17264l(strConcat, 14));
        c18396l5.pro("replaceAll", null, new C17264l(strConcat5, 15));
        c18396l5.pro("compute", null, new C0423l(strConcat, 0, strConcat5));
        c18396l5.pro("computeIfAbsent", null, new C0423l(strConcat, 1, strConcat3));
        c18396l5.pro("computeIfPresent", null, new C0423l(strConcat, 2, strConcat5));
        c18396l5.pro("merge", null, new C0423l(strConcat, 3, strConcat5));
        C18396l c18396l6 = new C18396l(c5183l, "java/util/".concat("LinkedHashMap"), false, 20);
        c18396l6.pro("putFirst", "2.2", new C17264l(strConcat, 16));
        c18396l6.pro("putLast", "2.2", new C17264l(strConcat, 18));
        C18396l c18396l7 = new C18396l(c5183l, strConcat9, false, 20);
        c18396l7.pro("empty", null, new C17264l(strConcat9, 19));
        c18396l7.pro("of", null, new C0423l(strConcat, 4, strConcat9));
        c18396l7.pro("ofNullable", null, new C0423l(strConcat, 5, strConcat9));
        int i = 20;
        c18396l7.pro("get", null, new C17264l(strConcat, 20));
        c18396l7.pro("ifPresent", null, new C17264l(strConcat4, 21));
        boolean z = false;
        new C18396l(c5183l, "java/lang/".concat("ref/Reference"), z, i).pro("get", null, new C17264l(strConcat, 22));
        new C18396l(c5183l, strConcat2, z, i).pro("test", null, new C17264l(strConcat, 23));
        new C18396l(c5183l, "java/util/function/".concat("BiPredicate"), z, i).pro("test", null, new C17264l(strConcat, 24));
        new C18396l(c5183l, strConcat4, z, i).pro("accept", null, new C17264l(strConcat, 25));
        new C18396l(c5183l, strConcat6, z, i).pro("accept", null, new C17264l(strConcat, 27));
        new C18396l(c5183l, strConcat3, z, i).pro("apply", null, new C17264l(strConcat, 28));
        new C18396l(c5183l, strConcat5, z, i).pro("apply", null, new C17264l(strConcat, 29));
        new C18396l(c5183l, "java/util/function/".concat("Supplier"), z, i).pro("get", null, new C13333l(strConcat, 0));
        amazon = c5183l.yandex;
    }
}
