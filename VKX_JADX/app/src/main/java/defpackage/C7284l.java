package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؚٕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7284l extends AbstractC18379l {
    public C7377l Signature;
    public float adcel;
    public final long admob;
    public int ads;
    public final int firebase;
    public final long isPro;
    public final AbstractC1186l metrica;
    public final C7713l mopub;
    public final float remoteconfig;
    public final int smaato;
    public final C18527l startapp;
    public final long subs;
    public int subscription;
    public long tapsense;
    public final float vip;

    public C7284l(C11916l c11916l, int[] iArr, C7713l c7713l, AbstractC1186l abstractC1186l) {
        super(c11916l, iArr);
        this.mopub = c7713l;
        this.admob = 10000000L;
        this.subs = 25000000L;
        this.isPro = 25000000L;
        this.firebase = 1279;
        this.smaato = 719;
        this.remoteconfig = 0.7f;
        this.vip = 0.75f;
        this.metrica = AbstractC1186l.Signature(abstractC1186l);
        this.startapp = C18527l.yandex;
        this.adcel = 1.0f;
        this.subscription = 0;
        this.tapsense = -9223372036854775807L;
    }

    public static long crashlytics(List list) {
        if (!list.isEmpty()) {
            C7377l c7377l = (C7377l) AbstractC11356l.purchase(list);
            long j = c7377l.mopub;
            if (j != -9223372036854775807L) {
                long j2 = c7377l.admob;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static void yandex(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C16971l c16971l = (C16971l) arrayList.get(i);
            if (c16971l != null) {
                c16971l.crashlytics(new C13558l(j, jArr[i]));
            }
        }
    }

    @Override // defpackage.InterfaceC10376l
    public final int Signature() {
        return this.subscription;
    }

    @Override // defpackage.InterfaceC10376l
    public final Object ad() {
        return null;
    }

    @Override // defpackage.AbstractC18379l, defpackage.InterfaceC10376l
    public final void admob() {
        this.Signature = null;
    }

    @Override // defpackage.AbstractC18379l, defpackage.InterfaceC10376l
    public final int ads(long j, List list) {
        int i;
        int i2;
        this.startapp.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.tapsense;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((C7377l) AbstractC11356l.purchase(list)).equals(this.Signature))) {
            return list.size();
        }
        this.tapsense = jElapsedRealtime;
        this.Signature = list.isEmpty() ? null : (C7377l) AbstractC11356l.purchase(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM3975package = AbstractC15323l.m3975package(this.adcel, ((C7377l) list.get(size - 1)).mopub - j);
        long j3 = this.isPro;
        if (jM3975package >= j3) {
            crashlytics(list);
            C5978l c5978l = this.amazon[loadAd(jElapsedRealtime)];
            for (int i3 = 0; i3 < size; i3++) {
                C7377l c7377l = (C7377l) list.get(i3);
                C5978l c5978l2 = c7377l.amazon;
                if (AbstractC15323l.m3975package(this.adcel, c7377l.mopub - j) >= j3 && c5978l2.isPro < c5978l.isPro && (i = c5978l2.pro) != -1 && i <= this.smaato && (i2 = c5978l2.license) != -1 && i2 <= this.firebase && i < c5978l.pro) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.InterfaceC10376l
    public final void isPro(long j, long j2, long j3, List list, InterfaceC7405l[] interfaceC7405lArr) {
        long jCrashlytics;
        this.startapp.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.ads;
        int i2 = 0;
        if (i >= interfaceC7405lArr.length || !interfaceC7405lArr[i].next()) {
            int length = interfaceC7405lArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    jCrashlytics = crashlytics(list);
                    break;
                }
                InterfaceC7405l interfaceC7405l = interfaceC7405lArr[i3];
                if (interfaceC7405l.next()) {
                    jCrashlytics = interfaceC7405l.vip() - interfaceC7405l.amazon();
                    break;
                }
                i3++;
            }
        } else {
            InterfaceC7405l interfaceC7405l2 = interfaceC7405lArr[this.ads];
            jCrashlytics = interfaceC7405l2.vip() - interfaceC7405l2.amazon();
        }
        int i4 = this.subscription;
        if (i4 == 0) {
            this.subscription = 1;
            this.ads = loadAd(jElapsedRealtime);
            return;
        }
        int i5 = this.ads;
        boolean zIsEmpty = list.isEmpty();
        C5978l[] c5978lArr = this.amazon;
        if (!zIsEmpty) {
            C5978l c5978l = ((C7377l) AbstractC11356l.purchase(list)).amazon;
            while (true) {
                if (i2 >= this.loadAd) {
                    i2 = -1;
                    break;
                } else if (c5978lArr[i2] == c5978l) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = -1;
            break;
        }
        if (i2 != -1) {
            i4 = ((C7377l) AbstractC11356l.purchase(list)).purchase;
            i5 = i2;
        }
        int iLoadAd = loadAd(jElapsedRealtime);
        if (iLoadAd != i5 && !subs(i5, jElapsedRealtime)) {
            C5978l c5978l2 = c5978lArr[i5];
            C5978l c5978l3 = c5978lArr[iLoadAd];
            long jMin = this.admob;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jCrashlytics != -9223372036854775807L ? j3 - jCrashlytics : j3) * this.vip), jMin);
            }
            int i6 = c5978l3.isPro;
            int i7 = c5978l2.isPro;
            if ((i6 > i7 && j2 < jMin) || (i6 < i7 && j2 >= this.subs)) {
                iLoadAd = i5;
            }
        }
        if (iLoadAd != i5) {
            i4 = 3;
        }
        this.subscription = i4;
        this.ads = iLoadAd;
    }

    public final int loadAd(long j) {
        long j2;
        C7713l c7713l = this.mopub;
        synchronized (c7713l) {
            j2 = c7713l.smaato;
        }
        long j3 = (long) (j2 * this.remoteconfig);
        this.mopub.getClass();
        long j4 = (long) (j3 / this.adcel);
        if (!this.metrica.isEmpty()) {
            int i = 1;
            while (i < this.metrica.size() - 1 && ((C13558l) this.metrica.get(i)).yandex < j4) {
                i++;
            }
            C13558l c13558l = (C13558l) this.metrica.get(i - 1);
            C13558l c13558l2 = (C13558l) this.metrica.get(i);
            long j5 = c13558l.yandex;
            float f = (j4 - j5) / (c13558l2.yandex - j5);
            long j6 = c13558l.loadAd;
            j4 = j6 + ((long) (f * (c13558l2.loadAd - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.loadAd; i3++) {
            if (j == Long.MIN_VALUE || !subs(i3, j)) {
                if (this.amazon[i3].isPro <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.AbstractC18379l, defpackage.InterfaceC10376l
    public final void pro(float f) {
        this.adcel = f;
    }

    @Override // defpackage.InterfaceC10376l
    public final int smaato() {
        return this.ads;
    }

    @Override // defpackage.AbstractC18379l, defpackage.InterfaceC10376l
    public final void startapp() {
        this.tapsense = -9223372036854775807L;
        this.Signature = null;
    }
}
