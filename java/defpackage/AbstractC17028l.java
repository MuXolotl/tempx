package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: lٍَٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17028l {
    public static final C13161l yandex;

    static {
        Object c6776l;
        ((C11673l) AbstractC4609l.yandex).getClass();
        AtomicReference atomicReference = C13387l.billing;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            C18589l c18589l = (C18589l) atomicReference.get();
            c6776l = new C6776l(strReplace, c18589l.yandex, c18589l.loadAd, c18589l.crashlytics);
        } else {
            for (int i = 7; i >= 0; i--) {
                char cCharAt = "Phlogger".charAt(i);
                if (cCharAt == '$') {
                    strReplace = "Phlogger".replace('$', '.');
                    break;
                } else {
                    if (cCharAt == '.') {
                        break;
                    }
                }
            }
            C13387l c13387l = new C13387l(strReplace);
            if (C13387l.crashlytics || C13387l.amazon) {
                c13387l.loadAd = new C6310l(strReplace);
            } else if (C13387l.purchase) {
                C18589l c18589l2 = C6776l.admob;
                c13387l.loadAd = new C6776l(strReplace, Level.OFF, c18589l2.loadAd, c18589l2.crashlytics);
            } else {
                c13387l.loadAd = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = AbstractC5704l.yandex;
            concurrentLinkedQueue.offer(c13387l);
            c6776l = c13387l;
            if (atomicReference.get() != null) {
                while (true) {
                    C13387l c13387l2 = (C13387l) concurrentLinkedQueue.poll();
                    if (c13387l2 == null) {
                        break;
                    }
                    C18589l c18589l3 = (C18589l) atomicReference.get();
                    c13387l2.loadAd = new C6776l(c13387l2.yandex, c18589l3.yandex, c18589l3.loadAd, c18589l3.crashlytics);
                }
                C13387l.amazon();
                c6776l = c13387l;
            }
        }
        yandex = new C13161l(c6776l);
    }
}
