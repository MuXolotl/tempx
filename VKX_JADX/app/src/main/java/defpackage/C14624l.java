package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚٔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14624l implements InterfaceC14081l {
    public C8490l amazon;
    public C10585l crashlytics;
    public C7504l loadAd;
    public C18524l yandex;

    @Override // defpackage.InterfaceC14081l
    public final void admob(C8896l c8896l) {
        Rect rect;
        C10585l c10585l = this.crashlytics;
        if (c10585l != null) {
            c10585l.smaato = new Rect(AbstractC5573l.ads(c8896l.yandex), AbstractC5573l.ads(c8896l.loadAd), AbstractC5573l.ads(c8896l.crashlytics), AbstractC5573l.ads(c8896l.amazon));
            if (!c10585l.isPro.isEmpty() || (rect = c10585l.smaato) == null) {
                return;
            }
            c10585l.yandex.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.InterfaceC14081l
    public final void amazon() throws Throwable {
        C7504l c7504l = this.loadAd;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        this.loadAd = null;
        InterfaceC5995l interfaceC5995lSubs = subs();
        if (interfaceC5995lSubs != null) {
            ((C8490l) interfaceC5995lSubs).billing();
        }
    }

    @Override // defpackage.InterfaceC14081l
    public final void billing(C0639l c0639l, InterfaceC4005l interfaceC4005l, C0327l c0327l, C17330l c17330l, C8896l c8896l, C8896l c8896l2) {
        C10585l c10585l = this.crashlytics;
        if (c10585l != null) {
            C8355l c8355l = c10585l.remoteconfig;
            synchronized (c8355l.crashlytics) {
                try {
                    c8355l.isPro = c0639l;
                    c8355l.smaato = interfaceC4005l;
                    c8355l.firebase = c0327l;
                    c8355l.remoteconfig = c8896l;
                    c8355l.vip = c8896l2;
                    if (c8355l.purchase || c8355l.amazon) {
                        c8355l.yandex();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC14081l
    public final void crashlytics(C0639l c0639l, C14966l c14966l, C6411l c6411l, C10403l c10403l) {
        isPro(new C2831l(c0639l, this, c14966l, c6411l, c10403l, 1));
    }

    public final void firebase(C18524l c18524l) {
        C18524l c18524l2 = this.yandex;
        if (c18524l2 != c18524l) {
            AbstractC14825l.crashlytics("Expected textInputModifierNode to be " + c18524l + " but was " + c18524l2);
        }
        this.yandex = null;
    }

    public final void isPro(C2831l c2831l) {
        C18524l c18524l = this.yandex;
        if (c18524l == null) {
            return;
        }
        C7504l c7504l = null;
        this.loadAd = c18524l.f29462l ? AbstractC10999l.mopub(c18524l.m3914l(), null, 4, new C15559l(c18524l, new C0384l(c2831l, this, c18524l, c7504l, 2), c7504l, 7), 1) : null;
    }

    @Override // defpackage.InterfaceC14081l
    public final void loadAd() {
        InterfaceC8533l interfaceC8533l;
        C18524l c18524l = this.yandex;
        if (c18524l == null || (interfaceC8533l = (InterfaceC8533l) AbstractC13402l.loadAd(c18524l, AbstractC4751l.adcel)) == null) {
            return;
        }
        ((C4666l) interfaceC8533l).loadAd();
    }

    @Override // defpackage.InterfaceC14081l
    public final void mopub() {
        InterfaceC8533l interfaceC8533l;
        C18524l c18524l = this.yandex;
        if (c18524l == null || (interfaceC8533l = (InterfaceC8533l) AbstractC13402l.loadAd(c18524l, AbstractC4751l.adcel)) == null) {
            return;
        }
        ((C4666l) interfaceC8533l).yandex();
    }

    @Override // defpackage.InterfaceC14081l
    public final void purchase(C0639l c0639l, C0639l c0639l2) {
        C10585l c10585l = this.crashlytics;
        if (c10585l != null) {
            boolean z = (C12814l.crashlytics(c10585l.admob.loadAd, c0639l2.loadAd) && AbstractC8576l.yandex(c10585l.admob.crashlytics, c0639l2.crashlytics)) ? false : true;
            c10585l.admob = c0639l2;
            int size = c10585l.isPro.size();
            for (int i = 0; i < size; i++) {
                InputConnectionC8406l inputConnectionC8406l = (InputConnectionC8406l) ((WeakReference) c10585l.isPro.get(i)).get();
                if (inputConnectionC8406l != null) {
                    inputConnectionC8406l.mopub = c0639l2;
                }
            }
            C8355l c8355l = c10585l.remoteconfig;
            synchronized (c8355l.crashlytics) {
                c8355l.isPro = null;
                c8355l.smaato = null;
                c8355l.firebase = null;
                c8355l.remoteconfig = null;
                c8355l.vip = null;
                Unit unit = Unit.INSTANCE;
            }
            if (AbstractC8576l.yandex(c0639l, c0639l2)) {
                if (z) {
                    C10023l c10023l = c10585l.loadAd;
                    int iMopub = C12814l.mopub(c0639l2.loadAd);
                    int iBilling = C12814l.billing(c0639l2.loadAd);
                    C12814l c12814l = c10585l.admob.crashlytics;
                    int iMopub2 = c12814l != null ? C12814l.mopub(c12814l.yandex) : -1;
                    C12814l c12814l2 = c10585l.admob.crashlytics;
                    c10023l.isVip().updateSelection((View) c10023l.f20419l, iMopub, iBilling, iMopub2, c12814l2 != null ? C12814l.billing(c12814l2.yandex) : -1);
                    return;
                }
                return;
            }
            if (c0639l != null && (!AbstractC8576l.yandex(c0639l.yandex.f7563l, c0639l2.yandex.f7563l) || (C12814l.crashlytics(c0639l.loadAd, c0639l2.loadAd) && !AbstractC8576l.yandex(c0639l.crashlytics, c0639l2.crashlytics)))) {
                C10023l c10023l2 = c10585l.loadAd;
                c10023l2.isVip().restartInput((View) c10023l2.f20419l);
                return;
            }
            int size2 = c10585l.isPro.size();
            for (int i2 = 0; i2 < size2; i2++) {
                InputConnectionC8406l inputConnectionC8406l2 = (InputConnectionC8406l) ((WeakReference) c10585l.isPro.get(i2)).get();
                if (inputConnectionC8406l2 != null) {
                    C0639l c0639l3 = c10585l.admob;
                    C10023l c10023l3 = c10585l.loadAd;
                    if (inputConnectionC8406l2.firebase) {
                        inputConnectionC8406l2.mopub = c0639l3;
                        if (inputConnectionC8406l2.subs) {
                            c10023l3.isVip().updateExtractedText((View) c10023l3.f20419l, inputConnectionC8406l2.admob, AbstractC11174l.loadAd(c0639l3));
                        }
                        C12814l c12814l3 = c0639l3.crashlytics;
                        long j = c0639l3.loadAd;
                        int iMopub3 = c12814l3 != null ? C12814l.mopub(c12814l3.yandex) : -1;
                        C12814l c12814l4 = c0639l3.crashlytics;
                        c10023l3.isVip().updateSelection((View) c10023l3.f20419l, C12814l.mopub(j), C12814l.billing(j), iMopub3, c12814l4 != null ? C12814l.billing(c12814l4.yandex) : -1);
                    }
                }
            }
        }
    }

    public final InterfaceC5995l subs() {
        C8490l c8490l = this.amazon;
        if (c8490l != null) {
            return c8490l;
        }
        if (!AbstractC12020l.yandex) {
            return null;
        }
        C8490l c8490lLoadAd = AbstractC3861l.loadAd(0, 3, 2);
        this.amazon = c8490lLoadAd;
        return c8490lLoadAd;
    }

    @Override // defpackage.InterfaceC14081l
    public final void yandex() {
        isPro(null);
    }
}
