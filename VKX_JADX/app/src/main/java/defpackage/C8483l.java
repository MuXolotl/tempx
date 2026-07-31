package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8483l implements InterfaceC14081l {
    public C14966l admob;
    public boolean amazon;
    public Function1 billing;
    public final ExecutorC12010l crashlytics;
    public Rect firebase;
    public final InterfaceC1220l isPro;
    public final C10111l loadAd;
    public C0639l mopub;
    public Function1 purchase;
    public final C17893l remoteconfig;
    public final C18310l smaato;
    public final ArrayList subs;
    public RunnableC6665l vip;
    public final View yandex;

    public C8483l(View view, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        C10111l c10111l = new C10111l(view);
        ExecutorC12010l executorC12010l = new ExecutorC12010l(4, view);
        this.yandex = view;
        this.loadAd = c10111l;
        this.crashlytics = executorC12010l;
        this.purchase = C11177l.f22470l;
        this.billing = C11177l.f22469l;
        this.mopub = new C0639l(C12814l.loadAd, 4, "");
        this.admob = C14966l.mopub;
        this.subs = new ArrayList();
        this.isPro = AbstractC9968l.crashlytics(3, new C11029l(19, this));
        this.smaato = new C18310l(viewTreeObserverOnGlobalLayoutListenerC13840l, c10111l);
        this.remoteconfig = new C17893l(0, new EnumC11723l[16]);
    }

    @Override // defpackage.InterfaceC14081l
    public final void admob(C8896l c8896l) {
        Rect rect;
        this.firebase = new Rect(AbstractC5573l.ads(c8896l.yandex), AbstractC5573l.ads(c8896l.loadAd), AbstractC5573l.ads(c8896l.crashlytics), AbstractC5573l.ads(c8896l.amazon));
        if (!this.subs.isEmpty() || (rect = this.firebase) == null) {
            return;
        }
        this.yandex.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.InterfaceC14081l
    public final void amazon() {
        this.amazon = false;
        this.purchase = C11177l.f22471l;
        this.billing = C11177l.f22468l;
        this.firebase = null;
        subs(EnumC11723l.f23459l);
    }

    @Override // defpackage.InterfaceC14081l
    public final void billing(C0639l c0639l, InterfaceC4005l interfaceC4005l, C0327l c0327l, C17330l c17330l, C8896l c8896l, C8896l c8896l2) {
        C18310l c18310l = this.smaato;
        synchronized (c18310l.crashlytics) {
            try {
                c18310l.isPro = c0639l;
                c18310l.smaato = interfaceC4005l;
                c18310l.firebase = c0327l;
                c18310l.remoteconfig = c17330l;
                c18310l.vip = c8896l;
                c18310l.metrica = c8896l2;
                if (c18310l.purchase || c18310l.amazon) {
                    c18310l.yandex();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC14081l
    public final void crashlytics(C0639l c0639l, C14966l c14966l, C6411l c6411l, C10403l c10403l) {
        this.amazon = true;
        this.mopub = c0639l;
        this.admob = c14966l;
        this.purchase = c6411l;
        this.billing = c10403l;
        subs(EnumC11723l.f23460l);
    }

    @Override // defpackage.InterfaceC14081l
    public final void loadAd() {
        subs(EnumC11723l.f23458l);
    }

    @Override // defpackage.InterfaceC14081l
    public final void mopub() {
        subs(EnumC11723l.f23462l);
    }

    @Override // defpackage.InterfaceC14081l
    public final void purchase(C0639l c0639l, C0639l c0639l2) {
        boolean z = (C12814l.crashlytics(this.mopub.loadAd, c0639l2.loadAd) && AbstractC8576l.yandex(this.mopub.crashlytics, c0639l2.crashlytics)) ? false : true;
        this.mopub = c0639l2;
        int size = this.subs.size();
        for (int i = 0; i < size; i++) {
            InputConnectionC17176l inputConnectionC17176l = (InputConnectionC17176l) ((WeakReference) this.subs.get(i)).get();
            if (inputConnectionC17176l != null) {
                inputConnectionC17176l.amazon = c0639l2;
            }
        }
        C18310l c18310l = this.smaato;
        synchronized (c18310l.crashlytics) {
            c18310l.isPro = null;
            c18310l.smaato = null;
            c18310l.firebase = null;
            c18310l.remoteconfig = C11192l.f22515l;
            c18310l.vip = null;
            c18310l.metrica = null;
            Unit unit = Unit.INSTANCE;
        }
        if (AbstractC8576l.yandex(c0639l, c0639l2)) {
            if (z) {
                C10111l c10111l = this.loadAd;
                int iMopub = C12814l.mopub(c0639l2.loadAd);
                int iBilling = C12814l.billing(c0639l2.loadAd);
                C12814l c12814l = this.mopub.crashlytics;
                int iMopub2 = c12814l != null ? C12814l.mopub(c12814l.yandex) : -1;
                C12814l c12814l2 = this.mopub.crashlytics;
                ((InputMethodManager) ((InterfaceC1220l) c10111l.f20586l).getValue()).updateSelection((View) c10111l.f20587l, iMopub, iBilling, iMopub2, c12814l2 != null ? C12814l.billing(c12814l2.yandex) : -1);
                return;
            }
            return;
        }
        if (c0639l != null && (!AbstractC8576l.yandex(c0639l.yandex.f7563l, c0639l2.yandex.f7563l) || (C12814l.crashlytics(c0639l.loadAd, c0639l2.loadAd) && !AbstractC8576l.yandex(c0639l.crashlytics, c0639l2.crashlytics)))) {
            C10111l c10111l2 = this.loadAd;
            ((InputMethodManager) ((InterfaceC1220l) c10111l2.f20586l).getValue()).restartInput((View) c10111l2.f20587l);
            return;
        }
        int size2 = this.subs.size();
        for (int i2 = 0; i2 < size2; i2++) {
            InputConnectionC17176l inputConnectionC17176l2 = (InputConnectionC17176l) ((WeakReference) this.subs.get(i2)).get();
            if (inputConnectionC17176l2 != null) {
                C0639l c0639l3 = this.mopub;
                C10111l c10111l3 = this.loadAd;
                if (inputConnectionC17176l2.admob) {
                    inputConnectionC17176l2.amazon = c0639l3;
                    if (inputConnectionC17176l2.billing) {
                        ((InputMethodManager) ((InterfaceC1220l) c10111l3.f20586l).getValue()).updateExtractedText((View) c10111l3.f20587l, inputConnectionC17176l2.purchase, AbstractC10547l.amazon(c0639l3));
                    }
                    C12814l c12814l3 = c0639l3.crashlytics;
                    long j = c0639l3.loadAd;
                    int iMopub3 = c12814l3 != null ? C12814l.mopub(c12814l3.yandex) : -1;
                    C12814l c12814l4 = c0639l3.crashlytics;
                    ((InputMethodManager) ((InterfaceC1220l) c10111l3.f20586l).getValue()).updateSelection((View) c10111l3.f20587l, C12814l.mopub(j), C12814l.billing(j), iMopub3, c12814l4 != null ? C12814l.billing(c12814l4.yandex) : -1);
                }
            }
        }
    }

    public final void subs(EnumC11723l enumC11723l) {
        this.remoteconfig.crashlytics(enumC11723l);
        if (this.vip == null) {
            RunnableC6665l runnableC6665l = new RunnableC6665l(10, this);
            this.crashlytics.execute(runnableC6665l);
            this.vip = runnableC6665l;
        }
    }

    @Override // defpackage.InterfaceC14081l
    public final void yandex() {
        subs(EnumC11723l.f23460l);
    }
}
