package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٍؓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1843l extends AbstractC2219l {
    public final Function1 amazon;
    public final Function4 crashlytics;
    public final C13698l purchase;

    public C1843l(Function4 function4, Function1 function1, int i) {
        this.crashlytics = function4;
        this.amazon = function1;
        C13698l c13698l = new C13698l((byte) 0, 18);
        c13698l.isPro(i, new C10873l(function1, function4));
        this.purchase = c13698l;
    }

    @Override // defpackage.AbstractC2219l
    public final C13698l billing() {
        return this.purchase;
    }
}
