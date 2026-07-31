package defpackage;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؓؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C1579l {
    public int amazon;
    public int billing;
    public final C6162l crashlytics;
    public final C6551l loadAd;
    public int purchase;
    public final int yandex;

    public C1579l(int i) {
        this.yandex = i;
        if (i <= 0) {
            AbstractC13082l.crashlytics("maxSize <= 0");
            throw null;
        }
        this.loadAd = new C6551l(1);
        this.crashlytics = new C6162l(5);
    }

    public final Object amazon(Object obj) {
        Object objRemove;
        synchronized (this.crashlytics) {
            try {
                objRemove = this.loadAd.yandex.remove(obj);
                if (objRemove != null) {
                    this.amazon--;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return objRemove;
    }

    public final Object crashlytics(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.crashlytics) {
            try {
                this.amazon++;
                objPut = this.loadAd.yandex.put(obj, obj2);
                if (objPut != null) {
                    this.amazon--;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        purchase(this.yandex);
        return objPut;
    }

    public final Object loadAd(Object obj) {
        Object objPut;
        synchronized (this.crashlytics) {
            Object obj2 = this.loadAd.yandex.get(obj);
            if (obj2 != null) {
                this.purchase++;
                return obj2;
            }
            this.billing++;
            Object objYandex = yandex(obj);
            if (objYandex == null) {
                return null;
            }
            synchronized (this.crashlytics) {
                try {
                    objPut = this.loadAd.yandex.put(obj, objYandex);
                    if (objPut != null) {
                        this.loadAd.yandex.put(obj, objPut);
                    } else {
                        this.amazon++;
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                return objPut;
            }
            purchase(this.yandex);
            return objYandex;
        }
    }

    public final void purchase(int i) {
        while (true) {
            synchronized (this.crashlytics) {
                try {
                    if (this.amazon < 0 || (this.loadAd.yandex.isEmpty() && this.amazon != 0)) {
                        break;
                    }
                    if (this.amazon > i && !this.loadAd.yandex.isEmpty()) {
                        Map.Entry entry = (Map.Entry) AbstractC16901l.m4234private(this.loadAd.yandex.entrySet());
                        if (entry == null) {
                            return;
                        }
                        Object key = entry.getKey();
                        entry.getValue();
                        this.loadAd.yandex.remove(key);
                        this.amazon--;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.crashlytics) {
            try {
                int i = this.purchase;
                int i2 = this.billing + i;
                str = "LruCache[maxSize=" + this.yandex + ",hits=" + this.purchase + ",misses=" + this.billing + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public Object yandex(Object obj) {
        return null;
    }
}
