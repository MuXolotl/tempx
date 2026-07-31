package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؑۗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0527l extends AbstractC6896l {
    public static final C8682l isVip = new C8682l();
    public static final ScheduledExecutorServiceC10335l signatures = AbstractC12272l.admob();
    public C16774l Signature;
    public C15691l ad;
    public C2525l advert;
    public C5571l license;
    public C3716l pro;
    public InterfaceC4969l subscription;
    public Executor tapsense;

    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l Signature(InterfaceC15879l interfaceC15879l, InterfaceC16651l interfaceC16651l) {
        interfaceC16651l.adcel().mopub(InterfaceC16352l.advert, 34);
        return interfaceC16651l.Signature();
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l advert(InterfaceC17944l interfaceC17944l) {
        this.Signature.yandex(interfaceC17944l);
        Object[] objArr = {this.Signature.crashlytics()};
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
        InterfaceC18690l interfaceC18690lAmazon = amazon();
        C3716l c3716l = this.pro;
        if (interfaceC18690lAmazon == null || c3716l == null) {
            return;
        }
        AbstractC12225l.firebase(new RunnableC7500l(c3716l, subs(interfaceC18690lAmazon, vip(interfaceC18690lAmazon)), ((InterfaceC4089l) this.admob).mo1486this()));
    }

    @Override // defpackage.AbstractC6896l
    public final Set firebase() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l isVip(C5464l c5464l, C5464l c5464l2) {
        AbstractC5088l.yandex("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c5464l + ", secondaryStreamSpec " + c5464l2);
        m626volatile((C8749l) this.admob, c5464l);
        return c5464l;
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l mopub(boolean z, InterfaceC10139l interfaceC10139l) {
        isVip.getClass();
        C8749l c8749l = C8682l.yandex;
        c8749l.getClass();
        InterfaceC17944l interfaceC17944lYandex = interfaceC10139l.yandex(AbstractC12589l.loadAd(c8749l), 1);
        if (z) {
            interfaceC17944lYandex = AbstractC11043l.ads(interfaceC17944lYandex, c8749l);
        }
        if (interfaceC17944lYandex == null) {
            return null;
        }
        return new C8749l(C7420l.yandex(((C14929l) smaato(interfaceC17944lYandex)).f29382l));
    }

    @Override // defpackage.AbstractC6896l
    public final void signatures() {
        m625synchronized();
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC16651l smaato(InterfaceC17944l interfaceC17944l) {
        return new C14929l(C5104l.amazon(interfaceC17944l), 2);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m624strictfp(InterfaceC4969l interfaceC4969l) {
        AbstractC12225l.crashlytics();
        if (interfaceC4969l == null) {
            this.subscription = null;
            this.amazon = 2;
            ads();
        } else {
            this.subscription = interfaceC4969l;
            this.tapsense = signatures;
            if (crashlytics() != null) {
                m626volatile((C8749l) this.admob, this.subs);
                adcel();
            }
            startapp();
        }
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m625synchronized() {
        C2525l c2525l = this.advert;
        if (c2525l != null) {
            c2525l.loadAd();
            this.advert = null;
        }
        C5571l c5571l = this.license;
        if (c5571l != null) {
            c5571l.yandex();
            this.license = null;
        }
        C3716l c3716l = this.pro;
        if (c3716l != null) {
            c3716l.crashlytics();
            this.pro = null;
        }
        C15691l c15691l = this.ad;
        if (c15691l != null) {
            synchronized (c15691l.yandex) {
                c15691l.metrica = null;
                c15691l.startapp = null;
            }
        }
        this.ad = null;
    }

    public final String toString() {
        return "Preview:".concat(admob());
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m626volatile(C8749l c8749l, C5464l c5464l) {
        AbstractC12225l.crashlytics();
        InterfaceC18690l interfaceC18690lAmazon = amazon();
        Objects.requireNonNull(interfaceC18690lAmazon);
        m625synchronized();
        int i = 1;
        AbstractC5641l.purchase(null, this.pro == null);
        Matrix matrix = this.smaato;
        boolean zMetrica = interfaceC18690lAmazon.metrica();
        Size size = c5464l.yandex;
        Rect rect = this.firebase;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        C3716l c3716l = new C3716l(1, 34, c5464l, matrix, zMetrica, rect, subs(interfaceC18690lAmazon, vip(interfaceC18690lAmazon)), ((InterfaceC4089l) this.admob).mo1486this(), interfaceC18690lAmazon.metrica() && vip(interfaceC18690lAmazon));
        this.pro = c3716l;
        c3716l.yandex(new RunnableC11297l(25, this));
        C15691l c15691lAmazon = this.pro.amazon(interfaceC18690lAmazon, true);
        this.ad = c15691lAmazon;
        this.license = c15691lAmazon.remoteconfig;
        if (this.subscription != null) {
            InterfaceC18690l interfaceC18690lAmazon2 = amazon();
            C3716l c3716l2 = this.pro;
            if (interfaceC18690lAmazon2 != null && c3716l2 != null) {
                AbstractC12225l.firebase(new RunnableC7500l(c3716l2, subs(interfaceC18690lAmazon2, vip(interfaceC18690lAmazon2)), ((InterfaceC4089l) this.admob).mo1486this()));
            }
            InterfaceC4969l interfaceC4969l = this.subscription;
            interfaceC4969l.getClass();
            C15691l c15691l = this.ad;
            c15691l.getClass();
            this.tapsense.execute(new RunnableC10311l(interfaceC4969l, c15691l, 3));
        }
        C16774l c16774lAmazon = C16774l.amazon(c8749l, c5464l.yandex);
        C9598l c9598l = c16774lAmazon.loadAd;
        c16774lAmazon.admob = c5464l.amazon;
        yandex(c16774lAmazon, c5464l);
        int iMopub = AbstractC12589l.mopub(c8749l);
        if (iMopub != 0) {
            c9598l.getClass();
            if (iMopub != 0) {
                ((C5104l) c9598l.f19553l).mopub(InterfaceC0048l.f918l, Integer.valueOf(iMopub));
            }
        }
        InterfaceC17944l interfaceC17944l = c5464l.billing;
        if (interfaceC17944l != null) {
            c9598l.license(interfaceC17944l);
        }
        if (this.subscription != null) {
            c16774lAmazon.loadAd(this.license, c5464l.crashlytics, ((InterfaceC4089l) this.admob).remoteconfig());
        }
        C2525l c2525l = this.advert;
        if (c2525l != null) {
            c2525l.loadAd();
        }
        C2525l c2525l2 = new C2525l(new C12717l(i, this));
        this.advert = c2525l2;
        c16774lAmazon.billing = c2525l2;
        this.Signature = c16774lAmazon;
        Object[] objArr = {c16774lAmazon.crashlytics()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m2081throws(DesugarCollections.unmodifiableList(arrayList));
    }
}
