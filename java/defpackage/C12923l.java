package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّۡٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12923l {
    public static final WeakHashMap pro = new WeakHashMap();
    public int Signature;
    public final C11414l adcel;
    public final C9297l admob;
    public final C11414l ads;
    public final C9297l amazon;
    public final C9297l billing;
    public final C9297l crashlytics;
    public final C10086l firebase;
    public final C11414l isPro;
    public final RunnableC9978l license;
    public final C9297l loadAd;
    public final C11414l metrica;
    public final C9297l mopub;
    public final C9297l purchase;
    public final C11414l remoteconfig;
    public final C18004l smaato;
    public final C11414l startapp;
    public final C9297l subs;
    public final C11414l subscription;
    public final boolean tapsense;
    public final C11414l vip;
    public final C9297l yandex;

    public C12923l(View view) {
        C9297l c9297lAmazon = C6760l.amazon(4, "captionBar");
        this.yandex = c9297lAmazon;
        C9297l c9297lAmazon2 = C6760l.amazon(128, "displayCutout");
        this.loadAd = c9297lAmazon2;
        C9297l c9297lAmazon3 = C6760l.amazon(8, "ime");
        this.crashlytics = c9297lAmazon3;
        C9297l c9297lAmazon4 = C6760l.amazon(32, "mandatorySystemGestures");
        this.amazon = c9297lAmazon4;
        C9297l c9297lAmazon5 = C6760l.amazon(2, "navigationBars");
        this.purchase = c9297lAmazon5;
        C9297l c9297lAmazon6 = C6760l.amazon(1, "statusBars");
        this.billing = c9297lAmazon6;
        C9297l c9297lAmazon7 = C6760l.amazon(519, "systemBars");
        this.mopub = c9297lAmazon7;
        C9297l c9297lAmazon8 = C6760l.amazon(16, "systemGestures");
        this.admob = c9297lAmazon8;
        C9297l c9297lAmazon9 = C6760l.amazon(64, "tappableElement");
        this.subs = c9297lAmazon9;
        C11414l c11414l = new C11414l(new C6777l(0, 0, 0, 0), "waterfall");
        this.isPro = c11414l;
        this.firebase = AbstractC8020l.smaato(null);
        C18004l c18004l = new C18004l(new C18004l(c9297lAmazon7, c9297lAmazon3), c9297lAmazon2);
        this.smaato = c18004l;
        new C18004l(c18004l, new C18004l(new C18004l(new C18004l(c9297lAmazon9, c9297lAmazon4), c9297lAmazon8), c11414l));
        this.remoteconfig = C6760l.admob(4, "captionBarIgnoringVisibility");
        this.vip = C6760l.admob(2, "navigationBarsIgnoringVisibility");
        this.metrica = C6760l.admob(1, "statusBarsIgnoringVisibility");
        this.startapp = C6760l.admob(519, "systemBarsIgnoringVisibility");
        this.adcel = C6760l.admob(64, "tappableElementIgnoringVisibility");
        this.ads = new C11414l(new C6777l(0, 0, 0, 0), "imeAnimationTarget");
        this.subscription = new C11414l(new C6777l(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.tapsense = bool != null ? bool.booleanValue() : false;
        this.license = new RunnableC9978l(this);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        C1473l c1473lYandex = AbstractC18487l.yandex(view);
        if (c1473lYandex != null) {
            C17212l c17212l = c1473lYandex.yandex;
            c9297lAmazon.billing(c17212l.Signature(4));
            c9297lAmazon2.billing(c17212l.Signature(128));
            c9297lAmazon3.billing(c17212l.Signature(8));
            c9297lAmazon4.billing(c17212l.Signature(32));
            c9297lAmazon5.billing(c17212l.Signature(2));
            c9297lAmazon6.billing(c17212l.Signature(1));
            c9297lAmazon7.billing(c17212l.Signature(519));
            c9297lAmazon8.billing(c17212l.Signature(16));
            c9297lAmazon9.billing(c17212l.Signature(64));
        }
    }

    public static void loadAd(C12923l c12923l, C1473l c1473l) {
        boolean z = false;
        c12923l.yandex.mopub(c1473l, 0);
        c12923l.crashlytics.mopub(c1473l, 0);
        c12923l.loadAd.mopub(c1473l, 0);
        c12923l.purchase.mopub(c1473l, 0);
        c12923l.billing.mopub(c1473l, 0);
        c12923l.mopub.mopub(c1473l, 0);
        c12923l.admob.mopub(c1473l, 0);
        c12923l.subs.mopub(c1473l, 0);
        c12923l.amazon.mopub(c1473l, 0);
        c12923l.remoteconfig.billing(AbstractC13573l.crashlytics(c1473l.yandex.isPro(4)));
        c12923l.vip.billing(AbstractC13573l.crashlytics(c1473l.yandex.isPro(2)));
        c12923l.metrica.billing(AbstractC13573l.crashlytics(c1473l.yandex.isPro(1)));
        c12923l.startapp.billing(AbstractC13573l.crashlytics(c1473l.yandex.isPro(519)));
        c12923l.adcel.billing(AbstractC13573l.crashlytics(c1473l.yandex.isPro(64)));
        C17518l c17518lAdmob = c1473l.yandex.admob();
        c12923l.isPro.billing(AbstractC13573l.crashlytics(c17518lAdmob != null ? c17518lAdmob.yandex() : C15496l.purchase));
        C9902l c9902l = null;
        if (c17518lAdmob != null) {
            Path pathVip = Build.VERSION.SDK_INT >= 31 ? AbstractC12148l.vip(c17518lAdmob.yandex) : null;
            if (pathVip != null) {
                c9902l = new C9902l(pathVip);
            }
        }
        c12923l.firebase.setValue(c9902l);
        synchronized (AbstractC9620l.crashlytics) {
            C6295l c6295l = AbstractC9620l.isPro.admob;
            if (c6295l != null && c6295l.subs()) {
                z = true;
            }
        }
        if (z) {
            AbstractC9620l.yandex();
        }
    }

    public final void yandex(View view) {
        if (this.Signature == 0) {
            RunnableC9978l runnableC9978l = this.license;
            runnableC9978l.f20378l = false;
            runnableC9978l.f20377l = false;
            runnableC9978l.f20379l = null;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            AbstractC8558l.crashlytics(view, runnableC9978l);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC9978l);
            AbstractC15872l.startapp(view, runnableC9978l);
        }
        this.Signature++;
    }
}
