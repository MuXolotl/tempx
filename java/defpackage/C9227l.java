package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۨٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9227l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f18970l = 1;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f18971l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f18972l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f18973l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f18974l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f18975l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f18976l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9227l(C14740l c14740l, String str, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f18972l = c14740l;
        this.f18975l = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0089 -> B:25:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c7 -> B:35:0x00c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9227l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f18970l;
        Object obj2 = this.f18975l;
        switch (i) {
            case 0:
                C9227l c9227l = new C9227l((C14740l) this.f18972l, (String) obj2, interfaceC14029l);
                c9227l.f18971l = obj;
                return c9227l;
            default:
                C9227l c9227l2 = new C9227l((C8739l) obj2, interfaceC14029l);
                c9227l2.f18971l = obj;
                return c9227l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C11129l c11129l = (C11129l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f18970l) {
            case 0:
                break;
        }
        return ((C9227l) ads(interfaceC14029l, c11129l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9227l(C8739l c8739l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f18975l = c8739l;
    }
}
