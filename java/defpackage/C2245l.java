package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؓۦؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2245l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4928l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C7761l f4929l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2245l(C7761l c7761l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f4928l = i;
        this.f4929l = c7761l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f4928l;
        C7761l c7761l = this.f4929l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C14103l c14103l = (C14103l) ((InterfaceC16452l) c7761l.subs.getValue());
                return new Integer(c14103l.loadAd.nativeGetCounterValue(c14103l.crashlytics));
            default:
                AbstractC2829l.crashlytics(obj);
                C14103l c14103l2 = (C14103l) ((InterfaceC16452l) c7761l.subs.getValue());
                return new Integer(c14103l2.loadAd.nativeIncrementAndGetCounterValue(c14103l2.crashlytics));
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f4928l;
        C7761l c7761l = this.f4929l;
        switch (i) {
            case 0:
                return new C2245l(c7761l, interfaceC14029l, 0);
            default:
                return new C2245l(c7761l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f4928l) {
            case 0:
                break;
        }
        return ((C2245l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
