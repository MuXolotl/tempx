package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: lٌۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9185l {
    public final int amazon;
    public int billing;
    public final int crashlytics;
    public final C8634l loadAd;
    public final int purchase;
    public final List yandex;

    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    public C9185l(List list, C8634l c8634l) {
        MotionEvent motionEventYandex;
        this.yandex = list;
        this.loadAd = c8634l;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.crashlytics = (i < 29 || (motionEventYandex = yandex()) == null) ? 0 : motionEventYandex.getClassification();
        MotionEvent motionEventYandex2 = yandex();
        this.amazon = motionEventYandex2 != null ? motionEventYandex2.getButtonState() : 0;
        MotionEvent motionEventYandex3 = yandex();
        this.purchase = motionEventYandex3 != null ? motionEventYandex3.getMetaState() : 0;
        MotionEvent motionEventYandex4 = yandex();
        if (motionEventYandex4 != null) {
            boolean z = i >= 29 && motionEventYandex4.getClassification() == 3;
            boolean z2 = i >= 29 && motionEventYandex4.getClassification() == 5;
            int actionMasked = motionEventYandex4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z) {
                                    i2 = 10;
                                } else if (!z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 6:
                                if (z) {
                                    i2 = 12;
                                } else if (!z2) {
                                    i2 = 2;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 7:
                                if (z) {
                                    i2 = 11;
                                } else if (!z2) {
                                    i2 = 3;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                    } else if (z) {
                        i2 = 11;
                    } else if (!z2) {
                        i2 = 8;
                    } else {
                        i2 = 3;
                    }
                } else if (z) {
                    i2 = 12;
                } else if (z2) {
                    i2 = 9;
                } else {
                    i2 = 2;
                }
            } else if (z) {
                i2 = 10;
            } else if (z2) {
                i2 = 7;
            } else {
                i2 = 1;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i2 < size) {
                    C15730l c15730l = (C15730l) list.get(i2);
                    if (AbstractC3474l.billing(c15730l)) {
                        i2 = 2;
                    } else if (AbstractC3474l.amazon(c15730l)) {
                        i2 = 1;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = 3;
                }
            }
        }
        this.billing = i2;
    }

    public final MotionEvent yandex() {
        C8634l c8634l = this.loadAd;
        if (c8634l != null) {
            return (MotionEvent) ((C13568l) c8634l.f17795l).f26580l;
        }
        return null;
    }
}
