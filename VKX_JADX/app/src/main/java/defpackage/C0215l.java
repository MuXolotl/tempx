package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0215l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f1189l;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r7, r0, r6) == r4) goto L17;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f1189l
            r1 = 1
            r2 = 0
            r3 = 2
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L1b
            if (r0 == r1) goto L17
            if (r0 != r3) goto L11
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L70
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L17:
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L3a
        L1b:
            defpackage.AbstractC2829l.crashlytics(r7)
            lّۖ٘ r7 = new lّۖ٘
            lٌٌَ r0 = defpackage.C2490l.subs
            lٌؚؔ r0 = defpackage.AbstractC12832l.crashlytics()
            lٍٔؔ r0 = r0.mopub
            java.lang.String r0 = r0.ads()
            r5 = 27
            r7.<init>(r0, r5)
            r6.f1189l = r1
            java.lang.Object r7 = defpackage.AbstractC8189l.admob(r7, r6)
            if (r7 != r4) goto L3a
            goto L55
        L3a:
            ua.itaysonlab.vkapi2.methods.auth.RefreshToken$RTToken r7 = (ua.itaysonlab.vkapi2.methods.auth.RefreshToken$RTToken) r7
            java.lang.String r0 = r7.yandex
            int r0 = r0.length()
            if (r0 != 0) goto L56
            lٖۖ r7 = defpackage.AbstractC11463l.yandex
            lؔۢؒ r7 = defpackage.AbstractC17278l.yandex
            lَؕۧ r0 = new lَؕۧ
            r0.<init>(r3, r2)
            r6.f1189l = r3
            java.lang.Object r6 = defpackage.AbstractC10999l.firebase(r7, r0, r6)
            if (r6 != r4) goto L70
        L55:
            return r4
        L56:
            ua.itaysonlab.vkx.VKXApplication r6 = ua.itaysonlab.vkx.VKXApplication.f36631l
            if (r6 == 0) goto L5b
            r2 = r6
        L5b:
            java.lang.String r6 = "user"
            r0 = 0
            android.content.SharedPreferences r6 = r2.getSharedPreferences(r6, r0)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r0 = "user_token"
            java.lang.String r7 = r7.yandex
            r6.putString(r0, r7)
            r6.commit()
        L70:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0215l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C0215l(2, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0215l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
