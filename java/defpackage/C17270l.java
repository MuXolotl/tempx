package defpackage;

import android.graphics.PointF;

/* JADX INFO: renamed from: lٗٝؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17270l {
    public final PointF yandex;

    public C17270l(PointF pointF) {
        this.yandex = pointF;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C17270l) && this.yandex.equals(((C17270l) obj).yandex);
        }
        return true;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + 255;
    }

    public final String toString() {
        return "FrameState(position=" + this.yandex + ", alpha=255)";
    }
}
