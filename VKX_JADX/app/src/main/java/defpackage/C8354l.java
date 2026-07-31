package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٌۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8354l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9714l f17285l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17286l;

    public /* synthetic */ C8354l(C9714l c9714l, int i) {
        this.f17286l = i;
        this.f17285l = c9714l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f17286l;
        C9714l c9714l = this.f17285l;
        C0187l c0187l = (C0187l) obj;
        switch (i) {
            case 0:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return c9714l.inmobi();
            case 1:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return null;
            case 2:
                if (c0187l.isPro == 2) {
                    return new C3134l(c9714l.subscription(), c9714l.appmetrica(), 10.0d, 1, false, 3, 16);
                }
                return null;
            case 3:
                if (c0187l.isPro == 1) {
                    return c0187l.crashlytics ? c9714l.license() : c9714l.pro();
                }
                return null;
            case 4:
                if (c0187l.isPro == 2) {
                    return new C3134l(c9714l.advert(), c9714l.m2723package(), 10.0d, 1, false, 3, 16);
                }
                return null;
            default:
                if (c0187l.isPro == 1) {
                    return new C3134l(c9714l.subscription(), c9714l.ads(), 5.0d, 4, false, 3, 16);
                }
                return null;
        }
    }
}
