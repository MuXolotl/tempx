package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: lؙۧؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6896l {
    public InterfaceC0048l admob;
    public InterfaceC0048l billing;
    public Rect firebase;
    public InterfaceC0048l isPro;
    public HashSet mopub;
    public InterfaceC0048l purchase;
    public InterfaceC18690l remoteconfig;
    public C5464l subs;
    public InterfaceC18690l vip;
    public final HashSet yandex = new HashSet();
    public final Object loadAd = new Object();
    public final Object crashlytics = new Object();
    public int amazon = 2;
    public Matrix smaato = new Matrix();
    public C17485l metrica = null;
    public final C4568l startapp = new C4568l(10, this);
    public C10814l adcel = C10814l.yandex();
    public C10814l ads = C10814l.yandex();

    public AbstractC6896l(InterfaceC0048l interfaceC0048l) {
        this.billing = interfaceC0048l;
        this.admob = interfaceC0048l;
    }

    public InterfaceC0048l Signature(InterfaceC15879l interfaceC15879l, InterfaceC16651l interfaceC16651l) {
        return interfaceC16651l.Signature();
    }

    public final void adcel() {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            ((InterfaceC8927l) it.next()).crashlytics(this);
        }
    }

    public final String admob() {
        String strApplovin = this.admob.applovin("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strApplovin);
        return strApplovin;
    }

    public final void ads() {
        int iInmobi = AbstractC5020l.inmobi(this.amazon);
        HashSet hashSet = this.yandex;
        if (iInmobi == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC8927l) it.next()).purchase(this);
            }
        } else {
            if (iInmobi != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((InterfaceC8927l) it2.next()).ads(this);
            }
        }
    }

    public C5464l advert(InterfaceC17944l interfaceC17944l) {
        C5464l c5464l = this.subs;
        if (c5464l == null) {
            C10754l.ads("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        C6472l c6472lLoadAd = c5464l.loadAd();
        c6472lLoadAd.f13510l = interfaceC17944l;
        return c6472lLoadAd.yandex();
    }

    public final InterfaceC18690l amazon() {
        InterfaceC18690l interfaceC18690l;
        synchronized (this.loadAd) {
            interfaceC18690l = this.remoteconfig;
        }
        return interfaceC18690l;
    }

    public final boolean applovin(int i) {
        Size sizeMo1487volatile;
        int iMo1483finally = ((InterfaceC4089l) this.admob).mo1483finally(-1);
        if (iMo1483finally != -1 && iMo1483finally == i) {
            return false;
        }
        InterfaceC16651l interfaceC16651lSmaato = smaato(this.billing);
        InterfaceC4089l interfaceC4089l = (InterfaceC4089l) interfaceC16651lSmaato.Signature();
        int iMo1483finally2 = interfaceC4089l.mo1483finally(-1);
        if (iMo1483finally2 == -1 || iMo1483finally2 != i) {
            C14929l c14929l = (C14929l) interfaceC16651lSmaato;
            switch (c14929l.f29383l) {
                case 0:
                    c14929l.f29382l.mopub(InterfaceC4089l.applovin, Integer.valueOf(i));
                    break;
                case 1:
                    c14929l.f29382l.mopub(InterfaceC4089l.applovin, Integer.valueOf(i));
                    break;
                case 2:
                    C5104l c5104l = c14929l.f29382l;
                    c5104l.mopub(InterfaceC4089l.applovin, Integer.valueOf(i));
                    c5104l.mopub(InterfaceC4089l.appmetrica, Integer.valueOf(i));
                    break;
                default:
                    c14929l.f29382l.mopub(InterfaceC4089l.applovin, Integer.valueOf(i));
                    break;
            }
        }
        if (iMo1483finally2 != -1 && i != -1 && iMo1483finally2 != i) {
            if (Math.abs(AbstractC7799l.purchase(i) - AbstractC7799l.purchase(iMo1483finally2)) % 180 == 90 && (sizeMo1487volatile = interfaceC4089l.mo1487volatile()) != null) {
                C14929l c14929l2 = (C14929l) interfaceC16651lSmaato;
                Size size = new Size(sizeMo1487volatile.getHeight(), sizeMo1487volatile.getWidth());
                switch (c14929l2.f29383l) {
                    case 0:
                        c14929l2.f29382l.mopub(InterfaceC4089l.f8426throws, size);
                        break;
                    case 1:
                        c14929l2.f29382l.mopub(InterfaceC4089l.f8426throws, size);
                        break;
                    case 2:
                        c14929l2.f29382l.mopub(InterfaceC4089l.f8426throws, size);
                        break;
                    default:
                        throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
            }
        }
        this.billing = interfaceC16651lSmaato.Signature();
        InterfaceC18690l interfaceC18690lAmazon = amazon();
        if (interfaceC18690lAmazon == null) {
            this.admob = this.billing;
            return true;
        }
        this.admob = metrica(interfaceC18690lAmazon.adcel(), this.purchase, this.isPro);
        return true;
    }

    public void appmetrica(Rect rect) {
        this.firebase = rect;
    }

    public final String billing() {
        InterfaceC18690l interfaceC18690lAmazon = amazon();
        AbstractC5641l.amazon(interfaceC18690lAmazon, "No camera attached to use case: " + this);
        return interfaceC18690lAmazon.adcel().mopub();
    }

    public final Size crashlytics() {
        C5464l c5464l = this.subs;
        if (c5464l != null) {
            return c5464l.yandex;
        }
        return null;
    }

    public Set firebase() {
        return Collections.EMPTY_SET;
    }

    public final void inmobi(InterfaceC18690l interfaceC18690l) {
        signatures();
        synchronized (this.loadAd) {
            try {
                InterfaceC18690l interfaceC18690l2 = this.remoteconfig;
                if (interfaceC18690l == interfaceC18690l2) {
                    this.yandex.remove(interfaceC18690l2);
                    this.remoteconfig = null;
                }
                InterfaceC18690l interfaceC18690l3 = this.vip;
                if (interfaceC18690l == interfaceC18690l3) {
                    this.yandex.remove(interfaceC18690l3);
                    this.vip = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.crashlytics) {
            try {
                C17485l c17485l = this.metrica;
                if (c17485l != null) {
                    c17485l.loadAd(this.startapp);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.subs = null;
        this.firebase = null;
        this.admob = this.billing;
        this.purchase = null;
        this.isPro = null;
    }

    public final InterfaceC18690l isPro() {
        InterfaceC18690l interfaceC18690l;
        synchronized (this.loadAd) {
            interfaceC18690l = this.vip;
        }
        return interfaceC18690l;
    }

    public abstract C5464l isVip(C5464l c5464l, C5464l c5464l2);

    public void license(int i) {
        applovin(i);
    }

    public final void loadAd(InterfaceC18690l interfaceC18690l, InterfaceC18690l interfaceC18690l2, InterfaceC0048l interfaceC0048l, InterfaceC0048l interfaceC0048l2) {
        synchronized (this.loadAd) {
            this.remoteconfig = interfaceC18690l;
            this.vip = interfaceC18690l2;
            this.yandex.add(interfaceC18690l);
            if (interfaceC18690l2 != null) {
                this.yandex.add(interfaceC18690l2);
            }
        }
        this.purchase = interfaceC0048l;
        this.isPro = interfaceC0048l2;
        this.admob = metrica(interfaceC18690l.adcel(), this.purchase, this.isPro);
        synchronized (this.crashlytics) {
            try {
                C17485l c17485l = this.metrica;
                if (c17485l != null) {
                    c17485l.yandex(AbstractC12272l.admob(), this.startapp);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        subscription();
    }

    public final InterfaceC0048l metrica(InterfaceC15879l interfaceC15879l, InterfaceC0048l interfaceC0048l, InterfaceC0048l interfaceC0048l2) {
        C5104l c5104lCrashlytics;
        if (interfaceC0048l2 != null) {
            c5104lCrashlytics = C5104l.amazon(interfaceC0048l2);
            c5104lCrashlytics.isPro(InterfaceC15273l.f29871l);
        } else {
            c5104lCrashlytics = C5104l.crashlytics();
        }
        TreeMap treeMap = c5104lCrashlytics.f15372l;
        if (this.billing.mo861strictfp(InterfaceC4089l.premium) || this.billing.mo861strictfp(InterfaceC4089l.f8426throws)) {
            C6916l c6916l = InterfaceC4089l.f8427volatile;
            if (treeMap.containsKey(c6916l)) {
                c5104lCrashlytics.isPro(c6916l);
            }
        }
        InterfaceC0048l interfaceC0048l3 = this.billing;
        C6916l c6916l2 = InterfaceC4089l.f8427volatile;
        if (interfaceC0048l3.mo861strictfp(c6916l2)) {
            C6916l c6916l3 = InterfaceC4089l.f8425synchronized;
            if (treeMap.containsKey(c6916l3) && ((C18085l) this.billing.adcel(c6916l2)).loadAd != null) {
                c5104lCrashlytics.isPro(c6916l3);
            }
        }
        Iterator it = this.billing.startapp().iterator();
        while (it.hasNext()) {
            AbstractC11043l.subscription(c5104lCrashlytics, c5104lCrashlytics, this.billing, (C6916l) it.next());
        }
        if (interfaceC0048l != null) {
            for (C6916l c6916l4 : interfaceC0048l.startapp()) {
                if (!c6916l4.yandex.equals(InterfaceC15273l.f29871l.yandex)) {
                    AbstractC11043l.subscription(c5104lCrashlytics, c5104lCrashlytics, interfaceC0048l, c6916l4);
                }
            }
        }
        if (treeMap.containsKey(InterfaceC4089l.f8426throws)) {
            C6916l c6916l5 = InterfaceC4089l.premium;
            if (treeMap.containsKey(c6916l5)) {
                c5104lCrashlytics.isPro(c6916l5);
            }
        }
        C6916l c6916l6 = InterfaceC4089l.f8427volatile;
        if (treeMap.containsKey(c6916l6)) {
            ((C18085l) c5104lCrashlytics.adcel(c6916l6)).getClass();
        }
        AbstractC5088l.yandex("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.mopub + ", this = " + this);
        HashSet<AbstractC5295l> hashSet = this.mopub;
        if (hashSet != null) {
            int i = AbstractC8555l.yandex;
            Range range = C5464l.admob;
            int i2 = AbstractC7636l.yandex;
            for (AbstractC5295l abstractC5295l : hashSet) {
                if (abstractC5295l instanceof AbstractC8555l) {
                    throw null;
                }
                if (abstractC5295l instanceof C12632l) {
                    throw null;
                }
            }
            if ((this instanceof C0527l) || AbstractC5641l.admob(this)) {
                c5104lCrashlytics.mopub(InterfaceC16352l.signatures, C15421l.amazon);
            }
            c5104lCrashlytics.mopub(InterfaceC0048l.f924l, range);
            c5104lCrashlytics.mopub(InterfaceC0048l.f918l, 1);
            c5104lCrashlytics.mopub(InterfaceC0048l.f921l, 1);
        }
        return Signature(interfaceC15879l, smaato(c5104lCrashlytics));
    }

    public abstract InterfaceC0048l mopub(boolean z, InterfaceC10139l interfaceC10139l);

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m2080package(C5464l c5464l, C5464l c5464l2) {
        this.subs = isVip(c5464l, c5464l2);
    }

    public void premium(Matrix matrix) {
        this.smaato = new Matrix(matrix);
    }

    public final InterfaceC10408l purchase() {
        synchronized (this.loadAd) {
            try {
                InterfaceC18690l interfaceC18690l = this.remoteconfig;
                if (interfaceC18690l == null) {
                    return InterfaceC10408l.yandex;
                }
                return interfaceC18690l.billing();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean remoteconfig() {
        return this instanceof C9585l;
    }

    public abstract InterfaceC16651l smaato(InterfaceC17944l interfaceC17944l);

    public final void startapp() {
        this.amazon = 1;
        ads();
    }

    public final int subs(InterfaceC18690l interfaceC18690l, boolean z) {
        int iTapsense = interfaceC18690l.adcel().tapsense(((InterfaceC4089l) this.admob).mo1483finally(0));
        return (interfaceC18690l.metrica() || !z) ? iTapsense : AbstractC18611l.isPro(-iTapsense);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m2081throws(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.adcel = (C10814l) list.get(0);
        if (list.size() > 1) {
            this.ads = (C10814l) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC0958l abstractC0958l : ((C10814l) it.next()).loadAd()) {
                if (abstractC0958l.isPro == null) {
                    abstractC0958l.isPro = getClass();
                }
            }
        }
    }

    public final boolean vip(InterfaceC18690l interfaceC18690l) {
        int iRemoteconfig = ((InterfaceC4089l) this.admob).remoteconfig();
        if (iRemoteconfig == -1 || iRemoteconfig == 0) {
            return false;
        }
        if (iRemoteconfig == 1) {
            return true;
        }
        if (iRemoteconfig == 2) {
            return interfaceC18690l.amazon();
        }
        C8339l.subs(AbstractC0653l.vip(iRemoteconfig, "Unknown mirrorMode: "));
        return false;
    }

    public final void yandex(C16774l c16774l, C5464l c5464l) {
        Range range = C5464l.admob;
        if (!range.equals(c5464l.purchase)) {
            Range range2 = c5464l.purchase;
            C9598l c9598l = c16774l.loadAd;
            c9598l.getClass();
            ((C5104l) c9598l.f19553l).mopub(C0665l.billing, range2);
            return;
        }
        synchronized (this.loadAd) {
            try {
                InterfaceC18690l interfaceC18690l = this.remoteconfig;
                interfaceC18690l.getClass();
                ArrayList arrayListCrashlytics = interfaceC18690l.adcel().applovin().crashlytics(AeFpsRangeQuirk.class);
                boolean z = true;
                if (arrayListCrashlytics.size() > 1) {
                    z = false;
                }
                AbstractC5641l.loadAd(z, "There should not have more than one AeFpsRangeQuirk.");
                if (!arrayListCrashlytics.isEmpty()) {
                    Range range3 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListCrashlytics.get(0))).yandex.getValue();
                    if (range3 != null) {
                        range = range3;
                    }
                    C9598l c9598l2 = c16774l.loadAd;
                    c9598l2.getClass();
                    ((C5104l) c9598l2.f19553l).mopub(C0665l.billing, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void ad() {
    }

    public void pro() {
    }

    public void signatures() {
    }

    public void subscription() {
    }

    public void tapsense() {
    }
}
