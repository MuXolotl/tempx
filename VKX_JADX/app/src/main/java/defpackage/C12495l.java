package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12495l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C6167l f24631l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24632l;

    public /* synthetic */ C12495l(C6167l c6167l, int i) {
        this.f24632l = i;
        this.f24631l = c6167l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f24632l;
        C6167l c6167l = this.f24631l;
        switch (i) {
            case 0:
                return new C3134l(c6167l.isVip(), c6167l.signatures(), 10.0d, 2, true, 0, 32);
            case 1:
                return new C3134l(c6167l.metrica(), c6167l.vip(), 10.0d, 5, false, 0, 32);
            case 2:
                return new C3134l(c6167l.metrica(), c6167l.vip(), 10.0d, 5, false, 0, 32);
            case 3:
                return new C3134l(c6167l.startapp(), c6167l.adcel(), 10.0d, 2, true, 0, 32);
            case 4:
                return new C3134l(c6167l.advert(), c6167l.ad(), 10.0d, 5, false, 0, 32);
            case 5:
                return new C3134l(c6167l.subscription(), c6167l.ads(), 10.0d, 5, false, 0, 32);
            case 6:
                return new C3134l(c6167l.loadAd(), c6167l.yandex(), 10.0d, 5, false, 0, 32);
            case 7:
                return new C3134l(c6167l.advert(), c6167l.ad(), 10.0d, 5, false, 0, 32);
            case 8:
                return new C3134l(c6167l.loadAd(), c6167l.yandex(), 10.0d, 5, false, 0, 32);
            case 9:
                return new C3134l(c6167l.tapsense(), c6167l.Signature(), 10.0d, 2, true, 0, 32);
            case 10:
                return new C3134l(c6167l.startapp(), c6167l.adcel(), 10.0d, 2, true, 0, 32);
            case 11:
                return new C3134l(c6167l.tapsense(), c6167l.Signature(), 10.0d, 2, true, 0, 32);
            case 12:
                return new C3134l(c6167l.subscription(), c6167l.ads(), 10.0d, 5, false, 0, 32);
            default:
                return new C3134l(c6167l.isVip(), c6167l.signatures(), 10.0d, 2, true, 0, 32);
        }
    }
}
