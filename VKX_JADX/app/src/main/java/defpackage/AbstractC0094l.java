package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;

/* JADX INFO: renamed from: lؑؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0094l {
    public static final C3797l yandex = C3797l.appmetrica("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final C3797l loadAd = C3797l.appmetrica("k");

    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    public static C1406l crashlytics(C3122l c3122l, C10712l c10712l) {
        C2536l c2536l;
        boolean z = c3122l.mo1287synchronized() == 3;
        if (z) {
            c3122l.billing();
        }
        C15659l c15659lYandex = null;
        InterfaceC15782l interfaceC15782lLoadAd = null;
        C2982l c2982lBilling = null;
        C2536l c2536l2 = null;
        C2982l c2982lBilling2 = null;
        C2982l c2982lBilling3 = null;
        C2982l c2982lBilling4 = null;
        C2982l c2982lBilling5 = null;
        C2982l c2982lBilling6 = null;
        C2536l c2536lAdmob = null;
        C2982l c2982lBilling7 = null;
        C2982l c2982lBilling8 = null;
        while (c3122l.ads()) {
            switch (c3122l.mo1288throw(yandex)) {
                case 0:
                    c3122l.billing();
                    while (c3122l.ads()) {
                        if (c3122l.mo1288throw(loadAd) != 0) {
                            c3122l.mo1286switch();
                            c3122l.mo1275continue();
                        } else {
                            c15659lYandex = AbstractC17754l.yandex(c3122l, c10712l);
                        }
                    }
                    c3122l.vip();
                    break;
                case 1:
                    interfaceC15782lLoadAd = AbstractC17754l.loadAd(c3122l, c10712l);
                    break;
                case 2:
                    c2536l2 = new C2536l(4, AbstractC18594l.yandex(c3122l, c10712l, 1.0f, C14823l.f29013l, false));
                    break;
                case 3:
                    c2982lBilling6 = AbstractC2069l.billing(c3122l, c10712l, false);
                    yandex(c2982lBilling6, c10712l);
                    break;
                case 4:
                    c2982lBilling = AbstractC2069l.billing(c3122l, c10712l, false);
                    yandex(c2982lBilling, c10712l);
                    break;
                case 5:
                    c2536lAdmob = AbstractC2069l.admob(c3122l, c10712l);
                    break;
                case 6:
                    c2982lBilling7 = AbstractC2069l.billing(c3122l, c10712l, false);
                    break;
                case 7:
                    c2982lBilling8 = AbstractC2069l.billing(c3122l, c10712l, false);
                    break;
                case 8:
                    c2982lBilling2 = AbstractC2069l.billing(c3122l, c10712l, false);
                    break;
                case 9:
                    c2982lBilling3 = AbstractC2069l.billing(c3122l, c10712l, false);
                    break;
                case 10:
                    c2982lBilling4 = AbstractC2069l.billing(c3122l, c10712l, false);
                    yandex(c2982lBilling4, c10712l);
                    break;
                case 11:
                    c2982lBilling5 = AbstractC2069l.billing(c3122l, c10712l, false);
                    yandex(c2982lBilling5, c10712l);
                    break;
                default:
                    c3122l.mo1286switch();
                    c3122l.mo1275continue();
                    break;
            }
        }
        if (z) {
            c3122l.vip();
        }
        if (c15659lYandex == null || (c15659lYandex.mo231l() && ((PointF) ((C4529l) c15659lYandex.f30611l.get(0)).loadAd).equals(0.0f, 0.0f))) {
            c15659lYandex = null;
        }
        InterfaceC15782l interfaceC15782l = (interfaceC15782lLoadAd == null || (!(interfaceC15782lLoadAd instanceof C12574l) && interfaceC15782lLoadAd.mo231l() && ((PointF) ((C4529l) interfaceC15782lLoadAd.mo209l().get(0)).loadAd).equals(0.0f, 0.0f))) ? null : interfaceC15782lLoadAd;
        C2982l c2982l = loadAd(c2982lBilling) ? null : c2982lBilling;
        if (c2536l2 == null) {
            c2536l = null;
        } else {
            if (c2536l2.mo231l()) {
                C5798l c5798l = (C5798l) ((C4529l) ((List) c2536l2.f833l).get(0)).loadAd;
                if (c5798l.yandex == 1.0f && c5798l.loadAd == 1.0f) {
                    c2536l = null;
                }
            }
            c2536l = c2536l2;
        }
        return new C1406l(c15659lYandex, interfaceC15782l, c2536l, c2982l, c2536lAdmob, c2982lBilling7, c2982lBilling8, (c2982lBilling2 == null || (c2982lBilling2.mo231l() && ((Float) ((C4529l) ((List) c2982lBilling2.f833l).get(0)).loadAd).floatValue() == 0.0f)) ? null : c2982lBilling2, (c2982lBilling3 == null || (c2982lBilling3.mo231l() && ((Float) ((C4529l) ((List) c2982lBilling3.f833l).get(0)).loadAd).floatValue() == 0.0f)) ? null : c2982lBilling3, loadAd(c2982lBilling4) ? null : c2982lBilling4, loadAd(c2982lBilling5) ? null : c2982lBilling5, loadAd(c2982lBilling6) ? null : c2982lBilling6);
    }

    public static boolean loadAd(C2982l c2982l) {
        if (c2982l != null) {
            return c2982l.mo231l() && ((Float) ((C4529l) ((List) c2982l.f833l).get(0)).loadAd).floatValue() == 0.0f;
        }
        return true;
    }

    public static void yandex(C2982l c2982l, C10712l c10712l) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) c2982l.f833l;
        if (list.isEmpty()) {
            list.add(new C4529l(c10712l, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(c10712l.remoteconfig)));
        } else if (((C4529l) list.get(0)).loadAd == null) {
            list.set(0, new C4529l(c10712l, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(c10712l.remoteconfig)));
        }
    }
}
