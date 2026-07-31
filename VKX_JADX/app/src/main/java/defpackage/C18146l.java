package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18146l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public /* synthetic */ Object f35498l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Iterator f35499l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public InterfaceC10011l f35500l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ C0462l f35501l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C9426l f35502l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f35503l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ C9426l f35504l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ArrayList f35505l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f35506l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Collection f35507l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Collection f35508l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f35509l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ C18163l f35510l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C10038l f35511l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18146l(C18163l c18163l, C9426l c9426l, C0462l c0462l, C9426l c9426l2, C10038l c10038l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
        this.f35510l = c18163l;
        this.f35504l = c9426l;
        this.f35501l = c0462l;
        this.f35502l = c9426l2;
        this.f35511l = c10038l;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f3 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:14:0x004e, B:36:0x00ed, B:38:0x00f3, B:46:0x0136, B:47:0x0145, B:49:0x014b, B:51:0x0163, B:54:0x0169, B:57:0x0177, B:58:0x0181, B:59:0x0185, B:19:0x0068, B:20:0x006e, B:22:0x0074, B:25:0x0087, B:26:0x008e, B:27:0x008f, B:28:0x009e, B:30:0x00a4, B:31:0x00b7, B:32:0x00c4, B:34:0x00ca, B:35:0x00d8), top: B:89:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0123  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e8 A[LOOP:0: B:73:0x01e2->B:75:0x01e8, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0123 -> B:87:0x0125). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18146l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
        C18146l c18146l = new C18146l(this.f35510l, this.f35504l, this.f35501l, this.f35502l, this.f35511l, interfaceC14029l);
        c18146l.f35498l = obj;
        return c18146l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C18146l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
