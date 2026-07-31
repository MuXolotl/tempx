package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lٖٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17168l {
    public static final C0346l yandex = C0346l.yandex(new byte[0]);

    public static final C0346l loadAd(int i) {
        return C0346l.yandex(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }

    public static final C0346l yandex(int i) {
        return C0346l.yandex(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }
}
