package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٌۣؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8507l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f17593l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f17594l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8507l(AppActivity appActivity, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f17594l = appActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r6.yandex(r0, r5) == r4) goto L26;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f17593l
            r1 = 0
            r2 = 2
            r3 = 1
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L66
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            return r1
        L17:
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L35
        L1b:
            defpackage.AbstractC2829l.crashlytics(r6)
            lؒۢۦ r6 = ua.itaysonlab.vkx.VKXApplication.f36627l
            if (r6 == 0) goto L23
            goto L24
        L23:
            r6 = r1
        L24:
            java.lang.Object r6 = r6.f3601l
            lٕٝۢ r6 = (defpackage.InterfaceC15829l) r6
            lؚؐٚ r6 = r6.yandex()
            r5.f17593l = r3
            java.lang.Object r6 = defpackage.AbstractC0622l.firebase(r6, r5)
            if (r6 != r4) goto L35
            goto L65
        L35:
            lؚٔۨ r6 = (defpackage.C15343l) r6
            boolean r6 = r6.f29994l
            if (r6 != 0) goto L3e
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L3e:
            lؒۢۦ r6 = ua.itaysonlab.vkx.VKXApplication.f36627l
            if (r6 == 0) goto L43
            r1 = r6
        L43:
            java.lang.Object r6 = r1.f3601l
            lٕٝۢ r6 = (defpackage.InterfaceC15829l) r6
            lؚؐٚ r6 = r6.yandex()
            lؙٓؔ r0 = new lؙٓؔ
            r1 = 9
            r0.<init>(r6, r1)
            lؚؐٚ r6 = defpackage.AbstractC0622l.isPro(r0)
            lؔؓۙ r0 = new lؔؓۙ
            ua.itaysonlab.vkx.activity.AppActivity r1 = r5.f17594l
            r0.<init>(r2, r1)
            r5.f17593l = r2
            java.lang.Object r5 = r6.yandex(r0, r5)
            if (r5 != r4) goto L66
        L65:
            return r4
        L66:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8507l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C8507l(this.f17594l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C8507l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
