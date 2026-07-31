package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٌۣؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9142l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f18792l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f18793l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9142l(AppActivity appActivity, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f18793l = appActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (defpackage.C15224l.yandex.yandex(r5.f18793l, (4 & 2) == 0, (4 & 4) == 0, r5) == r4) goto L18;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f18792l
            r1 = 0
            r2 = 2
            r3 = 1
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L38
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            return r1
        L17:
            defpackage.AbstractC2829l.crashlytics(r6)
            goto L2c
        L1b:
            defpackage.AbstractC2829l.crashlytics(r6)
            lؘؒؔ r6 = ua.itaysonlab.vkx.VKXApplication.f36626l
            if (r6 == 0) goto L23
            r1 = r6
        L23:
            r5.f18792l = r3
            java.lang.Object r6 = r1.loadAd(r5)
            if (r6 != r4) goto L2c
            goto L37
        L2c:
            r5.f18792l = r2
            ua.itaysonlab.vkx.activity.AppActivity r6 = r5.f18793l
            r0 = 6
            java.lang.Object r5 = defpackage.C15224l.loadAd(r6, r5, r0)
            if (r5 != r4) goto L38
        L37:
            return r4
        L38:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9142l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C9142l(this.f18793l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9142l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
