package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؘؓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1640l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Object f3974l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f3975l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f3976l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public /* synthetic */ Object f3977l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3978l = 0;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f3979l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f3980l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3981l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public /* synthetic */ Object f3982l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640l(InterfaceC9955l interfaceC9955l, List list, C11310l c11310l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f3982l = interfaceC9955l;
        this.f3979l = list;
        this.f3974l = c11310l;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    /* JADX WARN: Code duplicated, block: B:42:0x0128  */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, lِٔؐ] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:20:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b5 -> B:33:0x00dc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r21) throws defpackage.C12789l {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1640l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f3978l;
        Object obj4 = this.f3974l;
        Object obj5 = this.f3979l;
        switch (i) {
            case 0:
                C1640l c1640l = new C1640l((C4199l) obj5, (InterfaceC6942l) obj4, (InterfaceC14029l) obj3);
                c1640l.f3977l = (InterfaceC2262l) obj;
                c1640l.f3982l = (InterfaceC9427l) obj2;
                return c1640l.Signature(Unit.INSTANCE);
            default:
                C1640l c1640l2 = new C1640l((InterfaceC9955l) this.f3982l, (List) obj5, (C11310l) obj4, (InterfaceC14029l) obj3);
                c1640l2.f3977l = (InterfaceC9354l) obj2;
                return c1640l2.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640l(C4199l c4199l, InterfaceC6942l interfaceC6942l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f3979l = c4199l;
        this.f3974l = interfaceC6942l;
    }
}
