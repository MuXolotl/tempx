package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؓۥۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2241l {
    public boolean loadAd;
    public final Object yandex = new Object();
    public final ArrayList crashlytics = new ArrayList();

    public C2241l(C0488l c0488l) {
    }

    public final void yandex() {
        synchronized (this.yandex) {
            try {
                this.loadAd = true;
                Iterator it = this.crashlytics.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.crashlytics.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
