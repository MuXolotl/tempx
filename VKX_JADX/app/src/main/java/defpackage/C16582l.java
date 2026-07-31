package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖۗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16582l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13703l f32545l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32546l;

    public /* synthetic */ C16582l(C13703l c13703l, int i) {
        this.f32546l = i;
        this.f32545l = c13703l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f32546l;
        C13703l c13703l = this.f32545l;
        switch (i) {
            case 0:
                c13703l.loadAd.yandex = true;
                break;
            default:
                c13703l.crashlytics.yandex = true;
                break;
        }
        return Unit.INSTANCE;
    }
}
