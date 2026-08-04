package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.LinkedList;

/* JADX INFO: renamed from: lِ٘٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17855l {
    public static final C3797l crashlytics = new C3797l("StreamingFormatChecker", "");
    public final LinkedList yandex = new LinkedList();
    public long loadAd = -1;

    public final void yandex(C3049l c3049l) {
        if (c3049l.billing != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        LinkedList linkedList = this.yandex;
        linkedList.add(lValueOf);
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l = (Long) linkedList.peekFirst();
            AbstractC1051l.subs(l);
            if (jElapsedRealtime - l.longValue() < 5000) {
                long j = this.loadAd;
                if (j == -1 || jElapsedRealtime - j >= 5000) {
                    this.loadAd = jElapsedRealtime;
                    C3797l c3797l = crashlytics;
                    if (Log.isLoggable((String) c3797l.f7903l, 5)) {
                        Log.w("StreamingFormatChecker", c3797l.m1424extends("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                    }
                }
            }
        }
    }
}
