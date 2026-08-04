package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14072l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2814l f27430l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27431l;

    public /* synthetic */ C14072l(C2814l c2814l, int i) {
        this.f27431l = i;
        this.f27430l = c2814l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f27431l;
        C2814l c2814l = this.f27430l;
        switch (i) {
            case 0:
                c2814l.yandex.recreate();
                break;
            default:
                c2814l.amazon(C1722l.f4118l);
                break;
        }
        return Unit.INSTANCE;
    }
}
