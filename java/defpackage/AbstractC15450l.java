package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٕؕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15450l {
    public static final C13044l yandex = new C13044l(0, new long[0], new Object[0]);

    public static final int amazon(int i, int i2) {
        int iInmobi = AbstractC5020l.inmobi(i2);
        if (iInmobi != 0) {
            if (iInmobi != 1) {
                if (iInmobi == 2) {
                    return 3;
                }
                C18725l.billing();
                return 0;
            }
            int iInmobi2 = AbstractC5020l.inmobi(i);
            if (iInmobi2 != 0) {
                if (iInmobi2 == 1) {
                    return 2;
                }
                if (iInmobi2 == 2) {
                    return 3;
                }
                C18725l.billing();
                return 0;
            }
        }
        return 1;
    }

    public static final void crashlytics(C9967l c9967l, Function1 function1) {
        int iSmaato = AbstractC14055l.smaato(c9967l.getFragmentStack()) - 2;
        if (iSmaato < 0) {
            iSmaato = 0;
        }
        int iSmaato2 = AbstractC14055l.smaato(c9967l.getFragmentStack());
        if (iSmaato > iSmaato2) {
            return;
        }
        while (true) {
            function1.invoke(c9967l.getFragmentStack().get(iSmaato));
            if (iSmaato == iSmaato2) {
                return;
            } else {
                iSmaato++;
            }
        }
    }

    public static final C2159l loadAd(C0327l c0327l, int i, int i2, int i3, long j, boolean z, boolean z2) {
        C3242l c3242l;
        if (z) {
            c3242l = null;
        } else {
            int i4 = C12814l.crashlytics;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            c3242l = new C3242l(new C15812l(AbstractC7798l.crashlytics(c0327l, i5), 1L, i5), new C15812l(AbstractC7798l.crashlytics(c0327l, i6), 1L, i6), C12814l.admob(j));
        }
        return new C2159l(z2, 1, 1, c3242l, new C3737l(1L, 1, i, i2, i3, c0327l));
    }

    public static int purchase(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[LOOP:2: B:31:0x007f->B:42:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd A[EDGE_INSN: B:50:0x00dd->B:43:0x00dd BREAK  A[LOOP:2: B:31:0x007f->B:42:0x00d6], SYNTHETIC] */
    public static final C18730l yandex(C3242l c3242l, List list, Function1 function1, Function2 function2, Function4 function4) {
        long j;
        C3242l c3242l2;
        Function1 function3 = function1;
        long j2 = c3242l.yandex.crashlytics;
        C15812l c15812l = c3242l.loadAd;
        long j3 = c15812l.crashlytics;
        if (j2 == j3) {
            C18730l c18730l = AbstractC17774l.yandex;
            C18730l c18730l2 = new C18730l();
            c18730l2.subs(j2, c3242l);
            return c18730l2;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Number) function3.invoke(it.next())).longValue() == j2) {
                break;
            }
            i++;
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (((Number) function3.invoke(it2.next())).longValue() == j3) {
                break;
            }
            i2++;
        }
        if (i == -1 || i2 == -1) {
            return AbstractC17774l.yandex;
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        boolean z = i > i2;
        C18730l c18730l3 = AbstractC17774l.yandex;
        C18730l c18730l4 = new C18730l();
        if (iMin <= iMax) {
            while (true) {
                Object obj = list.get(iMin);
                long jLongValue = ((Number) function3.invoke(obj)).longValue();
                if (jLongValue != j2) {
                    j = j2;
                    if (jLongValue == j3) {
                        c3242l2 = (C3242l) function4.invoke(obj, Boolean.FALSE, Integer.valueOf(c15812l.loadAd), Boolean.valueOf(z));
                    } else {
                        c3242l2 = (C3242l) function2.invoke(obj, Boolean.valueOf(z));
                    }
                    if (c3242l2 != null) {
                        c18730l4.subs(jLongValue, c3242l2);
                    }
                    if (iMin != iMax) {
                        break;
                    }
                    iMin++;
                    function3 = function1;
                    j2 = j;
                } else {
                    j = j2;
                    c3242l2 = (C3242l) function4.invoke(obj, Boolean.TRUE, Integer.valueOf(c3242l.yandex.loadAd), Boolean.valueOf(z));
                }
                if (c3242l2 != null) {
                    c18730l4.subs(jLongValue, c3242l2);
                }
                if (iMin != iMax) {
                    break;
                    break;
                }
                iMin++;
                function3 = function1;
                j2 = j;
            }
        }
        return c18730l4;
    }
}
