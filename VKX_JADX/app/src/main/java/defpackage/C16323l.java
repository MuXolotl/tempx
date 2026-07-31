package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: lُٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16323l implements InterfaceC13600l {
    public final float loadAd;
    public final InterfaceC13600l yandex;

    public C16323l(float f, InterfaceC13600l interfaceC13600l) {
        while (interfaceC13600l instanceof C16323l) {
            interfaceC13600l = ((C16323l) interfaceC13600l).yandex;
            f += ((C16323l) interfaceC13600l).loadAd;
        }
        this.yandex = interfaceC13600l;
        this.loadAd = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16323l)) {
            return false;
        }
        C16323l c16323l = (C16323l) obj;
        return this.yandex.equals(c16323l.yandex) && this.loadAd == c16323l.loadAd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.yandex, Float.valueOf(this.loadAd)});
    }

    @Override // defpackage.InterfaceC13600l
    public final float yandex(RectF rectF) {
        return Math.max(0.0f, this.yandex.yandex(rectF) + this.loadAd);
    }
}
