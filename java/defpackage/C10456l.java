package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَٞ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10456l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13849l f21270l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21271l;

    public /* synthetic */ C10456l(C13849l c13849l, int i) {
        this.f21271l = i;
        this.f21270l = c13849l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f21271l;
        C13849l c13849l = this.f21270l;
        switch (i) {
            case 0:
                c13849l.f27086l.setValue(Boolean.TRUE);
                break;
            default:
                c13849l.f27086l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
