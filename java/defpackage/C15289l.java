package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: renamed from: lٔۤۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15289l implements InterfaceC13100l {
    public Boolean loadAd;
    public final Context yandex;

    public C15289l(Context context) {
        this.yandex = context == null ? null : context.getApplicationContext();
    }

    public final C15934l yandex(C13736l c13736l, C5978l c5978l) {
        boolean zBooleanValue;
        c5978l.getClass();
        int i = c5978l.f12622synchronized;
        c13736l.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return C15934l.amazon;
        }
        Boolean bool = this.loadAd;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.yandex;
            if (context != null) {
                String parameters = AbstractC13950l.vip(context).getParameters("offloadVariableRateSupported");
                this.loadAd = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.loadAd = Boolean.FALSE;
            }
            zBooleanValue = this.loadAd.booleanValue();
        }
        String str = c5978l.metrica;
        str.getClass();
        int iCrashlytics = AbstractC3825l.crashlytics(str, c5978l.firebase);
        if (iCrashlytics == 0 || i2 < AbstractC15323l.tapsense(iCrashlytics)) {
            return C15934l.amazon;
        }
        int iSignature = AbstractC15323l.Signature(c5978l.f12619package);
        if (iSignature == 0) {
            return C15934l.amazon;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iSignature).setEncoding(iCrashlytics).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, c13736l.crashlytics());
                if ((directPlaybackSupport & 1) == 0) {
                    return C15934l.amazon;
                }
                boolean z2 = (directPlaybackSupport & 3) == 3;
                C10458l c10458l = new C10458l(0);
                c10458l.loadAd = true;
                c10458l.crashlytics = z2;
                c10458l.amazon = zBooleanValue;
                return c10458l.yandex();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, c13736l.crashlytics())) {
                    return C15934l.amazon;
                }
                C10458l c10458l2 = new C10458l(0);
                c10458l2.loadAd = true;
                c10458l2.amazon = zBooleanValue;
                return c10458l2.yandex();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, c13736l.crashlytics());
            if (playbackOffloadSupport == 0) {
                return C15934l.amazon;
            }
            C10458l c10458l3 = new C10458l(0);
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            c10458l3.loadAd = true;
            c10458l3.crashlytics = z;
            c10458l3.amazon = zBooleanValue;
            return c10458l3.yandex();
        } catch (IllegalArgumentException unused) {
            return C15934l.amazon;
        }
    }
}
