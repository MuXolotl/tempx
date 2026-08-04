package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؔٞؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2786l {

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final C1780l f6084throws = new C1780l();
    public final boolean Signature;
    public final C9038l ad;
    public final C4816l adcel;
    public C10418l admob;
    public final C14952l ads;
    public final C13716l advert;
    public C9731l amazon;
    public final HashSet applovin;
    public final HashMap appmetrica;
    public C2773l billing;
    public C0527l crashlytics;
    public final C15421l firebase;
    public final long inmobi;
    public final C15421l isPro;
    public final C3585l isVip;
    public C8634l license;
    public int loadAd;
    public C14671l metrica;
    public C9585l mopub;
    public final C3585l premium;
    public final C9038l pro;
    public Executor purchase;
    public C7930l remoteconfig;
    public final C3585l signatures;
    public final Range smaato;
    public InterfaceC4969l startapp;
    public final C10136l subs;
    public int subscription;
    public final boolean tapsense;
    public C12404l vip;
    public final C7542l yandex;

    public AbstractC2786l(Context context) {
        boolean z;
        ListenableFuture listenableFutureAdmob;
        int i;
        byte b;
        byte b2;
        C15615l c15615l = C0466l.loadAd.yandex;
        synchronized (c15615l.f30480l) {
            Object obj = AbstractC8626l.yandex;
            z = false;
            byte b3 = 0;
            b2 = 0;
            b = 0;
            c15615l.f30482l = AbstractC10014l.yandex(Build.VERSION.SDK_INT >= 34 ? AbstractC5917l.remoteconfig(context) : 0);
            listenableFutureAdmob = (C15815l) c15615l.f30486l;
            i = 14;
            if (listenableFutureAdmob == null) {
                C5762l c5762l = new C5762l(context, null);
                RunnableC9823l runnableC9823lSmaato = AbstractC11356l.smaato(AbstractC11356l.smaato(C15815l.loadAd((ListenableFuture) c15615l.f30487l), new C6536l(8, new C17015l(27, c5762l)), AbstractC12272l.yandex()), new C1770l(i, new C6536l(9, new Ctransient(c15615l, c5762l, context, 24))), AbstractC12272l.yandex());
                c15615l.f30486l = runnableC9823lSmaato;
                runnableC9823lSmaato.yandex(new RunnableC9929l(runnableC9823lSmaato, new C16543l(16, c15615l), b3 == true ? 1 : 0), AbstractC12272l.yandex());
                listenableFutureAdmob = AbstractC11356l.admob(runnableC9823lSmaato);
            }
        }
        new C9673l(5);
        RunnableC9823l runnableC9823lSmaato2 = AbstractC11356l.smaato(AbstractC11356l.smaato(listenableFutureAdmob, new C1770l(i, new C18073l()), AbstractC12272l.yandex()), new C1770l(i, new C18353l(10)), AbstractC12272l.yandex());
        this.yandex = C7542l.crashlytics;
        this.loadAd = 3;
        new HashMap();
        this.subs = C3551l.inmobi;
        C15421l c15421l = C15421l.crashlytics;
        this.isPro = c15421l;
        this.firebase = c15421l;
        this.smaato = C5464l.admob;
        this.subscription = -1;
        this.tapsense = true;
        this.Signature = true;
        this.pro = new C9038l();
        this.ad = new C9038l();
        C13716l c13716l = new C13716l(new C17690l(0));
        this.advert = c13716l;
        C18353l c18353l = new C18353l(11);
        C8157l c8157l = new C8157l(c18353l.mo1368apply(c13716l.amazon()), c18353l);
        C13716l c13716l2 = c8157l.metrica;
        c8157l.metrica = c13716l;
        int i2 = 21;
        AbstractC12225l.firebase(new RunnableC10613l(c13716l2, c8157l, c13716l, i2));
        this.isVip = new C3585l(i2, z);
        this.signatures = new C3585l(i2, (boolean) (b == true ? 1 : 0));
        this.premium = new C3585l(i2, (boolean) (b2 == true ? 1 : 0));
        this.applovin = new HashSet();
        this.appmetrica = new HashMap();
        this.inmobi = 5000000000L;
        Context contextYandex = AbstractC8626l.yandex(context);
        C14929l c14929l = new C14929l(2);
        crashlytics(c14929l);
        C5104l c5104l = c14929l.f29382l;
        c5104l.mopub(InterfaceC16352l.signatures, c15421l);
        C8749l c8749l = new C8749l(C7420l.yandex(c5104l));
        AbstractC17666l.billing(c8749l);
        C0527l c0527l = new C0527l(c8749l);
        c0527l.tapsense = C0527l.signatures;
        this.crashlytics = c0527l;
        this.amazon = purchase(null);
        this.mopub = amazon(null, null, null);
        this.admob = mopub();
        C18089l c18089l = (C18089l) this;
        AbstractC11356l.smaato(runnableC9823lSmaato2, new C1770l(i, new C14952l(c18089l)), AbstractC12272l.admob());
        this.adcel = new C4816l(contextYandex);
        this.ads = new C14952l(c18089l);
    }

    public final C4738l admob() {
        HashMap map = this.appmetrica;
        EnumC17323l enumC17323l = EnumC17323l.f33634l;
        if (map.get(enumC17323l) != null) {
            return (C4738l) map.get(enumC17323l);
        }
        EnumC17323l enumC17323l2 = EnumC17323l.f33635l;
        if (map.get(enumC17323l2) != null) {
            return (C4738l) map.get(enumC17323l2);
        }
        return null;
    }

    public final C9585l amazon(Integer num, Integer num2, Integer num3) {
        C14929l c14929l = new C14929l(0);
        C5104l c5104l = c14929l.f29382l;
        if (num != null) {
            c5104l.mopub(C16506l.f32251l, num);
        }
        if (num2 != null) {
            c5104l.mopub(C16506l.f32249l, num2);
        }
        if (num3 != null) {
            c5104l.mopub(C16506l.f32252l, num3);
        }
        crashlytics(c14929l);
        int i = this.subscription;
        if (i != -1) {
            c5104l.mopub(InterfaceC4089l.applovin, Integer.valueOf(i));
        }
        C16506l c16506l = new C16506l(C7420l.yandex(c5104l));
        AbstractC17666l.billing(c16506l);
        return new C9585l(c16506l);
    }

    public final C12418l billing() {
        if (this.vip == null) {
            AbstractC5088l.yandex("CameraController", "Camera not initialized.");
            return null;
        }
        if (this.startapp == null || this.metrica == null) {
            AbstractC5088l.yandex("CameraController", "PreviewView not attached to CameraController.");
            return null;
        }
        metrica();
        C16426l c16426l = new C16426l();
        C0527l c0527l = this.crashlytics;
        ArrayList arrayList = c16426l.loadAd;
        arrayList.add(c0527l);
        AbstractC12225l.crashlytics();
        if ((this.loadAd & 1) != 0) {
            arrayList.add(this.amazon);
        }
        AbstractC12225l.crashlytics();
        if ((this.loadAd & 2) != 0) {
            arrayList.add(this.mopub);
        }
        AbstractC12225l.crashlytics();
        c16426l.yandex = this.metrica;
        Iterator it = this.applovin.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList2 = c16426l.crashlytics;
            if (!zHasNext) {
                AbstractC5641l.loadAd(!arrayList.isEmpty(), "UseCase must not be empty.");
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    throw AbstractC15560l.adcel(it2);
                }
                return new C12418l(c16426l.yandex, arrayList, arrayList2, 11);
            }
            if (it.next() != null) {
                C18725l.loadAd();
                return null;
            }
            arrayList2.add(null);
        }
    }

    public final void crashlytics(C14929l c14929l) {
        C14513l c14513l;
        C14671l c14671l = this.metrica;
        if (c14671l != null) {
            int iSubs = subs(c14671l);
            if (iSubs != -1) {
                byte b = 0;
                c14513l = new C14513l(iSubs, b, b);
            } else {
                c14513l = null;
            }
            if (c14513l != null) {
                C18085l c18085l = new C18085l(c14513l, null, null);
                switch (c14929l.f29383l) {
                    case 0:
                        c14929l.f29382l.mopub(InterfaceC4089l.f8427volatile, c18085l);
                        break;
                    case 1:
                        c14929l.f29382l.mopub(InterfaceC4089l.f8427volatile, c18085l);
                        break;
                    case 2:
                        c14929l.f29382l.mopub(InterfaceC4089l.f8427volatile, c18085l);
                        break;
                    default:
                        c14929l.f29382l.mopub(InterfaceC4089l.f8427volatile, c18085l);
                        break;
                }
            }
        }
    }

    public final ListenableFuture firebase(float f) {
        AbstractC12225l.crashlytics();
        return !isPro() ? this.premium.m1358synchronized(Float.valueOf(f)) : ((C14767l) this.remoteconfig.purchase()).crashlytics.billing(f);
    }

    public final boolean isPro() {
        return this.remoteconfig != null;
    }

    public final void loadAd() {
        AbstractC12225l.crashlytics();
        C12404l c12404l = this.vip;
        if (c12404l != null) {
            c12404l.loadAd(this.crashlytics, this.amazon, this.mopub, this.admob);
        }
        this.crashlytics.m624strictfp(null);
        this.remoteconfig = null;
        this.startapp = null;
        this.metrica = null;
        C4816l c4816l = this.adcel;
        C14952l c14952l = this.ads;
        synchronized (c4816l.f9860l) {
            try {
                C12892l c12892l = (C12892l) ((HashMap) c4816l.f9862l).get(c14952l);
                if (c12892l != null) {
                    c12892l.crashlytics.set(false);
                    ((HashMap) c4816l.f9862l).remove(c14952l);
                }
                if (((HashMap) c4816l.f9862l).isEmpty()) {
                    ((C3602l) c4816l.f9859l).disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void metrica() {
        C12404l c12404l = this.vip;
        if (c12404l != null) {
            c12404l.loadAd(this.crashlytics, this.amazon, this.mopub, this.admob);
        }
    }

    public final C10418l mopub() {
        int iSubs;
        C11983l c11983l = C3551l.f7465synchronized;
        C11983l c11983l2 = C3551l.f7467volatile;
        C1858l c1858l = C3551l.f7462package;
        c1858l.getClass();
        int i = C16928l.amazon;
        C16928l c16928l = c1858l.yandex;
        int i2 = c1858l.loadAd;
        C10136l c10136l = this.subs;
        AbstractC5641l.amazon(c10136l, "The specified quality selector can't be null.");
        C16928l c16928l2 = new C16928l(c10136l, c16928l.loadAd, c16928l.crashlytics);
        C14671l c14671l = this.metrica;
        if (c14671l != null && c10136l == C3551l.inmobi && (iSubs = subs(c14671l)) != -1) {
            c16928l2 = new C16928l(c16928l2.yandex, iSubs, c16928l2.crashlytics);
        }
        C14929l c14929l = new C14929l(new C3551l(new C1858l(c16928l2, i2), c11983l, c11983l, c11983l2));
        Range range = this.smaato;
        C6916l c6916l = InterfaceC0048l.f924l;
        C5104l c5104l = c14929l.f29382l;
        c5104l.mopub(c6916l, range);
        c5104l.mopub(InterfaceC4089l.inmobi, 0);
        c5104l.mopub(InterfaceC16352l.signatures, this.isPro);
        int i3 = this.subscription;
        if (i3 != -1) {
            c5104l.mopub(InterfaceC4089l.applovin, Integer.valueOf(i3));
        }
        return new C10418l(new C11550l(C7420l.yandex(c5104l)));
    }

    public final C9731l purchase(Integer num) {
        C14929l c14929l = new C14929l(1);
        C5104l c5104l = c14929l.f29382l;
        if (num != null) {
            c5104l.mopub(C14180l.f27767l, num);
        }
        crashlytics(c14929l);
        int i = this.subscription;
        if (i != -1) {
            c5104l.mopub(InterfaceC4089l.applovin, Integer.valueOf(i));
        }
        return c14929l.yandex();
    }

    public final void remoteconfig(RunnableC9534l runnableC9534l) {
        C16749l c16749l;
        C16749l c16749l2;
        try {
            this.remoteconfig = smaato();
            if (!isPro()) {
                AbstractC5088l.yandex("CameraController", "Use cases not attached to camera.");
                return;
            }
            AbstractC8769l abstractC8769lMo3792throws = ((C16057l) this.remoteconfig.loadAd()).f31461l.mo3792throws();
            C9038l c9038l = this.pro;
            AbstractC8769l abstractC8769l = c9038l.remoteconfig;
            if (abstractC8769l != null && (c16749l2 = (C16749l) c9038l.smaato.billing(abstractC8769l)) != null) {
                c16749l2.yandex.admob(c16749l2);
            }
            c9038l.remoteconfig = abstractC8769lMo3792throws;
            c9038l.firebase(abstractC8769lMo3792throws, new C11564l(0, c9038l));
            AbstractC8769l abstractC8769lAdmob = ((C16057l) this.remoteconfig.loadAd()).f31461l.admob();
            C9038l c9038l2 = this.ad;
            AbstractC8769l abstractC8769l2 = c9038l2.remoteconfig;
            if (abstractC8769l2 != null && (c16749l = (C16749l) c9038l2.smaato.billing(abstractC8769l2)) != null) {
                c16749l.yandex.admob(c16749l);
            }
            c9038l2.remoteconfig = abstractC8769lAdmob;
            c9038l2.firebase(abstractC8769lAdmob, new C11564l(0, c9038l2));
            C3585l c3585l = this.isVip;
            c3585l.getClass();
            AbstractC12225l.crashlytics();
            C17879l c17879l = (C17879l) c3585l.f7511l;
            if (c17879l != null) {
                Boolean bool = (Boolean) c17879l.loadAd;
                boolean zBooleanValue = bool.booleanValue();
                AbstractC12225l.crashlytics();
                ListenableFuture listenableFutureM1358synchronized = !isPro() ? c3585l.m1358synchronized(bool) : ((C14767l) this.remoteconfig.purchase()).crashlytics.isPro(zBooleanValue);
                C5807l c5807l = (C5807l) ((C17879l) c3585l.f7511l).yandex;
                Objects.requireNonNull(c5807l);
                AbstractC11356l.subs(listenableFutureM1358synchronized, c5807l);
                c3585l.f7511l = null;
            }
            C3585l c3585l2 = this.signatures;
            c3585l2.getClass();
            AbstractC12225l.crashlytics();
            C17879l c17879l2 = (C17879l) c3585l2.f7511l;
            if (c17879l2 != null) {
                Float f = (Float) c17879l2.loadAd;
                float fFloatValue = f.floatValue();
                AbstractC12225l.crashlytics();
                ListenableFuture listenableFutureM1358synchronized2 = !isPro() ? c3585l2.m1358synchronized(f) : ((C14767l) this.remoteconfig.purchase()).crashlytics.amazon(fFloatValue);
                C5807l c5807l2 = (C5807l) ((C17879l) c3585l2.f7511l).yandex;
                Objects.requireNonNull(c5807l2);
                AbstractC11356l.subs(listenableFutureM1358synchronized2, c5807l2);
                c3585l2.f7511l = null;
            }
            C3585l c3585l3 = this.premium;
            c3585l3.getClass();
            AbstractC12225l.crashlytics();
            C17879l c17879l3 = (C17879l) c3585l3.f7511l;
            if (c17879l3 != null) {
                ListenableFuture listenableFutureFirebase = firebase(((Float) c17879l3.loadAd).floatValue());
                C5807l c5807l3 = (C5807l) ((C17879l) c3585l3.f7511l).yandex;
                Objects.requireNonNull(c5807l3);
                AbstractC11356l.subs(listenableFutureFirebase, c5807l3);
                c3585l3.f7511l = null;
            }
        } catch (RuntimeException e) {
            if (runnableC9534l != null) {
                runnableC9534l.run();
            }
            throw e;
        }
    }

    public abstract C7930l smaato();

    public final void startapp() {
        C4738l c4738lAdmob = admob();
        if (c4738lAdmob == null) {
            AbstractC5088l.yandex("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            C9731l c9731l = this.amazon;
            c9731l.getClass();
            C2658l c2658l = new C2658l(f6084throws);
            c9731l.pro = c2658l;
            c9731l.purchase().admob(c2658l);
            return;
        }
        C9731l c9731l2 = this.amazon;
        InterfaceC2406l interfaceC2406l = c4738lAdmob.loadAd;
        c9731l2.getClass();
        C2658l c2658l2 = new C2658l(interfaceC2406l);
        c9731l2.pro = c2658l2;
        c9731l2.purchase().admob(c2658l2);
        AbstractC5088l.yandex("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + c4738lAdmob.yandex.name());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7 A[RETURN] */
    public final int subs(C14671l c14671l) {
        int iCrashlytics;
        String string;
        boolean z;
        int iLoadAd;
        Rational rational;
        C7542l c7542l = this.yandex;
        int iPurchase = c14671l == null ? 0 : AbstractC7799l.purchase(c14671l.crashlytics);
        try {
            C12404l c12404l = this.vip;
            if (c12404l != null) {
                InterfaceC15879l interfaceC15879l = c12404l.yandex.yandex.firebase(c7542l).f27125l;
                iCrashlytics = interfaceC15879l.crashlytics();
                try {
                    if (interfaceC15879l.metrica() != 1) {
                        z = false;
                    }
                } catch (IllegalArgumentException e) {
                    e = e;
                    if (c7542l == null) {
                        string = "null";
                    } else {
                        StringBuilder sb = new StringBuilder("CameraSelector{");
                        Integer numLoadAd = c7542l.loadAd();
                        if (numLoadAd != null) {
                            int iIntValue = numLoadAd.intValue();
                            if (iIntValue == 0) {
                                sb.append("lensFacing=FRONT");
                            } else if (iIntValue == 1) {
                                sb.append("lensFacing=BACK");
                            } else if (iIntValue != 2) {
                                sb.append("lensFacing=UNKNOWN(");
                                sb.append(numLoadAd);
                                sb.append(")");
                            } else {
                                sb.append("lensFacing=EXTERNAL");
                            }
                        } else {
                            sb.append("lensFacing=NOT_SPECIFIED");
                        }
                        sb.append("}");
                        string = sb.toString();
                    }
                    AbstractC5088l.Signature("CameraController", "Failed to retrieve CameraInfo for selector: ".concat(string), e);
                }
                iLoadAd = AbstractC7799l.loadAd(iPurchase, iCrashlytics, z);
                rational = c14671l.loadAd;
                if (iLoadAd != 90 || iLoadAd == 270) {
                    rational = new Rational(rational.getDenominator(), rational.getNumerator());
                }
                if (rational.equals(AbstractC14608l.yandex)) {
                    return 0;
                }
                if (rational.equals(AbstractC14608l.crashlytics)) {
                    return 1;
                }
                return -1;
            }
            iCrashlytics = 0;
        } catch (IllegalArgumentException e2) {
            e = e2;
            iCrashlytics = 0;
        }
        z = true;
        iLoadAd = AbstractC7799l.loadAd(iPurchase, iCrashlytics, z);
        rational = c14671l.loadAd;
        if (iLoadAd != 90) {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        } else {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        }
        if (rational.equals(AbstractC14608l.yandex)) {
            return 0;
        }
        if (rational.equals(AbstractC14608l.crashlytics)) {
            return 1;
        }
        return -1;
    }

    public final void vip() {
        C2773l c2773l;
        metrica();
        C14929l c14929l = new C14929l(2);
        crashlytics(c14929l);
        C15421l c15421l = this.firebase;
        C5104l c5104l = c14929l.f29382l;
        c5104l.mopub(InterfaceC16352l.signatures, c15421l);
        C8749l c8749l = new C8749l(C7420l.yandex(c5104l));
        AbstractC17666l.billing(c8749l);
        C0527l c0527l = new C0527l(c8749l);
        c0527l.tapsense = C0527l.signatures;
        this.crashlytics = c0527l;
        InterfaceC4969l interfaceC4969l = this.startapp;
        if (interfaceC4969l != null) {
            c0527l.m624strictfp(interfaceC4969l);
        }
        AbstractC12225l.crashlytics();
        Integer numValueOf = Integer.valueOf(this.amazon.subscription);
        int iM2730volatile = this.amazon.m2730volatile();
        this.amazon = purchase(numValueOf);
        AbstractC12225l.crashlytics();
        if (iM2730volatile == 3) {
            Integer numLoadAd = this.yandex.loadAd();
            if (numLoadAd != null && numLoadAd.intValue() != 0) {
                C8339l.metrica("Not a front camera despite setting FLASH_MODE_SCREEN");
                return;
            }
            startapp();
        }
        C9731l c9731l = this.amazon;
        c9731l.getClass();
        AbstractC5088l.yandex("ImageCapture", "setFlashMode: flashMode = " + iM2730volatile);
        if (iM2730volatile != 0 && iM2730volatile != 1 && iM2730volatile != 2) {
            if (iM2730volatile != 3) {
                C8339l.metrica(AbstractC0653l.vip(iM2730volatile, "Invalid flash mode: "));
                return;
            }
            if (c9731l.pro.yandex == null) {
                C8339l.metrica("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return;
            } else if (c9731l.amazon() != null) {
                InterfaceC18690l interfaceC18690lAmazon = c9731l.amazon();
                if ((interfaceC18690lAmazon != null ? interfaceC18690lAmazon.loadAd().metrica() : -1) != 0) {
                    C8339l.metrica("Not a front camera despite setting FLASH_MODE_SCREEN");
                    return;
                }
            }
        }
        synchronized (c9731l.tapsense) {
            c9731l.Signature = iM2730volatile;
            c9731l.m2726extends();
        }
        Integer num = (Integer) ((C7420l) ((C16506l) this.mopub.admob).subs()).smaato(C16506l.f32251l, 0);
        num.intValue();
        Integer numValueOf2 = Integer.valueOf(this.mopub.m2693strictfp());
        Integer numValueOf3 = Integer.valueOf(this.mopub.m2695volatile());
        AbstractC12225l.crashlytics();
        C9585l c9585lAmazon = amazon(num, numValueOf2, numValueOf3);
        this.mopub = c9585lAmazon;
        Executor executor = this.purchase;
        if (executor != null && (c2773l = this.billing) != null) {
            c9585lAmazon.m2692private(executor, c2773l);
        }
        this.admob = mopub();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public final void yandex(InterfaceC4969l interfaceC4969l, C14671l c14671l) {
        byte b;
        AbstractC12225l.crashlytics();
        if (this.startapp != interfaceC4969l) {
            this.startapp = interfaceC4969l;
            this.crashlytics.m624strictfp(interfaceC4969l);
        }
        if (this.metrica != null) {
            int iSubs = subs(c14671l);
            b = 0;
            C14513l c14513l = iSubs != -1 ? new C14513l(iSubs, b, b) : null;
            int iSubs2 = subs(this.metrica);
            b = c14513l != (iSubs2 != -1 ? new C14513l(iSubs2, b, b) : null) ? (byte) 1 : (byte) 0;
        }
        this.metrica = c14671l;
        C4816l c4816l = this.adcel;
        ScheduledExecutorServiceC10335l scheduledExecutorServiceC10335lAdmob = AbstractC12272l.admob();
        C14952l c14952l = this.ads;
        synchronized (c4816l.f9860l) {
            if (((C3602l) c4816l.f9859l).canDetectOrientation()) {
                ((HashMap) c4816l.f9862l).put(c14952l, new C12892l(c14952l, scheduledExecutorServiceC10335lAdmob));
                ((C3602l) c4816l.f9859l).enable();
            } else {
                AbstractC5088l.tapsense("CameraController", "The device cannot detect rotation changes.");
            }
        }
        if (b != 0) {
            vip();
        }
        remoteconfig(null);
    }
}
