package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؑۦٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0712l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C7968l f2199l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f2200l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f2201l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0712l(C7968l c7968l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f2200l = i;
        this.f2199l = c7968l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        switch (this.f2200l) {
            case 0:
                C13939l c13939l = (C13939l) this.f2201l;
                AbstractC2829l.crashlytics(obj);
                return C13939l.loadAd(c13939l, null, this.f2199l, null, null, 29);
            case 1:
                C13939l c13939l2 = (C13939l) this.f2201l;
                AbstractC2829l.crashlytics(obj);
                return C13939l.loadAd(c13939l2, null, null, this.f2199l, null, 27);
            default:
                C13939l c13939l3 = (C13939l) this.f2201l;
                AbstractC2829l.crashlytics(obj);
                return C13939l.loadAd(c13939l3, this.f2199l, null, null, null, 30);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f2200l) {
            case 0:
                C0712l c0712l = new C0712l(this.f2199l, interfaceC14029l, 0);
                c0712l.f2201l = obj;
                return c0712l;
            case 1:
                C0712l c0712l2 = new C0712l(this.f2199l, interfaceC14029l, 1);
                c0712l2.f2201l = obj;
                return c0712l2;
            default:
                C0712l c0712l3 = new C0712l(this.f2199l, interfaceC14029l, 2);
                c0712l3.f2201l = obj;
                return c0712l3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13939l c13939l = (C13939l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f2200l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0712l) ads(interfaceC14029l, c13939l)).Signature(Unit.INSTANCE);
    }
}
