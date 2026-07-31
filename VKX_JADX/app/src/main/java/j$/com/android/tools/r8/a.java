package j$.com.android.tools.r8;

import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.e0;
import j$.time.chrono.j;
import j$.time.chrono.k;
import j$.time.chrono.m;
import j$.time.chrono.q;
import j$.time.chrono.t;
import j$.time.chrono.y;
import j$.time.d;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.a0;
import j$.util.b0;
import j$.util.c0;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.d0;
import j$.util.function.b;
import j$.util.function.f;
import j$.util.function.g;
import j$.util.h0;
import j$.util.l0;
import j$.util.s1;
import j$.util.t0;
import j$.util.w0;
import j$.util.x;
import j$.util.z;
import j$.util.z0;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static long A(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.f().toEpochDay() * 86400) + ((long) chronoZonedDateTime.b().Y())) - ((long) chronoZonedDateTime.g().getTotalSeconds());
    }

    public static boolean B(t0 t0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return t0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (s1.a) {
            s1.a(t0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return t0Var.tryAdvance((DoubleConsumer) new d0(consumer, 0));
    }

    public static boolean C(w0 w0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return w0Var.tryAdvance((IntConsumer) consumer);
        }
        if (s1.a) {
            s1.a(w0Var.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return w0Var.tryAdvance((IntConsumer) new h0(consumer, 0));
    }

    public static boolean D(z0 z0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return z0Var.tryAdvance((LongConsumer) consumer);
        }
        if (s1.a) {
            s1.a(z0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return z0Var.tryAdvance((LongConsumer) new l0(consumer, 0));
    }

    public static String E(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String F(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static z G(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? new z(optional.get()) : z.b;
    }

    public static a0 H(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? new a0(optionalDouble.getAsDouble()) : a0.c;
    }

    public static b0 I(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? new b0(optionalInt.getAsInt()) : b0.c;
    }

    public static c0 J(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? new c0(optionalLong.getAsLong()) : c0.c;
    }

    public static Optional K(z zVar) {
        if (zVar == null) {
            return null;
        }
        Object obj = zVar.a;
        if (obj == null) {
            return Optional.empty();
        }
        if (obj != null) {
            return Optional.of(obj);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalDouble L(a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        boolean z = a0Var.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(a0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt M(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        boolean z = b0Var.a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(b0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong N(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        boolean z = c0Var.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(c0Var.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static void O(Iterator it, Consumer consumer) {
        if (it instanceof x) {
            ((x) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static j P(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        j jVar = (j) temporalAccessor.E(p.b);
        q qVar = q.c;
        if (jVar != null) {
            return jVar;
        }
        Objects.a(qVar, "defaultObj");
        return qVar;
    }

    public static /* synthetic */ int Q(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long R(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ List S(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Map.Entry T(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ boolean U(Unsafe unsafe, Object obj, long j, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j2 = j;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j2, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j2) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j2;
            lVar = lVar2;
        }
    }

    public static /* synthetic */ long V(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long W(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long X(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long Y(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String Z(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static j$.time.temporal.l a(ChronoLocalDate chronoLocalDate, j$.time.temporal.l lVar) {
        return lVar.c(chronoLocalDate.toEpochDay(), ChronoField.EPOCH_DAY);
    }

    public static j a0(String str) {
        ConcurrentHashMap concurrentHashMap = j$.time.chrono.a.a;
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = j$.time.chrono.a.a;
            j jVar = (j) concurrentHashMap2.get(str);
            if (jVar == null) {
                jVar = (j) j$.time.chrono.a.b.get(str);
            }
            if (jVar != null) {
                return jVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (j jVar2 : ServiceLoader.load(j.class)) {
                    if (str.equals(jVar2.i()) || str.equals(jVar2.m())) {
                        return jVar2;
                    }
                }
                d.k("Unknown chronology: ".concat(str));
                return null;
            }
            m mVar = m.l;
            mVar.getClass();
            j$.time.chrono.a.l(mVar, "Hijrah-umalqura");
            t tVar = t.c;
            tVar.getClass();
            j$.time.chrono.a.l(tVar, "Japanese");
            y yVar = y.c;
            yVar.getClass();
            j$.time.chrono.a.l(yVar, "Minguo");
            e0 e0Var = e0.c;
            e0Var.getClass();
            j$.time.chrono.a.l(e0Var, "ThaiBuddhist");
            try {
                for (j$.time.chrono.a aVar : Arrays.asList(new j$.time.chrono.a[0])) {
                    if (!aVar.i().equals("ISO")) {
                        j$.time.chrono.a.l(aVar, aVar.i());
                    }
                }
                q qVar = q.c;
                qVar.getClass();
                j$.time.chrono.a.l(qVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static g b(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 0);
    }

    public static j$.util.concurrent.t c(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new j$.util.concurrent.t(1, biConsumer, biConsumer2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b d(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.d(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f e(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.e(this, longConsumer3);
            }
        };
    }

    public static int f(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
        int iCompare = Long.compare(chronoLocalDate.toEpochDay(), chronoLocalDate2.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((j$.time.chrono.a) chronoLocalDate.a()).i().compareTo(chronoLocalDate2.a().i());
    }

    public static int g(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int iCompareTo = chronoLocalDateTime.f().compareTo(chronoLocalDateTime2.f());
        return (iCompareTo == 0 && (iCompareTo = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b())) == 0) ? ((j$.time.chrono.a) chronoLocalDateTime.a()).i().compareTo(chronoLocalDateTime2.a().i()) : iCompareTo;
    }

    public static int h(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = Long.compare(chronoZonedDateTime.M(), chronoZonedDateTime2.M());
        return (iCompare == 0 && (iCompare = chronoZonedDateTime.b().d - chronoZonedDateTime2.b().d) == 0 && (iCompare = chronoZonedDateTime.p().compareTo(chronoZonedDateTime2.p())) == 0 && (iCompare = chronoZonedDateTime.getZone().i().compareTo(chronoZonedDateTime2.getZone().i())) == 0) ? ((j$.time.chrono.a) chronoZonedDateTime.a()).i().compareTo(chronoZonedDateTime2.a().i()) : iCompare;
    }

    public static Object i(ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
        Object objApply;
        loop0: while (true) {
            Object objPutIfAbsent = concurrentMap.get(obj);
            do {
                objApply = biFunction.apply(obj, objPutIfAbsent);
                if (objApply != null) {
                    if (objPutIfAbsent == null) {
                        objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                    } else if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                        break;
                    }
                } else if (objPutIfAbsent == null || concurrentMap.remove(obj, objPutIfAbsent)) {
                    return null;
                }
            } while (objPutIfAbsent != null);
        }
        return objApply;
    }

    public static void j(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static void k(t0 t0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            t0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (s1.a) {
                s1.a(t0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            t0Var.forEachRemaining((DoubleConsumer) new d0(consumer, 0));
        }
    }

    public static void l(w0 w0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            w0Var.forEachRemaining((IntConsumer) consumer);
        } else {
            if (s1.a) {
                s1.a(w0Var.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            w0Var.forEachRemaining((IntConsumer) new h0(consumer, 0));
        }
    }

    public static void m(z0 z0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            z0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (s1.a) {
                s1.a(z0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            z0Var.forEachRemaining((LongConsumer) new l0(consumer, 0));
        }
    }

    public static int n(ChronoZonedDateTime chronoZonedDateTime, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return p.a(chronoZonedDateTime, temporalField);
        }
        int i = j$.time.chrono.g.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? chronoZonedDateTime.p().j(temporalField) : chronoZonedDateTime.g().getTotalSeconds();
        }
        throw new r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int o(k kVar, TemporalField temporalField) {
        return temporalField == ChronoField.ERA ? kVar.getValue() : p.a(kVar, temporalField);
    }

    public static long p(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static long q(k kVar, TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return kVar.getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new r(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return temporalField.y(kVar);
    }

    public static boolean r(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean s(ChronoLocalDate chronoLocalDate, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.j(chronoLocalDate);
    }

    public static boolean t(k kVar, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.j(kVar);
    }

    public static g u(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 1);
    }

    public static Object v(ChronoLocalDate chronoLocalDate, TemporalQuery temporalQuery) {
        if (temporalQuery == p.a || temporalQuery == p.e || temporalQuery == p.d || temporalQuery == p.g) {
            return null;
        }
        if (temporalQuery == p.b) {
            return chronoLocalDate.a();
        }
        return temporalQuery == p.c ? j$.time.temporal.a.DAYS : temporalQuery.queryFrom(chronoLocalDate);
    }

    public static Object w(ChronoLocalDateTime chronoLocalDateTime, TemporalQuery temporalQuery) {
        if (temporalQuery == p.a || temporalQuery == p.e || temporalQuery == p.d) {
            return null;
        }
        if (temporalQuery == p.g) {
            return chronoLocalDateTime.b();
        }
        if (temporalQuery == p.b) {
            return chronoLocalDateTime.a();
        }
        return temporalQuery == p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(chronoLocalDateTime);
    }

    public static Object x(ChronoZonedDateTime chronoZonedDateTime, TemporalQuery temporalQuery) {
        if (temporalQuery == p.e || temporalQuery == p.a) {
            return chronoZonedDateTime.getZone();
        }
        if (temporalQuery == p.d) {
            return chronoZonedDateTime.g();
        }
        if (temporalQuery == p.g) {
            return chronoZonedDateTime.b();
        }
        if (temporalQuery == p.b) {
            return chronoZonedDateTime.a();
        }
        return temporalQuery == p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(chronoZonedDateTime);
    }

    public static Object y(k kVar, TemporalQuery temporalQuery) {
        return temporalQuery == p.c ? j$.time.temporal.a.ERAS : p.c(kVar, temporalQuery);
    }

    public static long z(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((chronoLocalDateTime.f().toEpochDay() * 86400) + ((long) chronoLocalDateTime.b().Y())) - ((long) zoneOffset.getTotalSeconds());
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
