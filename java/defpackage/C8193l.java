package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lًؙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8193l {
    public static final AbstractC13675l admob;
    public static final C8193l billing;
    public static final C13708l mopub;
    public static final C13708l purchase;
    public final AbstractC1186l amazon;
    public final AbstractC1186l crashlytics;
    public final int loadAd;
    public final SparseArray yandex = new SparseArray();

    static {
        C13708l c13708lIsVip = AbstractC1186l.isVip(12);
        purchase = c13708lIsVip;
        billing = new C8193l(AbstractC1186l.isVip(C10681l.amazon), c13708lIsVip, C13708l.f26763l);
        Object[] objArr = {2, 5, 6};
        AbstractC13743l.yandex(3, objArr);
        mopub = AbstractC1186l.vip(3, objArr);
        C13698l c13698l = new C13698l(4, 11);
        c13698l.mo3668catch(5, 6);
        c13698l.mo3668catch(17, 6);
        c13698l.mo3668catch(7, 6);
        c13698l.mo3668catch(30, 10);
        c13698l.mo3668catch(18, 6);
        c13698l.mo3668catch(6, 8);
        c13698l.mo3668catch(8, 8);
        c13698l.mo3668catch(14, 8);
        admob = c13698l.metrica(true);
    }

    public C8193l(C13708l c13708l, List list, List list2) {
        for (int i = 0; i < c13708l.f26765l; i++) {
            C10681l c10681l = (C10681l) c13708l.get(i);
            this.yandex.put(c10681l.yandex, c10681l);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.yandex.size(); i2++) {
            iMax = Math.max(iMax, ((C10681l) this.yandex.valueAt(i2)).loadAd);
        }
        this.loadAd = iMax;
        this.crashlytics = AbstractC1186l.Signature(list);
        this.amazon = AbstractC1186l.Signature(list2);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    public static C8193l loadAd(Context context, Intent intent, C13736l c13736l, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager audioManagerVip = AbstractC13950l.vip(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? AbstractC2847l.isPro(audioManagerVip, c13736l) : null;
        }
        AbstractC1186l abstractC1186lLoadAd = audioDeviceInfo != null ? AbstractC11970l.loadAd(audioDeviceInfo) : purchase;
        if (Build.VERSION.SDK_INT >= 33 && (AbstractC15323l.m3964else(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return AbstractC2847l.subs(audioManagerVip, c13736l, abstractC1186lLoadAd, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? audioManagerVip.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (AbstractC6873l.loadAd(audioDeviceInfo2.getType())) {
                return new C8193l(AbstractC1186l.isVip(C10681l.amazon), abstractC1186lLoadAd, list);
            }
        }
        C4146l c4146l = new C4146l(4);
        c4146l.crashlytics(2);
        if (Build.VERSION.SDK_INT >= 29 && (AbstractC15323l.m3964else(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            C13708l c13708lTapsense = AbstractC11880l.tapsense(c13736l);
            c13708lTapsense.getClass();
            c4146l.amazon(c13708lTapsense);
            return new C8193l(yandex(AbstractC9966l.subscription(c4146l.mopub()), 10), abstractC1186lLoadAd, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    C13708l c13708l = mopub;
                    c13708l.getClass();
                    c4146l.amazon(c13708l);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            C13708l c13708l2 = mopub;
            c13708l2.getClass();
            c4146l.amazon(c13708l2);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C8193l(yandex(AbstractC9966l.subscription(c4146l.mopub()), 10), abstractC1186lLoadAd, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listYandex = AbstractC9966l.yandex(intArrayExtra);
            listYandex.getClass();
            c4146l.amazon(listYandex);
        }
        return new C8193l(yandex(AbstractC9966l.subscription(c4146l.mopub()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), abstractC1186lLoadAd, list);
    }

    public static C13708l yandex(int[] iArr, int i) {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            c16971lMetrica.crashlytics(new C10681l(i2, i));
        }
        return c16971lMetrica.mopub();
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    public final Pair crashlytics(C13736l c13736l, C5978l c5978l) {
        String str = c5978l.metrica;
        str.getClass();
        int iCrashlytics = AbstractC3825l.crashlytics(str, c5978l.firebase);
        Integer numValueOf = Integer.valueOf(iCrashlytics);
        AbstractC13675l abstractC13675l = admob;
        if (!abstractC13675l.containsKey(numValueOf)) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.yandex;
        if (iCrashlytics == 18 && !AbstractC15323l.smaato(sparseArray, 18)) {
            iCrashlytics = 6;
        } else if ((iCrashlytics == 8 && !AbstractC15323l.smaato(sparseArray, 8)) || (iCrashlytics == 30 && !AbstractC15323l.smaato(sparseArray, 30))) {
            iCrashlytics = 7;
        }
        if (!AbstractC15323l.smaato(sparseArray, iCrashlytics)) {
            return null;
        }
        C10681l c10681l = (C10681l) sparseArray.get(iCrashlytics);
        c10681l.getClass();
        int iIntValue = c10681l.loadAd;
        AbstractC8481l abstractC8481l = c10681l.crashlytics;
        int i2 = c5978l.f12619package;
        boolean zContains = false;
        if (i2 == -1 || iCrashlytics == 18) {
            int i3 = c5978l.f12622synchronized;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = c10681l.yandex;
            if (abstractC8481l == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = AbstractC11880l.Signature(i4, i3, c13736l);
                } else {
                    Object obj = abstractC13675l.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i2 = iIntValue;
        } else if (!c5978l.metrica.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (abstractC8481l != null) {
                int iSignature = AbstractC15323l.Signature(i2);
                if (iSignature != 0) {
                    zContains = abstractC8481l.contains(Integer.valueOf(iSignature));
                }
            } else if (i2 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iSignature2 = AbstractC15323l.Signature(i);
        if (iSignature2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iCrashlytics), Integer.valueOf(iSignature2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8193l)) {
            return false;
        }
        C8193l c8193l = (C8193l) obj;
        return AbstractC15323l.vip(this.yandex, c8193l.yandex) && this.loadAd == c8193l.loadAd && Objects.equals(this.crashlytics, c8193l.crashlytics) && Objects.equals(this.amazon, c8193l.amazon);
    }

    public final int hashCode() {
        return Objects.hashCode(this.amazon) + ((Objects.hashCode(this.crashlytics) + ((AbstractC15323l.metrica(this.yandex) + (this.loadAd * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.loadAd + ", audioProfiles=" + this.yandex + ", speakerLayoutChannelMasks=" + this.crashlytics + ", spatializerChannelMasks=" + this.amazon + "]";
    }
}
