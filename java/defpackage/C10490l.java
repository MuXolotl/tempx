package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًَۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10490l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Object f21353l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f21354l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f21355l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Object f21356l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f21357l = 1;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f21358l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f21359l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f21360l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public /* synthetic */ Object f21361l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10490l(C16811l c16811l, Map map, C16076l c16076l, int i, C13305l c13305l, InterfaceC17817l interfaceC17817l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f21359l = c16811l;
        this.f21356l = map;
        this.f21361l = c16076l;
        this.f21354l = i;
        this.f21358l = c13305l;
        this.f21353l = interfaceC17817l;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:11:0x0031, B:29:0x0094, B:33:0x00bd, B:37:0x00e8, B:39:0x00f8, B:16:0x004b, B:19:0x0060), top: B:110:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:91:0x0205  */
    /* JADX WARN: Code duplicated, block: B:92:0x0208  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f6 -> B:46:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0126 -> B:114:0x012c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10490l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f21357l;
        Object obj2 = this.f21353l;
        Object obj3 = this.f21358l;
        switch (i) {
            case 0:
                return new C10490l((C16811l) this.f21359l, (Map) this.f21356l, (C16076l) this.f21361l, this.f21354l, (C13305l) obj3, (InterfaceC17817l) obj2, interfaceC14029l);
            default:
                C10490l c10490l = new C10490l((C3416l) obj3, (C7883l) obj2, interfaceC14029l);
                c10490l.f21361l = obj;
                return c10490l;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f21357l) {
            case 0:
                break;
        }
        return ((C10490l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10490l(C3416l c3416l, C7883l c7883l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f21358l = c3416l;
        this.f21353l = c7883l;
    }
}
