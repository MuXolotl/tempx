package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙٗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16957l {
    public LoudnessCodecController crashlytics;
    public final C3010l loadAd;
    public final HashSet yandex;

    public C16957l() {
        C3010l c3010l = C3010l.f6527l;
        this.yandex = new HashSet();
        this.loadAd = c3010l;
    }

    public final void amazon(int i) {
        LoudnessCodecController loudnessCodecController = this.crashlytics;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.crashlytics = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, EnumC1535l.f3808l, new C10334l(this));
        this.crashlytics = loudnessCodecControllerCreate;
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void crashlytics(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.yandex.remove(mediaCodec) || (loudnessCodecController = this.crashlytics) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void loadAd() {
        this.yandex.clear();
        LoudnessCodecController loudnessCodecController = this.crashlytics;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void yandex(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.crashlytics;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC12442l.subscription(this.yandex.add(mediaCodec));
        }
    }
}
