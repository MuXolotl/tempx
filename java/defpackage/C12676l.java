package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lّ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12676l {
    public int amazon;
    public int crashlytics;
    public int loadAd;
    public Object purchase;
    public final /* synthetic */ int yandex;

    public C12676l(Cfor cfor) {
        this.yandex = 9;
        if (cfor == null) {
            C6541l.subs("treeDigest == null");
            throw null;
        }
        this.purchase = cfor;
        InterfaceC16922l interfaceC16922lYandex = AbstractC8455l.yandex(cfor);
        String algorithmName = interfaceC16922lYandex.getAlgorithmName();
        int digestSize = algorithmName.equals("SHAKE128") ? 32 : algorithmName.equals("SHAKE256") ? 64 : interfaceC16922lYandex.getDigestSize();
        this.loadAd = digestSize;
        int i = 16;
        this.crashlytics = 16;
        double d = digestSize * 8;
        int i2 = 0;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            i3 >>= 1;
            if (i3 == 0) {
                break;
            } else {
                i4++;
            }
        }
        int iCeil = (int) Math.ceil(d / ((double) i4));
        int i5 = 15 * iCeil;
        int i6 = 0;
        while (true) {
            i5 >>= 1;
            if (i5 == 0) {
                break;
            } else {
                i6++;
            }
        }
        while (true) {
            i >>= 1;
            if (i == 0) {
                break;
            } else {
                i2++;
            }
        }
        int iFloor = ((int) Math.floor(i6 / i2)) + 1 + iCeil;
        this.amazon = iFloor;
        String algorithmName2 = interfaceC16922lYandex.getAlgorithmName();
        if (algorithmName2 == null) {
            Map map = C15983l.loadAd;
            C6541l.subs("algorithmName == null");
            throw null;
        }
        if (((C15983l) C15983l.loadAd.get(C15983l.yandex(digestSize, iFloor, algorithmName2))) != null) {
            return;
        }
        C18262l.startapp(interfaceC16922lYandex.getAlgorithmName(), "cannot find OID for digest algorithm: ");
        throw null;
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public static void m3430l(int i) throws C2297l {
        if ((i & 7) != 0) {
            throw C2297l.billing();
        }
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public static final void m3431l(int i) throws C9893l {
        if ((i & 7) == 0) {
            return;
        }
        C11586l.admob("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public static void m3432l(int i) throws C0803l {
        if ((i & 3) != 0) {
            throw C0803l.billing();
        }
    }

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public static final void m3433l(int i) throws C9893l {
        if ((i & 3) == 0) {
            return;
        }
        C11586l.admob("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public static void m3434l(int i) throws C0803l {
        if ((i & 7) != 0) {
            throw C0803l.billing();
        }
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public static void m3435l(int i) throws C2297l {
        if ((i & 3) != 0) {
            throw C2297l.billing();
        }
    }

    public void Signature(InterfaceC10996l interfaceC10996l) throws C8352l {
        int iMo1023strictfp;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        if ((this.loadAd & 7) != 2) {
            throw C0803l.crashlytics();
        }
        do {
            interfaceC10996l.add(subscription());
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp == this.loadAd);
        this.amazon = iMo1023strictfp;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public void m3436abstract(InterfaceC9858l interfaceC9858l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13401l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC9858l.add(Long.valueOf(abstractC15029l.mo1027throws()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC9858l.add(Long.valueOf(abstractC15029l.mo1027throws()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC13401l.billing(abstractC15029l.mo1027throws());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC13401l.billing(abstractC15029l.mo1027throws());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    public void ad(InterfaceC10996l interfaceC10996l) throws C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof AbstractC2583l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    interfaceC10996l.add(Double.valueOf(abstractC15029l.license()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iMo1028volatile = abstractC15029l.mo1028volatile();
            m3434l(iMo1028volatile);
            int iAdmob = abstractC15029l.admob() + iMo1028volatile;
            do {
                interfaceC10996l.add(Double.valueOf(abstractC15029l.license()));
            } while (abstractC15029l.admob() < iAdmob);
            return;
        }
        AbstractC2583l abstractC2583l = (AbstractC2583l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                abstractC2583l.billing(abstractC15029l.license());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iMo1028volatile2 = abstractC15029l.mo1028volatile();
        m3434l(iMo1028volatile2);
        int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
        do {
            abstractC2583l.billing(abstractC15029l.license());
        } while (abstractC15029l.admob() < iAdmob2);
    }

    public void adcel(InterfaceC0400l interfaceC0400l) throws C5957l, C2297l, C0803l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 0) {
            do {
                ((C10268l) interfaceC0400l).add(Boolean.valueOf(abstractC9284l.billing()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLoadAd = abstractC9284l.loadAd() + abstractC9284l.license();
        do {
            ((C10268l) interfaceC0400l).add(Boolean.valueOf(abstractC9284l.billing()));
        } while (abstractC9284l.loadAd() < iLoadAd);
        m3441const(iLoadAd);
    }

    public Object admob(int i) {
        return ((C6323l) this.purchase).smaato[this.amazon + i];
    }

    public C4966l ads() throws C8236l, C5347l, C8352l {
        m3487return(2);
        return ((AbstractC9284l) this.purchase).mopub();
    }

    public void advert(InterfaceC9858l interfaceC9858l) throws C2297l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC9488l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    interfaceC9858l.add(Double.valueOf(abstractC15029l.license()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iMo1028volatile = abstractC15029l.mo1028volatile();
            m3430l(iMo1028volatile);
            int iAdmob = abstractC15029l.admob() + iMo1028volatile;
            do {
                interfaceC9858l.add(Double.valueOf(abstractC15029l.license()));
            } while (abstractC15029l.admob() < iAdmob);
            return;
        }
        AbstractC9488l abstractC9488l = (AbstractC9488l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                abstractC9488l.billing(abstractC15029l.license());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iMo1028volatile2 = abstractC15029l.mo1028volatile();
        m3430l(iMo1028volatile2);
        int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
        do {
            abstractC9488l.billing(abstractC15029l.license());
        } while (abstractC15029l.admob() < iAdmob2);
    }

    public void amazon() {
        View view = (View) this.purchase;
        int top = this.amazon - (view.getTop() - this.loadAd);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.crashlytics));
    }

    public void applovin(InterfaceC0400l interfaceC0400l) throws C5957l, C2297l, C0803l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 0) {
            do {
                ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.subs()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLoadAd = abstractC9284l.loadAd() + abstractC9284l.license();
        do {
            ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.subs()));
        } while (abstractC9284l.loadAd() < iLoadAd);
        m3441const(iLoadAd);
    }

    public Object appmetrica(EnumC3932l enumC3932l, Class cls, C5225l c5225l) throws C5957l, C8236l, C8352l {
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        switch (enumC3932l.ordinal()) {
            case 0:
                m3487return(1);
                return Double.valueOf(abstractC9284l.admob());
            case 1:
                m3487return(5);
                return Float.valueOf(abstractC9284l.smaato());
            case 2:
                m3487return(0);
                return Long.valueOf(abstractC9284l.vip());
            case 3:
                m3487return(0);
                return Long.valueOf(abstractC9284l.pro());
            case 4:
                m3487return(0);
                return Integer.valueOf(abstractC9284l.remoteconfig());
            case 5:
                m3487return(1);
                return Long.valueOf(abstractC9284l.firebase());
            case 6:
                m3487return(5);
                return Integer.valueOf(abstractC9284l.isPro());
            case 7:
                m3487return(0);
                return Boolean.valueOf(abstractC9284l.billing());
            case 8:
                m3487return(2);
                return abstractC9284l.tapsense();
            case 9:
            default:
                C8339l.metrica("unsupported field type.");
                return null;
            case 10:
                m3487return(2);
                InterfaceC5100l interfaceC5100lYandex = C16946l.crashlytics.yandex(cls);
                AbstractC8760l abstractC8760lAmazon = interfaceC5100lYandex.amazon();
                vip(abstractC8760lAmazon, interfaceC5100lYandex, c5225l);
                interfaceC5100lYandex.loadAd(abstractC8760lAmazon);
                return abstractC8760lAmazon;
            case 11:
                return ads();
            case 12:
                m3487return(0);
                return Integer.valueOf(abstractC9284l.license());
            case 13:
                m3487return(0);
                return Integer.valueOf(abstractC9284l.subs());
            case 14:
                m3487return(5);
                return Integer.valueOf(abstractC9284l.metrica());
            case 15:
                m3487return(1);
                return Long.valueOf(abstractC9284l.startapp());
            case 16:
                m3487return(0);
                return Integer.valueOf(abstractC9284l.adcel());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                m3487return(0);
                return Long.valueOf(abstractC9284l.ads());
        }
    }

    public int billing() {
        switch (this.yandex) {
            case 2:
                int i = this.amazon;
                if (i != 0) {
                    this.loadAd = i;
                    this.amazon = 0;
                } else {
                    this.loadAd = ((AbstractC15029l) this.purchase).mo1023strictfp();
                }
                int i2 = this.loadAd;
                return (i2 == 0 || i2 == this.crashlytics) ? Alert.DURATION_SHOW_INDEFINITELY : i2 >>> 3;
            case 3:
                int i3 = this.amazon;
                if (i3 != 0) {
                    this.loadAd = i3;
                    this.amazon = 0;
                } else {
                    this.loadAd = ((AbstractC15029l) this.purchase).mo1023strictfp();
                }
                int i4 = this.loadAd;
                return (i4 == 0 || i4 == this.crashlytics) ? Alert.DURATION_SHOW_INDEFINITELY : i4 >>> 3;
            default:
                int i5 = this.amazon;
                if (i5 != 0) {
                    this.loadAd = i5;
                    this.amazon = 0;
                } else {
                    this.loadAd = ((AbstractC9284l) this.purchase).Signature();
                }
                int i6 = this.loadAd;
                return (i6 == 0 || i6 == this.crashlytics) ? Alert.DURATION_SHOW_INDEFINITELY : i6 >>> 3;
        }
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public void m3437break(InterfaceC9858l interfaceC9858l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13800l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC9858l.add(Integer.valueOf(abstractC15029l.mo1028volatile()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC9858l.add(Integer.valueOf(abstractC15029l.mo1028volatile()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC13800l.billing(abstractC15029l.mo1028volatile());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC13800l.billing(abstractC15029l.mo1028volatile());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public void m3438case(InterfaceC9858l interfaceC9858l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13401l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC9858l.add(Long.valueOf(abstractC15029l.premium()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC9858l.add(Long.valueOf(abstractC15029l.premium()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC13401l.billing(abstractC15029l.premium());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC13401l.billing(abstractC15029l.premium());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public void m3439catch(InterfaceC0400l interfaceC0400l) throws C5957l, C2297l, C0803l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 0) {
            do {
                ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.remoteconfig()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLoadAd = abstractC9284l.loadAd() + abstractC9284l.license();
        do {
            ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.remoteconfig()));
        } while (abstractC9284l.loadAd() < iLoadAd);
        m3441const(iLoadAd);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public void m3440class(InterfaceC9858l interfaceC9858l) throws C2297l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13800l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo1028volatile = abstractC15029l.mo1028volatile();
                m3435l(iMo1028volatile);
                int iAdmob = abstractC15029l.admob() + iMo1028volatile;
                do {
                    interfaceC9858l.add(Integer.valueOf(abstractC15029l.applovin()));
                } while (abstractC15029l.admob() < iAdmob);
                return;
            }
            if (i2 != 5) {
                throw C2297l.crashlytics();
            }
            do {
                interfaceC9858l.add(Integer.valueOf(abstractC15029l.applovin()));
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp == this.loadAd);
            this.amazon = iMo1023strictfp;
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo1028volatile2 = abstractC15029l.mo1028volatile();
            m3435l(iMo1028volatile2);
            int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
            do {
                abstractC13800l.billing(abstractC15029l.applovin());
            } while (abstractC15029l.admob() < iAdmob2);
            return;
        }
        if (i3 != 5) {
            throw C2297l.crashlytics();
        }
        do {
            abstractC13800l.billing(abstractC15029l.applovin());
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp2 == this.loadAd);
        this.amazon = iMo1023strictfp2;
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public void m3441const(int i) throws C5957l, C2297l, C0803l {
        switch (this.yandex) {
            case 2:
                if (((AbstractC15029l) this.purchase).admob() != i) {
                    throw C0803l.mopub();
                }
                return;
            case 3:
                if (((AbstractC15029l) this.purchase).admob() != i) {
                    throw C2297l.mopub();
                }
                return;
            default:
                if (((AbstractC9284l) this.purchase).loadAd() != i) {
                    throw C5957l.purchase();
                }
                return;
        }
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void m3442continue(InterfaceC10996l interfaceC10996l) throws C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof C2577l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo1028volatile = abstractC15029l.mo1028volatile();
                m3432l(iMo1028volatile);
                int iAdmob = abstractC15029l.admob() + iMo1028volatile;
                do {
                    interfaceC10996l.add(Integer.valueOf(abstractC15029l.applovin()));
                } while (abstractC15029l.admob() < iAdmob);
                return;
            }
            if (i2 != 5) {
                throw C0803l.crashlytics();
            }
            do {
                interfaceC10996l.add(Integer.valueOf(abstractC15029l.applovin()));
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp == this.loadAd);
            this.amazon = iMo1023strictfp;
            return;
        }
        C2577l c2577l = (C2577l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo1028volatile2 = abstractC15029l.mo1028volatile();
            m3432l(iMo1028volatile2);
            int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
            do {
                c2577l.billing(abstractC15029l.applovin());
            } while (abstractC15029l.admob() < iAdmob2);
            return;
        }
        if (i3 != 5) {
            throw C0803l.crashlytics();
        }
        do {
            c2577l.billing(abstractC15029l.applovin());
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp2 == this.loadAd);
        this.amazon = iMo1023strictfp2;
    }

    public void crashlytics(C5203l c5203l) {
        Object[] objArr = (Object[]) this.purchase;
        int i = this.crashlytics;
        objArr[i] = c5203l;
        int i2 = this.amazon & (i + 1);
        this.crashlytics = i2;
        int i3 = this.loadAd;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                C18073l.license("Max array capacity exceeded");
                return;
            }
            Object[] objArr2 = new Object[i5];
            AbstractC8669l.pro(0, i3, length, objArr, objArr2);
            AbstractC8669l.pro(i4, 0, this.loadAd, (Object[]) this.purchase, objArr2);
            this.purchase = objArr2;
            this.loadAd = 0;
            this.crashlytics = length;
            this.amazon = i5 - 1;
        }
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public void m3443default(InterfaceC9858l interfaceC9858l) throws C2297l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13401l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    interfaceC9858l.add(Long.valueOf(abstractC15029l.appmetrica()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iMo1028volatile = abstractC15029l.mo1028volatile();
            m3430l(iMo1028volatile);
            int iAdmob = abstractC15029l.admob() + iMo1028volatile;
            do {
                interfaceC9858l.add(Long.valueOf(abstractC15029l.appmetrica()));
            } while (abstractC15029l.admob() < iAdmob);
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                abstractC13401l.billing(abstractC15029l.appmetrica());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iMo1028volatile2 = abstractC15029l.mo1028volatile();
        m3430l(iMo1028volatile2);
        int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
        do {
            abstractC13401l.billing(abstractC15029l.appmetrica());
        } while (abstractC15029l.admob() < iAdmob2);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public void m3444else(InterfaceC10996l interfaceC10996l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof AbstractC8563l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC10996l.add(Long.valueOf(abstractC15029l.premium()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC10996l.add(Long.valueOf(abstractC15029l.premium()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC8563l.billing(abstractC15029l.premium());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC8563l.billing(abstractC15029l.premium());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void m3445extends(InterfaceC0400l interfaceC0400l) throws C5957l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 2) {
            int iLicense = abstractC9284l.license();
            if ((iLicense & 3) != 0) {
                throw new C5957l("Failed to parse the message.");
            }
            int iLoadAd = abstractC9284l.loadAd() + iLicense;
            do {
                ((C10268l) interfaceC0400l).add(Float.valueOf(abstractC9284l.smaato()));
            } while (abstractC9284l.loadAd() < iLoadAd);
            return;
        }
        if (i != 5) {
            throw C5957l.loadAd();
        }
        do {
            ((C10268l) interfaceC0400l).add(Float.valueOf(abstractC9284l.smaato()));
            if (abstractC9284l.crashlytics()) {
                return;
            } else {
                iSignature = abstractC9284l.Signature();
            }
        } while (iSignature == this.loadAd);
        this.amazon = iSignature;
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public void m3446final(InterfaceC0400l interfaceC0400l) throws C5957l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 1) {
            do {
                ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.startapp()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLicense = abstractC9284l.license();
        if ((iLicense & 7) != 0) {
            throw new C5957l("Failed to parse the message.");
        }
        int iLoadAd = abstractC9284l.loadAd() + iLicense;
        do {
            ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.startapp()));
        } while (abstractC9284l.loadAd() < iLoadAd);
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public void m3447finally(InterfaceC9858l interfaceC9858l, boolean z) throws C8236l, C5347l, C8352l {
        String strMo1021package;
        int iMo1023strictfp;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        if ((this.loadAd & 7) != 2) {
            throw C2297l.crashlytics();
        }
        do {
            if (z) {
                m3487return(2);
                strMo1021package = abstractC15029l.mo1025synchronized();
            } else {
                m3487return(2);
                strMo1021package = abstractC15029l.mo1021package();
            }
            interfaceC9858l.add(strMo1021package);
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp == this.loadAd);
        this.amazon = iMo1023strictfp;
    }

    public void firebase(Object obj, InterfaceC5100l interfaceC5100l, C5225l c5225l) {
        int i = this.crashlytics;
        this.crashlytics = ((this.loadAd >>> 3) << 3) | 4;
        try {
            interfaceC5100l.mopub(obj, this, c5225l);
            if (this.loadAd != this.crashlytics) {
                throw new C5957l("Failed to parse the message.");
            }
            this.crashlytics = i;
        } catch (Throwable th) {
            this.crashlytics = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m3448for(InterfaceC10996l interfaceC10996l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof C2577l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC10996l.add(Integer.valueOf(abstractC15029l.signatures()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC10996l.add(Integer.valueOf(abstractC15029l.signatures()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        C2577l c2577l = (C2577l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c2577l.billing(abstractC15029l.signatures());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            c2577l.billing(abstractC15029l.signatures());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public void m3449goto(InterfaceC9858l interfaceC9858l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13800l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC9858l.add(Integer.valueOf(abstractC15029l.inmobi()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC9858l.add(Integer.valueOf(abstractC15029l.inmobi()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC13800l.billing(abstractC15029l.inmobi());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC13800l.billing(abstractC15029l.inmobi());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public void m3450implements(InterfaceC0400l interfaceC0400l) throws C5957l, C2297l, C0803l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 0) {
            do {
                ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.pro()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLoadAd = abstractC9284l.loadAd() + abstractC9284l.license();
        do {
            ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.pro()));
        } while (abstractC9284l.loadAd() < iLoadAd);
        m3441const(iLoadAd);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public void m3451import(InterfaceC10996l interfaceC10996l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof AbstractC8563l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC10996l.add(Long.valueOf(abstractC15029l.mo1027throws()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC10996l.add(Long.valueOf(abstractC15029l.mo1027throws()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC8563l.billing(abstractC15029l.mo1027throws());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC8563l.billing(abstractC15029l.mo1027throws());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    public void inmobi(InterfaceC10996l interfaceC10996l) throws C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof C2577l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo1028volatile = abstractC15029l.mo1028volatile();
                m3432l(iMo1028volatile);
                int iAdmob = abstractC15029l.admob() + iMo1028volatile;
                do {
                    interfaceC10996l.add(Integer.valueOf(abstractC15029l.ad()));
                } while (abstractC15029l.admob() < iAdmob);
                return;
            }
            if (i2 != 5) {
                throw C0803l.crashlytics();
            }
            do {
                interfaceC10996l.add(Integer.valueOf(abstractC15029l.ad()));
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp == this.loadAd);
            this.amazon = iMo1023strictfp;
            return;
        }
        C2577l c2577l = (C2577l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo1028volatile2 = abstractC15029l.mo1028volatile();
            m3432l(iMo1028volatile2);
            int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
            do {
                c2577l.billing(abstractC15029l.ad());
            } while (abstractC15029l.admob() < iAdmob2);
            return;
        }
        if (i3 != 5) {
            throw C0803l.crashlytics();
        }
        do {
            c2577l.billing(abstractC15029l.ad());
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp2 == this.loadAd);
        this.amazon = iMo1023strictfp2;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public void m3452instanceof(InterfaceC0400l interfaceC0400l) throws C5957l, C2297l, C0803l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 0) {
            do {
                ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.ads()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLoadAd = abstractC9284l.loadAd() + abstractC9284l.license();
        do {
            ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.ads()));
        } while (abstractC9284l.loadAd() < iLoadAd);
        m3441const(iLoadAd);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m3453interface(InterfaceC0400l interfaceC0400l) throws C5957l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 2) {
            int iLicense = abstractC9284l.license();
            if ((iLicense & 3) != 0) {
                throw new C5957l("Failed to parse the message.");
            }
            int iLoadAd = abstractC9284l.loadAd() + iLicense;
            do {
                ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.metrica()));
            } while (abstractC9284l.loadAd() < iLoadAd);
            return;
        }
        if (i != 5) {
            throw C5957l.loadAd();
        }
        do {
            ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.metrica()));
            if (abstractC9284l.crashlytics()) {
                return;
            } else {
                iSignature = abstractC9284l.Signature();
            }
        } while (iSignature == this.loadAd);
        this.amazon = iSignature;
    }

    public void isPro(Object obj, InterfaceC0060l interfaceC0060l, C7597l c7597l) {
        int i = this.crashlytics;
        this.crashlytics = ((this.loadAd >>> 3) << 3) | 4;
        try {
            interfaceC0060l.purchase(obj, this, c7597l);
            if (this.loadAd != this.crashlytics) {
                throw C2297l.billing();
            }
            this.crashlytics = i;
        } catch (Throwable th) {
            this.crashlytics = i;
            throw th;
        }
    }

    public void isVip(InterfaceC0400l interfaceC0400l) throws C5957l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 1) {
            do {
                ((C10268l) interfaceC0400l).add(Double.valueOf(abstractC9284l.admob()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLicense = abstractC9284l.license();
        if ((iLicense & 7) != 0) {
            throw new C5957l("Failed to parse the message.");
        }
        int iLoadAd = abstractC9284l.loadAd() + iLicense;
        do {
            ((C10268l) interfaceC0400l).add(Double.valueOf(abstractC9284l.admob()));
        } while (abstractC9284l.loadAd() < iLoadAd);
    }

    public void license(InterfaceC9858l interfaceC9858l) throws C8236l {
        int iMo1023strictfp;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        if ((this.loadAd & 7) != 2) {
            throw C2297l.crashlytics();
        }
        do {
            interfaceC9858l.add(tapsense());
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp == this.loadAd);
        this.amazon = iMo1023strictfp;
    }

    public void loadAd(int i) {
        int[] iArr = (int[]) this.purchase;
        int i2 = this.crashlytics;
        iArr[i2] = i;
        int i3 = this.amazon & (i2 + 1);
        this.crashlytics = i3;
        int i4 = this.loadAd;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy((int[]) this.purchase, 0, iArr2, i5, this.loadAd);
            this.purchase = iArr2;
            this.loadAd = 0;
            this.crashlytics = length;
            this.amazon = i6 - 1;
        }
    }

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public void m3454l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 0) {
            do {
                interfaceC9971l.add(Boolean.valueOf(abstractC9284l.mo1071class()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            this.amazon = iMo1083native;
            return;
        }
        if (i != 2) {
            C11586l.mopub();
            return;
        }
        int iAppmetrica = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
        do {
            interfaceC9971l.add(Boolean.valueOf(abstractC9284l.mo1071class()));
        } while (abstractC9284l.appmetrica() < iAppmetrica);
        m3476l(iAppmetrica);
    }

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public void m3455l(InterfaceC9971l interfaceC9971l) throws C13529l {
        int iMo1083native;
        if ((this.loadAd & 7) != 2) {
            C11586l.mopub();
            return;
        }
        do {
            interfaceC9971l.add(m3462l());
            AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
            if (abstractC9284l.applovin()) {
                return;
            } else {
                iMo1083native = abstractC9284l.mo1083native();
            }
        } while (iMo1083native == this.loadAd);
        this.amazon = iMo1083native;
    }

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public void m3456l(InterfaceC9971l interfaceC9971l, boolean z) throws C13529l {
        String strMo1082interface;
        int iMo1083native;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        if ((this.loadAd & 7) != 2) {
            C11586l.mopub();
            return;
        }
        do {
            if (z) {
                m3459l(2);
                strMo1082interface = abstractC9284l.mo1088static();
            } else {
                m3459l(2);
                strMo1082interface = abstractC9284l.mo1082interface();
            }
            interfaceC9971l.add(strMo1082interface);
            if (abstractC9284l.applovin()) {
                return;
            } else {
                iMo1083native = abstractC9284l.mo1083native();
            }
        } while (iMo1083native == this.loadAd);
        this.amazon = iMo1083native;
    }

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public Object m3457l(EnumC2564l enumC2564l, Class cls, C11337l c11337l) throws C9893l {
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        EnumC2564l enumC2564l2 = EnumC2564l.f5569l;
        switch (enumC2564l.ordinal()) {
            case 0:
                m3459l(1);
                return Double.valueOf(abstractC9284l.mo1078for());
            case 1:
                m3459l(5);
                return Float.valueOf(abstractC9284l.mo1092throw());
            case 2:
                m3459l(0);
                return Long.valueOf(abstractC9284l.mo1074else());
            case 3:
                m3459l(0);
                return Long.valueOf(abstractC9284l.mo1070catch());
            case 4:
                m3459l(0);
                return Integer.valueOf(abstractC9284l.mo1069case());
            case 5:
                m3459l(1);
                return Long.valueOf(abstractC9284l.mo1090switch());
            case 6:
                m3459l(5);
                return Integer.valueOf(abstractC9284l.mo1072continue());
            case 7:
                m3459l(0);
                return Boolean.valueOf(abstractC9284l.mo1071class());
            case 8:
                m3459l(2);
                return abstractC9284l.mo1088static();
            case 9:
            default:
                C8339l.metrica("unsupported field type.");
                return null;
            case 10:
                m3459l(2);
                InterfaceC12940l interfaceC12940lYandex = C8307l.crashlytics.yandex(cls);
                AbstractC0288l abstractC0288lZza = interfaceC12940lYandex.zza();
                m3461l(abstractC0288lZza, interfaceC12940lYandex, c11337l);
                interfaceC12940lYandex.loadAd(abstractC0288lZza);
                return abstractC0288lZza;
            case 11:
                return m3462l();
            case 12:
                m3459l(0);
                return Integer.valueOf(abstractC9284l.mo1084new());
            case 13:
                m3459l(0);
                return Integer.valueOf(abstractC9284l.mo1079goto());
            case 14:
                m3459l(5);
                return Integer.valueOf(abstractC9284l.mo1089super());
            case 15:
                m3459l(1);
                return Long.valueOf(abstractC9284l.mo1080import());
            case 16:
                m3459l(0);
                return Integer.valueOf(abstractC9284l.mo1067abstract());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                m3459l(0);
                return Long.valueOf(abstractC9284l.mo1081instanceof());
        }
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public void m3458l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C6514l;
        int i = this.loadAd;
        if (z) {
            C6514l c6514l = (C6514l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    c6514l.admob(abstractC9284l.mo1074else());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                m3476l(iAppmetrica);
                return;
            }
            do {
                c6514l.admob(abstractC9284l.mo1074else());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica2 = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1074else()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                m3476l(iAppmetrica2);
                return;
            }
            do {
                interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1074else()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public void m3459l(int i) {
        if ((this.loadAd & 7) == i) {
            return;
        }
        C11586l.mopub();
    }

    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public int m3460l() {
        int iMo1083native = this.amazon;
        if (iMo1083native != 0) {
            this.loadAd = iMo1083native;
            this.amazon = 0;
        } else {
            iMo1083native = ((AbstractC9284l) this.purchase).mo1083native();
            this.loadAd = iMo1083native;
        }
        return (iMo1083native == 0 || iMo1083native == this.crashlytics) ? Alert.DURATION_SHOW_INDEFINITELY : iMo1083native >>> 3;
    }

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public void m3461l(Object obj, InterfaceC12940l interfaceC12940l, C11337l c11337l) throws C9893l {
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int iMo1084new = abstractC9284l.mo1084new();
        if (abstractC9284l.yandex + abstractC9284l.loadAd >= 100) {
            C11586l.admob("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iIsVip = abstractC9284l.isVip(iMo1084new);
        abstractC9284l.yandex++;
        interfaceC12940l.admob(obj, this, c11337l);
        abstractC9284l.mo1085private(0);
        abstractC9284l.yandex--;
        abstractC9284l.signatures(iIsVip);
    }

    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public AbstractC15619l m3462l() {
        m3459l(2);
        return ((AbstractC9284l) this.purchase).mo1073default();
    }

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public void m3463l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C12405l;
        int i = this.loadAd;
        if (z) {
            C12405l c12405l = (C12405l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo1084new = abstractC9284l.mo1084new();
                m3433l(iMo1084new);
                int iAppmetrica = abstractC9284l.appmetrica() + iMo1084new;
                do {
                    c12405l.admob(abstractC9284l.mo1089super());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                return;
            }
            if (i2 != 5) {
                C11586l.mopub();
                return;
            }
            do {
                c12405l.admob(abstractC9284l.mo1089super());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo1084new2 = abstractC9284l.mo1084new();
                m3433l(iMo1084new2);
                int iAppmetrica2 = abstractC9284l.appmetrica() + iMo1084new2;
                do {
                    interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1089super()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                return;
            }
            if (i3 != 5) {
                C11586l.mopub();
                return;
            }
            do {
                interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1089super()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public void m3464l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C6514l;
        int i = this.loadAd;
        if (z) {
            C6514l c6514l = (C6514l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    c6514l.admob(abstractC9284l.mo1070catch());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                m3476l(iAppmetrica);
                return;
            }
            do {
                c6514l.admob(abstractC9284l.mo1070catch());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica2 = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1070catch()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                m3476l(iAppmetrica2);
                return;
            }
            do {
                interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1070catch()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public void m3465l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C6514l;
        int i = this.loadAd;
        if (z) {
            C6514l c6514l = (C6514l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    c6514l.admob(abstractC9284l.mo1081instanceof());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                m3476l(iAppmetrica);
                return;
            }
            do {
                c6514l.admob(abstractC9284l.mo1081instanceof());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica2 = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1081instanceof()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                m3476l(iAppmetrica2);
                return;
            }
            do {
                interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1081instanceof()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public void m3466l(C12643l c12643l, C5991l c5991l, C11337l c11337l) {
        int i;
        int i2;
        m3459l(2);
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int iIsVip = abstractC9284l.isVip(abstractC9284l.mo1084new());
        Object obj = c5991l.f12718l;
        Object objM3457l = "";
        Object objM3457l2 = obj;
        while (true) {
            try {
                int iM3460l = m3460l();
                if (iM3460l == Integer.MAX_VALUE || abstractC9284l.applovin()) {
                    break;
                }
                boolean zMo1075extends = false;
                if (iM3460l == 1) {
                    objM3457l = m3457l((EnumC2564l) c5991l.f12716l, null, null);
                } else if (iM3460l != 2) {
                    try {
                        if (!((abstractC9284l.applovin() || (i2 = this.loadAd) == this.crashlytics) ? false : abstractC9284l.mo1075extends(i2))) {
                            throw new C9893l("Unable to parse map entry.");
                        }
                    } catch (C13529l e) {
                        if (!abstractC9284l.applovin() && (i = this.loadAd) != this.crashlytics) {
                            zMo1075extends = abstractC9284l.mo1075extends(i);
                        }
                        if (!zMo1075extends) {
                            throw new C9893l("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objM3457l2 = m3457l((EnumC2564l) c5991l.f12715l, obj.getClass(), c11337l);
                }
            } catch (Throwable th) {
                abstractC9284l.signatures(iIsVip);
                throw th;
            }
        }
        c12643l.put(objM3457l, objM3457l2);
        abstractC9284l.signatures(iIsVip);
    }

    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public void m3467l(Object obj, InterfaceC12940l interfaceC12940l, C11337l c11337l) {
        int i = this.crashlytics;
        this.crashlytics = ((this.loadAd >>> 3) << 3) | 4;
        try {
            interfaceC12940l.admob(obj, this, c11337l);
            if (this.loadAd != this.crashlytics) {
                throw new C9893l("Failed to parse the message.");
            }
            this.crashlytics = i;
        } catch (Throwable th) {
            this.crashlytics = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public void m3468l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C12405l;
        int i = this.loadAd;
        if (z) {
            C12405l c12405l = (C12405l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    c12405l.admob(abstractC9284l.mo1079goto());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                m3476l(iAppmetrica);
                return;
            }
            do {
                c12405l.admob(abstractC9284l.mo1079goto());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica2 = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1079goto()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                m3476l(iAppmetrica2);
                return;
            }
            do {
                interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1079goto()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public void m3469l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C12405l;
        int i = this.loadAd;
        if (z) {
            C12405l c12405l = (C12405l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    c12405l.admob(abstractC9284l.mo1084new());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                m3476l(iAppmetrica);
                return;
            }
            do {
                c12405l.admob(abstractC9284l.mo1084new());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica2 = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1084new()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                m3476l(iAppmetrica2);
                return;
            }
            do {
                interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1084new()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public void m3470l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C6514l;
        int i = this.loadAd;
        if (z) {
            C6514l c6514l = (C6514l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iMo1084new = abstractC9284l.mo1084new();
                m3431l(iMo1084new);
                int iAppmetrica = abstractC9284l.appmetrica() + iMo1084new;
                do {
                    c6514l.admob(abstractC9284l.mo1090switch());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                return;
            }
            do {
                c6514l.admob(abstractC9284l.mo1090switch());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iMo1084new2 = abstractC9284l.mo1084new();
                m3431l(iMo1084new2);
                int iAppmetrica2 = abstractC9284l.appmetrica() + iMo1084new2;
                do {
                    interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1090switch()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                return;
            }
            do {
                interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1090switch()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public void m3471l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C12405l;
        int i = this.loadAd;
        if (z) {
            C12405l c12405l = (C12405l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo1084new = abstractC9284l.mo1084new();
                m3433l(iMo1084new);
                int iAppmetrica = abstractC9284l.appmetrica() + iMo1084new;
                do {
                    c12405l.admob(abstractC9284l.mo1072continue());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                return;
            }
            if (i2 != 5) {
                C11586l.mopub();
                return;
            }
            do {
                c12405l.admob(abstractC9284l.mo1072continue());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo1084new2 = abstractC9284l.mo1084new();
                m3433l(iMo1084new2);
                int iAppmetrica2 = abstractC9284l.appmetrica() + iMo1084new2;
                do {
                    interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1072continue()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                return;
            }
            if (i3 != 5) {
                C11586l.mopub();
                return;
            }
            do {
                interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1072continue()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public void m3472l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C6514l;
        int i = this.loadAd;
        if (z) {
            C6514l c6514l = (C6514l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iMo1084new = abstractC9284l.mo1084new();
                m3431l(iMo1084new);
                int iAppmetrica = abstractC9284l.appmetrica() + iMo1084new;
                do {
                    c6514l.admob(abstractC9284l.mo1080import());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                return;
            }
            do {
                c6514l.admob(abstractC9284l.mo1080import());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iMo1084new2 = abstractC9284l.mo1084new();
                m3431l(iMo1084new2);
                int iAppmetrica2 = abstractC9284l.appmetrica() + iMo1084new2;
                do {
                    interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1080import()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                return;
            }
            do {
                interfaceC9971l.add(Long.valueOf(abstractC9284l.mo1080import()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public void m3473l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C12405l;
        int i = this.loadAd;
        if (z) {
            C12405l c12405l = (C12405l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    c12405l.admob(abstractC9284l.mo1067abstract());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                m3476l(iAppmetrica);
                return;
            }
            do {
                c12405l.admob(abstractC9284l.mo1067abstract());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica2 = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1067abstract()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                m3476l(iAppmetrica2);
                return;
            }
            do {
                interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1067abstract()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public void m3474l(InterfaceC9971l interfaceC9971l, InterfaceC12940l interfaceC12940l, C11337l c11337l) throws C9893l {
        int iMo1083native;
        int i = this.loadAd;
        if ((i & 7) != 2) {
            C11586l.mopub();
            return;
        }
        do {
            AbstractC0288l abstractC0288lZza = interfaceC12940l.zza();
            m3461l(abstractC0288lZza, interfaceC12940l, c11337l);
            interfaceC12940l.loadAd(abstractC0288lZza);
            interfaceC9971l.add(abstractC0288lZza);
            AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
            if (abstractC9284l.applovin() || this.amazon != 0) {
                return;
            } else {
                iMo1083native = abstractC9284l.mo1083native();
            }
        } while (iMo1083native == i);
        this.amazon = iMo1083native;
    }

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public void m3475l(InterfaceC9971l interfaceC9971l, InterfaceC12940l interfaceC12940l, C11337l c11337l) throws C13529l {
        int iMo1083native;
        int i = this.loadAd;
        if ((i & 7) != 3) {
            C11586l.mopub();
            return;
        }
        do {
            AbstractC0288l abstractC0288lZza = interfaceC12940l.zza();
            m3467l(abstractC0288lZza, interfaceC12940l, c11337l);
            interfaceC12940l.loadAd(abstractC0288lZza);
            interfaceC9971l.add(abstractC0288lZza);
            AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
            if (abstractC9284l.applovin() || this.amazon != 0) {
                return;
            } else {
                iMo1083native = abstractC9284l.mo1083native();
            }
        } while (iMo1083native == i);
        this.amazon = iMo1083native;
    }

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public void m3476l(int i) throws C9893l {
        if (((AbstractC9284l) this.purchase).appmetrica() == i) {
            return;
        }
        C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public void m3477l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        int iMo1083native2;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        boolean z = interfaceC9971l instanceof C12405l;
        int i = this.loadAd;
        if (z) {
            C12405l c12405l = (C12405l) interfaceC9971l;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    c12405l.admob(abstractC9284l.mo1069case());
                } while (abstractC9284l.appmetrica() < iAppmetrica);
                m3476l(iAppmetrica);
                return;
            }
            do {
                c12405l.admob(abstractC9284l.mo1069case());
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native2 = abstractC9284l.mo1083native();
                }
            } while (iMo1083native2 == this.loadAd);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    C11586l.mopub();
                    return;
                }
                int iAppmetrica2 = abstractC9284l.appmetrica() + abstractC9284l.mo1084new();
                do {
                    interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1069case()));
                } while (abstractC9284l.appmetrica() < iAppmetrica2);
                m3476l(iAppmetrica2);
                return;
            }
            do {
                interfaceC9971l.add(Integer.valueOf(abstractC9284l.mo1069case()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            iMo1083native2 = iMo1083native;
        }
        this.amazon = iMo1083native2;
    }

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public void m3478l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 2) {
            int iMo1084new = abstractC9284l.mo1084new();
            m3433l(iMo1084new);
            int iAppmetrica = abstractC9284l.appmetrica() + iMo1084new;
            do {
                interfaceC9971l.add(Float.valueOf(abstractC9284l.mo1092throw()));
            } while (abstractC9284l.appmetrica() < iAppmetrica);
            return;
        }
        if (i != 5) {
            C11586l.mopub();
            return;
        }
        do {
            interfaceC9971l.add(Float.valueOf(abstractC9284l.mo1092throw()));
            if (abstractC9284l.applovin()) {
                return;
            } else {
                iMo1083native = abstractC9284l.mo1083native();
            }
        } while (iMo1083native == this.loadAd);
        this.amazon = iMo1083native;
    }

    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public void m3479l(InterfaceC9971l interfaceC9971l) throws C9893l {
        int iMo1083native;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 1) {
            do {
                interfaceC9971l.add(Double.valueOf(abstractC9284l.mo1078for()));
                if (abstractC9284l.applovin()) {
                    return;
                } else {
                    iMo1083native = abstractC9284l.mo1083native();
                }
            } while (iMo1083native == this.loadAd);
            this.amazon = iMo1083native;
            return;
        }
        if (i != 2) {
            C11586l.mopub();
            return;
        }
        int iMo1084new = abstractC9284l.mo1084new();
        m3431l(iMo1084new);
        int iAppmetrica = abstractC9284l.appmetrica() + iMo1084new;
        do {
            interfaceC9971l.add(Double.valueOf(abstractC9284l.mo1078for()));
        } while (abstractC9284l.appmetrica() < iAppmetrica);
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public boolean m3480l() {
        int i;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        if (abstractC9284l.crashlytics() || (i = this.loadAd) == this.crashlytics) {
            return false;
        }
        return abstractC9284l.ad(i);
    }

    public void metrica(InterfaceC10996l interfaceC10996l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof AbstractC16329l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC10996l.add(Boolean.valueOf(abstractC15029l.subscription()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC10996l.add(Boolean.valueOf(abstractC15029l.subscription()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC16329l abstractC16329l = (AbstractC16329l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC16329l.billing(abstractC15029l.subscription());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC16329l.billing(abstractC15029l.subscription());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    public int mopub(int i) {
        return ((C6323l) this.purchase).isPro[this.crashlytics + i];
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public void m3481native(InterfaceC10996l interfaceC10996l) throws C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof AbstractC3191l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo1028volatile = abstractC15029l.mo1028volatile();
                m3432l(iMo1028volatile);
                int iAdmob = abstractC15029l.admob() + iMo1028volatile;
                do {
                    interfaceC10996l.add(Float.valueOf(abstractC15029l.isVip()));
                } while (abstractC15029l.admob() < iAdmob);
                return;
            }
            if (i2 != 5) {
                throw C0803l.crashlytics();
            }
            do {
                interfaceC10996l.add(Float.valueOf(abstractC15029l.isVip()));
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp == this.loadAd);
            this.amazon = iMo1023strictfp;
            return;
        }
        AbstractC3191l abstractC3191l = (AbstractC3191l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo1028volatile2 = abstractC15029l.mo1028volatile();
            m3432l(iMo1028volatile2);
            int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
            do {
                abstractC3191l.billing(abstractC15029l.isVip());
            } while (abstractC15029l.admob() < iAdmob2);
            return;
        }
        if (i3 != 5) {
            throw C0803l.crashlytics();
        }
        do {
            abstractC3191l.billing(abstractC15029l.isVip());
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp2 == this.loadAd);
        this.amazon = iMo1023strictfp2;
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public void m3482new(InterfaceC10996l interfaceC10996l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof C2577l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC10996l.add(Integer.valueOf(abstractC15029l.inmobi()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC10996l.add(Integer.valueOf(abstractC15029l.inmobi()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        C2577l c2577l = (C2577l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c2577l.billing(abstractC15029l.inmobi());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            c2577l.billing(abstractC15029l.inmobi());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public void m3483package(InterfaceC0400l interfaceC0400l) throws C5957l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 2) {
            int iLicense = abstractC9284l.license();
            if ((iLicense & 3) != 0) {
                throw new C5957l("Failed to parse the message.");
            }
            int iLoadAd = abstractC9284l.loadAd() + iLicense;
            do {
                ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.isPro()));
            } while (abstractC9284l.loadAd() < iLoadAd);
            return;
        }
        if (i != 5) {
            throw C5957l.loadAd();
        }
        do {
            ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.isPro()));
            if (abstractC9284l.crashlytics()) {
                return;
            } else {
                iSignature = abstractC9284l.Signature();
            }
        } while (iSignature == this.loadAd);
        this.amazon = iSignature;
    }

    public void premium(InterfaceC9858l interfaceC9858l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13800l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC9858l.add(Integer.valueOf(abstractC15029l.pro()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC9858l.add(Integer.valueOf(abstractC15029l.pro()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC13800l.billing(abstractC15029l.pro());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC13800l.billing(abstractC15029l.pro());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m3484private(InterfaceC9858l interfaceC9858l) throws C2297l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC14281l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo1028volatile = abstractC15029l.mo1028volatile();
                m3435l(iMo1028volatile);
                int iAdmob = abstractC15029l.admob() + iMo1028volatile;
                do {
                    interfaceC9858l.add(Float.valueOf(abstractC15029l.isVip()));
                } while (abstractC15029l.admob() < iAdmob);
                return;
            }
            if (i2 != 5) {
                throw C2297l.crashlytics();
            }
            do {
                interfaceC9858l.add(Float.valueOf(abstractC15029l.isVip()));
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp == this.loadAd);
            this.amazon = iMo1023strictfp;
            return;
        }
        AbstractC14281l abstractC14281l = (AbstractC14281l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo1028volatile2 = abstractC15029l.mo1028volatile();
            m3435l(iMo1028volatile2);
            int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
            do {
                abstractC14281l.billing(abstractC15029l.isVip());
            } while (abstractC15029l.admob() < iAdmob2);
            return;
        }
        if (i3 != 5) {
            throw C2297l.crashlytics();
        }
        do {
            abstractC14281l.billing(abstractC15029l.isVip());
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp2 == this.loadAd);
        this.amazon = iMo1023strictfp2;
    }

    public void pro(InterfaceC0400l interfaceC0400l) throws C5347l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        if ((this.loadAd & 7) != 2) {
            throw C5957l.loadAd();
        }
        do {
            ((C10268l) interfaceC0400l).add(ads());
            if (abstractC9284l.crashlytics()) {
                return;
            } else {
                iSignature = abstractC9284l.Signature();
            }
        } while (iSignature == this.loadAd);
        this.amazon = iSignature;
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public void m3485protected(InterfaceC10996l interfaceC10996l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof AbstractC8563l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC10996l.add(Long.valueOf(abstractC15029l.mo1020native()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC10996l.add(Long.valueOf(abstractC15029l.mo1020native()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC8563l.billing(abstractC15029l.mo1020native());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC8563l.billing(abstractC15029l.mo1020native());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public void m3486public(InterfaceC10996l interfaceC10996l, boolean z) throws C8236l, C5347l, C8352l {
        String strMo1021package;
        int iMo1023strictfp;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        if ((this.loadAd & 7) != 2) {
            throw C0803l.crashlytics();
        }
        do {
            if (z) {
                m3487return(2);
                strMo1021package = abstractC15029l.mo1025synchronized();
            } else {
                m3487return(2);
                strMo1021package = abstractC15029l.mo1021package();
            }
            interfaceC10996l.add(strMo1021package);
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp == this.loadAd);
        this.amazon = iMo1023strictfp;
    }

    public C2848l purchase() {
        AbstractC12442l.admob(this.crashlytics <= this.amazon);
        return new C2848l(this);
    }

    public void remoteconfig(Object obj, InterfaceC0060l interfaceC0060l, C7597l c7597l) throws C2297l {
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        int iMo1028volatile = abstractC15029l.mo1028volatile();
        if (abstractC15029l.f29555l + 0 >= 100) {
            throw new C2297l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iAds = abstractC15029l.ads(iMo1028volatile);
        abstractC15029l.f29555l++;
        interfaceC0060l.purchase(obj, this, c7597l);
        abstractC15029l.loadAd(0);
        abstractC15029l.f29555l--;
        abstractC15029l.startapp(iAds);
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public void m3487return(int i) throws C8236l, C5347l, C8352l {
        switch (this.yandex) {
            case 2:
                if ((this.loadAd & 7) != i) {
                    throw C0803l.crashlytics();
                }
                return;
            case 3:
                if ((this.loadAd & 7) != i) {
                    throw C2297l.crashlytics();
                }
                return;
            default:
                if ((this.loadAd & 7) != i) {
                    throw C5957l.loadAd();
                }
                return;
        }
    }

    public void signatures(InterfaceC10996l interfaceC10996l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof C2577l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC10996l.add(Integer.valueOf(abstractC15029l.pro()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC10996l.add(Integer.valueOf(abstractC15029l.pro()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        C2577l c2577l = (C2577l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c2577l.billing(abstractC15029l.pro());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            c2577l.billing(abstractC15029l.pro());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    public void smaato(Object obj, InterfaceC9608l interfaceC9608l, C1466l c1466l) throws C0803l {
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        int iMo1028volatile = abstractC15029l.mo1028volatile();
        if (abstractC15029l.f29555l >= 100) {
            throw new C0803l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iAds = abstractC15029l.ads(iMo1028volatile);
        abstractC15029l.f29555l++;
        interfaceC9608l.isPro(obj, this, c1466l);
        abstractC15029l.loadAd(0);
        abstractC15029l.f29555l--;
        abstractC15029l.startapp(iAds);
    }

    public void startapp(InterfaceC9858l interfaceC9858l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC16587l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC9858l.add(Boolean.valueOf(abstractC15029l.subscription()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC9858l.add(Boolean.valueOf(abstractC15029l.subscription()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC16587l abstractC16587l = (AbstractC16587l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC16587l.billing(abstractC15029l.subscription());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC16587l.billing(abstractC15029l.subscription());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public void m3488static(InterfaceC10996l interfaceC10996l) throws C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof AbstractC8563l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    interfaceC10996l.add(Long.valueOf(abstractC15029l.appmetrica()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iMo1028volatile = abstractC15029l.mo1028volatile();
            m3434l(iMo1028volatile);
            int iAdmob = abstractC15029l.admob() + iMo1028volatile;
            do {
                interfaceC10996l.add(Long.valueOf(abstractC15029l.appmetrica()));
            } while (abstractC15029l.admob() < iAdmob);
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                abstractC8563l.billing(abstractC15029l.appmetrica());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iMo1028volatile2 = abstractC15029l.mo1028volatile();
        m3434l(iMo1028volatile2);
        int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
        do {
            abstractC8563l.billing(abstractC15029l.appmetrica());
        } while (abstractC15029l.admob() < iAdmob2);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public void m3489strictfp(InterfaceC9858l interfaceC9858l) throws C2297l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13401l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    interfaceC9858l.add(Long.valueOf(abstractC15029l.advert()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iMo1028volatile = abstractC15029l.mo1028volatile();
            m3430l(iMo1028volatile);
            int iAdmob = abstractC15029l.admob() + iMo1028volatile;
            do {
                interfaceC9858l.add(Long.valueOf(abstractC15029l.advert()));
            } while (abstractC15029l.admob() < iAdmob);
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                abstractC13401l.billing(abstractC15029l.advert());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iMo1028volatile2 = abstractC15029l.mo1028volatile();
        m3430l(iMo1028volatile2);
        int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
        do {
            abstractC13401l.billing(abstractC15029l.advert());
        } while (abstractC15029l.admob() < iAdmob2);
    }

    public void subs(Object obj, InterfaceC9608l interfaceC9608l, C1466l c1466l) {
        int i = this.crashlytics;
        this.crashlytics = ((this.loadAd >>> 3) << 3) | 4;
        try {
            interfaceC9608l.isPro(obj, this, c1466l);
            if (this.loadAd != this.crashlytics) {
                throw C0803l.billing();
            }
            this.crashlytics = i;
        } catch (Throwable th) {
            this.crashlytics = i;
            throw th;
        }
    }

    public AbstractC16071l subscription() throws C8236l, C5347l, C8352l {
        m3487return(2);
        return ((AbstractC15029l) this.purchase).tapsense();
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public void m3490super(InterfaceC0400l interfaceC0400l) throws C5957l, C2297l, C0803l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 0) {
            do {
                ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.adcel()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLoadAd = abstractC9284l.loadAd() + abstractC9284l.license();
        do {
            ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.adcel()));
        } while (abstractC9284l.loadAd() < iLoadAd);
        m3441const(iLoadAd);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public void m3491switch(InterfaceC0400l interfaceC0400l) throws C5957l, C2297l, C0803l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 0) {
            do {
                ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.vip()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLoadAd = abstractC9284l.loadAd() + abstractC9284l.license();
        do {
            ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.vip()));
        } while (abstractC9284l.loadAd() < iLoadAd);
        m3441const(iLoadAd);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void m3492synchronized(InterfaceC10996l interfaceC10996l) throws C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof AbstractC8563l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    interfaceC10996l.add(Long.valueOf(abstractC15029l.advert()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iMo1028volatile = abstractC15029l.mo1028volatile();
            m3434l(iMo1028volatile);
            int iAdmob = abstractC15029l.admob() + iMo1028volatile;
            do {
                interfaceC10996l.add(Long.valueOf(abstractC15029l.advert()));
            } while (abstractC15029l.admob() < iAdmob);
            return;
        }
        AbstractC8563l abstractC8563l = (AbstractC8563l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                abstractC8563l.billing(abstractC15029l.advert());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iMo1028volatile2 = abstractC15029l.mo1028volatile();
        m3434l(iMo1028volatile2);
        int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
        do {
            abstractC8563l.billing(abstractC15029l.advert());
        } while (abstractC15029l.admob() < iAdmob2);
    }

    public AbstractC15257l tapsense() throws C8236l, C5347l, C8352l {
        m3487return(2);
        return ((AbstractC15029l) this.purchase).Signature();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public void m3493this(InterfaceC0400l interfaceC0400l, boolean z) throws C8236l, C5347l, C8352l {
        String strSubscription;
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        if ((this.loadAd & 7) != 2) {
            throw C5957l.loadAd();
        }
        do {
            if (z) {
                m3487return(2);
                strSubscription = abstractC9284l.tapsense();
            } else {
                m3487return(2);
                strSubscription = abstractC9284l.subscription();
            }
            ((C10268l) interfaceC0400l).add(strSubscription);
            if (abstractC9284l.crashlytics()) {
                return;
            } else {
                iSignature = abstractC9284l.Signature();
            }
        } while (iSignature == this.loadAd);
        this.amazon = iSignature;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void m3494throw(InterfaceC9858l interfaceC9858l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13800l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC9858l.add(Integer.valueOf(abstractC15029l.signatures()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC9858l.add(Integer.valueOf(abstractC15029l.signatures()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC13800l.billing(abstractC15029l.signatures());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC13800l.billing(abstractC15029l.signatures());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public void m3495throws(InterfaceC9858l interfaceC9858l) throws C2297l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13800l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo1028volatile = abstractC15029l.mo1028volatile();
                m3435l(iMo1028volatile);
                int iAdmob = abstractC15029l.admob() + iMo1028volatile;
                do {
                    interfaceC9858l.add(Integer.valueOf(abstractC15029l.ad()));
                } while (abstractC15029l.admob() < iAdmob);
                return;
            }
            if (i2 != 5) {
                throw C2297l.crashlytics();
            }
            do {
                interfaceC9858l.add(Integer.valueOf(abstractC15029l.ad()));
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp == this.loadAd);
            this.amazon = iMo1023strictfp;
            return;
        }
        AbstractC13800l abstractC13800l = (AbstractC13800l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo1028volatile2 = abstractC15029l.mo1028volatile();
            m3435l(iMo1028volatile2);
            int iAdmob2 = abstractC15029l.admob() + iMo1028volatile2;
            do {
                abstractC13800l.billing(abstractC15029l.ad());
            } while (abstractC15029l.admob() < iAdmob2);
            return;
        }
        if (i3 != 5) {
            throw C2297l.crashlytics();
        }
        do {
            abstractC13800l.billing(abstractC15029l.ad());
            if (abstractC15029l.subs()) {
                return;
            } else {
                iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
            }
        } while (iMo1023strictfp2 == this.loadAd);
        this.amazon = iMo1023strictfp2;
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public void m3496transient(InterfaceC0400l interfaceC0400l) throws C5957l, C2297l, C0803l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 0) {
            do {
                ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.license()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLoadAd = abstractC9284l.loadAd() + abstractC9284l.license();
        do {
            ((C10268l) interfaceC0400l).add(Integer.valueOf(abstractC9284l.license()));
        } while (abstractC9284l.loadAd() < iLoadAd);
        m3441const(iLoadAd);
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public void m3497try(InterfaceC10996l interfaceC10996l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC10996l instanceof C2577l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC10996l.add(Integer.valueOf(abstractC15029l.mo1028volatile()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C0803l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC10996l.add(Integer.valueOf(abstractC15029l.mo1028volatile()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        C2577l c2577l = (C2577l) interfaceC10996l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                c2577l.billing(abstractC15029l.mo1028volatile());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C0803l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            c2577l.billing(abstractC15029l.mo1028volatile());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    public void vip(Object obj, InterfaceC5100l interfaceC5100l, C5225l c5225l) throws C5957l {
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int iLicense = abstractC9284l.license();
        if (abstractC9284l.yandex + abstractC9284l.loadAd >= 100) {
            throw new C5957l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iPurchase = abstractC9284l.purchase(iLicense);
        abstractC9284l.yandex++;
        interfaceC5100l.mopub(obj, this, c5225l);
        abstractC9284l.yandex(0);
        abstractC9284l.yandex--;
        abstractC9284l.amazon(iPurchase);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public void m3498volatile(InterfaceC0400l interfaceC0400l) throws C5957l {
        int iSignature;
        AbstractC9284l abstractC9284l = (AbstractC9284l) this.purchase;
        int i = this.loadAd & 7;
        if (i == 1) {
            do {
                ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.firebase()));
                if (abstractC9284l.crashlytics()) {
                    return;
                } else {
                    iSignature = abstractC9284l.Signature();
                }
            } while (iSignature == this.loadAd);
            this.amazon = iSignature;
            return;
        }
        if (i != 2) {
            throw C5957l.loadAd();
        }
        int iLicense = abstractC9284l.license();
        if ((iLicense & 7) != 0) {
            throw new C5957l("Failed to parse the message.");
        }
        int iLoadAd = abstractC9284l.loadAd() + iLicense;
        do {
            ((C10268l) interfaceC0400l).add(Long.valueOf(abstractC9284l.firebase()));
        } while (abstractC9284l.loadAd() < iLoadAd);
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public void m3499while(InterfaceC9858l interfaceC9858l) throws C5957l, C2297l, C0803l {
        int iMo1023strictfp;
        int iMo1023strictfp2;
        AbstractC15029l abstractC15029l = (AbstractC15029l) this.purchase;
        boolean z = interfaceC9858l instanceof AbstractC13401l;
        int i = this.loadAd;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    interfaceC9858l.add(Long.valueOf(abstractC15029l.mo1020native()));
                    if (abstractC15029l.subs()) {
                        return;
                    } else {
                        iMo1023strictfp = abstractC15029l.mo1023strictfp();
                    }
                } while (iMo1023strictfp == this.loadAd);
                this.amazon = iMo1023strictfp;
                return;
            }
            if (i2 != 2) {
                throw C2297l.crashlytics();
            }
            int iAdmob = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
            do {
                interfaceC9858l.add(Long.valueOf(abstractC15029l.mo1020native()));
            } while (abstractC15029l.admob() < iAdmob);
            m3441const(iAdmob);
            return;
        }
        AbstractC13401l abstractC13401l = (AbstractC13401l) interfaceC9858l;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                abstractC13401l.billing(abstractC15029l.mo1020native());
                if (abstractC15029l.subs()) {
                    return;
                } else {
                    iMo1023strictfp2 = abstractC15029l.mo1023strictfp();
                }
            } while (iMo1023strictfp2 == this.loadAd);
            this.amazon = iMo1023strictfp2;
            return;
        }
        if (i3 != 2) {
            throw C2297l.crashlytics();
        }
        int iAdmob2 = abstractC15029l.admob() + abstractC15029l.mo1028volatile();
        do {
            abstractC13401l.billing(abstractC15029l.mo1020native());
        } while (abstractC15029l.admob() < iAdmob2);
        m3441const(iAdmob2);
    }

    public void yandex(C17512l c17512l) {
        c17512l.f34123l = null;
        c17512l.f34127l = null;
        c17512l.f34126l = null;
        c17512l.f34130l = 1;
        int i = this.loadAd;
        if (i > 0) {
            int i2 = this.amazon;
            if ((i2 & 1) == 0) {
                this.amazon = i2 + 1;
                this.loadAd = i - 1;
                this.crashlytics++;
            }
        }
        c17512l.f34127l = (C17512l) this.purchase;
        this.purchase = c17512l;
        int i3 = this.amazon;
        int i4 = i3 + 1;
        this.amazon = i4;
        int i5 = this.loadAd;
        if (i5 > 0 && (i4 & 1) == 0) {
            this.amazon = i3 + 2;
            this.loadAd = i5 - 1;
            this.crashlytics++;
        }
        int i6 = 4;
        while (true) {
            int i7 = i6 - 1;
            if ((this.amazon & i7) != i7) {
                return;
            }
            int i8 = this.crashlytics;
            if (i8 == 0) {
                C17512l c17512l2 = (C17512l) this.purchase;
                C17512l c17512l3 = c17512l2.f34127l;
                C17512l c17512l4 = c17512l3.f34127l;
                c17512l3.f34127l = c17512l4.f34127l;
                this.purchase = c17512l3;
                c17512l3.f34126l = c17512l4;
                c17512l3.f34123l = c17512l2;
                c17512l3.f34130l = c17512l2.f34130l + 1;
                c17512l4.f34127l = c17512l3;
                c17512l2.f34127l = c17512l3;
            } else if (i8 == 1) {
                C17512l c17512l5 = (C17512l) this.purchase;
                C17512l c17512l6 = c17512l5.f34127l;
                this.purchase = c17512l6;
                c17512l6.f34123l = c17512l5;
                c17512l6.f34130l = c17512l5.f34130l + 1;
                c17512l5.f34127l = c17512l6;
                this.crashlytics = 0;
            } else if (i8 == 2) {
                this.crashlytics = 0;
            }
            i6 *= 2;
        }
    }

    public /* synthetic */ C12676l(int i, Object obj) {
        this.yandex = i;
        this.purchase = obj;
    }

    public /* synthetic */ C12676l(byte b, int i) {
        this.yandex = i;
    }

    public C12676l(AbstractC9284l abstractC9284l, byte b) {
        this.yandex = 10;
        this.amazon = 0;
        this.purchase = abstractC9284l;
        abstractC9284l.crashlytics = this;
    }

    public C12676l() {
        this.yandex = 1;
        this.amazon = 7;
        this.purchase = new int[8];
    }

    public C12676l(AbstractC15029l abstractC15029l) {
        this.yandex = 2;
        this.amazon = 0;
        Charset charset = AbstractC6320l.yandex;
        this.purchase = abstractC15029l;
        abstractC15029l.f29554l = this;
    }

    public C12676l(AbstractC15029l abstractC15029l, byte b) {
        this.yandex = 3;
        this.amazon = 0;
        AbstractC6061l.yandex(abstractC15029l, "input");
        this.purchase = abstractC15029l;
        abstractC15029l.f29554l = this;
    }

    public C12676l(AbstractC9284l abstractC9284l) {
        this.yandex = 4;
        this.amazon = 0;
        Charset charset = AbstractC4579l.yandex;
        this.purchase = abstractC9284l;
        abstractC9284l.crashlytics = this;
    }

    public C12676l(int i) {
        this.yandex = 5;
        this.loadAd = i;
    }
}
