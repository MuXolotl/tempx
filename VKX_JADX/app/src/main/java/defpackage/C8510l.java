package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8510l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f17595l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ long f17596l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17597l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f17598l = 1;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f17599l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f17600l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f17601l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8510l(C3276l c3276l, C2643l c2643l, InterfaceC14447l interfaceC14447l, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f17599l = c3276l;
        this.f17597l = c2643l;
        this.f17601l = interfaceC14447l;
        this.f17596l = j;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008d */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8510l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f17598l;
        Object obj2 = this.f17601l;
        Object obj3 = this.f17597l;
        Object obj4 = this.f17599l;
        switch (i) {
            case 0:
                C8510l c8510l = new C8510l((C3276l) obj4, (C2643l) obj3, (InterfaceC14447l) obj2, this.f17596l, interfaceC14029l);
                c8510l.f17595l = obj;
                return c8510l;
            default:
                C8510l c8510l2 = new C8510l((C1304l) obj4, (C12217l) obj3, this.f17596l, (C2403l) obj2, interfaceC14029l);
                c8510l2.f17595l = obj;
                return c8510l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f17598l) {
            case 0:
                break;
        }
        return ((C8510l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8510l(C1304l c1304l, C12217l c12217l, long j, C2403l c2403l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f17599l = c1304l;
        this.f17597l = c12217l;
        this.f17596l = j;
        this.f17601l = c2403l;
    }
}
