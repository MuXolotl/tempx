package defpackage;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: l۠ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18621l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public /* synthetic */ Object f36378l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Function3 f36379l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public InterfaceC15580l f36380l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ C9426l f36381l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final /* synthetic */ C14082l f36382l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C2993l f36383l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f36384l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ C11023l f36385l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Closeable f36386l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f36387l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f36388l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f36389l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f36390l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ C9268l f36391l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ long f36392l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18621l(C9268l c9268l, C11023l c11023l, C9426l c9426l, C2993l c2993l, long j, C14082l c14082l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36391l = c9268l;
        this.f36385l = c11023l;
        this.f36381l = c9426l;
        this.f36383l = c2993l;
        this.f36392l = j;
        this.f36382l = c14082l;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0152 A[Catch: all -> 0x00a6, IOException -> 0x00a9, TryCatch #0 {IOException -> 0x00a9, blocks: (B:26:0x0098, B:45:0x0135, B:47:0x0152, B:48:0x0157), top: B:100:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0157 A[Catch: all -> 0x00a6, IOException -> 0x00a9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00a9, blocks: (B:26:0x0098, B:45:0x0135, B:47:0x0152, B:48:0x0157), top: B:100:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x015f  */
    /* JADX WARN: Code duplicated, block: B:55:0x018d A[Catch: all -> 0x01d5, ClosedChannelException -> 0x01dc, TryCatch #2 {ClosedChannelException -> 0x01dc, blocks: (B:53:0x0167, B:55:0x018d, B:57:0x0195, B:59:0x01a1, B:61:0x01a8), top: B:104:0x0167 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a1 A[Catch: all -> 0x01d5, ClosedChannelException -> 0x01dc, TryCatch #2 {ClosedChannelException -> 0x01dc, blocks: (B:53:0x0167, B:55:0x018d, B:57:0x0195, B:59:0x01a1, B:61:0x01a8), top: B:104:0x0167 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.jvm.functions.Function3, lٍٕٓ] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.jvm.functions.Function3, lٍٕٓ] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x015f -> B:28:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01ea -> B:63:0x01d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18621l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C18621l c18621l = new C18621l(this.f36391l, this.f36385l, this.f36381l, this.f36383l, this.f36392l, this.f36382l, interfaceC14029l);
        c18621l.f36378l = obj;
        return c18621l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C18621l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
