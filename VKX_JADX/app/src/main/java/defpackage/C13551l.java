package defpackage;

/* JADX INFO: renamed from: lْٞۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13551l {
    public long admob;
    public final long amazon;
    public float billing;
    public final C14169l crashlytics;
    public C13507l isPro;
    public final C10086l loadAd;
    public float mopub;
    public long purchase;
    public long subs;
    public final C10086l yandex;

    public C13551l() {
        Boolean bool = Boolean.FALSE;
        this.yandex = AbstractC8020l.smaato(bool);
        this.loadAd = AbstractC8020l.smaato(bool);
        this.crashlytics = new C14169l(4);
        this.amazon = AbstractC18114l.yandex();
        this.purchase = C9735l.isPro;
        this.billing = 1.0f;
        this.mopub = 1.0f;
        this.admob = C1723l.loadAd;
        this.subs = 0L;
    }

    public final void crashlytics(boolean z) {
        C10086l c10086l = this.yandex;
        boolean zBooleanValue = ((Boolean) c10086l.getValue()).booleanValue();
        C10086l c10086l2 = this.loadAd;
        if (zBooleanValue && !z) {
            c10086l2.setValue(Boolean.TRUE);
        } else if (z) {
            c10086l2.setValue(Boolean.FALSE);
        }
        c10086l.setValue(Boolean.valueOf(z));
    }

    public final boolean loadAd() {
        return ((Boolean) this.yandex.getValue()).booleanValue();
    }

    public final boolean yandex() {
        return ((Boolean) this.loadAd.getValue()).booleanValue();
    }
}
