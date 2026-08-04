package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٗۛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17400l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f33904l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f33905l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f33906l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33907l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17400l(C14451l c14451l, long j, int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f33906l = 6;
        this.f33905l = c14451l;
        this.f33904l = j;
        this.f33907l = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (defpackage.C3095l.yandex(r15, r14) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        if (defpackage.AbstractC8532l.purchase(8, r14) == r14) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bb, code lost:
    
        if (defpackage.C5616l.loadAd(r4, r5, r6, null, null, r14, 12) == r0) goto L84;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17400l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f33906l;
        Object obj2 = this.f33905l;
        switch (i) {
            case 0:
                return new C17400l((AbstractC0290l) obj2, this.f33904l, interfaceC14029l, 0);
            case 1:
                return new C17400l(this.f33904l, (C7276l) obj2, interfaceC14029l, 1);
            case 2:
                return new C17400l((C5056l) obj2, this.f33904l, interfaceC14029l, 2);
            case 3:
                return new C17400l((C5616l) obj2, this.f33904l, interfaceC14029l, 3);
            case 4:
                return new C17400l(this.f33904l, (C17249l) obj2, interfaceC14029l, 4);
            case 5:
                return new C17400l((C9288l) obj2, this.f33904l, interfaceC14029l, 5);
            case 6:
                return new C17400l((C14451l) obj2, this.f33904l, this.f33907l, interfaceC14029l);
            default:
                return new C17400l(this.f33904l, (C3095l) obj2, interfaceC14029l, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f33906l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((C17400l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17400l(long j, Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f33906l = i;
        this.f33904l = j;
        this.f33905l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17400l(Object obj, long j, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f33906l = i;
        this.f33905l = obj;
        this.f33904l = j;
    }
}
