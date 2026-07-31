package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17626l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f34297l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9879l f34298l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34299l;

    public /* synthetic */ C17626l(C9879l c9879l, InterfaceC17242l interfaceC17242l, int i, int i2) {
        this.f34299l = i2;
        this.f34298l = c9879l;
        this.f34297l = interfaceC17242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34299l;
        InterfaceC17242l interfaceC17242l = this.f34297l;
        C9879l c9879l = this.f34298l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c9879l.loadAd(interfaceC17242l, c6956l, AbstractC0545l.purchase(7));
                break;
            default:
                c9879l.crashlytics(interfaceC17242l, c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
