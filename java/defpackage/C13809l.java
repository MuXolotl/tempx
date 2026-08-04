package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lْۦۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13809l implements InterfaceC18129l {
    public final ArrayList loadAd;
    public final AbstractC8237l yandex;

    public C13809l(AbstractC8237l abstractC8237l) {
        this.yandex = abstractC8237l;
        List list = AbstractC1706l.yandex;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C3785l) it.next()).getClass();
            arrayList.add(new C6936l(abstractC8237l));
        }
        this.loadAd = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.InterfaceC18129l
    public final Object loadAd(C5254l c5254l, Charset charset, C11310l c11310l, Object obj, AbstractC0283l abstractC0283l) throws IOException {
        C0467l c0467l;
        C11310l c11310l2;
        Charset charset2;
        Object obj2;
        InterfaceC16588l interfaceC16588lAmazon;
        AbstractC8237l abstractC8237l = this.yandex;
        C13975l c13975l = abstractC8237l.loadAd;
        if (abstractC0283l instanceof C0467l) {
            c0467l = (C0467l) abstractC0283l;
            int i = c0467l.f1704l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0467l.f1704l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0467l = new C0467l(this, abstractC0283l);
            }
        } else {
            c0467l = new C0467l(this, abstractC0283l);
        }
        Object objVip = c0467l.f1703l;
        int i2 = c0467l.f1704l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objVip);
            c11310l2 = c11310l;
            C12265l c12265l = new C12265l(new C14970l(4, this.loadAd), c5254l, charset, c11310l2, obj);
            C2051l c2051l = new C2051l(2, interfaceC14029l, 7);
            c0467l.f1706l = c5254l;
            c0467l.f1705l = charset;
            c0467l.f1708l = c11310l2;
            c0467l.f1702l = obj;
            c0467l.f1704l = 1;
            objVip = AbstractC0622l.vip(c12265l, c2051l, c0467l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objVip == enumC9342l) {
                return enumC9342l;
            }
            charset2 = charset;
            obj2 = obj;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = c0467l.f1702l;
            C11310l c11310l3 = c0467l.f1708l;
            Charset charset3 = c0467l.f1705l;
            C5254l c5254l2 = c0467l.f1706l;
            AbstractC2829l.crashlytics(objVip);
            c11310l2 = c11310l3;
            c5254l = c5254l2;
            charset2 = charset3;
        }
        AbstractC8870l abstractC8870l = (AbstractC8870l) objVip;
        if (abstractC8870l != null) {
            return abstractC8870l;
        }
        try {
            interfaceC16588lAmazon = AbstractC0135l.purchase(c13975l, c11310l2);
        } catch (C14747l unused) {
            interfaceC16588lAmazon = AbstractC0135l.amazon(obj2, c13975l);
        }
        String strCrashlytics = abstractC8237l.crashlytics(interfaceC16588lAmazon, obj2);
        int i3 = AbstractC15755l.yandex;
        if (c5254l.f11337l.toLowerCase(Locale.ROOT).equals("text")) {
            c5254l = c5254l.m1756l(charset2.name());
        }
        return new C2627l(strCrashlytics, c5254l, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r9 == r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:25:0x007f). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC18129l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yandex(java.nio.charset.Charset r6, defpackage.C11310l r7, defpackage.InterfaceC9354l r8, defpackage.AbstractC0283l r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.C7141l
            if (r0 == 0) goto L13
            r0 = r9
            lٌؘؚ r0 = (defpackage.C7141l) r0
            int r1 = r0.f14940l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14940l = r1
            goto L18
        L13:
            lٌؘؚ r0 = new lٌؘؚ
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f14939l
            int r1 = r0.f14940l
            r2 = 2
            r3 = 1
            lٍؗؐ r4 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L32
            java.util.Iterator r6 = r0.f14938l
            lٖٓۡ r7 = r0.f14944l
            lُۚٔ r8 = r0.f14941l
            java.nio.charset.Charset r1 = r0.f14942l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L7f
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            r5 = 0
            return r5
        L39:
            lُۚٔ r7 = r0.f14941l
            java.nio.charset.Charset r6 = r0.f14942l
            defpackage.AbstractC2829l.crashlytics(r9)
            goto L51
        L41:
            defpackage.AbstractC2829l.crashlytics(r9)
            r0.f14942l = r6
            r0.f14941l = r7
            r0.f14940l = r3
            java.lang.Object r9 = defpackage.AbstractC10310l.premium(r8, r0)
            if (r9 != r4) goto L51
            goto L7e
        L51:
            lٖٓۡ r9 = (defpackage.InterfaceC14189l) r9
            java.util.ArrayList r8 = r5.loadAd
            java.util.Iterator r8 = r8.iterator()
            r1 = r6
            r6 = r8
            r8 = r7
            r7 = r9
        L5d:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L83
            java.lang.Object r9 = r6.next()
            lؚؐؗ r9 = (defpackage.C6936l) r9
            lٌؙؙ r3 = new lٌؙؙ
            r3.<init>(r7)
            r0.f14942l = r1
            r0.f14941l = r8
            r0.f14944l = r7
            r0.f14938l = r6
            r0.f14940l = r2
            java.lang.Object r9 = r9.loadAd(r1, r8, r3, r0)
            if (r9 != r4) goto L7f
        L7e:
            return r4
        L7f:
            if (r9 != 0) goto L82
            goto L5d
        L82:
            return r9
        L83:
            lًۙۚ r5 = r5.yandex
            lؘٓۙ r6 = r5.loadAd
            lؘٖۘ r6 = defpackage.AbstractC0135l.purchase(r6, r8)
            lؘٖۘ r6 = (defpackage.InterfaceC16588l) r6     // Catch: java.lang.Throwable -> L96
            java.lang.String r7 = defpackage.C17423l.firebase(r7, r1, r2)     // Catch: java.lang.Throwable -> L96
            java.lang.Object r5 = r5.loadAd(r6, r7)     // Catch: java.lang.Throwable -> L96
            return r5
        L96:
            r5 = move-exception
            lّٖؗ r6 = new lّٖؗ
            java.lang.String r7 = r5.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Illegal input: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r2, r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13809l.yandex(java.nio.charset.Charset, lُۚٔ, lٍؘؒ, lّؑۧ):java.lang.Object");
    }
}
