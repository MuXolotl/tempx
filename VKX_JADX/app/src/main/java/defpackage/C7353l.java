package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚٚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C7353l {
    public int loadAd;
    public final Object[] yandex;

    public C7353l(int i) {
        if (i > 0) {
            this.yandex = new Object[i];
        } else {
            C8339l.metrica("The max pool size must be > 0");
            throw null;
        }
    }

    public boolean crashlytics(Object obj) {
        int i = this.loadAd;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.yandex;
            if (i2 >= i) {
                int i3 = this.loadAd;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.loadAd = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                C8339l.smaato("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public boolean loadAd(C1846l c1846l) {
        int i = this.loadAd;
        Object[] objArr = this.yandex;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = c1846l;
        this.loadAd = i + 1;
        return true;
    }

    public Object yandex() {
        int i = this.loadAd;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.yandex;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.loadAd = i - 1;
        return obj;
    }

    public C7353l() {
        this.yandex = new Object[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    }
}
