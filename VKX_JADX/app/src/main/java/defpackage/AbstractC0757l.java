package defpackage;

/* JADX INFO: renamed from: lؒؐٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0757l {
    public final Object yandex;

    public AbstractC0757l(Object obj) {
        this.yandex = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objLoadAd = loadAd();
        AbstractC0757l abstractC0757l = obj instanceof AbstractC0757l ? (AbstractC0757l) obj : null;
        return AbstractC8576l.yandex(objLoadAd, abstractC0757l != null ? abstractC0757l.loadAd() : null);
    }

    public final int hashCode() {
        Object objLoadAd = loadAd();
        if (objLoadAd != null) {
            return objLoadAd.hashCode();
        }
        return 0;
    }

    public Object loadAd() {
        return this.yandex;
    }

    public String toString() {
        return String.valueOf(loadAd());
    }

    public abstract AbstractC18041l yandex(InterfaceC11865l interfaceC11865l);
}
