package defpackage;

import android.media.MediaCodec;
import android.view.Surface;

/* JADX INFO: renamed from: lٓٞۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14315l implements InterfaceC0049l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C7025l f28020l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Surface f28021l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f28022l = new Object();

    public C14315l(C7025l c7025l) {
        this.f28020l = c7025l;
    }

    public final Surface yandex() {
        Surface surface;
        synchronized (this.f28022l) {
            try {
                if (this.f28021l == null) {
                    this.f28021l = MediaCodec.createPersistentInputSurface();
                }
                surface = this.f28021l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return surface;
    }
}
