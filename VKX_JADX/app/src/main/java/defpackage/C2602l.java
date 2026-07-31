package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: lْؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2602l {
    public static final LinkedHashSet amazon;
    public static final LinkedHashSet billing;
    public static final LinkedHashSet crashlytics;
    public static final LinkedHashSet loadAd;
    public static final LinkedHashSet mopub;
    public static final LinkedHashSet purchase;
    public static final LinkedHashSet yandex = AbstractC9905l.admob(C6168l.license("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    static {
        List<EnumC17708l> listRemoteconfig = AbstractC14055l.remoteconfig(EnumC17708l.BOOLEAN, EnumC17708l.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC17708l enumC17708l : listRemoteconfig) {
            C2312l c2312l = enumC17708l.f34523l;
            if (c2312l == null) {
                EnumC17708l.yandex(15);
                throw null;
            }
            String strLoadAd = c2312l.yandex.mopub().loadAd();
            String[] strArr = {enumC17708l.f34521l + "Value()" + enumC17708l.f34520l};
            String strConcat = "java/lang/".concat(strLoadAd);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str : strArr2) {
                linkedHashSet2.add(strConcat + '.' + str);
            }
            AbstractC3984l.license(linkedHashSet, linkedHashSet2);
        }
        loadAd = AbstractC9905l.mopub(AbstractC9905l.mopub(AbstractC9905l.mopub(AbstractC9905l.mopub(AbstractC9905l.mopub(AbstractC9905l.mopub(linkedHashSet, C6168l.license("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), C6168l.Signature("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C6168l.Signature("Double", "isInfinite()Z", "isNaN()Z")), C6168l.Signature("Float", "isInfinite()Z", "isNaN()Z")), C6168l.Signature("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C6168l.Signature("CharSequence", "isEmpty()Z"));
        crashlytics = C6168l.license("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        amazon = AbstractC9905l.mopub(AbstractC9905l.mopub(AbstractC9905l.mopub(AbstractC9905l.mopub(AbstractC9905l.mopub(AbstractC9905l.mopub(C6168l.Signature("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C6168l.license("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C6168l.Signature("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C6168l.Signature("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C6168l.license("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C6168l.license("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C6168l.license("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        purchase = AbstractC9905l.mopub(AbstractC9905l.mopub(C6168l.license("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C6168l.license("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C6168l.license("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC17708l enumC17708l2 = EnumC17708l.BYTE;
        List listRemoteconfig2 = AbstractC14055l.remoteconfig(EnumC17708l.BOOLEAN, enumC17708l2, EnumC17708l.DOUBLE, EnumC17708l.FLOAT, enumC17708l2, EnumC17708l.INT, EnumC17708l.LONG, EnumC17708l.SHORT);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = listRemoteconfig2.iterator();
        while (it.hasNext()) {
            C2312l c2312l2 = ((EnumC17708l) it.next()).f34523l;
            if (c2312l2 == null) {
                EnumC17708l.yandex(15);
                throw null;
            }
            String strLoadAd2 = c2312l2.yandex.mopub().loadAd();
            String[] strArrSmaato = C6168l.smaato("Ljava/lang/String;");
            AbstractC3984l.license(linkedHashSet3, C6168l.Signature(strLoadAd2, (String[]) Arrays.copyOf(strArrSmaato, strArrSmaato.length)));
        }
        String[] strArrSmaato2 = C6168l.smaato("D");
        LinkedHashSet linkedHashSetMopub = AbstractC9905l.mopub(linkedHashSet3, C6168l.Signature("Float", (String[]) Arrays.copyOf(strArrSmaato2, strArrSmaato2.length)));
        String[] strArrSmaato3 = C6168l.smaato("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        billing = AbstractC9905l.mopub(linkedHashSetMopub, C6168l.Signature("String", (String[]) Arrays.copyOf(strArrSmaato3, strArrSmaato3.length)));
        String[] strArrSmaato4 = C6168l.smaato("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        mopub = C6168l.Signature("Throwable", (String[]) Arrays.copyOf(strArrSmaato4, strArrSmaato4.length));
    }
}
