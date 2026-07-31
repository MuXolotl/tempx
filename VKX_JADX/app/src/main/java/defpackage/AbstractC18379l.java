package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l٘ۨؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18379l implements InterfaceC10376l {
    public final C5978l[] amazon;
    public int billing;
    public final int[] crashlytics;
    public final int loadAd;
    public final long[] purchase;
    public final C11916l yandex;

    public AbstractC18379l(C11916l c11916l, int[] iArr) {
        C5978l[] c5978lArr;
        int i = 0;
        AbstractC12442l.subscription(iArr.length > 0);
        c11916l.getClass();
        this.yandex = c11916l;
        int length = iArr.length;
        this.loadAd = length;
        this.amazon = new C5978l[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            c5978lArr = this.amazon;
            if (i2 >= length2) {
                break;
            }
            c5978lArr[i2] = c11916l.amazon[iArr[i2]];
            i2++;
        }
        Arrays.sort(c5978lArr, new C2351l(2));
        this.crashlytics = new int[this.loadAd];
        while (true) {
            int i3 = this.loadAd;
            if (i >= i3) {
                this.purchase = new long[i3];
                return;
            } else {
                this.crashlytics[i] = c11916l.loadAd(this.amazon[i]);
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC10376l
    public final int adcel(int i) {
        return this.crashlytics[i];
    }

    @Override // defpackage.InterfaceC10376l
    public int ads(long j, List list) {
        return list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC18379l abstractC18379l = (AbstractC18379l) obj;
            if (this.yandex.equals(abstractC18379l.yandex) && Arrays.equals(this.crashlytics, abstractC18379l.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC10376l
    public final C11916l firebase() {
        return this.yandex;
    }

    public final int hashCode() {
        if (this.billing == 0) {
            this.billing = Arrays.hashCode(this.crashlytics) + (System.identityHashCode(this.yandex) * 31);
        }
        return this.billing;
    }

    @Override // defpackage.InterfaceC10376l
    public final int length() {
        return this.crashlytics.length;
    }

    @Override // defpackage.InterfaceC10376l
    public final boolean license(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zSubs = subs(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.loadAd && !zSubs) {
            zSubs = (i2 == i || subs(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zSubs) {
            return false;
        }
        long[] jArr = this.purchase;
        jArr[i] = Math.max(jArr[i], AbstractC15323l.yandex(jElapsedRealtime, j));
        return true;
    }

    @Override // defpackage.InterfaceC10376l
    public final C5978l metrica(int i) {
        return this.amazon[i];
    }

    @Override // defpackage.InterfaceC10376l
    public final /* synthetic */ boolean remoteconfig(long j, AbstractC7995l abstractC7995l, List list) {
        return false;
    }

    @Override // defpackage.InterfaceC10376l
    public final int signatures(int i) {
        for (int i2 = 0; i2 < this.loadAd; i2++) {
            if (this.crashlytics[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC10376l
    public final boolean subs(int i, long j) {
        return this.purchase[i] > j;
    }

    @Override // defpackage.InterfaceC10376l
    public final int subscription() {
        return this.crashlytics[smaato()];
    }

    @Override // defpackage.InterfaceC10376l
    public final C5978l tapsense() {
        return this.amazon[smaato()];
    }

    @Override // defpackage.InterfaceC10376l
    public void admob() {
    }

    @Override // defpackage.InterfaceC10376l
    public final /* synthetic */ void advert() {
    }

    @Override // defpackage.InterfaceC10376l
    public final /* synthetic */ void isVip() {
    }

    @Override // defpackage.InterfaceC10376l
    public void startapp() {
    }

    @Override // defpackage.InterfaceC10376l
    public void pro(float f) {
    }

    @Override // defpackage.InterfaceC10376l
    public final void vip(boolean z) {
    }
}
