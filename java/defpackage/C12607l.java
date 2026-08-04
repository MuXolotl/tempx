package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12607l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f24827l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f24828l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f24829l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Function1 f24830l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12607l(int i, InterfaceC14029l interfaceC14029l, Function1 function1) {
        super(2, interfaceC14029l);
        this.f24827l = i;
        this.f24830l = function1;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x0011
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12607l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f24827l;
        Function1 function1 = this.f24830l;
        switch (i) {
            case 0:
                C12607l c12607l = new C12607l(0, interfaceC14029l, function1);
                c12607l.f24828l = obj;
                return c12607l;
            case 1:
                C12607l c12607l2 = new C12607l(1, interfaceC14029l, function1);
                c12607l2.f24828l = obj;
                return c12607l2;
            case 2:
                C12607l c12607l3 = new C12607l(2, interfaceC14029l, function1);
                c12607l3.f24828l = obj;
                return c12607l3;
            default:
                C12607l c12607l4 = new C12607l(3, interfaceC14029l, function1);
                c12607l4.f24828l = obj;
                return c12607l4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C17249l c17249l = (C17249l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f24827l) {
            case 0:
                return ((C12607l) ads(interfaceC14029l, c17249l)).Signature(Unit.INSTANCE);
            case 1:
                return ((C12607l) ads(interfaceC14029l, c17249l)).Signature(Unit.INSTANCE);
            case 2:
                return ((C12607l) ads(interfaceC14029l, c17249l)).Signature(Unit.INSTANCE);
            default:
                ((C12607l) ads(interfaceC14029l, c17249l)).Signature(Unit.INSTANCE);
                return EnumC9342l.f19165l;
        }
    }
}
