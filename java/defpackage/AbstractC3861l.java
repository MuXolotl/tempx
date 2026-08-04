package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lؖؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3861l {
    public static final C9676l yandex = new C9676l("NO_VALUE", 2);

    public static final void amazon(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final Object crashlytics(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static /* synthetic */ C8490l loadAd(int i, int i2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : 1;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return yandex(i4, i, i2);
    }

    public static final InterfaceC6942l purchase(InterfaceC4611l interfaceC4611l, InterfaceC12932l interfaceC12932l, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? interfaceC4611l : new C5239l(i, i2, interfaceC12932l, interfaceC4611l);
    }

    public static final C8490l yandex(int i, int i2, int i3) {
        if (i < 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            C10754l.metrica(AbstractC0653l.vip(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            C10754l.metrica("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(AbstractC12900l.advert(i3)));
            return null;
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return new C8490l(i, i4, i3);
    }
}
