package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًؘؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5376l extends AbstractC15096l implements InterfaceC3488l {
    public final String loadAd;

    public C5376l(String str) {
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5376l) && AbstractC8576l.yandex(this.loadAd, ((C5376l) obj).loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode();
    }

    @Override // defpackage.AbstractC15096l
    public final AbstractC7444l mopub(C5740l c5740l, int i) {
        List list = (List) c5740l.f12126l;
        return (i >= list.size() || !AbstractC8576l.yandex(list.get(i), this.loadAd)) ? AbstractC7444l.yandex : AbstractC7444l.billing;
    }

    public final String toString() {
        return this.loadAd;
    }
}
