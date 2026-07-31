package androidx.car.app;

import android.view.Surface;
import defpackage.AbstractC14814l;
import defpackage.InterfaceC12208l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class SurfaceContainer {
    private final int mDpi;
    private final int mHeight;
    private final Surface mSurface;
    private final int mWidth;

    private SurfaceContainer() {
        this.mSurface = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDpi = 0;
    }

    public int getDpi() {
        return this.mDpi;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.mSurface);
        sb.append(", ");
        sb.append(this.mWidth);
        sb.append("x");
        sb.append(this.mHeight);
        sb.append(", dpi: ");
        return AbstractC14814l.remoteconfig(this.mDpi, "]", sb);
    }

    public SurfaceContainer(Surface surface, int i, int i2, int i3) {
        this.mSurface = surface;
        this.mWidth = i;
        this.mHeight = i2;
        this.mDpi = i3;
    }
}
