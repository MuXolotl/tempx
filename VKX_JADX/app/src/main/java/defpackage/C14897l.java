package defpackage;

import java.io.Serializable;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14897l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f29305l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Serializable f29306l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f29307l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f29308l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f29309l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14897l(LinkedHashSet linkedHashSet, boolean z, C6267l c6267l, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f29306l = linkedHashSet;
        this.f29305l = z;
        this.f29308l = c6267l;
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x016f  */
    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r1.compareTo(((defpackage.C4645l) r3).crashlytics) >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        if (((defpackage.C4645l) r1).purchase.length() > 0) goto L37;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14897l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f29307l;
        Object obj = this.f29308l;
        boolean z = this.f29305l;
        switch (i) {
            case 0:
                return new C14897l((LinkedHashSet) this.f29306l, z, (C6267l) obj, interfaceC14029l);
            default:
                return new C14897l(z, (C7644l) obj, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f29307l) {
            case 0:
                break;
        }
        return ((C14897l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14897l(boolean z, C7644l c7644l, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f29305l = z;
        this.f29308l = c7644l;
    }
}
