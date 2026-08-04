package defpackage;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lؓۖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2043l {
    public final String yandex;
    public static final String loadAd = AbstractC2632l.firebase(UUID.randomUUID().toString() + System.currentTimeMillis());
    public static final AtomicLong crashlytics = new AtomicLong(0);

    public C2043l() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b = bArrArray[0];
        byte b2 = bArrArray[1];
        byte b3 = bArrArray[2];
        byte b4 = bArrArray[3];
        byte[] bArrYandex = yandex(time % 1000);
        byte b5 = bArrYandex[0];
        byte b6 = bArrYandex[1];
        byte[] bArrYandex2 = yandex(crashlytics.incrementAndGet());
        byte b7 = bArrYandex2[0];
        byte b8 = bArrYandex2[1];
        byte[] bArrYandex3 = yandex(Integer.valueOf(Process.myPid()).shortValue());
        String strAdmob = AbstractC2632l.admob(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, bArrYandex3[0], bArrYandex3[1]});
        Locale locale = Locale.US;
        this.yandex = String.format(locale, "%s%s%s%s", strAdmob.substring(0, 12), strAdmob.substring(12, 16), strAdmob.subSequence(16, 20), loadAd.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] yandex(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.yandex;
    }
}
