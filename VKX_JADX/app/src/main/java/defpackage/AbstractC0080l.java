package defpackage;

/* JADX INFO: renamed from: lؑؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080l {
    public static final C1395l amazon;
    public static final C1395l billing;
    public static final C1395l mopub;
    public static final C1395l purchase;
    public static final C11205l yandex = new C11205l(2, 1.0f);
    public static final C11205l loadAd = new C11205l(1, 1.0f);
    public static final C11205l crashlytics = new C11205l(3, 1.0f);

    static {
        int i = 3;
        C0086l c0086l = C18450l.f36040l;
        amazon = new C1395l(1, new C15583l(i, c0086l), c0086l);
        C0086l c0086l2 = C18450l.f36044l;
        purchase = new C1395l(1, new C15583l(i, c0086l2), c0086l2);
        C14855l c14855l = C18450l.f36043l;
        int i2 = 4;
        billing = new C1395l(3, new C15583l(i2, c14855l), c14855l);
        C14855l c14855l2 = C18450l.f36026l;
        mopub = new C1395l(3, new C15583l(i2, c14855l2), c14855l2);
    }

    public static InterfaceC17242l adcel(InterfaceC17242l interfaceC17242l, C14855l c14855l) {
        C1395l c1395l;
        if (c14855l.equals(C18450l.f36043l)) {
            c1395l = billing;
        } else {
            c1395l = c14855l.equals(C18450l.f36026l) ? mopub : new C1395l(3, new C15583l(4, c14855l), c14855l);
        }
        return interfaceC17242l.premium(c1395l);
    }

    public static final InterfaceC17242l admob(InterfaceC17242l interfaceC17242l) {
        return interfaceC17242l.premium(new C16662l(20.0f, 20.0f, 20.0f, 20.0f, false));
    }

    public static final InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, float f) {
        return interfaceC17242l.premium(f == 1.0f ? yandex : new C11205l(2, f));
    }

    public static final InterfaceC17242l billing(InterfaceC17242l interfaceC17242l, float f, float f2) {
        return interfaceC17242l.premium(new C16662l(0.0f, f, 0.0f, f2, true, 5));
    }

    public static final InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, float f) {
        return interfaceC17242l.premium(f == 1.0f ? crashlytics : new C11205l(3, f));
    }

    public static final InterfaceC17242l firebase(InterfaceC17242l interfaceC17242l, float f, float f2) {
        return interfaceC17242l.premium(new C16662l(f, f2, f, f2, true));
    }

    public static final InterfaceC17242l isPro(InterfaceC17242l interfaceC17242l, float f) {
        return interfaceC17242l.premium(new C16662l(f, f, f, f, true));
    }

    public static /* synthetic */ InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l, float f, int i) {
        float f2 = (i & 1) != 0 ? Float.NaN : 24.0f;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        return yandex(interfaceC17242l, f2, f);
    }

    public static InterfaceC17242l metrica(InterfaceC17242l interfaceC17242l, float f, float f2, int i) {
        return interfaceC17242l.premium(new C16662l((i & 1) != 0 ? Float.NaN : f, 0.0f, (i & 2) != 0 ? Float.NaN : f2, 0.0f, true, 10));
    }

    public static /* synthetic */ InterfaceC17242l mopub(InterfaceC17242l interfaceC17242l, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return billing(interfaceC17242l, f, f2);
    }

    public static final InterfaceC17242l purchase(InterfaceC17242l interfaceC17242l, float f) {
        return interfaceC17242l.premium(new C16662l(0.0f, f, 0.0f, f, true, 5));
    }

    public static /* synthetic */ InterfaceC17242l remoteconfig(InterfaceC17242l interfaceC17242l, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f3 = Float.NaN;
        }
        if ((i & 8) != 0) {
            f4 = Float.NaN;
        }
        return smaato(interfaceC17242l, f, f2, f3, f4);
    }

    public static final InterfaceC17242l smaato(InterfaceC17242l interfaceC17242l, float f, float f2, float f3, float f4) {
        return interfaceC17242l.premium(new C16662l(f, f2, f3, f4, true));
    }

    public static InterfaceC17242l startapp(InterfaceC17242l interfaceC17242l) {
        C1395l c1395l;
        C0086l c0086l = C18450l.f36040l;
        if (AbstractC8576l.yandex(c0086l, c0086l)) {
            c1395l = amazon;
        } else {
            c1395l = AbstractC8576l.yandex(c0086l, C18450l.f36044l) ? purchase : new C1395l(1, new C15583l(3, c0086l), c0086l);
        }
        return interfaceC17242l.premium(c1395l);
    }

    public static InterfaceC17242l subs(InterfaceC17242l interfaceC17242l, float f, float f2, float f3, float f4, int i) {
        return interfaceC17242l.premium(new C16662l(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }

    public static final InterfaceC17242l vip(InterfaceC17242l interfaceC17242l, float f) {
        return interfaceC17242l.premium(new C16662l(f, 0.0f, f, 0.0f, true, 10));
    }

    public static final InterfaceC17242l yandex(InterfaceC17242l interfaceC17242l, float f, float f2) {
        return interfaceC17242l.premium(new C8675l(f, f2));
    }
}
