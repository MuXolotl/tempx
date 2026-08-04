package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: renamed from: lؓٞۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2005l {
    public final int amazon;
    public final InterfaceC18690l crashlytics;
    public final Rect loadAd;
    public final boolean purchase;
    public final Size yandex;

    public C2005l(Size size, Rect rect, InterfaceC18690l interfaceC18690l, int i, boolean z) {
        if (size == null) {
            C6541l.subs("Null inputSize");
            throw null;
        }
        this.yandex = size;
        if (rect == null) {
            C6541l.subs("Null inputCropRect");
            throw null;
        }
        this.loadAd = rect;
        this.crashlytics = interfaceC18690l;
        this.amazon = i;
        this.purchase = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2005l) {
            C2005l c2005l = (C2005l) obj;
            if (this.yandex.equals(c2005l.yandex) && this.loadAd.equals(c2005l.loadAd)) {
                InterfaceC18690l interfaceC18690l = c2005l.crashlytics;
                InterfaceC18690l interfaceC18690l2 = this.crashlytics;
                if (interfaceC18690l2 != null ? interfaceC18690l2.equals(interfaceC18690l) : interfaceC18690l == null) {
                    if (this.amazon == c2005l.amazon && this.purchase == c2005l.purchase) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003;
        InterfaceC18690l interfaceC18690l = this.crashlytics;
        return (this.purchase ? 1231 : 1237) ^ ((((iHashCode ^ (interfaceC18690l == null ? 0 : interfaceC18690l.hashCode())) * 1000003) ^ this.amazon) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.yandex);
        sb.append(", inputCropRect=");
        sb.append(this.loadAd);
        sb.append(", cameraInternal=");
        sb.append(this.crashlytics);
        sb.append(", rotationDegrees=");
        sb.append(this.amazon);
        sb.append(", mirroring=");
        return AbstractC5020l.Signature(sb, this.purchase, "}");
    }
}
