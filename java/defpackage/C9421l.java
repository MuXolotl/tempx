package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lٌٍْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9421l implements InterfaceC1234l {
    public final View yandex;

    public C9421l(View view) {
        this.yandex = view;
    }

    public final void yandex(int i) {
        int i2 = 16;
        if (i != 16) {
            i2 = 6;
            if (i != 6) {
                i2 = 13;
                if (i != 13) {
                    i2 = 23;
                    if (i != 23) {
                        i2 = 3;
                        if (i != 3) {
                            if (i == 0) {
                                i2 = 0;
                            } else {
                                i2 = 17;
                                if (i != 17) {
                                    i2 = 27;
                                    if (i != 27) {
                                        i2 = 26;
                                        if (i != 26) {
                                            i2 = 9;
                                            if (i != 9) {
                                                i2 = 22;
                                                if (i != 22) {
                                                    i2 = 21;
                                                    if (i != 21) {
                                                        i2 = 1;
                                                        if (i != 1) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int iPurchase = AbstractC10999l.purchase(i2);
        if (iPurchase == -1) {
            return;
        }
        this.yandex.performHapticFeedback(iPurchase);
    }
}
