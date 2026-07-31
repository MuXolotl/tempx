package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3819l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6942l[] f7927l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public byte[] f7928l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f7929l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9427l f7930l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f7931l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f7932l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object[] f7933l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public /* synthetic */ Object f7934l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f7935l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC14592l f7936l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f7937l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f7938l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3819l(InterfaceC14029l interfaceC14029l, InterfaceC9427l interfaceC9427l, Function0 function0, Function3 function3, InterfaceC6942l[] interfaceC6942lArr) {
        super(2, interfaceC14029l);
        this.f7927l = interfaceC6942lArr;
        this.f7938l = function0;
        this.f7932l = function3;
        this.f7930l = interfaceC9427l;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0 A[LOOP:0: B:30:0x00d0->B:38:0x00f1, LOOP_START, PHI: r2 r14
  0x00d0: PHI (r2v4 int) = (r2v3 int), (r2v5 int) binds: [B:27:0x00cb, B:38:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r14v6 lۣؒٙ) = (r14v5 lۣؒٙ), (r14v10 lۣؒٙ) binds: [B:27:0x00cb, B:38:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3 A[EDGE_INSN: B:52:0x00f3->B:39:0x00f3 BREAK  A[LOOP:0: B:30:0x00d0->B:38:0x00f1], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0135 -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x013a -> B:45:0x011a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3819l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C3819l c3819l = new C3819l(interfaceC14029l, this.f7930l, this.f7938l, this.f7932l, this.f7927l);
        c3819l.f7934l = obj;
        return c3819l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3819l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
