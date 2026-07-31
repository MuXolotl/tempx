package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7289l {
    public static final float yandex = 0.125f / 18.0f;

    public static final float admob(InterfaceC3114l interfaceC3114l, int i) {
        return i == 2 ? interfaceC3114l.billing() * yandex : interfaceC3114l.billing();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca A[LOOP:0: B:26:0x00b5->B:30:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3 A[EDGE_INSN: B:68:0x00d3->B:32:0x00d3 BREAK  A[LOOP:0: B:26:0x00b5->B:30:0x00ca], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015e -> B:62:0x0164). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object amazon(defpackage.C17249l r18, long r19, defpackage.C1645l r21, defpackage.AbstractC12050l r22) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7289l.amazon(lٜٗؒ, long, lٜؓؗ, lِۗٓ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object billing(defpackage.C17249l r4, long r5, kotlin.jvm.functions.Function1 r7, defpackage.AbstractC12050l r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C6328l
            if (r0 == 0) goto L13
            r0 = r8
            lًؙّ r0 = (defpackage.C6328l) r0
            int r1 = r0.f13274l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13274l = r1
            goto L18
        L13:
            lًؙّ r0 = new lًؙّ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f13277l
            int r1 = r0.f13274l
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            kotlin.jvm.functions.Function1 r4 = r0.f13275l
            lٜٗؒ r5 = r0.f13276l
            defpackage.AbstractC2829l.crashlytics(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r4)
            r4 = 0
            return r4
        L32:
            defpackage.AbstractC2829l.crashlytics(r8)
        L35:
            r0.f13276l = r4
            r0.f13275l = r7
            r0.f13274l = r2
            java.lang.Object r8 = loadAd(r4, r5, r0)
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r8 != r5) goto L44
            return r5
        L44:
            lَٕٗ r8 = (defpackage.C15730l) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.AbstractC3474l.billing(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.yandex
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7289l.billing(lٜٗؒ, long, kotlin.jvm.functions.Function1, lِۗٓ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [lَۥۚ] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final Object crashlytics(C17249l c17249l, long j, AbstractC0283l abstractC0283l) {
        C7722l c7722l;
        Object obj;
        C15730l c15730l;
        C9122l c9122l;
        if (abstractC0283l instanceof C7722l) {
            c7722l = (C7722l) abstractC0283l;
            int i = c7722l.f16213l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7722l.f16213l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7722l = new C7722l(abstractC0283l);
            }
        } else {
            c7722l = new C7722l(abstractC0283l);
        }
        Object obj2 = c7722l.f16212l;
        int i2 = c7722l.f16213l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj2);
                if (!mopub(c17249l.f33476l.f9255l, j)) {
                    List list = c17249l.f33476l.f9255l.yandex;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i3);
                        if (AbstractC17265l.purchase(((C15730l) obj).yandex, j)) {
                            break;
                        }
                        i3++;
                    }
                    c15730l = (C15730l) obj;
                    if (c15730l != null) {
                        C10700l c10700l = new C10700l();
                        C10700l c10700l2 = new C10700l();
                        c10700l2.f21708l = c15730l;
                        long jLoadAd = c17249l.purchase().loadAd();
                        C9122l c9122l2 = new C9122l();
                        Function2 c4783l = new C4783l(c9122l2, c10700l2, c10700l, null);
                        c7722l.f16215l = c15730l;
                        c7722l.f16214l = c10700l;
                        c7722l.f16216l = c9122l2;
                        c7722l.f16213l = 1;
                        Object objBilling = c17249l.billing(jLoadAd, c4783l, c7722l);
                        Object obj3 = EnumC9342l.f19165l;
                        if (objBilling == obj3) {
                            return obj3;
                        }
                        c9122l = c9122l2;
                        j = c10700l;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9122l = c7722l.f16216l;
            C10700l c10700l3 = c7722l.f16214l;
            c15730l = c7722l.f16215l;
            AbstractC2829l.crashlytics(obj2);
            j = c10700l3;
            if (c9122l.f18750l) {
                C15730l c15730l2 = (C15730l) j.f21708l;
                return c15730l2 == null ? c15730l : c15730l2;
            }
            return null;
        } catch (C15658l unused) {
            C15730l c15730l3 = (C15730l) j.f21708l;
            return c15730l3 == null ? c15730l : c15730l3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[LOOP:0: B:23:0x0065->B:27:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007d A[EDGE_INSN: B:54:0x007d->B:29:0x007d BREAK  A[LOOP:0: B:23:0x0065->B:27:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0058 -> B:22:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object loadAd(defpackage.C17249l r12, long r13, defpackage.AbstractC0283l r15) {
        /*
            boolean r0 = r15 instanceof defpackage.C3168l
            if (r0 == 0) goto L13
            r0 = r15
            lؕؕؖ r0 = (defpackage.C3168l) r0
            int r1 = r0.f6805l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6805l = r1
            goto L18
        L13:
            lؕؕؖ r0 = new lؕؕؖ
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f6808l
            int r1 = r0.f6805l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            lّٗؖ r12 = r0.f6806l
            lٜٗؒ r13 = r0.f6807l
            defpackage.AbstractC2829l.crashlytics(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5b
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r12)
            return r3
        L33:
            defpackage.AbstractC2829l.crashlytics(r15)
            lؚؗؐ r15 = r12.f33476l
            lٌۦ r15 = r15.f9255l
            boolean r15 = mopub(r15, r13)
            if (r15 == 0) goto L42
            goto Lc0
        L42:
            lّٗؖ r15 = new lّٗؖ
            r15.<init>()
            r15.f33243l = r13
        L49:
            r0.f6807l = r12
            r0.f6806l = r15
            r0.f6805l = r2
            java.lang.Object r13 = defpackage.AbstractC12900l.crashlytics(r12, r0)
            lٍؗؐ r14 = defpackage.EnumC9342l.f19165l
            if (r13 != r14) goto L58
            return r14
        L58:
            r11 = r15
            r15 = r13
            r13 = r11
        L5b:
            lٌۦ r15 = (defpackage.C9185l) r15
            java.util.List r14 = r15.yandex
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L65:
            if (r5 >= r1) goto L7c
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            lَٕٗ r7 = (defpackage.C15730l) r7
            long r7 = r7.yandex
            long r9 = r13.f33243l
            boolean r7 = defpackage.AbstractC17265l.purchase(r7, r9)
            if (r7 == 0) goto L79
            goto L7d
        L79:
            int r5 = r5 + 1
            goto L65
        L7c:
            r6 = r3
        L7d:
            lَٕٗ r6 = (defpackage.C15730l) r6
            if (r6 != 0) goto L83
            r6 = r3
            goto Lb7
        L83:
            boolean r14 = defpackage.AbstractC3474l.billing(r6)
            if (r14 == 0) goto Lab
            java.util.List r14 = r15.yandex
            int r15 = r14.size()
        L8f:
            if (r4 >= r15) goto La0
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            lَٕٗ r5 = (defpackage.C15730l) r5
            boolean r5 = r5.amazon
            if (r5 == 0) goto L9d
            goto La1
        L9d:
            int r4 = r4 + 1
            goto L8f
        La0:
            r1 = r3
        La1:
            lَٕٗ r1 = (defpackage.C15730l) r1
            if (r1 != 0) goto La6
            goto Lb7
        La6:
            long r14 = r1.yandex
            r13.f33243l = r14
            goto Lc1
        Lab:
            long r14 = defpackage.AbstractC3474l.subs(r6, r2)
            r4 = 0
            boolean r14 = defpackage.C1187l.loadAd(r14, r4)
            if (r14 != 0) goto Lc1
        Lb7:
            if (r6 == 0) goto Lc0
            boolean r12 = r6.crashlytics()
            if (r12 != 0) goto Lc0
            return r6
        Lc0:
            return r3
        Lc1:
            r15 = r13
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7289l.loadAd(lٜٗؒ, long, lّؑۧ):java.lang.Object");
    }

    public static final boolean mopub(C9185l c9185l, long j) {
        Object obj;
        List list = c9185l.yandex;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (AbstractC17265l.purchase(((C15730l) obj).yandex, j)) {
                break;
            }
            i++;
        }
        C15730l c15730l = (C15730l) obj;
        if (c15730l != null && c15730l.amazon) {
            z = true;
        }
        return true ^ z;
    }

    public static final Object purchase(InterfaceC6843l interfaceC6843l, Function1 function1, Function0 function0, Function0 function2, Function2 function3, AbstractC0283l abstractC0283l) {
        Object objCrashlytics = AbstractC11141l.crashlytics(interfaceC6843l, new C11274l(new C3321l(16), new C1350l(22, function1), function3, function2, new C6199l(5, function0), null), abstractC0283l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objCrashlytics != enumC9342l) {
            objCrashlytics = Unit.INSTANCE;
        }
        return objCrashlytics == enumC9342l ? objCrashlytics : Unit.INSTANCE;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0406 -> B:91:0x03b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0444 -> B:164:0x0599). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0584 -> B:161:0x058a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x05af -> B:165:0x059a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x061a -> B:179:0x0623). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x022f -> B:31:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02c0 -> B:31:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0315 -> B:77:0x0377). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0360 -> B:74:0x036b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17701. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final java.lang.Object subs(defpackage.C17249l r28, defpackage.C15730l r29, defpackage.C3321l r30, defpackage.C1350l r31, kotlin.jvm.functions.Function2 r32, kotlin.jvm.functions.Function0 r33, defpackage.C6199l r34, defpackage.AbstractC12050l r35) {
        /*
            Method dump skipped, instruction units count: 1770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7289l.subs(lٜٗؒ, lَٕٗ, lُؕٙ, lؒۜۖ, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, lؙۣؒ, lِۗٓ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1 A[LOOP:0: B:24:0x009d->B:28:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6 A[EDGE_INSN: B:65:0x00b6->B:30:0x00b6 BREAK  A[LOOP:0: B:24:0x009d->B:28:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0089 -> B:23:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object yandex(defpackage.C17249l r17, defpackage.C15730l r18, defpackage.EnumC9065l r19, defpackage.AbstractC12050l r20) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7289l.yandex(lٜٗؒ, lَٕٗ, lٌۜۙ, lِۗٓ):java.lang.Object");
    }
}
