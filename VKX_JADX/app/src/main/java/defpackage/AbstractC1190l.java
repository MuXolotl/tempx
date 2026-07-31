package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٜؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1190l {
    public int loadAd;
    public final C11315l yandex;

    public AbstractC1190l(int i) {
        switch (i) {
            case 1:
                this.yandex = new C11315l();
                break;
            default:
                this.yandex = new C11315l();
                break;
        }
    }

    public char[] amazon(int i) {
        char[] cArr;
        synchronized (this) {
            C11315l c11315l = this.yandex;
            cArr = null;
            char[] cArr2 = (char[]) (c11315l.isEmpty() ? null : c11315l.removeLast());
            if (cArr2 != null) {
                this.loadAd -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }

    public byte[] crashlytics(int i) {
        byte[] bArr;
        synchronized (this) {
            C11315l c11315l = this.yandex;
            bArr = null;
            byte[] bArr2 = (byte[]) (c11315l.isEmpty() ? null : c11315l.removeLast());
            if (bArr2 != null) {
                this.loadAd -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    public void loadAd(char[] cArr) {
        synchronized (this) {
            try {
                int i = this.loadAd;
                if (cArr.length + i < AbstractC9152l.yandex) {
                    this.loadAd = i + cArr.length;
                    this.yandex.addLast(cArr);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void yandex(byte[] bArr) {
        synchronized (this) {
            try {
                int i = this.loadAd;
                if (bArr.length + i < AbstractC9152l.yandex) {
                    this.loadAd = i + (bArr.length / 2);
                    this.yandex.addLast(bArr);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
