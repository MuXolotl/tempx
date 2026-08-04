package defpackage;

/* JADX INFO: renamed from: lؘؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5371l {
    public final /* synthetic */ EnumC7283l loadAd;
    public final /* synthetic */ C15237l yandex;

    public C5371l(C15237l c15237l, EnumC7283l enumC7283l) {
        this.yandex = c15237l;
        this.loadAd = enumC7283l;
    }

    public final long crashlytics() {
        int i = this.yandex.startapp;
        int iOrdinal = this.loadAd.ordinal();
        if (iOrdinal == 0) {
            return AbstractC14707l.loadAd(0, i);
        }
        if (iOrdinal == 1) {
            return AbstractC14707l.loadAd(i, 0);
        }
        C18725l.billing();
        return 0L;
    }

    public final long loadAd() {
        int i = this.yandex.metrica;
        int iOrdinal = this.loadAd.ordinal();
        if (iOrdinal == 0) {
            return AbstractC3383l.crashlytics(0, i);
        }
        if (iOrdinal == 1) {
            return AbstractC3383l.crashlytics(i, 0);
        }
        C18725l.billing();
        return 0L;
    }

    public final int yandex() {
        return this.yandex.yandex;
    }
}
