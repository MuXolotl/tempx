package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْؕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3375l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f7189l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f7190l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f7191l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f7192l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f7193l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f7194l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f7195l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7196l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3375l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f7189l = i;
        this.f7192l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0070 -> B:24:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c0 -> B:36:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d1 -> B:41:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3375l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f7189l;
        Object obj2 = this.f7192l;
        switch (i) {
            case 0:
                C3375l c3375l = new C3375l((C4540l) obj2, interfaceC14029l, 0);
                c3375l.f7190l = obj;
                return c3375l;
            default:
                C3375l c3375l2 = new C3375l((C14750l) obj2, interfaceC14029l, 1);
                c3375l2.f7190l = obj;
                return c3375l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C11129l c11129l = (C11129l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f7189l) {
            case 0:
                break;
        }
        return ((C3375l) ads(interfaceC14029l, c11129l)).Signature(Unit.INSTANCE);
    }
}
