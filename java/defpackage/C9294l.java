package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lٍؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9294l {
    public int admob;
    public int amazon;
    public int billing;
    public int crashlytics;
    public long firebase;
    public int isPro;
    public int loadAd;
    public int mopub;
    public int purchase;
    public int smaato;
    public int subs;
    public int yandex;

    public final String toString() {
        int i = this.yandex;
        int i2 = this.loadAd;
        int i3 = this.crashlytics;
        int i4 = this.amazon;
        int i5 = this.purchase;
        int i6 = this.billing;
        int i7 = this.mopub;
        int i8 = this.admob;
        int i9 = this.subs;
        int i10 = this.isPro;
        long j = this.firebase;
        int i11 = this.smaato;
        String str = AbstractC15323l.yandex;
        Locale locale = Locale.US;
        StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        AbstractC12900l.tapsense(sbSubscription, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        AbstractC12900l.tapsense(sbSubscription, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        AbstractC12900l.tapsense(sbSubscription, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        AbstractC12900l.tapsense(sbSubscription, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbSubscription.append(j);
        sbSubscription.append("\n videoFrameProcessingOffsetCount=");
        sbSubscription.append(i11);
        sbSubscription.append("\n}");
        return sbSubscription.toString();
    }
}
