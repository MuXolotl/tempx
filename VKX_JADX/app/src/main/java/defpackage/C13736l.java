package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: lْۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13736l {
    public static final String firebase;
    public static final String isPro;
    public static final String metrica;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String startapp;
    public static final C13736l subs = new C13736l(0, 0, 1, 1, 0, false, true);
    public static final String vip;
    public AudioAttributes admob;
    public final int amazon;
    public final boolean billing;
    public final int crashlytics;
    public final int loadAd;
    public final boolean mopub;
    public final int purchase;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        isPro = Integer.toString(0, 36);
        firebase = Integer.toString(1, 36);
        smaato = Integer.toString(2, 36);
        remoteconfig = Integer.toString(3, 36);
        vip = Integer.toString(4, 36);
        metrica = Integer.toString(5, 36);
        startapp = Integer.toString(6, 36);
    }

    public C13736l(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
        this.purchase = i5;
        this.billing = z;
        this.mopub = z2;
    }

    public static C13736l loadAd(AudioAttributes audioAttributes) {
        int allowedCapturePolicy;
        boolean zAreHapticChannelsMuted;
        int i;
        boolean zIsContentSpatialized;
        int contentType = audioAttributes.getContentType();
        int flags = audioAttributes.getFlags();
        int usage = audioAttributes.getUsage();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            allowedCapturePolicy = audioAttributes.getAllowedCapturePolicy();
            zAreHapticChannelsMuted = audioAttributes.areHapticChannelsMuted();
        } else {
            allowedCapturePolicy = 1;
            zAreHapticChannelsMuted = true;
        }
        if (i2 >= 32) {
            int spatializationBehavior = audioAttributes.getSpatializationBehavior();
            zIsContentSpatialized = audioAttributes.isContentSpatialized();
            i = spatializationBehavior;
        } else {
            i = 0;
            zIsContentSpatialized = false;
        }
        return new C13736l(contentType, flags, usage, allowedCapturePolicy, i, zIsContentSpatialized, zAreHapticChannelsMuted);
    }

    public static C13736l yandex(Bundle bundle) {
        String str = isPro;
        int i = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = firebase;
        int i2 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = smaato;
        int i3 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = remoteconfig;
        int i4 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = vip;
        int i5 = bundle.containsKey(str5) ? bundle.getInt(str5) : 0;
        String str6 = metrica;
        boolean z = bundle.containsKey(str6) ? bundle.getBoolean(str6) : false;
        String str7 = startapp;
        return new C13736l(i, i2, i3, i4, i5, z, bundle.containsKey(str7) ? bundle.getBoolean(str7) : true);
    }

    public final int amazon() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                int volumeControlStream = crashlytics().getVolumeControlStream();
                if (volumeControlStream == Integer.MIN_VALUE) {
                    return 3;
                }
                return volumeControlStream;
            } catch (RuntimeException unused) {
                return 3;
            }
        }
        if ((this.loadAd & 1) != 1) {
            switch (this.crashlytics) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 12:
                default:
                    return 3;
                case 13:
                    break;
            }
        }
        return 1;
    }

    public final AudioAttributes crashlytics() {
        if (this.admob == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.yandex).setFlags(this.loadAd).setUsage(this.crashlytics);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                AbstractC11880l.m3286volatile(usage, this.amazon);
                AbstractC11880l.yandex(usage, this.mopub);
            }
            if (i >= 32) {
                AbstractC6869l.loadAd(usage, this.purchase);
                AbstractC6869l.yandex(usage, this.billing);
            }
            this.admob = usage.build();
        }
        return this.admob;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13736l.class == obj.getClass()) {
            C13736l c13736l = (C13736l) obj;
            if (this.yandex == c13736l.yandex && this.loadAd == c13736l.loadAd && this.crashlytics == c13736l.crashlytics && this.amazon == c13736l.amazon && this.purchase == c13736l.purchase && this.billing == c13736l.billing && this.mopub == c13736l.mopub) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.yandex) * 31) + this.loadAd) * 31) + this.crashlytics) * 31) + this.amazon) * 31) + this.purchase) * 31) + (this.billing ? 1 : 0)) * 31) + (this.mopub ? 1 : 0);
    }

    public final Bundle purchase() {
        Bundle bundle = new Bundle();
        int i = this.yandex;
        if (i != 0) {
            bundle.putInt(isPro, i);
        }
        int i2 = this.loadAd;
        if (i2 != 0) {
            bundle.putInt(firebase, i2);
        }
        int i3 = this.crashlytics;
        if (i3 != 1) {
            bundle.putInt(smaato, i3);
        }
        int i4 = this.amazon;
        if (i4 != 1) {
            bundle.putInt(remoteconfig, i4);
        }
        int i5 = this.purchase;
        if (i5 != 0) {
            bundle.putInt(vip, i5);
        }
        boolean z = this.billing;
        if (z) {
            bundle.putBoolean(metrica, z);
        }
        boolean z2 = this.mopub;
        if (!z2) {
            bundle.putBoolean(startapp, z2);
        }
        return bundle;
    }
}
