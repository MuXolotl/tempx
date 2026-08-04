package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؚۨۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7682l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final /* synthetic */ long f16112l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C3532l f16113l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C10700l f16114l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final /* synthetic */ C12014l f16115l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f16116l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C7784l f16117l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f16118l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f16119l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f16120l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public CharSequence f16121l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public long f16122l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC14592l f16123l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C2369l f16124l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C4993l f16125l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC12932l f16126l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C13545l f16127l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public InterfaceC9354l f16128l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f16129l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f16130l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7682l(C12014l c12014l, long j, Function3 function3, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f16115l = c12014l;
        this.f16112l = j;
        this.f16130l = function3;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x04af: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:1200), block:B:207:0x04af */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x04b3: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:1204), block:B:208:0x04b3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x0434 -> B:345:0x043b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x04d3 -> B:218:0x04d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16141. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 1614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7682l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C7682l c7682l = new C7682l(this.f16115l, this.f16112l, this.f16130l, interfaceC14029l);
        c7682l.f16116l = obj;
        return c7682l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7682l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
