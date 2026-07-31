package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: lّؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC4973l extends AbstractC14971l implements InterfaceC3228l, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C15625l f10160l = new C15625l(this, 0);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C15625l f10161l = new C15625l(this, 1);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public ViewTreeObserver f10162l;

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        ViewTreeObserver viewTreeObserver = this.f10162l;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f10162l = null;
        AbstractC1068l.billing(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        ViewTreeObserver viewTreeObserver = AbstractC1068l.billing(this).getViewTreeObserver();
        this.f10162l = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final C6543l m1657l() {
        boolean z;
        if (!this.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitLocalDescendants called on an unattached node");
        }
        AbstractC14971l abstractC14971l = this.f29454l;
        if ((abstractC14971l.f29457l & 1024) != 0) {
            boolean z2 = false;
            for (AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                if ((abstractC14971l2.f29450l & 1024) != 0) {
                    AbstractC14971l abstractC14971lLoadAd = abstractC14971l2;
                    C17893l c17893l = null;
                    while (abstractC14971lLoadAd != null) {
                        if (abstractC14971lLoadAd instanceof C6543l) {
                            C6543l c6543l = (C6543l) abstractC14971lLoadAd;
                            if (z2) {
                                return c6543l;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                            int i = 0;
                            for (AbstractC14971l abstractC14971l3 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l3 != null; abstractC14971l3 = abstractC14971l3.f29460l) {
                                if ((abstractC14971l3.f29450l & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC14971lLoadAd = abstractC14971l3;
                                    } else {
                                        if (c17893l == null) {
                                            c17893l = new C17893l(0, new AbstractC14971l[16]);
                                        }
                                        if (abstractC14971lLoadAd != null) {
                                            c17893l.crashlytics(abstractC14971lLoadAd);
                                            abstractC14971lLoadAd = null;
                                        }
                                        c17893l.crashlytics(abstractC14971l3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                    }
                }
            }
        }
        C8339l.smaato("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (AbstractC5573l.metrica(this).f7680l == null) {
            return;
        }
        View viewYandex = AbstractC12396l.yandex(this);
        InterfaceC6497l focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getFocusOwner();
        InterfaceC11218l interfaceC11218lStartapp = AbstractC5573l.startapp(this);
        boolean z2 = true;
        if (view != null && !view.equals(interfaceC11218lStartapp)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewYandex.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(interfaceC11218lStartapp)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else if (parent2 == viewYandex.getParent()) {
                    break;
                } else {
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            return;
        }
        if (z2) {
            C6543l c6543lM1657l = m1657l();
            if (c6543lM1657l.m2028l().yandex()) {
                return;
            }
            AbstractC12225l.subs(c6543lM1657l);
            return;
        }
        if (z && m1657l().m2028l().loadAd()) {
            ((C15552l) focusOwner).loadAd(8, false, false);
        }
    }

    @Override // defpackage.InterfaceC3228l
    /* JADX INFO: renamed from: synchronized */
    public final void mo1299synchronized(InterfaceC1389l interfaceC1389l) {
        interfaceC1389l.amazon(false);
        interfaceC1389l.billing(this.f10160l);
        interfaceC1389l.crashlytics(this.f10161l);
    }
}
