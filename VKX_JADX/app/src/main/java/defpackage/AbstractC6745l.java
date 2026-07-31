package defpackage;

import android.graphics.Point;
import android.view.View;
import java.io.InputStream;

/* JADX INFO: renamed from: lًؙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6745l {
    public static final boolean admob(C6543l c6543l) {
        InterfaceC2449l interfaceC2449l;
        if (c6543l.f13655l == null && (interfaceC2449l = (InterfaceC2449l) AbstractC13402l.loadAd(c6543l, AbstractC16780l.yandex)) != null) {
            Object objPurchase = interfaceC2449l.purchase("pfc" + AbstractC5573l.metrica(c6543l).f7677l);
            if (objPurchase != null) {
                c6543l.f13655l = (Integer) objPurchase;
            }
        }
        if (c6543l.f13655l != null) {
            if (!c6543l.f29454l.f29462l) {
                AbstractC0081l.crashlytics("visitChildren called on an unattached node");
            }
            C17893l c17893l = new C17893l(0, new AbstractC14971l[16]);
            AbstractC14971l abstractC14971l = c6543l.f29454l;
            AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
            if (abstractC14971l2 == null) {
                AbstractC5573l.yandex(c17893l, abstractC14971l);
            } else {
                c17893l.crashlytics(abstractC14971l2);
            }
            loop0: while (true) {
                int i = c17893l.f34846l;
                if (i == 0) {
                    break;
                }
                AbstractC14971l abstractC14971lLoadAd = (AbstractC14971l) c17893l.vip(i - 1);
                if ((abstractC14971lLoadAd.f29457l & 1024) == 0) {
                    AbstractC5573l.yandex(c17893l, abstractC14971lLoadAd);
                } else {
                    while (abstractC14971lLoadAd != null) {
                        if ((abstractC14971lLoadAd.f29450l & 1024) != 0) {
                            C17893l c17893l2 = null;
                            while (abstractC14971lLoadAd != null) {
                                if (abstractC14971lLoadAd instanceof C6543l) {
                                    C6543l c6543l2 = (C6543l) abstractC14971lLoadAd;
                                    if (c6543l2.f29462l) {
                                        int i2 = AbstractC5573l.metrica(c6543l2).f7677l;
                                        Integer num = c6543l.f13655l;
                                        if (num != null && i2 == num.intValue()) {
                                            if (admob(c6543l2) || (c6543l2.m2024l().yandex && c6543l2.m2026l(7))) {
                                                return true;
                                            }
                                        }
                                    }
                                } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i3 = 0;
                                    for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                        if ((abstractC14971l3.f29450l & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                abstractC14971lLoadAd = abstractC14971l3;
                                            } else {
                                                if (c17893l2 == null) {
                                                    c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l2.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l2.crashlytics(abstractC14971l3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
                            }
                            break;
                        }
                        abstractC14971lLoadAd = abstractC14971lLoadAd.f29460l;
                    }
                }
            }
        }
        return false;
    }

    public static Object amazon(Object[] objArr, Object... objArr2) {
        Object obj = objArr[0];
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException(String.format("At least one %s required", objArr2));
    }

    public static final /* synthetic */ Point billing(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0] + ((int) view.getTranslationX()), iArr[1] + ((int) view.getTranslationY()));
    }

    public static Object crashlytics(Object[] objArr) {
        Object obj = objArr[0];
        if (obj != null) {
            return obj;
        }
        C11983l.crashlytics();
        return null;
    }

    public static C0535l isPro(InputStream inputStream) {
        C16552l c16552l = AbstractC11463l.yandex;
        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
        int i = AbstractC7213l.yandex;
        int i2 = AbstractC14953l.yandex;
        return new C0535l(new C16149l(1, inputStream), executorC6708l);
    }

    public static void loadAd(Object obj, Object... objArr) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("%s cannot be null", objArr));
        }
    }

    public static final boolean mopub(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final InterfaceC17242l purchase(InterfaceC17242l interfaceC17242l, C6523l c6523l) {
        return interfaceC17242l.premium(new C14182l(c6523l));
    }

    public static final boolean subs(C6543l c6543l) {
        if (c6543l.m2028l().yandex()) {
            if (!c6543l.f29454l.f29462l) {
                AbstractC0081l.crashlytics("visitChildren called on an unattached node");
            }
            C17893l c17893l = new C17893l(0, new AbstractC14971l[16]);
            AbstractC14971l abstractC14971l = c6543l.f29454l;
            AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
            if (abstractC14971l2 == null) {
                AbstractC5573l.yandex(c17893l, abstractC14971l);
            } else {
                c17893l.crashlytics(abstractC14971l2);
            }
            while (true) {
                int i = c17893l.f34846l;
                if (i == 0) {
                    break;
                }
                AbstractC14971l abstractC14971lLoadAd = (AbstractC14971l) c17893l.vip(i - 1);
                if ((abstractC14971lLoadAd.f29457l & 1024) == 0) {
                    AbstractC5573l.yandex(c17893l, abstractC14971lLoadAd);
                } else {
                    while (abstractC14971lLoadAd != null) {
                        if ((abstractC14971lLoadAd.f29450l & 1024) != 0) {
                            C17893l c17893l2 = null;
                            while (abstractC14971lLoadAd != null) {
                                if (abstractC14971lLoadAd instanceof C6543l) {
                                    C6543l c6543l2 = (C6543l) abstractC14971lLoadAd;
                                    if (c6543l2.m2028l().yandex()) {
                                        int i2 = AbstractC5573l.metrica(c6543l2).f7677l;
                                        c6543l.f13655l = Integer.valueOf(i2);
                                        InterfaceC2449l interfaceC2449l = (InterfaceC2449l) AbstractC13402l.loadAd(c6543l, AbstractC16780l.yandex);
                                        InterfaceC18327l interfaceC18327l = c6543l.f13654l;
                                        if (interfaceC18327l != null) {
                                            ((C5991l) interfaceC18327l).signatures();
                                        }
                                        c6543l.f13654l = interfaceC2449l != null ? interfaceC2449l.billing(AbstractC0653l.vip(AbstractC5573l.metrica(c6543l).f7677l, "pfc"), new C0735l(i2)) : null;
                                        return true;
                                    }
                                } else if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                    int i3 = 0;
                                    for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                        if ((abstractC14971l3.f29450l & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                abstractC14971lLoadAd = abstractC14971l3;
                                            } else {
                                                if (c17893l2 == null) {
                                                    c17893l2 = new C17893l(0, new AbstractC14971l[16]);
                                                }
                                                if (abstractC14971lLoadAd != null) {
                                                    c17893l2.crashlytics(abstractC14971lLoadAd);
                                                    abstractC14971lLoadAd = null;
                                                }
                                                c17893l2.crashlytics(abstractC14971l3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l2);
                            }
                            break;
                        }
                        abstractC14971lLoadAd = abstractC14971lLoadAd.f29460l;
                    }
                }
            }
        }
        return false;
    }

    public static void yandex(Object obj) {
        if (obj != null) {
            return;
        }
        C11983l.crashlytics();
    }
}
