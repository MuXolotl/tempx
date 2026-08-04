package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٍٕۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9585l extends AbstractC6896l {
    public static final C6470l premium = new C6470l();
    public Executor Signature;
    public Matrix ad;
    public C16774l advert;
    public C5571l isVip;
    public InterfaceC10782l license;
    public Rect pro;
    public C2525l signatures;
    public final Object subscription;
    public AbstractC13871l tapsense;

    public C9585l(C16506l c16506l) {
        super(c16506l);
        this.subscription = new Object();
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l Signature(InterfaceC15879l interfaceC15879l, InterfaceC16651l interfaceC16651l) {
        Size sizeLoadAd;
        C12418l c12418lStartapp;
        synchronized (this.subscription) {
            try {
                InterfaceC10782l interfaceC10782l = this.license;
                sizeLoadAd = interfaceC10782l != null ? interfaceC10782l.loadAd() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sizeLoadAd == null) {
            return interfaceC16651l.Signature();
        }
        if (interfaceC15879l.tapsense(((Integer) interfaceC16651l.adcel().smaato(InterfaceC4089l.applovin, 0)).intValue()) % 180 == 90) {
            sizeLoadAd = new Size(sizeLoadAd.getHeight(), sizeLoadAd.getWidth());
        }
        InterfaceC0048l interfaceC0048lSignature = interfaceC16651l.Signature();
        C6916l c6916l = InterfaceC4089l.f8426throws;
        if (!interfaceC0048lSignature.mo861strictfp(c6916l)) {
            interfaceC16651l.adcel().mopub(c6916l, sizeLoadAd);
        }
        InterfaceC0048l interfaceC0048lSignature2 = interfaceC16651l.Signature();
        C6916l c6916l2 = InterfaceC4089l.f8427volatile;
        if (interfaceC0048lSignature2.mo861strictfp(c6916l2)) {
            C18085l c18085l = (C18085l) this.billing.smaato(c6916l2, null);
            if (c18085l == null) {
                c12418lStartapp = new C12418l(2);
                c12418lStartapp.f24519l = C14513l.f28387l;
                c12418lStartapp.f24518l = null;
                c12418lStartapp.f24521l = null;
            } else {
                c12418lStartapp = C12418l.startapp(c18085l);
            }
            if (c18085l == null || c18085l.loadAd == null) {
                c12418lStartapp.f24518l = new C10077l(sizeLoadAd);
            }
            if (c18085l == null) {
                c12418lStartapp.f24521l = new C6536l(5, sizeLoadAd);
            }
            interfaceC16651l.adcel().mopub(c6916l2, new C18085l((C14513l) c12418lStartapp.f24519l, (C10077l) c12418lStartapp.f24518l, (C6536l) c12418lStartapp.f24521l));
        }
        return interfaceC16651l.Signature();
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l advert(InterfaceC17944l interfaceC17944l) {
        this.advert.yandex(interfaceC17944l);
        Object[] objArr = {this.advert.crashlytics()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2081throws(DesugarCollections.unmodifiableList(arrayList));
        C6472l c6472lLoadAd = this.subs.loadAd();
        c6472lLoadAd.f13510l = interfaceC17944l;
        return c6472lLoadAd.yandex();
    }

    @Override // defpackage.AbstractC6896l
    public final void appmetrica(Rect rect) {
        this.firebase = rect;
        synchronized (this.subscription) {
            try {
                AbstractC13871l abstractC13871l = this.tapsense;
                if (abstractC13871l != null) {
                    abstractC13871l.smaato(rect);
                }
                this.pro = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m2690extends() {
        synchronized (this.subscription) {
            try {
                InterfaceC18690l interfaceC18690lAmazon = amazon();
                if (interfaceC18690lAmazon != null) {
                    this.tapsense.f27133l = subs(interfaceC18690lAmazon, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l isVip(C5464l c5464l, C5464l c5464l2) {
        AbstractC5088l.yandex("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c5464l + ", secondaryStreamSpec " + c5464l2);
        C16506l c16506l = (C16506l) this.admob;
        billing();
        C16774l c16774lM2694synchronized = m2694synchronized(c16506l, c5464l);
        this.advert = c16774lM2694synchronized;
        Object[] objArr = {c16774lM2694synchronized.crashlytics()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2081throws(DesugarCollections.unmodifiableList(arrayList));
        return c5464l;
    }

    @Override // defpackage.AbstractC6896l
    public final void license(int i) {
        if (applovin(i)) {
            m2690extends();
        }
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l mopub(boolean z, InterfaceC10139l interfaceC10139l) {
        premium.getClass();
        C16506l c16506l = C6470l.yandex;
        c16506l.getClass();
        InterfaceC17944l interfaceC17944lYandex = interfaceC10139l.yandex(AbstractC12589l.loadAd(c16506l), 1);
        if (z) {
            interfaceC17944lYandex = AbstractC11043l.ads(interfaceC17944lYandex, c16506l);
        }
        if (interfaceC17944lYandex == null) {
            return null;
        }
        return new C16506l(C7420l.yandex(((C14929l) smaato(interfaceC17944lYandex)).f29382l));
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m2691native() {
        InterfaceC10782l interfaceC10782l;
        synchronized (this.subscription) {
            try {
                C16506l c16506l = (C16506l) this.admob;
                if (((Integer) ((C7420l) c16506l.subs()).smaato(C16506l.f32251l, 0)).intValue() == 1) {
                    this.tapsense = new C17498l();
                } else {
                    this.tapsense = new C15629l(AbstractC12589l.yandex(c16506l, AbstractC12272l.amazon()));
                }
                this.tapsense.f27140l = m2695volatile();
                AbstractC13871l abstractC13871l = this.tapsense;
                C16506l c16506l2 = (C16506l) this.admob;
                Boolean bool = Boolean.FALSE;
                c16506l2.getClass();
                abstractC13871l.f27139l = ((Boolean) AbstractC4338l.smaato(c16506l2, C16506l.f32250l, bool)).booleanValue();
                InterfaceC18690l interfaceC18690lAmazon = amazon();
                C16506l c16506l3 = (C16506l) this.admob;
                c16506l3.getClass();
                Boolean bool2 = (Boolean) AbstractC4338l.smaato(c16506l3, C16506l.f32254l, null);
                boolean zYandex = interfaceC18690lAmazon != null ? interfaceC18690lAmazon.adcel().applovin().yandex(OnePixelShiftQuirk.class) : false;
                AbstractC13871l abstractC13871l2 = this.tapsense;
                if (bool2 != null) {
                    zYandex = bool2.booleanValue();
                }
                abstractC13871l2.f27143l = zYandex;
                if (interfaceC18690lAmazon != null) {
                    this.tapsense.f27133l = subs(interfaceC18690lAmazon, false);
                }
                Rect rect = this.pro;
                if (rect != null) {
                    this.tapsense.smaato(rect);
                }
                Matrix matrix = this.ad;
                if (matrix != null) {
                    this.tapsense.firebase(matrix);
                }
                Executor executor = this.Signature;
                if (executor != null && (interfaceC10782l = this.license) != null) {
                    this.tapsense.admob(executor, interfaceC10782l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC6896l
    public final void premium(Matrix matrix) {
        super.premium(matrix);
        synchronized (this.subscription) {
            try {
                AbstractC13871l abstractC13871l = this.tapsense;
                if (abstractC13871l != null) {
                    abstractC13871l.firebase(matrix);
                }
                this.ad = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m2692private(Executor executor, C2773l c2773l) {
        synchronized (this.subscription) {
            try {
                AbstractC13871l abstractC13871l = this.tapsense;
                if (abstractC13871l != null) {
                    abstractC13871l.admob(executor, new C6536l(4, c2773l));
                }
                if (this.license == null) {
                    startapp();
                }
                this.Signature = executor;
                this.license = c2773l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC6896l
    public final void signatures() {
        AbstractC12225l.crashlytics();
        C2525l c2525l = this.signatures;
        if (c2525l != null) {
            c2525l.loadAd();
            this.signatures = null;
        }
        C5571l c5571l = this.isVip;
        if (c5571l != null) {
            c5571l.yandex();
            this.isVip = null;
        }
        synchronized (this.subscription) {
            AbstractC13871l abstractC13871l = this.tapsense;
            abstractC13871l.f27129l = false;
            abstractC13871l.crashlytics();
            this.tapsense = null;
        }
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC16651l smaato(InterfaceC17944l interfaceC17944l) {
        return new C14929l(C5104l.amazon(interfaceC17944l), 0);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final int m2693strictfp() {
        C16506l c16506l = (C16506l) this.admob;
        c16506l.getClass();
        return ((Integer) AbstractC4338l.smaato(c16506l, C16506l.f32249l, 6)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f  */
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C16774l m2694synchronized(C16506l c16506l, C5464l c5464l) {
        AbstractC13871l abstractC13871l;
        boolean z;
        boolean z2;
        AbstractC12225l.crashlytics();
        Size size = c5464l.yandex;
        ExecutorC0877l executorC0877lAmazon = AbstractC12272l.amazon();
        c16506l.getClass();
        Executor executorYandex = AbstractC12589l.yandex(c16506l, executorC0877lAmazon);
        executorYandex.getClass();
        int iM2693strictfp = ((Integer) ((C7420l) ((C16506l) this.admob).subs()).smaato(C16506l.f32251l, 0)).intValue() == 1 ? m2693strictfp() : 4;
        C6344l c6344l = null;
        if (((C7420l) c16506l.subs()).smaato(C16506l.f32253l, null) != null) {
            C18725l.loadAd();
            return null;
        }
        C6344l c6344l2 = new C6344l(AbstractC6159l.yandex(size.getWidth(), size.getHeight(), this.admob.firebase(), iM2693strictfp));
        synchronized (this.subscription) {
            m2691native();
            abstractC13871l = this.tapsense;
        }
        if (amazon() != null) {
            InterfaceC18690l interfaceC18690lAmazon = amazon();
            C16506l c16506l2 = (C16506l) this.admob;
            Boolean bool = Boolean.FALSE;
            c16506l2.getClass();
            if (!((Boolean) AbstractC4338l.smaato(c16506l2, C16506l.f32250l, bool)).booleanValue() || subs(interfaceC18690lAmazon, false) % 180 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        int height = z ? size.getHeight() : size.getWidth();
        int width = z ? size.getWidth() : size.getHeight();
        int i = m2695volatile() == 2 ? 1 : 35;
        boolean z3 = this.admob.firebase() == 35 && m2695volatile() == 2;
        boolean z4 = this.admob.firebase() == 35 && m2695volatile() == 3;
        if (this.admob.firebase() != 35) {
            z2 = false;
        } else {
            if (amazon() == null || subs(amazon(), false) == 0) {
                Boolean bool2 = Boolean.TRUE;
                C16506l c16506l3 = (C16506l) this.admob;
                c16506l3.getClass();
                if (!bool2.equals((Boolean) AbstractC4338l.smaato(c16506l3, C16506l.f32254l, null))) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (z3 || (z2 && !z4)) {
            c6344l = new C6344l(AbstractC6159l.yandex(height, width, i, c6344l2.mo1997strictfp()));
        }
        if (c6344l != null) {
            abstractC13871l.isPro(c6344l);
        }
        m2690extends();
        c6344l2.premium(abstractC13871l, executorYandex);
        C16774l c16774lAmazon = C16774l.amazon(c16506l, c5464l.yandex);
        InterfaceC17944l interfaceC17944l = c5464l.billing;
        if (interfaceC17944l != null) {
            c16774lAmazon.loadAd.license(interfaceC17944l);
        }
        C5571l c5571l = this.isVip;
        if (c5571l != null) {
            c5571l.yandex();
        }
        C5571l c5571l2 = new C5571l(c6344l2.getSurface(), size, this.admob.firebase());
        this.isVip = c5571l2;
        AbstractC11356l.admob(c5571l2.purchase).yandex(new RunnableC0336l(c6344l2, c6344l, 26), AbstractC12272l.admob());
        c16774lAmazon.admob = c5464l.amazon;
        yandex(c16774lAmazon, c5464l);
        c16774lAmazon.loadAd(this.isVip, c5464l.crashlytics, -1);
        C2525l c2525l = this.signatures;
        if (c2525l != null) {
            c2525l.loadAd();
        }
        C2525l c2525l2 = new C2525l(new C17699l(this, abstractC13871l, 0));
        this.signatures = c2525l2;
        c16774lAmazon.billing = c2525l2;
        return c16774lAmazon;
    }

    public final String toString() {
        return "ImageAnalysis:".concat(admob());
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final int m2695volatile() {
        C16506l c16506l = (C16506l) this.admob;
        c16506l.getClass();
        return ((Integer) AbstractC4338l.smaato(c16506l, C16506l.f32252l, 1)).intValue();
    }
}
