package defpackage;

import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lًُٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7930l implements InterfaceC1711l, InterfaceC4982l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C11903l f16512l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC3177l f16513l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C17485l f16516l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f16514l = new Object();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f16515l = false;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C1869l f16517l = null;

    public C7930l(InterfaceC3177l interfaceC3177l, C11903l c11903l, C17485l c17485l) {
        this.f16513l = interfaceC3177l;
        this.f16512l = c11903l;
        this.f16516l = c17485l;
        if (((C5268l) interfaceC3177l.loadAd()).subs.yandex(EnumC8981l.f18524l)) {
            c11903l.ads();
        } else {
            c11903l.ad();
        }
        interfaceC3177l.loadAd().yandex(this);
    }

    public static void signatures(List list, C17485l c17485l) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
            if (abstractC6896l.remoteconfig()) {
                synchronized (abstractC6896l.crashlytics) {
                    abstractC6896l.metrica = c17485l;
                }
            }
        }
    }

    public final boolean Signature(AbstractC6896l abstractC6896l) {
        boolean zContains;
        synchronized (this.f16514l) {
            zContains = ((ArrayList) this.f16512l.premium()).contains(abstractC6896l);
        }
        return zContains;
    }

    public final void ad(C1869l c1869l) {
        C1869l c1869l2;
        synchronized (this.f16514l) {
            try {
                C1869l c1869l3 = this.f16517l;
                if (c1869l3 != null && c1869l3.loadAd() == c1869l.subs) {
                    if (this.f16517l.loadAd() || c1869l.subs) {
                        if (this.f16517l.loadAd() && c1869l.subs) {
                            ArrayList arrayList = new ArrayList(this.f16517l.billing);
                            arrayList.removeAll(c1869l.billing);
                            if (arrayList.isEmpty()) {
                                c1869l2 = null;
                            } else {
                                C1869l c1869l4 = this.f16517l;
                                c1869l2 = new C1869l(arrayList, c1869l4.yandex, c1869l4.loadAd);
                            }
                            this.f16517l = c1869l2;
                        }
                    } else if (this.f16517l != c1869l) {
                        return;
                    } else {
                        this.f16517l = null;
                    }
                    ArrayList arrayList2 = new ArrayList(c1869l.billing);
                    arrayList2.retainAll(this.f16512l.premium());
                    this.f16512l.inmobi(arrayList2);
                    signatures(arrayList2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void advert() {
        synchronized (this.f16514l) {
            List listPremium = this.f16512l.premium();
            this.f16512l.inmobi((ArrayList) listPremium);
            signatures(listPremium, null);
            this.f16517l = null;
        }
    }

    public final void crashlytics(C1869l c1869l) {
        synchronized (this.f16514l) {
            try {
                if (this.f16517l == null) {
                    this.f16517l = c1869l;
                } else {
                    boolean zLoadAd = c1869l.loadAd();
                    C1869l c1869l2 = this.f16517l;
                    if (zLoadAd) {
                        if (!c1869l2.loadAd()) {
                            throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                        }
                        ArrayList arrayList = new ArrayList(this.f16517l.billing);
                        arrayList.addAll(c1869l.billing);
                        this.f16517l = new C1869l(arrayList, c1869l.yandex, c1869l.loadAd);
                    } else {
                        if (c1869l2.loadAd()) {
                            throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                        }
                        this.f16517l = c1869l;
                        C11903l c11903l = this.f16512l;
                        c11903l.inmobi((ArrayList) c11903l.premium());
                    }
                }
                this.f16512l.m3291private(c1869l.yandex);
                this.f16512l.m3292synchronized(c1869l.loadAd);
                this.f16512l.m3289native(c1869l.yandex());
                this.f16512l.m3293volatile(c1869l.crashlytics);
                C5008l c5008lVip = C16936l.vip(c1869l, loadAd());
                c1869l.admob.execute(new RunnableC0336l(c5008lVip, c1869l, 29));
                this.f16512l.crashlytics(c1869l.billing, c5008lVip);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void isVip() {
        synchronized (this.f16514l) {
            try {
                if (this.f16515l) {
                    this.f16515l = false;
                    if (((C5268l) this.f16513l.loadAd()).subs.yandex(EnumC8981l.f18524l)) {
                        onStart(this.f16513l);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean license() {
        boolean zLoadAd;
        synchronized (this.f16514l) {
            C1869l c1869l = this.f16517l;
            zLoadAd = c1869l == null ? false : c1869l.loadAd();
        }
        return zLoadAd;
    }

    @Override // defpackage.InterfaceC4982l
    public final InterfaceC15879l loadAd() {
        return this.f16512l.f23734l.f31730l;
    }

    @InterfaceC16020l(EnumC14812l.ON_DESTROY)
    public void onDestroy(InterfaceC3177l interfaceC3177l) {
        synchronized (this.f16514l) {
            C11903l c11903l = this.f16512l;
            c11903l.inmobi((ArrayList) c11903l.premium());
        }
    }

    @InterfaceC16020l(EnumC14812l.ON_PAUSE)
    public void onPause(InterfaceC3177l interfaceC3177l) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f16512l.f23734l.isPro(false);
        }
    }

    @InterfaceC16020l(EnumC14812l.ON_RESUME)
    public void onResume(InterfaceC3177l interfaceC3177l) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f16512l.f23734l.isPro(true);
        }
    }

    @InterfaceC16020l(EnumC14812l.ON_START)
    public void onStart(InterfaceC3177l interfaceC3177l) {
        synchronized (this.f16514l) {
            try {
                if (!this.f16515l) {
                    this.f16512l.ads();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC16020l(EnumC14812l.ON_STOP)
    public void onStop(InterfaceC3177l interfaceC3177l) {
        synchronized (this.f16514l) {
            try {
                if (!this.f16515l) {
                    this.f16512l.ad();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void pro() {
        synchronized (this.f16514l) {
            try {
                if (this.f16515l) {
                    return;
                }
                onStop(this.f16513l);
                this.f16515l = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC10408l purchase() {
        return this.f16512l.f23734l.f31729l;
    }

    public final InterfaceC3177l subscription() {
        InterfaceC3177l interfaceC3177l;
        synchronized (this.f16514l) {
            interfaceC3177l = this.f16513l;
        }
        return interfaceC3177l;
    }

    public final List tapsense() {
        List listUnmodifiableList;
        synchronized (this.f16514l) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(this.f16512l.premium());
        }
        return listUnmodifiableList;
    }
}
