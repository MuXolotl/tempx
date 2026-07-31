package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٜؒۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1258l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2312l f3289l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3290l;

    public /* synthetic */ C1258l(C2312l c2312l, int i) {
        this.f3290l = i;
        this.f3289l = c2312l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f3290l;
        C2312l c2312l = this.f3289l;
        switch (i) {
            case 0:
                return ((InterfaceC3841l) obj).loadAd(c2312l);
            default:
                C2312l c2312l2 = (C2312l) obj;
                return Boolean.valueOf(!c2312l2.yandex.crashlytics() && c2312l2.loadAd().equals(c2312l));
        }
    }
}
