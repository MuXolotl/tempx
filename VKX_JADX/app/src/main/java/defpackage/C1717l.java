package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌؙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1717l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C0471l f4103l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f4104l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4105l;

    public /* synthetic */ C1717l(InterfaceC2262l interfaceC2262l, C0471l c0471l, int i) {
        this.f4105l = i;
        this.f4104l = interfaceC2262l;
        this.f4103l = c0471l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f4105l;
        C0471l c0471l = this.f4103l;
        InterfaceC2262l interfaceC2262l = this.f4104l;
        switch (i) {
            case 0:
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C8100l(c0471l, null, 2), 3);
                break;
            case 1:
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C8100l(c0471l, null, 3), 3);
                break;
            default:
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C8100l(c0471l, null, 1), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
