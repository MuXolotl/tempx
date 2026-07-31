package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۣۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9820l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f20000l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f20001l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Object f20002l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f20003l = 0;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f20004l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f20005l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20006l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Object f20007l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9820l(C5835l c5835l, int i, int i2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20004l = c5835l;
        this.f20001l = i;
        this.f20005l = i2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ab -> B:26:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9820l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f20003l;
        Object obj2 = this.f20004l;
        switch (i) {
            case 0:
                return new C9820l((List) obj2, interfaceC14029l);
            default:
                C9820l c9820l = new C9820l((C5835l) obj2, this.f20001l, this.f20005l, interfaceC14029l);
                c9820l.f20000l = obj;
                return c9820l;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20003l) {
            case 0:
                return ((C9820l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C9820l) ads((InterfaceC14029l) obj2, (InterfaceC16805l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9820l(List list, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f20004l = list;
    }
}
