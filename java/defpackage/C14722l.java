package defpackage;

import android.media.MediaCodec;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؙؙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14722l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f28783l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final MediaCodec.BufferInfo f28784l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final MediaCodec f28785l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C5807l f28786l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C16565l f28787l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AtomicBoolean f28788l = new AtomicBoolean(false);

    public C14722l(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.f28785l = mediaCodec;
        this.f28783l = i;
        mediaCodec.getOutputBuffer(i);
        this.f28784l = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            atomicReference.set(c5807l);
            c5807l.yandex = "Data closed";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        this.f28787l = c16565l;
        C5807l c5807l2 = (C5807l) atomicReference.get();
        c5807l2.getClass();
        this.f28786l = c5807l2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C5807l c5807l = this.f28786l;
        if (this.f28788l.getAndSet(true)) {
            return;
        }
        try {
            this.f28785l.releaseOutputBuffer(this.f28783l, false);
            c5807l.loadAd(null);
        } catch (IllegalStateException e) {
            c5807l.amazon(e);
        }
    }

    public final long size() {
        return this.f28784l.size;
    }
}
