package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements k {
    public static final h0 BE;
    public static final h0 BEFORE_BE;
    public static final /* synthetic */ h0[] a;

    static {
        h0 h0Var = new h0("BEFORE_BE", 0);
        BEFORE_BE = h0Var;
        h0 h0Var2 = new h0("BE", 1);
        BE = h0Var2;
        a = new h0[]{h0Var, h0Var2};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long C(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.q(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object E(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.y(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.t(this, temporalField);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int j(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.o(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), ChronoField.ERA);
    }
}
