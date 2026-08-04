package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3154l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC18026l f6774l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C4307l f6775l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f6776l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Cfinally f6777l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C1252l f6778l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3154l(C1252l c1252l, AbstractC18026l abstractC18026l, C4307l c4307l, Cfinally cfinally, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f6778l = c1252l;
        this.f6774l = abstractC18026l;
        this.f6775l = c4307l;
        this.f6777l = cfinally;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f6776l;
        C1252l c1252l = this.f6778l;
        InterfaceC14029l interfaceC14029l = null;
        AbstractC10999l.mopub(interfaceC2262l, null, 0, new C7641l(c1252l, this.f6774l, this.f6775l, interfaceC14029l, 18), 3);
        return AbstractC10999l.mopub(interfaceC2262l, null, 0, new C5163l(c1252l, this.f6777l, interfaceC14029l, 16), 3);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C3154l c3154l = new C3154l(this.f6778l, this.f6774l, this.f6775l, this.f6777l, interfaceC14029l);
        c3154l.f6776l = obj;
        return c3154l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3154l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
