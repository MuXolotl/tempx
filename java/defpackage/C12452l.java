package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًؚّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12452l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ C15744l f24573l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24574l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C3597l f24575l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12452l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f24574l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        switch (this.f24574l) {
            case 0:
                C3597l c3597l = this.f24575l;
                C15744l c15744l = this.f24573l;
                AbstractC2829l.crashlytics(obj);
                return C3597l.loadAd(c3597l, null, null, null, null, null, c15744l, null, null, 130815);
            default:
                C3597l c3597l2 = this.f24575l;
                C15744l c15744l2 = this.f24573l;
                AbstractC2829l.crashlytics(obj);
                return C3597l.loadAd(c3597l2, null, null, null, null, null, null, null, c15744l2, 130047);
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        C3597l c3597l = (C3597l) obj;
        C15744l c15744l = (C15744l) obj2;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (this.f24574l) {
            case 0:
                C12452l c12452l = new C12452l(i, interfaceC14029l, 0);
                c12452l.f24575l = c3597l;
                c12452l.f24573l = c15744l;
                return c12452l.Signature(Unit.INSTANCE);
            default:
                C12452l c12452l2 = new C12452l(i, interfaceC14029l, 1);
                c12452l2.f24575l = c3597l;
                c12452l2.f24573l = c15744l;
                return c12452l2.Signature(Unit.INSTANCE);
        }
    }
}
