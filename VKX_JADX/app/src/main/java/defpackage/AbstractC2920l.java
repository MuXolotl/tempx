package defpackage;

import java.security.GeneralSecurityException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2920l {
    public static final int[] loadAd = {0, 25847, -2608894, -518909, 237124, -777960, -876248, 466468, 1826347, 2353451, -359251, -2091905, 3119733, -2884855, 3111497, 2680103, 2725464, 1024112, -1079900, 3585928, -549488, -1119584, 2619752, -2108549, -2118186, -3859737, -1399561, -3277672, 1757237, -19422, 4010497, 280005, 2706023, 95776, 3077325, 3530437, -1661693, -3592148, -2537516, 3915439, -3861115, -3043716, 3574422, -2867647, 3539968, -300467, 2348700, -539299, -1699267, -1643818, 3505694, -3821735, 3507263, -2140649, -1600420, 3699596, 811944, 531354, 954230, 3881043, 3900724, -2556880, 2071892, -2797779, -3930395, -1528703, -3677745, -3041255, -1452451, 3475950, 2176455, -1585221, -1257611, 1939314, -4083598, -1000202, -3190144, -3157330, -3632928, 126922, 3412210, -983419, 2147896, 2715295, -2967645, -3693493, -411027, -2477047, -671102, -1228525, -22981, -1308169, -381987, 1349076, 1852771, -1430430, -3343383, 264944, 508951, 3097992, 44288, -1100098, 904516, 3958618, -3724342, -8578, 1653064, -3249728, 2389356, -210977, 759969, -1316856, 189548, -3553272, 3159746, -1851402, -2409325, -177440, 1315589, 1341330, 1285669, -1584928, -812732, -1439742, -3019102, -3881060, -3628969, 3839961, 2091667, 3407706, 2316500, 3817976, -3342478, 2244091, -2446433, -3562462, 266997, 2434439, -1235728, 3513181, -3520352, -3759364, -1197226, -3193378, 900702, 1859098, 909542, 819034, 495491, -1613174, -43260, -522500, -655327, -3122442, 2031748, 3207046, -3556995, -525098, -768622, -3595838, 342297, 286988, -2437823, 4108315, 3437287, -3342277, 1735879, 203044, 2842341, 2691481, -2590150, 1265009, 4055324, 1247620, 2486353, 1595974, -3767016, 1250494, 2635921, -3548272, -2994039, 1869119, 1903435, -1050970, -1333058, 1237275, -3318210, -1430225, -451100, 1312455, 3306115, -1962642, -1279661, 1917081, -2546312, -1374803, 1500165, 777191, 2235880, 3406031, -542412, -2831860, -1671176, -1846953, -2584293, -3724270, 594136, -3776993, -2013608, 2432395, 2454455, -164721, 1957272, 3369112, 185531, -1207385, -3183426, 162844, 1616392, 3014001, 810149, 1652634, -3694233, -1799107, -3038916, 3523897, 3866901, 269760, 2213111, -975884, 1717735, 472078, -426683, 1723600, -1803090, 1910376, -1667432, -1104333, -260646, -3833893, -2939036, -2235985, -420899, -2286327, 183443, -976891, 1612842, -3545687, -554416, 3919660, -48306, -1362209, 3937738, 1400424, -846154, 1976782};
    public static C5599l yandex;

    public static C3316l amazon(String str) {
        AbstractC3302l abstractC3302l;
        C16704l c16704l = C16704l.loadAd;
        synchronized (c16704l) {
            if (!c16704l.yandex.containsKey(str)) {
                throw new GeneralSecurityException("Name " + str + " does not exist");
            }
            abstractC3302l = (AbstractC3302l) c16704l.yandex.get(str);
        }
        return new C3316l(12, abstractC3302l);
    }

    public static synchronized C11734l billing(C5187l c5187l) {
        try {
            if (yandex == null) {
                yandex = new C5599l(1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C11734l) yandex.m216l(c5187l);
    }

    public static int crashlytics(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static C9933l loadAd(Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new C9933l(0, function1Arr);
        }
        C8339l.metrica("Failed requirement.");
        return null;
    }

    public static int purchase(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        C8339l.metrica(AbstractC0653l.vip(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[LOOP:0: B:21:0x004e->B:25:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:18:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object yandex(defpackage.C17249l r6, defpackage.AbstractC12050l r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C17835l
            if (r0 == 0) goto L13
            r0 = r7
            lَ٘ۨ r0 = (defpackage.C17835l) r0
            int r1 = r0.f34766l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34766l = r1
            goto L18
        L13:
            lَ٘ۨ r0 = new lَ٘ۨ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34764l
            int r1 = r0.f34766l
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            lٜٗؒ r6 = r0.f34765l
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L3e
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.AbstractC2829l.crashlytics(r7)
        L31:
            r0.f34765l = r6
            r0.f34766l = r2
            java.lang.Object r7 = defpackage.AbstractC12900l.crashlytics(r6, r0)
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            if (r7 != r1) goto L3e
            return r1
        L3e:
            lٌۦ r7 = (defpackage.C9185l) r7
            int r1 = r7.amazon
            java.util.List r7 = r7.yandex
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L4e:
            if (r4 >= r1) goto L60
            java.lang.Object r5 = r7.get(r4)
            lَٕٗ r5 = (defpackage.C15730l) r5
            boolean r5 = defpackage.AbstractC3474l.crashlytics(r5)
            if (r5 != 0) goto L5d
            goto L31
        L5d:
            int r4 = r4 + 1
            goto L4e
        L60:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2920l.yandex(lٜٗؒ, lِۗٓ):java.lang.Object");
    }
}
