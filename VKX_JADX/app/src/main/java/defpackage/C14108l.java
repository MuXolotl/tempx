package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14108l extends AbstractC14761l {
    public final /* synthetic */ Function2 crashlytics;
    public final /* synthetic */ C9117l loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14108l(C9117l c9117l, Function2 function2, String str) {
        super(str);
        this.loadAd = c9117l;
        this.crashlytics = function2;
    }

    @Override // defpackage.InterfaceC10835l
    public final InterfaceC17792l loadAd(InterfaceC7448l interfaceC7448l, List list, long j) {
        C9117l c9117l = this.loadAd;
        C2121l c2121l = c9117l.f18729l;
        c2121l.f4761l = interfaceC7448l.getLayoutDirection();
        c2121l.f4760l = interfaceC7448l.loadAd();
        c2121l.f4759l = interfaceC7448l.mo873super();
        boolean zMo992import = interfaceC7448l.mo992import();
        Function2 function2 = this.crashlytics;
        if (zMo992import || c9117l.f18732l.f7693l == null) {
            c9117l.f18736l = 0;
            InterfaceC17792l interfaceC17792l = (InterfaceC17792l) function2.invoke(c2121l, new C15519l(j));
            return new C12475l(interfaceC17792l, c9117l, c9117l.f18736l, interfaceC17792l, 1);
        }
        c9117l.f18735l = 0;
        InterfaceC17792l interfaceC17792l2 = (InterfaceC17792l) function2.invoke(c9117l.f18738l, new C15519l(j));
        return new C12475l(interfaceC17792l2, c9117l, c9117l.f18735l, interfaceC17792l2, 0);
    }
}
