package defpackage;

/* JADX INFO: renamed from: lًۛۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8269l implements InterfaceC8850l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C5222l f17171l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8353l f17172l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C8353l f17173l;

    public C8269l(C5222l c5222l, C5665l c5665l, C2962l c2962l) {
        C8353l c8353l = new C8353l(C8353l.purchase(AbstractC1845l.yandex(c5222l.yandex)));
        C11906l c11906l = c5222l.loadAd;
        C8353l c8353lCrashlytics = null;
        String str = ((EnumC4474l) c11906l.crashlytics) != EnumC4474l.MULTIFILE_CLASS_PART ? null : (String) c11906l.admob;
        if (str != null && str.length() > 0) {
            c8353lCrashlytics = C8353l.crashlytics(str);
        }
        this.f17173l = c8353l;
        this.f17172l = c8353lCrashlytics;
        this.f17171l = c5222l;
        Integer num = (Integer) AbstractC0714l.loadAd(c5665l, AbstractC8450l.firebase);
        if (num != null) {
            c2962l.getString(num.intValue());
        }
    }

    public final String toString() {
        return C8269l.class.getSimpleName() + ": " + this.f17173l;
    }

    @Override // defpackage.InterfaceC8850l
    public final String vip() {
        return AbstractC2812l.tapsense(new StringBuilder("Class '"), yandex().yandex().yandex.yandex, '\'');
    }

    public final C3624l yandex() {
        C2312l c2312l;
        C8353l c8353l = this.f17173l;
        String str = c8353l.yandex;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            c2312l = C2312l.crashlytics;
            if (c2312l == null) {
                C8353l.yandex(9);
                throw null;
            }
        } else {
            c2312l = new C2312l(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strAmazon = c8353l.amazon();
        return new C3624l(c2312l, C3498l.purchase(AbstractC12024l.m3348transient('/', strAmazon, strAmazon)));
    }
}
