package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lۣؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3608l extends AbstractC12694l {
    public C15691l admob;
    public SurfaceTexture billing;
    public AtomicReference firebase;
    public SurfaceTexture isPro;
    public C16565l mopub;
    public TextureView purchase;
    public C17706l smaato;
    public boolean subs;

    public final void admob() {
        SurfaceTexture surfaceTexture;
        Size size = this.yandex;
        if (size == null || (surfaceTexture = this.billing) == null || this.admob == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.yandex.getHeight());
        Surface surface = new Surface(this.billing);
        C15691l c15691l = this.admob;
        C16565l c16565lPurchase = AbstractC11064l.purchase(new C15263l(this, surface, 23));
        this.mopub = c16565lPurchase;
        c16565lPurchase.f32512l.yandex(new RunnableC4063l(this, surface, c16565lPurchase, c15691l, 19), AbstractC7720l.amazon(this.purchase.getContext()));
        this.amazon = true;
        billing();
    }

    @Override // defpackage.AbstractC12694l
    public final void amazon() {
        this.subs = true;
    }

    @Override // defpackage.AbstractC12694l
    public final void crashlytics() {
        if (!this.subs || this.isPro == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.purchase.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.isPro;
        if (surfaceTexture != surfaceTexture2) {
            this.purchase.setSurfaceTexture(surfaceTexture2);
            this.isPro = null;
            this.subs = false;
        }
    }

    @Override // defpackage.AbstractC12694l
    public final Bitmap loadAd() {
        TextureView textureView = this.purchase;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.purchase.getBitmap();
    }

    @Override // defpackage.AbstractC12694l
    public final ListenableFuture mopub() {
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            this.firebase.set(c5807l);
            c5807l.yandex = "textureViewImpl_waitForNextFrame";
            return c16565l;
        } catch (Exception e) {
            c16565l.loadAd(e);
            return c16565l;
        }
    }

    @Override // defpackage.AbstractC12694l
    public final void purchase(C15691l c15691l, C17706l c17706l) {
        C17706l c17706l2;
        Size size = c15691l.loadAd;
        this.yandex = size;
        size.getClass();
        FrameLayout frameLayout = this.loadAd;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.purchase = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.yandex.getWidth(), this.yandex.getHeight()));
        this.purchase.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC3108l(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.purchase);
        C15691l c15691l2 = this.admob;
        if (c15691l2 != null && c15691l2.crashlytics() && (c17706l2 = this.smaato) != null) {
            c17706l2.yandex();
            this.smaato = null;
        }
        this.admob = c15691l;
        this.smaato = c17706l;
        c15691l.smaato.yandex(new RunnableC10311l(this, c15691l, 12), AbstractC7720l.amazon(this.purchase.getContext()));
        admob();
    }

    @Override // defpackage.AbstractC12694l
    public final View yandex() {
        return this.purchase;
    }
}
