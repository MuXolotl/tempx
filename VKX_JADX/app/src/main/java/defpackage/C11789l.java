package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11789l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f23600l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f23601l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23602l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f23603l = 2;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f23604l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f23605l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11789l(C5835l c5835l, String str, int i, int i2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f23604l = c5835l;
        this.f23602l = str;
        this.f23600l = i;
        this.f23601l = i2;
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x018c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01cd -> B:82:0x01d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11789l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f23603l;
        Object obj2 = this.f23602l;
        switch (i) {
            case 0:
                return new C11789l((C7246l) obj2, interfaceC14029l);
            case 1:
                return new C11789l((C5835l) this.f23604l, (String) obj2, this.f23600l, this.f23601l, interfaceC14029l);
            default:
                return new C11789l(this.f23600l, (InterfaceC7042l) this.f23604l, this.f23601l, (C8998l) obj2, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f23603l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C11789l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11789l(C7246l c7246l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f23602l = c7246l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11789l(int i, InterfaceC7042l interfaceC7042l, int i2, C8998l c8998l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f23600l = i;
        this.f23604l = interfaceC7042l;
        this.f23601l = i2;
        this.f23602l = c8998l;
    }
}
