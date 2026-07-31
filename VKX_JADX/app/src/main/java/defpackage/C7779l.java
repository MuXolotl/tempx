package defpackage;

/* JADX INFO: renamed from: lًؕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7779l extends AbstractC17195l {
    public final C10086l crashlytics = AbstractC8020l.smaato(null);
    public final C5138l loadAd;

    public C7779l(C5138l c5138l) {
        this.loadAd = c5138l;
    }

    @Override // defpackage.AbstractC17195l
    public final Object billing(C5138l c5138l) {
        if (c5138l != this.loadAd) {
            AbstractC0081l.crashlytics("Check failed.");
        }
        Object value = this.crashlytics.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // defpackage.AbstractC17195l
    public final boolean crashlytics(C5138l c5138l) {
        return c5138l == this.loadAd;
    }

    public final void smaato(C5138l c5138l, Object obj) {
        if (c5138l != this.loadAd) {
            AbstractC0081l.crashlytics("Check failed.");
        }
        this.crashlytics.setValue(obj);
    }
}
