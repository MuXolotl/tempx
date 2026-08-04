package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lً٘ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17773l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f34607l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f34608l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34609l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17773l(C12217l c12217l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34608l = i;
        this.f34607l = c12217l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        if (r8 == r6) goto L60;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17773l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f34608l;
        C12217l c12217l = this.f34607l;
        switch (i) {
            case 0:
                return new C17773l(c12217l, interfaceC14029l, 0);
            case 1:
                return new C17773l(c12217l, interfaceC14029l, 1);
            case 2:
                return new C17773l(c12217l, interfaceC14029l, 2);
            default:
                return new C17773l(c12217l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34608l) {
            case 0:
                long j = ((C1187l) obj).yandex;
                return new C17773l(this.f34607l, (InterfaceC14029l) obj2, 0).Signature(Unit.INSTANCE);
            case 1:
                return ((C17773l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C17773l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C17773l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
