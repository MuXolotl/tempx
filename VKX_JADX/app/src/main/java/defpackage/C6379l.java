package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؙُؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6379l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ String f13351l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ byte[] f13352l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f13353l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C7424l f13354l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ long f13355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6379l(C7424l c7424l, InterfaceC14029l interfaceC14029l) {
        super(4, interfaceC14029l);
        this.f13354l = c7424l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r10, r2, r9) == r8) goto L17;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r10) {
        /*
            r9 = this;
            long r0 = r9.f13355l
            java.lang.String r2 = r9.f13351l
            byte[] r3 = r9.f13352l
            int r4 = r9.f13353l
            r5 = 2
            r6 = 1
            r7 = 0
            lٍؗؐ r8 = defpackage.EnumC9342l.f19165l
            if (r4 == 0) goto L21
            if (r4 == r6) goto L1d
            if (r4 != r5) goto L17
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L57
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            return r7
        L1d:
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L33
        L21:
            defpackage.AbstractC2829l.crashlytics(r10)
            r9.f13351l = r7
            r9.f13352l = r7
            r9.f13355l = r0
            r9.f13353l = r6
            java.lang.Object r10 = defpackage.C12450l.yandex(r0, r2, r3, r9)
            if (r10 != r8) goto L33
            goto L56
        L33:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L57
            lٖۖ r10 = defpackage.AbstractC11463l.yandex
            lؔۢؒ r10 = defpackage.AbstractC17278l.yandex
            lؔۢؒ r10 = r10.f6462l
            lؘؗۚ r2 = new lؘؗۚ
            lؚٟؕ r3 = r9.f13354l
            r2.<init>(r3, r7, r6)
            r9.f13351l = r7
            r9.f13352l = r7
            r9.f13355l = r0
            r9.f13353l = r5
            java.lang.Object r9 = defpackage.AbstractC10999l.firebase(r10, r2, r9)
            if (r9 != r8) goto L57
        L56:
            return r8
        L57:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6379l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        C6379l c6379l = new C6379l(this.f13354l, (InterfaceC14029l) obj4);
        c6379l.f13355l = jLongValue;
        c6379l.f13351l = (String) obj2;
        c6379l.f13352l = (byte[]) obj3;
        return c6379l.Signature(Unit.INSTANCE);
    }
}
