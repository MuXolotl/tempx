package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lؚؐؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6936l {
    public final LinkedHashMap loadAd = new LinkedHashMap();
    public final AbstractC8237l yandex;

    public C6936l(AbstractC8237l abstractC8237l) {
        this.yandex = abstractC8237l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (defpackage.AbstractC7572l.subscription(r1, r0, 0, r0.length, r6) == r11) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object yandex(defpackage.C6936l r14, defpackage.InterfaceC6942l r15, defpackage.InterfaceC16588l r16, java.nio.charset.Charset r17, defpackage.InterfaceC8639l r18, defpackage.AbstractC0283l r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r14.getClass()
            boolean r4 = r2 instanceof defpackage.C6326l
            if (r4 == 0) goto L1d
            r4 = r2
            lًؙؚ r4 = (defpackage.C6326l) r4
            int r5 = r4.f13273l
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.f13273l = r5
        L1b:
            r6 = r4
            goto L23
        L1d:
            lًؙؚ r4 = new lًؙؚ
            r4.<init>(r14, r2)
            goto L1b
        L23:
            java.lang.Object r2 = r6.f13271l
            int r4 = r6.f13273l
            r7 = 0
            r8 = 3
            r9 = 2
            r5 = 1
            r10 = 0
            lٍؗؐ r11 = defpackage.EnumC9342l.f19165l
            if (r4 == 0) goto L5d
            if (r4 == r5) goto L49
            if (r4 == r9) goto L41
            if (r4 != r8) goto L3b
            defpackage.AbstractC2829l.crashlytics(r2)
            goto Lc1
        L3b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r0)
            return r10
        L41:
            lُۛۡ r0 = r6.f13267l
            lٌؚۛ r1 = r6.f13266l
            defpackage.AbstractC2829l.crashlytics(r2)
            goto Lab
        L49:
            lُۛۡ r0 = r6.f13267l
            lٌؚۛ r1 = r6.f13266l
            java.nio.charset.Charset r4 = r6.f13272l
            lؘٖۘ r5 = r6.f13269l
            lؘٖۘ r5 = (defpackage.InterfaceC16588l) r5
            lؚؐٚ r12 = r6.f13270l
            defpackage.AbstractC2829l.crashlytics(r2)
            r2 = r5
            r5 = r4
            r4 = r2
            r2 = r0
            goto L91
        L5d:
            defpackage.AbstractC2829l.crashlytics(r2)
            java.util.LinkedHashMap r2 = r14.loadAd
            java.lang.Object r4 = r2.get(r0)
            if (r4 != 0) goto L70
            lُۛۡ r4 = new lُۛۡ
            r4.<init>(r0)
            r2.put(r0, r4)
        L70:
            r2 = r4
            lُۛۡ r2 = (defpackage.C11335l) r2
            byte[] r4 = r2.yandex
            r6.f13270l = r15
            r13 = r16
            lؘٖۘ r13 = (defpackage.InterfaceC16588l) r13
            r6.f13269l = r13
            r6.f13272l = r0
            r6.f13266l = r1
            r6.f13267l = r2
            r6.f13273l = r5
            int r5 = r4.length
            java.lang.Object r4 = defpackage.AbstractC7572l.subscription(r1, r4, r7, r5, r6)
            if (r4 != r11) goto L8d
            goto Lc0
        L8d:
            r12 = r15
            r4 = r16
            r5 = r0
        L91:
            lؙُٚ r0 = new lؙُٚ
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f13270l = r10
            r6.f13269l = r10
            r6.f13272l = r10
            r6.f13266l = r1
            r6.f13267l = r2
            r6.f13273l = r9
            java.lang.Object r0 = r12.yandex(r0, r6)
            if (r0 != r11) goto Laa
            goto Lc0
        Laa:
            r0 = r2
        Lab:
            byte[] r0 = r0.loadAd
            r6.f13270l = r10
            r6.f13269l = r10
            r6.f13272l = r10
            r6.f13266l = r10
            r6.f13267l = r10
            r6.f13273l = r8
            int r2 = r0.length
            java.lang.Object r0 = defpackage.AbstractC7572l.subscription(r1, r0, r7, r2, r6)
            if (r0 != r11) goto Lc1
        Lc0:
            return r11
        Lc1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6936l.yandex(lؚؐؗ, lؚؐٚ, lؘٖۘ, java.nio.charset.Charset, lٌؚۛ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(Charset charset, C11310l c11310l, C6301l c6301l, AbstractC0283l abstractC0283l) throws C4843l {
        C6201l c6201l;
        if (abstractC0283l instanceof C6201l) {
            c6201l = (C6201l) abstractC0283l;
            int i = c6201l.f13084l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6201l.f13084l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6201l = new C6201l(this, abstractC0283l);
            }
        } else {
            c6201l = new C6201l(this, abstractC0283l);
        }
        Object obj = c6201l.f13083l;
        int i2 = c6201l.f13084l;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            InterfaceC14029l interfaceC14029l = null;
            if (!AbstractC8576l.yandex(charset, AbstractC9050l.yandex) || !AbstractC8576l.yandex(c11310l.yandex, AbstractC18202l.yandex.loadAd(InterfaceC11075l.class))) {
                return null;
            }
            AbstractC8237l abstractC8237l = this.yandex;
            c6201l.f13084l = 1;
            C16552l c16552l = AbstractC11463l.yandex;
            Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C8568l(c6301l, c11310l, abstractC8237l, interfaceC14029l, 3), c6201l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            return objFirebase == enumC9342l ? enumC9342l : objFirebase;
        } catch (Throwable th) {
            throw new C4843l(2, "Illegal input: " + th.getMessage(), th);
        }
    }
}
