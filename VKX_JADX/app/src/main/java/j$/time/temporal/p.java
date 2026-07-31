package j$.time.temporal;

import j$.time.DateTimeException;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    public static final j$.time.f a = new j$.time.f(7);
    public static final j$.time.f b = new j$.time.f(8);
    public static final j$.time.f c = new j$.time.f(9);
    public static final j$.time.f d = new j$.time.f(10);
    public static final j$.time.f e = new j$.time.f(11);
    public static final j$.time.f f = new j$.time.f(12);
    public static final j$.time.f g = new j$.time.f(13);

    public static int a(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        s sVarL = temporalAccessor.l(temporalField);
        if (!sVarL.d()) {
            throw new r("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long jC = temporalAccessor.C(temporalField);
        if (sVarL.e(jC)) {
            return (int) jC;
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + sVarL + "): " + jC);
    }

    public static l b(l lVar, long j, q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            lVar = lVar.d(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return lVar.d(j2, qVar);
    }

    public static Object c(TemporalAccessor temporalAccessor, TemporalQuery temporalQuery) {
        if (temporalQuery == a || temporalQuery == b || temporalQuery == c) {
            return null;
        }
        return temporalQuery.queryFrom(temporalAccessor);
    }

    public static s d(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.a(temporalField, "field");
            return temporalField.k(temporalAccessor);
        }
        if (temporalAccessor.e(temporalField)) {
            return ((ChronoField) temporalField).b;
        }
        throw new r(j$.time.b.a("Unsupported field: ", temporalField));
    }

    public static /* synthetic */ int e(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }
}
