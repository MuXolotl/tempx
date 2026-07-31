package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: lٟؑۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0498l {
    public C1750l admob;
    public C13736l amazon;
    public int billing;
    public C0477l crashlytics;
    public final Handler loadAd;
    public float mopub = 1.0f;
    public int purchase = 0;
    public final InterfaceC11766l yandex;

    public C0498l(Context context, Looper looper, C0477l c0477l) {
        this.yandex = AbstractC15788l.purchase(new C17636l(context, 0));
        this.crashlytics = c0477l;
        this.loadAd = new Handler(looper);
    }

    public final int amazon(int i, boolean z) {
        int i2;
        C14906l c14906l;
        if (i == 1 || (i2 = this.billing) != 1) {
            yandex();
            crashlytics(0);
            return 1;
        }
        int i3 = this.purchase;
        if (z) {
            if (i3 != 2) {
                C1750l c1750l = this.admob;
                if (c1750l == null) {
                    if (c1750l == null) {
                        c14906l = new C14906l();
                        c14906l.amazon = C13736l.subs;
                        c14906l.yandex = i2;
                    } else {
                        C14906l c14906l2 = new C14906l();
                        c14906l2.yandex = c1750l.yandex;
                        c14906l2.amazon = c1750l.amazon;
                        c14906l2.loadAd = c1750l.purchase;
                        c14906l = c14906l2;
                    }
                    C13736l c13736l = this.amazon;
                    boolean z2 = c13736l != null && c13736l.yandex == 1;
                    c13736l.getClass();
                    c14906l.amazon = c13736l;
                    c14906l.loadAd = z2;
                    c14906l.crashlytics = true;
                    C3873l c3873l = new C3873l(0, this);
                    Handler handler = this.loadAd;
                    handler.getClass();
                    this.admob = new C1750l(c14906l.yandex, c3873l, handler, (C13736l) c14906l.amazon, c14906l.loadAd, c14906l.crashlytics);
                }
                int iM3802case = AbstractC13950l.m3802case((AudioManager) this.yandex.get(), this.admob);
                if (iM3802case == 1 || iM3802case == 2) {
                    crashlytics(2);
                    return 1;
                }
                crashlytics(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }

    public final void crashlytics(int i) {
        if (this.purchase == i) {
            return;
        }
        this.purchase = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.mopub == f) {
            return;
        }
        this.mopub = f;
        C0477l c0477l = this.crashlytics;
        if (c0477l != null) {
            c0477l.f1746l.mopub(34);
        }
    }

    public final void loadAd(int i) {
        C0477l c0477l = this.crashlytics;
        if (c0477l != null) {
            C14500l c14500l = c0477l.f1746l;
            c14500l.getClass();
            C3485l c3485lCrashlytics = C14500l.crashlytics();
            c3485lCrashlytics.yandex = c14500l.yandex.obtainMessage(33, i, 0);
            c3485lCrashlytics.loadAd();
        }
    }

    public final void yandex() {
        int i = this.purchase;
        if (i == 1 || i == 0 || this.admob == null) {
            return;
        }
        AbstractC13950l.loadAd((AudioManager) this.yandex.get(), this.admob);
    }
}
