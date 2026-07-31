package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11141l {
    public static final C15578l yandex = new C15578l(-865932534, false, new C6971l(7));
    public static final C15578l loadAd = new C15578l(1419435051, false, new C6971l(9));
    public static final C15578l crashlytics = new C15578l(1075026205, false, new C6971l(12));
    public static final C15578l amazon = new C15578l(857588279, false, new C4076l(25));
    public static final C15578l purchase = new C15578l(-1785544948, false, new C6971l(13));
    public static final C15578l billing = new C15578l(-1581370488, false, new C6971l(14));
    public static final C15578l mopub = new C15578l(413936564, false, new C6971l(15));
    public static final C15578l admob = new C15578l(-761609763, false, new C6971l(16));
    public static final C15578l subs = new C15578l(910092198, false, new C2039l(1));
    public static final C15578l isPro = new C15578l(152493271, false, new C6971l(17));
    public static final C15578l firebase = new C15578l(-71920384, false, new C4076l(26));
    public static final C15578l smaato = new C15578l(-1575018690, false, new C4076l(27));
    public static final C15578l remoteconfig = new C15578l(-637985703, false, new C6971l(18));
    public static final C15578l vip = new C15578l(-2054213950, false, new C4076l(28));
    public static final C15578l metrica = new C15578l(737655040, false, new C4076l(29));
    public static final C15578l startapp = new C15578l(1674688027, false, new C6971l(19));
    public static final C15578l adcel = new C15578l(-1299016819, false, new C6971l(20));
    public static final C15578l ads = new C15578l(-1648251914, false, new C6971l(21));
    public static final C15578l subscription = new C15578l(1535873927, false, new C6971l(22));
    public static final C15578l tapsense = new C15578l(57364080, false, new C6971l(8));
    public static final C15578l Signature = new C15578l(-1433111381, false, new C6971l(10));
    public static final C15578l license = new C15578l(-315199660, false, new C6971l(11));

    public static final long admob(long j) {
        return AbstractC7563l.yandex(C15519l.isPro(j), C15519l.admob(j), C15519l.subs(j), C15519l.mopub(j));
    }

    public static long amazon(int i, long j) {
        return AbstractC7563l.yandex(i == 1 ? C15519l.isPro(j) : C15519l.subs(j), i == 1 ? C15519l.admob(j) : C15519l.mopub(j), i == 1 ? C15519l.subs(j) : C15519l.isPro(j), i == 1 ? C15519l.mopub(j) : C15519l.admob(j));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[Catch: CancellationException -> 0x0046, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0046, blocks: (B:31:0x006e, B:34:0x0085, B:17:0x0040, B:22:0x004e), top: B:52:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [lّۢٚ] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [lؙؙۣ] */
    /* JADX WARN: Type inference failed for: r1v12, types: [lؙؙۣ] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [lؙؙۣ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [lؙؙۣ] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [lؙؙۣ] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [lّۢٚ] */
    /* JADX WARN: Type inference failed for: r9v13, types: [lّۢٚ] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [lّۢٚ] */
    /* JADX WARN: Type inference failed for: r9v3, types: [lّۢٚ] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, lؙؙۣ] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object billing(defpackage.InterfaceC6843l r9, kotlin.jvm.functions.Function2 r10, defpackage.AbstractC0283l r11) {
        /*
            boolean r0 = r11 instanceof defpackage.C7352l
            if (r0 == 0) goto L13
            r0 = r11
            lؚۣٚ r0 = (defpackage.C7352l) r0
            int r1 = r0.f15250l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15250l = r1
            goto L18
        L13:
            lؚۣٚ r0 = new lؚۣٚ
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f15249l
            int r1 = r0.f15250l
            r2 = 0
            lٍؗؐ r3 = defpackage.EnumC9342l.f19165l
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L52
            if (r1 == r6) goto L48
            if (r1 == r5) goto L3a
            if (r1 != r4) goto L34
            lّۢٚ r9 = r0.f15253l
            kotlin.jvm.functions.Function2 r10 = r0.f15251l
            lؙؙۣ r1 = r0.f15252l
            defpackage.AbstractC2829l.crashlytics(r11)
            goto L43
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r9)
            return r2
        L3a:
            lّۢٚ r9 = r0.f15253l
            kotlin.jvm.functions.Function2 r10 = r0.f15251l
            lؙؙۣ r1 = r0.f15252l
            defpackage.AbstractC2829l.crashlytics(r11)     // Catch: java.util.concurrent.CancellationException -> L46
        L43:
            r11 = r9
            r9 = r1
            goto L57
        L46:
            r11 = move-exception
            goto L8f
        L48:
            lّۢٚ r9 = r0.f15253l
            kotlin.jvm.functions.Function2 r10 = r0.f15251l
            lؙؙۣ r1 = r0.f15252l
            defpackage.AbstractC2829l.crashlytics(r11)     // Catch: java.util.concurrent.CancellationException -> L46
            goto L6e
        L52:
            defpackage.AbstractC2829l.crashlytics(r11)
            lّۢٚ r11 = r0.f1295l
        L57:
            boolean r1 = defpackage.AbstractC11174l.isPro(r11)
            if (r1 == 0) goto Lb2
            r0.f15252l = r9     // Catch: java.util.concurrent.CancellationException -> L8a
            r0.f15251l = r10     // Catch: java.util.concurrent.CancellationException -> L8a
            r0.f15253l = r11     // Catch: java.util.concurrent.CancellationException -> L8a
            r0.f15250l = r6     // Catch: java.util.concurrent.CancellationException -> L8a
            java.lang.Object r1 = r10.invoke(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L8a
            if (r1 != r3) goto L6c
            goto Lb0
        L6c:
            r1 = r9
            r9 = r11
        L6e:
            r0.f15252l = r1     // Catch: java.util.concurrent.CancellationException -> L46
            r0.f15251l = r10     // Catch: java.util.concurrent.CancellationException -> L46
            r0.f15253l = r9     // Catch: java.util.concurrent.CancellationException -> L46
            r0.f15250l = r5     // Catch: java.util.concurrent.CancellationException -> L46
            lٗۨۤ r11 = new lٗۨۤ     // Catch: java.util.concurrent.CancellationException -> L46
            r11.<init>(r5, r2)     // Catch: java.util.concurrent.CancellationException -> L46
            r7 = r1
            lؚؗؐ r7 = (defpackage.C4566l) r7     // Catch: java.util.concurrent.CancellationException -> L46
            java.lang.Object r11 = r7.m1556l(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L46
            if (r11 != r3) goto L85
            goto L87
        L85:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L46
        L87:
            if (r11 != r3) goto L43
            goto Lb0
        L8a:
            r1 = move-exception
            r8 = r1
            r1 = r9
            r9 = r11
            r11 = r8
        L8f:
            boolean r7 = defpackage.AbstractC11174l.isPro(r9)
            if (r7 == 0) goto Lb1
            r0.f15252l = r1
            r0.f15251l = r10
            r0.f15253l = r9
            r0.f15250l = r4
            lٗۨۤ r11 = new lٗۨۤ
            r11.<init>(r5, r2)
            r7 = r1
            lؚؗؐ r7 = (defpackage.C4566l) r7
            java.lang.Object r11 = r7.m1556l(r11, r0)
            if (r11 != r3) goto Lac
            goto Lae
        Lac:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        Lae:
            if (r11 != r3) goto L43
        Lb0:
            return r3
        Lb1:
            throw r11
        Lb2:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11141l.billing(lؙؙۣ, kotlin.jvm.functions.Function2, lّؑۧ):java.lang.Object");
    }

    public static final Object crashlytics(InterfaceC6843l interfaceC6843l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        Object objM1556l = ((C4566l) interfaceC6843l).m1556l(new amazon(interfaceC14029l.metrica(), function2, null, 1), interfaceC14029l);
        return objM1556l == EnumC9342l.f19165l ? objM1556l : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[LOOP:0: B:20:0x0054->B:24:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003c A[EDGE_INSN: B:28:0x003c->B:16:0x003c BREAK  A[LOOP:0: B:20:0x0054->B:24:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object loadAd(defpackage.C17249l r6, defpackage.EnumC9065l r7, defpackage.AbstractC12050l r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C14992l
            if (r0 == 0) goto L13
            r0 = r8
            lٔٚۖ r0 = (defpackage.C14992l) r0
            int r1 = r0.f29501l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29501l = r1
            goto L18
        L13:
            lٔٚۖ r0 = new lٔٚۖ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29504l
            int r1 = r0.f29501l
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            lٌۜۙ r6 = r0.f29502l
            lٜٗؒ r7 = r0.f29503l
            defpackage.AbstractC2829l.crashlytics(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4b
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            r6 = 0
            return r6
        L33:
            defpackage.AbstractC2829l.crashlytics(r8)
            boolean r8 = yandex(r6)
            if (r8 != 0) goto L64
        L3c:
            r0.f29503l = r6
            r0.f29502l = r7
            r0.f29501l = r2
            java.lang.Object r8 = r6.crashlytics(r7, r0)
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            if (r8 != r1) goto L4b
            return r1
        L4b:
            lٌۦ r8 = (defpackage.C9185l) r8
            java.util.List r8 = r8.yandex
            int r1 = r8.size()
            r3 = 0
        L54:
            if (r3 >= r1) goto L64
            java.lang.Object r4 = r8.get(r3)
            lَٕٗ r4 = (defpackage.C15730l) r4
            boolean r4 = r4.amazon
            if (r4 == 0) goto L61
            goto L3c
        L61:
            int r3 = r3 + 1
            goto L54
        L64:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11141l.loadAd(lٜٗؒ, lٌۜۙ, lِۗٓ):java.lang.Object");
    }

    public static long purchase(int i, long j) {
        return AbstractC7563l.yandex(0, C15519l.admob(j), (i & 4) != 0 ? C15519l.subs(j) : 0, C15519l.mopub(j));
    }

    public static final CharSequence subs(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? AbstractC12024l.m3339return(charSequence, 4999) : AbstractC12024l.m3339return(charSequence, 5000);
    }

    public static final boolean yandex(C17249l c17249l) {
        List list = c17249l.f33476l.f9255l.yandex;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((C15730l) list.get(i)).amazon) {
                z = true;
                break;
            }
        }
        return !z;
    }

    public abstract void mopub();
}
