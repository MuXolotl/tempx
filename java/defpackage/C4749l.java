package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lًّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4749l {
    public static final C4749l yandex = new C4749l();
    public static final Map loadAd = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static C2631l yandex(EnumC9110l enumC9110l) {
        Object obj = loadAd.get(enumC9110l);
        if (obj != null) {
            return (C2631l) obj;
        }
        C18262l.firebase(enumC9110l, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008c -> B:30:0x008d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object loadAd(defpackage.AbstractC0283l r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C3992l
            if (r0 == 0) goto L13
            r0 = r9
            lٌؖؐ r0 = (defpackage.C3992l) r0
            int r1 = r0.f8203l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8203l = r1
            goto L18
        L13:
            lٌؖؐ r0 = new lٌؖؐ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r8 = r0.f8200l
            int r9 = r0.f8203l
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L38
            if (r9 != r1) goto L32
            java.lang.Object r9 = r0.f8204l
            java.util.Map r3 = r0.f8199l
            lٖؗؓ r4 = r0.f8198l
            lٌ۠ۥ r5 = r0.f8205l
            java.util.Iterator r6 = r0.f8201l
            java.util.Map r7 = r0.f8202l
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L8d
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r8)
            return r2
        L38:
            defpackage.AbstractC2829l.crashlytics(r8)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            java.util.Map r9 = defpackage.C4749l.loadAd
            int r3 = r9.size()
            int r3 = defpackage.AbstractC2200l.firebase(r3)
            r8.<init>(r3)
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r3 = r8
            r6 = r9
        L56:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lbb
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r4 = r8.getKey()
            r5 = r4
            lٌ۠ۥ r5 = (defpackage.EnumC9110l) r5
            java.lang.Object r8 = r8.getValue()
            lْٕؔ r8 = (defpackage.C2631l) r8
            lٖؗؓ r4 = r8.yandex
            r0.f8202l = r3
            r0.f8201l = r6
            r0.f8205l = r5
            r0.f8198l = r4
            r0.f8199l = r3
            r0.f8204l = r9
            r0.f8203l = r1
            java.lang.Object r8 = r4.yandex(r0)
            lٍؗؐ r7 = defpackage.EnumC9342l.f19165l
            if (r8 != r7) goto L8c
            return r7
        L8c:
            r7 = r3
        L8d:
            lْٕؔ r8 = yandex(r5)     // Catch: java.lang.Throwable -> Lb6
            lًؓۖ r8 = r8.loadAd     // Catch: java.lang.Throwable -> Lb6
            if (r8 == 0) goto L9d
            r4.billing(r2)
            r3.put(r9, r8)
            r3 = r7
            goto L56
        L9d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "Subscriber "
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lb6
            r9.append(r5)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = " has not been registered."
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb6
            throw r8     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r8 = move-exception
            r4.billing(r2)
            throw r8
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4749l.loadAd(lّؑۧ):java.lang.Object");
    }
}
