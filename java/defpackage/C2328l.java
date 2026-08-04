package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔؑ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2328l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f5040l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f5041l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C9426l f5042l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ C4074l f5043l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ long f5044l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f5045l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9354l f5046l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C3753l f5047l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public long f5048l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C14740l f5049l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C4074l f5050l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long f5051l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public /* synthetic */ Object f5052l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Long f5053l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2328l(InterfaceC9354l interfaceC9354l, C4074l c4074l, long j, Long l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f5046l = interfaceC9354l;
        this.f5043l = c4074l;
        this.f5044l = j;
        this.f5053l = l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf A[PHI: r0 r1 r3 r4 r5 r8 r16
  0x00bf: PHI (r0v17 lؙؚّ) = (r0v1 lؙؚّ), (r0v18 lؙؚّ) binds: [B:24:0x00b1, B:58:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r1v20 long) = (r1v11 long), (r1v23 long) binds: [B:24:0x00b1, B:58:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r3v11 lّؖ۠) = (r3v0 lّؖ۠), (r3v12 lّؖ۠) binds: [B:24:0x00b1, B:58:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r4v17 lّؖ۠) = (r4v6 lّؖ۠), (r4v20 lّؖ۠) binds: [B:24:0x00b1, B:58:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r5v23 lؕۤۙ) = (r5v12 lؕۤۙ), (r5v25 lؕۤۙ) binds: [B:24:0x00b1, B:58:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r8v7 java.lang.Object) = (r8v1 java.lang.Object), (r8v12 java.lang.Object) binds: [B:24:0x00b1, B:58:0x01bb] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r16v13 long) = (r16v7 long), (r16v14 long) binds: [B:24:0x00b1, B:58:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x016c A[PHI: r0 r1 r3 r5 r13 r16
  0x016c: PHI (r0v20 lؙؚّ) = (r0v1 lؙؚّ), (r0v1 lؙؚّ), (r0v17 lؙؚّ), (r0v23 lؙؚّ) binds: [B:39:0x014d, B:44:0x016a, B:61:0x01c5, B:81:0x0249] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r1v28 lّؖ۠) = (r1v3 lّؖ۠), (r1v7 lّؖ۠), (r1v21 lّؖ۠), (r1v29 lّؖ۠) binds: [B:39:0x014d, B:44:0x016a, B:61:0x01c5, B:81:0x0249] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r3v14 lّؖ۠) = (r3v0 lّؖ۠), (r3v0 lّؖ۠), (r3v11 lّؖ۠), (r3v15 lّؖ۠) binds: [B:39:0x014d, B:44:0x016a, B:61:0x01c5, B:81:0x0249] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r5v27 lؕۤۙ) = (r5v6 lؕۤۙ), (r5v8 lؕۤۙ), (r5v23 lؕۤۙ), (r5v28 lؕۤۙ) binds: [B:39:0x014d, B:44:0x016a, B:61:0x01c5, B:81:0x0249] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r13v20 long) = (r13v1 long), (r13v3 long), (r13v17 long), (r13v22 long) binds: [B:39:0x014d, B:44:0x016a, B:61:0x01c5, B:81:0x0249] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r16v16 long) = (r16v1 long), (r16v3 long), (r16v13 long), (r16v17 long) binds: [B:39:0x014d, B:44:0x016a, B:61:0x01c5, B:81:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:50:0x018d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0196  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01c5 -> B:45:0x016c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x023e -> B:146:0x0246). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2328l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C2328l c2328l = new C2328l(this.f5046l, this.f5043l, this.f5044l, this.f5053l, interfaceC14029l);
        c2328l.f5052l = obj;
        return c2328l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2328l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
    }
}
