package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lَٔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10298l extends AbstractC16808l {
    public static final Object admob = new Object();
    public final Object billing;
    public final Object mopub;

    public C10298l(AbstractC10759l abstractC10759l, Object obj, Object obj2) {
        super(abstractC10759l);
        this.billing = obj;
        this.mopub = obj2;
    }

    @Override // defpackage.AbstractC16808l, defpackage.AbstractC10759l
    public final C3904l billing(int i, C3904l c3904l, boolean z) {
        this.purchase.billing(i, c3904l, z);
        if (Objects.equals(c3904l.loadAd, this.mopub) && z) {
            c3904l.loadAd = admob;
        }
        return c3904l;
    }

    @Override // defpackage.AbstractC16808l, defpackage.AbstractC10759l
    public final int loadAd(Object obj) {
        Object obj2;
        if (admob == obj && (obj2 = this.mopub) != null) {
            obj = obj2;
        }
        return this.purchase.loadAd(obj);
    }

    @Override // defpackage.AbstractC16808l, defpackage.AbstractC10759l
    public final C4322l remoteconfig(int i, C4322l c4322l, long j) {
        this.purchase.remoteconfig(i, c4322l, j);
        if (Objects.equals(c4322l.yandex, this.billing)) {
            c4322l.yandex = C4322l.adcel;
        }
        return c4322l;
    }

    @Override // defpackage.AbstractC16808l, defpackage.AbstractC10759l
    public final Object smaato(int i) {
        Object objSmaato = this.purchase.smaato(i);
        return Objects.equals(objSmaato, this.mopub) ? admob : objSmaato;
    }
}
