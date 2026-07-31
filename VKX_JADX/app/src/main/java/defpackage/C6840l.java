package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙۣؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6840l implements InterfaceC4335l {
    public final C4910l yandex = AbstractC8618l.yandex();
    public final C3142l loadAd = new C3142l(0);
    public final C14970l crashlytics = new C14970l(8, new C0071l(2, null, 9));

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4335l
    public final Object amazon(Function2 function2, AbstractC0283l abstractC0283l) throws Throwable {
        C0921l c0921l;
        C4910l c4910l;
        boolean z;
        Throwable th;
        if (abstractC0283l instanceof C0921l) {
            c0921l = (C0921l) abstractC0283l;
            int i = c0921l.f2598l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0921l.f2598l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0921l = new C0921l(this, abstractC0283l);
            }
        } else {
            c0921l = new C0921l(this, abstractC0283l);
        }
        Object obj = c0921l.f2601l;
        int i2 = c0921l.f2598l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c0921l.f2599l;
            c4910l = c0921l.f2600l;
            try {
                AbstractC2829l.crashlytics(obj);
                if (z) {
                    c4910l.billing(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    c4910l.billing(null);
                }
                throw th;
            }
        }
        AbstractC2829l.crashlytics(obj);
        C4910l c4910l2 = this.yandex;
        boolean zMopub = c4910l2.mopub();
        try {
            Boolean boolValueOf = Boolean.valueOf(zMopub);
            c0921l.f2600l = c4910l2;
            c0921l.f2599l = zMopub;
            c0921l.f2598l = 1;
            Object objInvoke = function2.invoke(boolValueOf, c0921l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objInvoke == enumC9342l) {
                return enumC9342l;
            }
            c4910l = c4910l2;
            z = zMopub;
            obj = objInvoke;
            if (z) {
                c4910l.billing(null);
            }
            return obj;
        } catch (Throwable th3) {
            c4910l = c4910l2;
            z = zMopub;
            th = th3;
            if (z) {
                c4910l.billing(null);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC4335l
    public final Object crashlytics(C12674l c12674l) {
        return new Integer(this.loadAd.yandex.incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [lؙۣؑ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.InterfaceC4335l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadAd(kotlin.jvm.functions.Function1 r7, defpackage.AbstractC0283l r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C6300l
            if (r0 == 0) goto L13
            r0 = r8
            lًؙؙ r0 = (defpackage.C6300l) r0
            int r1 = r0.f13251l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13251l = r1
            goto L18
        L13:
            lًؙؙ r0 = new lًؙؙ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13247l
            int r1 = r0.f13251l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L44
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            lٍؓؕ r6 = r0.f13249l
            defpackage.AbstractC2829l.crashlytics(r8)     // Catch: java.lang.Throwable -> L2d
            goto L6b
        L2d:
            r7 = move-exception
            goto L6f
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r4
        L35:
            int r6 = r0.f13252l
            lٍؓؕ r7 = r0.f13249l
            lٌؘۦ r1 = r0.f13250l
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            defpackage.AbstractC2829l.crashlytics(r8)
            r8 = r6
            r6 = r7
            r7 = r1
            goto L5c
        L44:
            defpackage.AbstractC2829l.crashlytics(r8)
            r8 = r7
            lٌؘۦ r8 = (defpackage.AbstractC5563l) r8
            r0.f13250l = r8
            lٖؗؓ r6 = r6.yandex
            r0.f13249l = r6
            r8 = 0
            r0.f13252l = r8
            r0.f13251l = r3
            java.lang.Object r1 = r6.yandex(r0)
            if (r1 != r5) goto L5c
            goto L6a
        L5c:
            r0.f13250l = r4     // Catch: java.lang.Throwable -> L2d
            r0.f13249l = r6     // Catch: java.lang.Throwable -> L2d
            r0.f13252l = r8     // Catch: java.lang.Throwable -> L2d
            r0.f13251l = r2     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6.billing(r4)
            return r8
        L6f:
            r6.billing(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6840l.loadAd(kotlin.jvm.functions.Function1, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC4335l
    public final InterfaceC6942l purchase() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC4335l
    public final Object yandex(AbstractC0283l abstractC0283l) {
        return new Integer(this.loadAd.yandex.get());
    }
}
