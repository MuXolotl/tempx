package defpackage;

import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُْ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11018l {
    public final ArrayList adcel;
    public final long admob;
    public final long amazon;
    public final long billing;
    public final String crashlytics;
    public final Long firebase;
    public final int isPro;
    public final boolean loadAd;
    public final Integer metrica;
    public final int mopub;
    public final long purchase;
    public final Long remoteconfig;
    public final Long smaato;
    public final Integer startapp;
    public final int subs;
    public final Integer vip;
    public final C14025l yandex;

    public /* synthetic */ C11018l(C14025l c14025l, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, int i4) {
        this(c14025l, z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & 128) != 0 ? -1L : j4, (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? -1 : i2, (i4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? -1 : i3, (i4 & 1024) != 0 ? null : l, (i4 & 2048) != 0 ? null : l2, (i4 & 4096) != 0 ? null : l3, null, null, null);
    }

    public C11018l(C14025l c14025l, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        this.yandex = c14025l;
        this.loadAd = z;
        this.crashlytics = str;
        this.amazon = j;
        this.purchase = j2;
        this.billing = j3;
        this.mopub = i;
        this.admob = j4;
        this.subs = i2;
        this.isPro = i3;
        this.firebase = l;
        this.smaato = l2;
        this.remoteconfig = l3;
        this.vip = num;
        this.metrica = num2;
        this.startapp = num3;
        this.adcel = new ArrayList();
    }
}
