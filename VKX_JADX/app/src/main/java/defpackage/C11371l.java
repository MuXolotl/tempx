package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُ۟ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11371l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f22925l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C3469l f22926l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22927l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f22928l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f22929l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C11911l f22930l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC12074l f22931l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11371l(C11911l c11911l, String str, C3469l c3469l, Function2 function2, Object obj, AbstractC12074l abstractC12074l, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f22930l = c11911l;
        this.f22925l = str;
        this.f22926l = c3469l;
        this.f22929l = function2;
        this.f22927l = obj;
        this.f22931l = abstractC12074l;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (r10 == r8) goto L38;
     */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f22928l
            lّۢٚ r1 = r10.f1295l
            lؚّ۠ r2 = defpackage.C7725l.f16217l
            java.lang.String r3 = r10.f22925l
            lَِ٘ r4 = r10.f22930l
            r5 = 3
            r6 = 2
            r7 = 1
            lٍؗؐ r8 = defpackage.EnumC9342l.f19165l
            if (r0 == 0) goto L2b
            if (r0 == r7) goto L27
            if (r0 == r6) goto L23
            if (r0 != r5) goto L1c
            defpackage.AbstractC2829l.crashlytics(r11)
            goto La1
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r10)
            r10 = 0
            return r10
        L23:
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L76
        L27:
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L59
        L2b:
            defpackage.AbstractC2829l.crashlytics(r11)
            java.lang.String r11 = r4.yandex
            r10.f22928l = r7
            boolean r0 = defpackage.AbstractC16828l.yandex()
            if (r0 != 0) goto L3b
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            goto L51
        L3b:
            lؘ٘ۨ r0 = r1.mo245l(r2)
            if (r0 == 0) goto L4f
            lًّؒ r0 = (defpackage.C7725l) r0
            java.util.List r0 = r0.f16218l
            lَٙؑ r9 = new lَٙؑ
            r9.<init>(r11, r7, r3)
            r0.add(r9)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L4f:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L51:
            if (r11 != r8) goto L54
            goto L56
        L54:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L56:
            if (r11 != r8) goto L59
            goto La0
        L59:
            kotlin.jvm.functions.Function2 r11 = r10.f22929l
            java.lang.Object r0 = r10.f22927l
            lِۙ r7 = r10.f22931l
            java.lang.Object r11 = r11.invoke(r0, r7)
            java.lang.Object r0 = r7.f24000l
            lٍۦۖ r0 = (defpackage.InterfaceC9955l) r0
            java.lang.Object r7 = r7.crashlytics()
            r10.f22928l = r6
            lؕٙٓ r9 = r10.f22926l
            java.lang.Object r11 = r9.invoke(r11, r0, r7, r10)
            if (r11 != r8) goto L76
            goto La0
        L76:
            java.lang.String r11 = r4.yandex
            r10.f22928l = r5
            boolean r10 = defpackage.AbstractC16828l.yandex()
            if (r10 != 0) goto L83
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            goto L99
        L83:
            lؘ٘ۨ r10 = r1.mo245l(r2)
            if (r10 == 0) goto L97
            lًّؒ r10 = (defpackage.C7725l) r10
            java.util.List r10 = r10.f16218l
            lَٙؑ r0 = new lَٙؑ
            r0.<init>(r11, r6, r3)
            r10.add(r0)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L97:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L99:
            if (r10 != r8) goto L9c
            goto L9e
        L9c:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L9e:
            if (r10 != r8) goto La1
        La0:
            return r8
        La1:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11371l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C11371l(this.f22930l, this.f22925l, this.f22926l, this.f22929l, this.f22927l, this.f22931l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C11371l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
