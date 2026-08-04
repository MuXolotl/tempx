package defpackage;

import android.database.Observable;

/* JADX INFO: renamed from: lٜٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14492l extends Observable {
    public final void amazon(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC14039l) ((Observable) this).mObservers.get(size)).loadAd(i, i2, obj);
        }
    }

    public final void billing(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC14039l) ((Observable) this).mObservers.get(size)).purchase(i, i2);
        }
    }

    public final void crashlytics(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC14039l) ((Observable) this).mObservers.get(size)).amazon(i, i2);
        }
    }

    public final void loadAd() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC14039l) ((Observable) this).mObservers.get(size)).yandex();
        }
    }

    public final void mopub() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC14039l) ((Observable) this).mObservers.get(size)).billing();
        }
    }

    public final void purchase(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC14039l) ((Observable) this).mObservers.get(size)).crashlytics(i, i2);
        }
    }

    public final boolean yandex() {
        return !((Observable) this).mObservers.isEmpty();
    }
}
