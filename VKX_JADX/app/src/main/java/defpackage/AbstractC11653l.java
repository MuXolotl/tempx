package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lِؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11653l extends AbstractC16531l {
    public C13187l amazon;
    public C15053l crashlytics;
    public Executor loadAd;
    public ArrayList purchase;
    public final Object yandex = new Object();

    public final void isPro(C13187l c13187l, ArrayList arrayList) {
        if (c13187l == null) {
            C6541l.subs("groupRoute must not be null");
            return;
        }
        synchronized (this.yandex) {
            try {
                Executor executor = this.loadAd;
                if (executor != null) {
                    executor.execute(new RunnableC4063l(this, this.crashlytics, c13187l, arrayList, 9));
                } else {
                    this.amazon = c13187l;
                    this.purchase = new ArrayList(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
