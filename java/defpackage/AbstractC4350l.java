package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: lٖؖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4350l {
    public final C14697l yandex = new C14697l();

    public final void yandex() {
        C14697l c14697l = this.yandex;
        if (c14697l != null && !c14697l.amazon) {
            c14697l.amazon = true;
            synchronized (c14697l.yandex) {
                try {
                    Iterator it = c14697l.loadAd.values().iterator();
                    while (it.hasNext()) {
                        C14697l.yandex((AutoCloseable) it.next());
                    }
                    Iterator it2 = c14697l.crashlytics.iterator();
                    while (it2.hasNext()) {
                        C14697l.yandex((AutoCloseable) it2.next());
                    }
                    c14697l.crashlytics.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        loadAd();
    }

    public void loadAd() {
    }
}
