package defpackage;

/* JADX INFO: renamed from: lَؒؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0950l extends AbstractC7444l {
    public final double admob;
    public final int isPro;
    public final InterfaceC14665l subs;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0950l(double d, int i, int i2) {
        this(d, C8070l.crashlytics, (i2 & 4) != 0 ? 0 : i);
        InterfaceC14665l.loadAd.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0950l)) {
            return false;
        }
        C0950l c0950l = (C0950l) obj;
        return Double.compare(this.admob, c0950l.admob) == 0 && AbstractC8576l.yandex(this.subs, c0950l.subs) && this.isPro == c0950l.isPro;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.admob);
        return ((this.subs.hashCode() + (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31)) * 31) + this.isPro;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(quality=");
        sb.append(this.admob);
        sb.append(", parameters=");
        sb.append(this.subs);
        sb.append(", segmentIncrement=");
        return AbstractC0653l.adcel(sb, this.isPro, ')');
    }

    public C0950l(double d, InterfaceC14665l interfaceC14665l, int i) {
        this.admob = d;
        this.subs = interfaceC14665l;
        this.isPro = i;
    }
}
