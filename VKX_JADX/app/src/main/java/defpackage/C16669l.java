package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖ۟ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16669l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16385l f32684l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32685l;

    public /* synthetic */ C16669l(C16385l c16385l, int i) {
        this.f32685l = i;
        this.f32684l = c16385l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f32685l;
        C16385l c16385l = this.f32684l;
        switch (i) {
            case 0:
                AbstractC9092l.loadAd(c16385l.isVip(), new C13099l((InterfaceC13238l) c16385l.f22963l.getValue()), new C13305l(null, 0L, null, false, false, true, 95));
                break;
            case 1:
                c16385l.f32038l.setValue(Boolean.TRUE);
                break;
            default:
                c16385l.f32038l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
