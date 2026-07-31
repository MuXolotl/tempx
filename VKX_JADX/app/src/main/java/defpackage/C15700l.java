package defpackage;

/* JADX INFO: renamed from: lٕٕٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15700l {
    public final C15308l yandex = new C15308l(0);
    public final C15308l loadAd = new C15308l(0);
    public final C10086l crashlytics = AbstractC8020l.smaato(AbstractC15038l.crashlytics(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535));
    public final C10086l amazon = AbstractC8020l.smaato(Boolean.FALSE);

    public final C5587l amazon(C6956l c6956l) {
        return AbstractC14760l.loadAd(0.0f, yandex(c6956l), 7);
    }

    public final float crashlytics(C6956l c6956l) {
        return ((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo872static(this.yandex.admob());
    }

    public final C17253l loadAd(C6956l c6956l) {
        return AbstractC3605l.amazon(0.0f, 0.0f, 0.0f, yandex(c6956l), 7);
    }

    public final C5587l purchase(C6956l c6956l) {
        return AbstractC14760l.loadAd(crashlytics(c6956l), 0.0f, 13);
    }

    public final float yandex(C6956l c6956l) {
        return ((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo872static(this.loadAd.admob());
    }
}
