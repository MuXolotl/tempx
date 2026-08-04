package defpackage;

/* JADX INFO: renamed from: lٓٔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14152l {
    public final Long crashlytics;
    public final Long loadAd;
    public final Long yandex;

    static {
        AbstractC18202l.yandex.loadAd(C14152l.class);
        try {
            AbstractC18202l.yandex(C14152l.class);
        } catch (Throwable unused) {
        }
        if (AbstractC12024l.m3315catch("TimeoutConfiguration")) {
            C8339l.metrica("Name can't be blank");
        }
    }

    public C14152l() {
        this.yandex = 0L;
        this.loadAd = 0L;
        this.crashlytics = 0L;
        this.yandex = null;
        this.loadAd = null;
        this.crashlytics = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14152l.class != obj.getClass()) {
            return false;
        }
        C14152l c14152l = (C14152l) obj;
        return AbstractC8576l.yandex(this.yandex, c14152l.yandex) && AbstractC8576l.yandex(this.loadAd, c14152l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c14152l.crashlytics);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        Long l = this.yandex;
        if (l != null) {
            long jLongValue = l.longValue();
            i = (int) (jLongValue ^ (jLongValue >>> 32));
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Long l2 = this.loadAd;
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            i2 = (int) (jLongValue2 ^ (jLongValue2 >>> 32));
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Long l3 = this.crashlytics;
        if (l3 != null) {
            long jLongValue3 = l3.longValue();
            i3 = (int) ((jLongValue3 >>> 32) ^ jLongValue3);
        }
        return i5 + i3;
    }
}
