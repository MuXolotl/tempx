package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٔٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14888l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C1682l f29275l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9197l f29276l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29277l;

    public /* synthetic */ C14888l(C9197l c9197l, C1682l c1682l, int i) {
        this.f29277l = i;
        this.f29276l = c9197l;
        this.f29275l = c1682l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f29277l;
        C1682l c1682l = this.f29275l;
        C9197l c9197l = this.f29276l;
        switch (i) {
            case 0:
                c9197l.f18909l.setValue(Boolean.TRUE);
                c9197l.f18906l.setValue(c1682l);
                break;
            default:
                c9197l.f18907l.setValue(Boolean.TRUE);
                c9197l.f18906l.setValue(c1682l);
                break;
        }
        return Unit.INSTANCE;
    }
}
