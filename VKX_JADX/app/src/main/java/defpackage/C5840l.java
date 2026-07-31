package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘٝ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5840l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9197l f12301l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12302l;

    public /* synthetic */ C5840l(C9197l c9197l, int i) {
        this.f12302l = i;
        this.f12301l = c9197l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f12302l;
        C9197l c9197l = this.f12301l;
        switch (i) {
            case 0:
                c9197l.f18909l.setValue(Boolean.FALSE);
                c9197l.f18906l.setValue(null);
                break;
            case 1:
                c9197l.m4125private(new C16911l(0));
                break;
            case 2:
                c9197l.f18909l.setValue(Boolean.TRUE);
                break;
            default:
                c9197l.f18907l.setValue(Boolean.FALSE);
                c9197l.f18906l.setValue(null);
                break;
        }
        return Unit.INSTANCE;
    }
}
