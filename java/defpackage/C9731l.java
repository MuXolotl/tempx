package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍٟٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9731l extends AbstractC6896l {
    public static final C3511l applovin = new C3511l();
    public int Signature;
    public C16774l ad;
    public C10038l advert;
    public C11108l isVip;
    public Rational license;
    public final C2582l premium;
    public C2658l pro;
    public C2525l signatures;
    public final int subscription;
    public final AtomicReference tapsense;

    public C9731l(C14180l c14180l) {
        super(c14180l);
        this.tapsense = new AtomicReference(null);
        this.Signature = -1;
        this.license = null;
        this.premium = new C2582l(this);
        C14180l c14180l2 = (C14180l) this.admob;
        C6916l c6916l = C14180l.f27767l;
        c14180l2.getClass();
        if (((C7420l) c14180l2.subs()).mo861strictfp(c6916l)) {
            this.subscription = ((Integer) c14180l2.f27773l.adcel(c6916l)).intValue();
        } else {
            this.subscription = 1;
        }
        ((Integer) ((C7420l) c14180l2.subs()).smaato(C14180l.f27766l, 0)).getClass();
        this.pro = new C2658l((InterfaceC2406l) ((C7420l) c14180l2.subs()).smaato(C14180l.f27771l, null));
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static boolean m2725native(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l Signature(InterfaceC15879l interfaceC15879l, InterfaceC16651l interfaceC16651l) {
        Integer numValueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        HashSet<AbstractC5295l> hashSet = this.mopub;
        boolean z = false;
        if (hashSet != null) {
            for (AbstractC5295l abstractC5295l : hashSet) {
            }
            interfaceC16651l.adcel().mopub(C14180l.f27769l, 0);
        }
        if (interfaceC15879l.applovin().yandex(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            C5104l c5104lAdcel = interfaceC16651l.adcel();
            C6916l c6916l = C14180l.f27765l;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(c5104lAdcel.smaato(c6916l, bool2))) {
                AbstractC5088l.tapsense("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                AbstractC5088l.subs("ImageCapture", "Requesting software JPEG due to device quirk.");
                interfaceC16651l.adcel().mopub(c6916l, bool2);
            }
        }
        C5104l c5104lAdcel2 = interfaceC16651l.adcel();
        Boolean bool3 = Boolean.TRUE;
        C6916l c6916l2 = C14180l.f27765l;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(c5104lAdcel2.smaato(c6916l2, bool4))) {
            if (amazon() != null) {
                ((C5138l) amazon().admob()).m1720public();
            }
            Integer num = (Integer) c5104lAdcel2.smaato(C14180l.f27770l, null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                AbstractC5088l.tapsense("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                AbstractC5088l.tapsense("ImageCapture", "Unable to support software JPEG. Disabling.");
                c5104lAdcel2.mopub(c6916l2, bool4);
            }
        }
        Integer num2 = (Integer) interfaceC16651l.adcel().smaato(C14180l.f27770l, null);
        if (num2 != null) {
            if (amazon() != null) {
                ((C5138l) amazon().admob()).m1720public();
            }
            interfaceC16651l.adcel().mopub(InterfaceC16352l.advert, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            C5104l c5104lAdcel3 = interfaceC16651l.adcel();
            C6916l c6916l3 = C14180l.f27769l;
            if (Objects.equals(c5104lAdcel3.smaato(c6916l3, null), 2)) {
                interfaceC16651l.adcel().mopub(InterfaceC16352l.advert, 32);
            } else if (Objects.equals(interfaceC16651l.adcel().smaato(c6916l3, null), 3)) {
                interfaceC16651l.adcel().mopub(InterfaceC16352l.advert, 32);
                interfaceC16651l.adcel().mopub(InterfaceC16352l.isVip, numValueOf);
            } else if (Objects.equals(interfaceC16651l.adcel().smaato(c6916l3, null), 1)) {
                interfaceC16651l.adcel().mopub(InterfaceC16352l.advert, 4101);
                interfaceC16651l.adcel().mopub(InterfaceC16352l.signatures, C15421l.crashlytics);
            } else if (z) {
                interfaceC16651l.adcel().mopub(InterfaceC16352l.advert, 35);
            } else {
                List list = (List) interfaceC16651l.adcel().smaato(InterfaceC4089l.f8424strictfp, null);
                if (list == null || m2725native(PSKKeyManager.MAX_KEY_LENGTH_BYTES, list)) {
                    interfaceC16651l.adcel().mopub(InterfaceC16352l.advert, numValueOf);
                } else if (m2725native(35, list)) {
                    interfaceC16651l.adcel().mopub(InterfaceC16352l.advert, 35);
                }
            }
        }
        return interfaceC16651l.Signature();
    }

    @Override // defpackage.AbstractC6896l
    public final void ad() {
        C2658l c2658l = this.pro;
        c2658l.loadAd();
        c2658l.yandex();
        C11108l c11108l = this.isVip;
        if (c11108l != null) {
            c11108l.loadAd();
        }
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l advert(InterfaceC17944l interfaceC17944l) {
        this.ad.yandex(interfaceC17944l);
        Object[] objArr = {this.ad.crashlytics()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2081throws(DesugarCollections.unmodifiableList(arrayList));
        C6472l c6472lLoadAd = this.subs.loadAd();
        c6472lLoadAd.f13510l = interfaceC17944l;
        return c6472lLoadAd.yandex();
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m2726extends() {
        synchronized (this.tapsense) {
            try {
                if (this.tapsense.get() != null) {
                    return;
                }
                purchase().mopub(m2730volatile());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC6896l
    public final Set firebase() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l isVip(C5464l c5464l, C5464l c5464l2) {
        AbstractC5088l.yandex("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c5464l + ", secondaryStreamSpec " + c5464l2);
        C16774l c16774lM2728strictfp = m2728strictfp(billing(), (C14180l) this.admob, c5464l);
        this.ad = c16774lM2728strictfp;
        Object[] objArr = {c16774lM2728strictfp.crashlytics()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2081throws(DesugarCollections.unmodifiableList(arrayList));
        startapp();
        return c5464l;
    }

    @Override // defpackage.AbstractC6896l
    public final void license(int i) {
        m2727private(i);
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l mopub(boolean z, InterfaceC10139l interfaceC10139l) {
        applovin.getClass();
        C14180l c14180l = C3511l.yandex;
        c14180l.getClass();
        InterfaceC17944l interfaceC17944lYandex = interfaceC10139l.yandex(AbstractC12589l.loadAd(c14180l), this.subscription);
        if (z) {
            interfaceC17944lYandex = AbstractC11043l.ads(interfaceC17944lYandex, c14180l);
        }
        if (interfaceC17944lYandex == null) {
            return null;
        }
        return new C14180l(C7420l.yandex(((C14929l) smaato(interfaceC17944lYandex)).f29382l));
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m2727private(int i) {
        int iMo1483finally = ((InterfaceC4089l) this.admob).mo1483finally(0);
        if (!applovin(i) || this.license == null) {
            return;
        }
        this.license = AbstractC16947l.amazon(Math.abs(AbstractC7799l.purchase(i) - AbstractC7799l.purchase(iMo1483finally)), this.license);
    }

    @Override // defpackage.AbstractC6896l
    public final boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.AbstractC6896l
    public final void signatures() {
        C2658l c2658l = this.pro;
        c2658l.loadAd();
        c2658l.yandex();
        C11108l c11108l = this.isVip;
        if (c11108l != null) {
            c11108l.loadAd();
        }
        m2729synchronized(false);
        purchase().admob(null);
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC16651l smaato(InterfaceC17944l interfaceC17944l) {
        return new C14929l(C5104l.amazon(interfaceC17944l), 1);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0061  */
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final C16774l m2728strictfp(String str, C14180l c14180l, C5464l c5464l) {
        HashSet hashSet;
        C5571l c5571l;
        boolean zContains;
        int i = 0;
        AbstractC12225l.crashlytics();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + c5464l + ")");
        Size size = c5464l.yandex;
        InterfaceC18690l interfaceC18690lAmazon = amazon();
        Objects.requireNonNull(interfaceC18690lAmazon);
        boolean zMetrica = interfaceC18690lAmazon.metrica() ^ true;
        CameraCharacteristics cameraCharacteristics = null;
        if (this.advert != null) {
            AbstractC5641l.purchase(null, zMetrica);
            this.advert.m2860static();
        }
        InterfaceC15879l interfaceC15879lLoadAd = amazon().loadAd();
        if (interfaceC15879lLoadAd instanceof C16057l) {
            C5138l c5138l = (C5138l) ((C16057l) interfaceC15879lLoadAd).f31460l;
            c5138l.getClass();
            int i2 = AbstractC14352l.yandex;
            InterfaceC17944l interfaceC17944lYandex = ((InterfaceC10139l) ((C7420l) c5138l.subs()).smaato(InterfaceC13235l.crashlytics, InterfaceC10139l.yandex)).yandex(EnumC11949l.f23817l, 1);
            if (interfaceC17944lYandex != null) {
                C6916l c6916l = InterfaceC4089l.f8424strictfp;
                C7420l c7420l = (C7420l) interfaceC17944lYandex;
                if (c7420l.f15372l.containsKey(c6916l)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) c7420l.adcel(c6916l)).iterator();
                    while (it.hasNext()) {
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                } else {
                    hashSet = null;
                }
            } else {
                hashSet = null;
            }
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            hashSet = new HashSet();
            hashSet.add(0);
            boolean zAdvert = AbstractC2812l.advert(interfaceC15879lLoadAd);
            if (zAdvert ? interfaceC15879lLoadAd.mo3793volatile().contains(4101) : false) {
                hashSet.add(1);
            }
            if (zAdvert) {
                InterfaceC15879l interfaceC15879l = interfaceC15879lLoadAd;
                if (interfaceC15879l.mo3791strictfp().contains(3)) {
                    zContains = interfaceC15879l.mo3793volatile().contains(32);
                } else {
                    zContains = false;
                }
            } else {
                zContains = false;
            }
            if (zContains) {
                hashSet.add(2);
                hashSet.add(3);
            }
        }
        InterfaceC0048l interfaceC0048l = this.admob;
        C6916l c6916l2 = C14180l.f27769l;
        Integer num = (Integer) interfaceC0048l.smaato(c6916l2, 0);
        num.getClass();
        boolean zContains2 = hashSet.contains(num);
        StringBuilder sb = new StringBuilder("The specified output format (");
        Integer num2 = (Integer) this.admob.smaato(c6916l2, 0);
        num2.getClass();
        sb.append(num2.intValue());
        sb.append(") is not supported by current configuration. Supported output formats: ");
        sb.append(hashSet);
        AbstractC5641l.loadAd(zContains2, sb.toString());
        if (((Boolean) this.admob.smaato(C14180l.f27768l, Boolean.FALSE)).booleanValue()) {
            c14180l.firebase();
            ((C5138l) amazon().admob()).m1720public();
        }
        if (amazon() != null) {
            try {
                Object objLicense = amazon().adcel().license();
                if (objLicense instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objLicense;
                }
            } catch (Exception e) {
                Log.e("ImageCapture", "getCameraCharacteristics failed", e);
            }
        }
        this.advert = new C10038l(c14180l, size, cameraCharacteristics, zMetrica);
        if (this.isVip == null) {
            this.admob.vip();
            this.isVip = new C11108l(this.premium);
        }
        C11108l c11108l = this.isVip;
        C10038l c10038l = this.advert;
        c11108l.getClass();
        AbstractC12225l.crashlytics();
        c11108l.f22315l = c10038l;
        c10038l.getClass();
        AbstractC12225l.crashlytics();
        C0554l c0554l = (C0554l) c10038l.f20462l;
        c0554l.getClass();
        AbstractC12225l.crashlytics();
        AbstractC5641l.purchase("The ImageReader is not initialized.", ((C6344l) c0554l.f1958l) != null);
        C6344l c6344l = (C6344l) c0554l.f1958l;
        synchronized (c6344l.f13303l) {
            c6344l.f13309l = c11108l;
        }
        C10038l c10038l2 = this.advert;
        C16774l c16774lAmazon = C16774l.amazon((C14180l) c10038l2.f20463l, c5464l.yandex);
        C11539l c11539l = (C11539l) c10038l2.f20465l;
        C5571l c5571l2 = c11539l.yandex;
        Objects.requireNonNull(c5571l2);
        C15421l c15421l = C15421l.amazon;
        C11644l c11644lYandex = C14113l.yandex(c5571l2);
        c11644lYandex.f23362l = c15421l;
        c16774lAmazon.yandex.add(c11644lYandex.m3173l());
        if (c11539l.billing.size() > 1 && (c5571l = c11539l.loadAd) != null) {
            C11644l c11644lYandex2 = C14113l.yandex(c5571l);
            c11644lYandex2.f23362l = c15421l;
            c16774lAmazon.yandex.add(c11644lYandex2.m3173l());
        }
        C5571l c5571l3 = c11539l.crashlytics;
        if (c5571l3 != null) {
            c16774lAmazon.subs = C14113l.yandex(c5571l3).m3173l();
        }
        c16774lAmazon.admob = c5464l.amazon;
        if (this.subscription == 2 && !c5464l.mopub) {
            purchase().loadAd(c16774lAmazon);
        }
        InterfaceC17944l interfaceC17944l = c5464l.billing;
        if (interfaceC17944l != null) {
            c16774lAmazon.loadAd.license(interfaceC17944l);
        }
        C2525l c2525l = this.signatures;
        if (c2525l != null) {
            c2525l.loadAd();
        }
        C2525l c2525l2 = new C2525l(new C12717l(i, this));
        this.signatures = c2525l2;
        c16774lAmazon.billing = c2525l2;
        return c16774lAmazon;
    }

    @Override // defpackage.AbstractC6896l
    public final void subscription() {
        AbstractC5641l.amazon(amazon(), "Attached camera cannot be null");
        if (m2730volatile() == 3) {
            InterfaceC18690l interfaceC18690lAmazon = amazon();
            if ((interfaceC18690lAmazon != null ? interfaceC18690lAmazon.loadAd().metrica() : -1) == 0) {
                return;
            }
            C8339l.metrica("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m2729synchronized(boolean z) {
        C11108l c11108l;
        Log.d("ImageCapture", "clearPipeline");
        AbstractC12225l.crashlytics();
        C2525l c2525l = this.signatures;
        if (c2525l != null) {
            c2525l.loadAd();
            this.signatures = null;
        }
        C10038l c10038l = this.advert;
        if (c10038l != null) {
            c10038l.m2860static();
            this.advert = null;
        }
        if (!z && (c11108l = this.isVip) != null) {
            c11108l.loadAd();
            this.isVip = null;
        }
        purchase().yandex();
    }

    @Override // defpackage.AbstractC6896l
    public final void tapsense() {
        AbstractC5088l.yandex("ImageCapture", "onCameraControlReady");
        m2726extends();
        purchase().admob(this.pro);
    }

    public final String toString() {
        return "ImageCapture:".concat(admob());
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final int m2730volatile() {
        int iIntValue;
        synchronized (this.tapsense) {
            iIntValue = this.Signature;
            if (iIntValue == -1) {
                C14180l c14180l = (C14180l) this.admob;
                c14180l.getClass();
                iIntValue = ((Integer) AbstractC4338l.smaato(c14180l, C14180l.f27764l, 2)).intValue();
            }
        }
        return iIntValue;
    }
}
