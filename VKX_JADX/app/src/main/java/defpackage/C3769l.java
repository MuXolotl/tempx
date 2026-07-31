package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؕۦؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3769l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18656l f7850l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7851l;

    public /* synthetic */ C3769l(C18656l c18656l, int i) {
        this.f7851l = i;
        this.f7850l = c18656l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f7851l;
        C18656l c18656l = this.f7850l;
        switch (i) {
            case 0:
                return Boolean.valueOf((AbstractC8576l.yandex(c18656l.amazon.getValue(), c18656l.crashlytics()) && c18656l.admob.admob() == Long.MIN_VALUE && !((Boolean) c18656l.subs.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(c18656l.loadAd());
        }
    }
}
