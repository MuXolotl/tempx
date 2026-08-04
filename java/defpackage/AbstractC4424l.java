package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚؖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4424l {
    public static final LruCache yandex = new LruCache(10);

    public static final MediaCodecInfo yandex(String str) throws Throwable {
        Object obj;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = yandex;
        synchronized (lruCache) {
            obj = lruCache.get(str);
            Unit unit = Unit.INSTANCE;
        }
        try {
            if (obj != null) {
                return (MediaCodecInfo) obj;
            }
            try {
                mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                try {
                    MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                    synchronized (lruCache) {
                    }
                    mediaCodecCreateEncoderByType.release();
                    return codecInfo;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                throw new C8104l(e);
            } catch (IllegalArgumentException e2) {
                throw new C8104l(e2);
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodecCreateEncoderByType = null;
        }
        if (mediaCodecCreateEncoderByType != null) {
            mediaCodecCreateEncoderByType.release();
        }
        throw th;
    }
}
