package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘۜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5973l extends AbstractC13821l {
    public final /* synthetic */ Object billing;
    public final /* synthetic */ int purchase = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5973l(C0093l c0093l, String str) {
        super(str, true);
        this.billing = c0093l;
    }

    @Override // defpackage.AbstractC13821l
    public final long yandex() {
        switch (this.purchase) {
            case 0:
                C0093l c0093l = (C0093l) this.billing;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - c0093l.f1006l) + 1;
                C13247l c13247l = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                C13247l c13247l2 = null;
                C13247l c13247l3 = null;
                int i2 = 0;
                for (C13247l c13247l4 : (ConcurrentLinkedQueue) c0093l.f1007l) {
                    synchronized (c13247l4) {
                        if (c0093l.crashlytics(c13247l4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = c13247l4.adcel;
                            if (j3 < j) {
                                j = j3;
                                c13247l2 = c13247l4;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                c13247l3 = c13247l4;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                if (c13247l2 != null) {
                    c13247l = c13247l2;
                } else if (i > 5) {
                    j = j2;
                    c13247l = c13247l3;
                } else {
                    j = -1;
                }
                if (c13247l == null) {
                    if (c13247l3 != null) {
                        return (j2 + c0093l.f1006l) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return c0093l.f1006l;
                    }
                    return -1L;
                }
                synchronized (c13247l) {
                    if (c13247l.startapp.isEmpty() && c13247l.adcel == j) {
                        c13247l.isPro = true;
                        ((ConcurrentLinkedQueue) c0093l.f1007l).remove(c13247l);
                        AbstractC11432l.crashlytics(c13247l.purchase);
                        if (!((ConcurrentLinkedQueue) c0093l.f1007l).isEmpty()) {
                            return 0L;
                        }
                        ((C7522l) c0093l.f1005l).yandex();
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((Function0) this.billing).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5973l(String str, boolean z, Function0 function0) {
        super(str, z);
        this.billing = function0;
    }
}
