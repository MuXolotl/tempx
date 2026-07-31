package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2495l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4077l f5293l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5294l;

    public /* synthetic */ C2495l(C4077l c4077l, int i) {
        this.f5294l = i;
        this.f5293l = c4077l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f5294l;
        C4077l c4077l = this.f5293l;
        switch (i) {
            case 0:
                c4077l.purchase();
                break;
            default:
                c4077l.purchase();
                break;
        }
        return Unit.INSTANCE;
    }
}
