package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lَٝۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10444l extends AbstractC10759l {
    public static final Object admob;
    public static final C10444l mopub;
    public final C10475l billing;
    public final AbstractC1186l purchase;

    static {
        C9258l c9258l = AbstractC1186l.f3181l;
        mopub = new C10444l(C13708l.f26763l, null);
        admob = new Object();
    }

    public C10444l(AbstractC1186l abstractC1186l, C10475l c10475l) {
        this.purchase = abstractC1186l;
        this.billing = c10475l;
    }

    public final C10444l adcel(int i, List list) {
        C16971l c16971l = new C16971l(4);
        AbstractC1186l abstractC1186l = this.purchase;
        c16971l.amazon(abstractC1186l.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            c16971l.crashlytics(new C10475l((C2427l) list.get(i2), -1L, -9223372036854775807L));
        }
        c16971l.amazon(abstractC1186l.subList(i, abstractC1186l.size()));
        return new C10444l(c16971l.mopub(), this.billing);
    }

    @Override // defpackage.AbstractC10759l
    public final int admob() {
        return metrica();
    }

    public final long ads(int i) {
        if (i < 0) {
            return -1L;
        }
        AbstractC1186l abstractC1186l = this.purchase;
        if (i < abstractC1186l.size()) {
            return ((C10475l) abstractC1186l.get(i)).loadAd;
        }
        return -1L;
    }

    @Override // defpackage.AbstractC10759l
    public final C3904l billing(int i, C3904l c3904l, boolean z) {
        C10475l c10475lSubscription = subscription(i);
        Long lValueOf = Long.valueOf(c10475lSubscription.loadAd);
        long jM3962continue = AbstractC15323l.m3962continue(c10475lSubscription.crashlytics);
        c3904l.getClass();
        c3904l.subs(lValueOf, null, i, jM3962continue, 0L, C12869l.billing, false);
        return c3904l;
    }

    @Override // defpackage.AbstractC10759l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10444l)) {
            return false;
        }
        C10444l c10444l = (C10444l) obj;
        return Objects.equals(this.purchase, c10444l.purchase) && Objects.equals(this.billing, c10444l.billing);
    }

    @Override // defpackage.AbstractC10759l
    public final int hashCode() {
        return Objects.hash(this.purchase, this.billing);
    }

    @Override // defpackage.AbstractC10759l
    public final int loadAd(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC10759l
    public final int metrica() {
        return this.purchase.size() + (this.billing == null ? 0 : 1);
    }

    @Override // defpackage.AbstractC10759l
    public final C4322l remoteconfig(int i, C4322l c4322l, long j) {
        C10475l c10475lSubscription = subscription(i);
        c4322l.loadAd(admob, c10475lSubscription.yandex, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, AbstractC15323l.m3962continue(c10475lSubscription.crashlytics), i, i, 0L);
        return c4322l;
    }

    @Override // defpackage.AbstractC10759l
    public final Object smaato(int i) {
        throw new UnsupportedOperationException();
    }

    public final C10475l subscription(int i) {
        C10475l c10475l;
        AbstractC1186l abstractC1186l = this.purchase;
        return (i != abstractC1186l.size() || (c10475l = this.billing) == null) ? (C10475l) abstractC1186l.get(i) : c10475l;
    }
}
