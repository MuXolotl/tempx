package defpackage;

/* JADX INFO: renamed from: lؗٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4946l implements InterfaceC0218l {
    public abstract AbstractC4946l amazon(C14945l c14945l);

    public abstract boolean crashlytics();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4946l)) {
            return false;
        }
        AbstractC4946l abstractC4946l = (AbstractC4946l) obj;
        return crashlytics() == abstractC4946l.crashlytics() && yandex() == abstractC4946l.yandex() && loadAd().equals(abstractC4946l.loadAd());
    }

    public final int hashCode() {
        int iInmobi = AbstractC5020l.inmobi(yandex());
        if (AbstractC12008l.smaato(loadAd())) {
            return (iInmobi * 31) + 19;
        }
        return (iInmobi * 31) + (crashlytics() ? 17 : loadAd().hashCode());
    }

    public abstract AbstractC18041l loadAd();

    public final String toString() {
        if (crashlytics()) {
            return "*";
        }
        if (yandex() == 1) {
            return loadAd().toString();
        }
        return AbstractC12589l.m3423private(yandex()) + " " + loadAd();
    }

    public abstract int yandex();
}
