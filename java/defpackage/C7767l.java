package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7767l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17338l f16289l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16290l;

    public /* synthetic */ C7767l(C17338l c17338l, int i) {
        this.f16290l = i;
        this.f16289l = c17338l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f16290l;
        C17338l c17338l = this.f16289l;
        switch (i) {
            case 0:
                return Float.valueOf(c17338l.f33672l.loadAd());
            case 1:
                return Float.valueOf(c17338l.f33672l.purchase());
            default:
                return Float.valueOf(c17338l.f33672l.yandex() - c17338l.f33672l.amazon());
        }
    }
}
