package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٗۥً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC17529l {
    void adcel(ArrayList arrayList);

    void admob();

    void ads(C13214l c13214l, Handler handler);

    void billing(int i);

    int firebase(MediaCodec.BufferInfo bufferInfo);

    void flush();

    int isPro();

    void loadAd(int i, C4276l c4276l, long j, int i2);

    void metrica(Surface surface);

    MediaFormat mopub();

    void purchase(int i, int i2, int i3, long j);

    void release();

    void remoteconfig(int i);

    void smaato(RunnableC12388l runnableC12388l);

    ByteBuffer startapp(int i);

    void subs(int i, long j);

    boolean subscription(C14965l c14965l);

    void tapsense(ArrayList arrayList);

    ByteBuffer vip(int i);

    void yandex(Bundle bundle);
}
