package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: lۣٗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17505l implements InterfaceC13521l, InterfaceC4784l, InterfaceC11885l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C4322l f34102l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC9814l f34103l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C14500l f34104l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C3904l f34105l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C18527l f34106l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final SparseArray f34107l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1424l f34108l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f34109l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C8961l f34110l;

    public C17505l(C18527l c18527l) {
        c18527l.getClass();
        this.f34106l = c18527l;
        this.f34110l = new C8961l(AbstractC15323l.isVip().getThread());
        C3904l c3904l = new C3904l();
        this.f34105l = c3904l;
        this.f34102l = new C4322l();
        C1424l c1424l = new C1424l();
        c1424l.f3603l = c3904l;
        C9258l c9258l = AbstractC1186l.f3181l;
        c1424l.f3602l = C13708l.f26763l;
        c1424l.f3601l = C15333l.f29966l;
        this.f34108l = c1424l;
        this.f34107l = new SparseArray();
    }

    @Override // defpackage.InterfaceC13521l
    public final void Signature(int i) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 4, new C14389l(c5597lM4400static, i, 2));
    }

    @Override // defpackage.InterfaceC4784l
    public final void ad(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l, IOException iOException, boolean z) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1003, new C17706l(c5597lM4399new, c13071l, c2040l, iOException, z));
    }

    @Override // defpackage.InterfaceC13521l
    public final void adcel(float f) {
        C5597l c5597lM4397goto = m4397goto();
        m4401super(c5597lM4397goto, 22, new C11525l(c5597lM4397goto, f));
    }

    @Override // defpackage.InterfaceC13521l
    public final void ads(int i, C2427l c2427l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 1, new C14389l(c5597lM4400static, c2427l, i));
    }

    @Override // defpackage.InterfaceC13521l
    public final void advert(C16684l c16684l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 27, new C18725l(c5597lM4400static, c16684l, 13));
    }

    @Override // defpackage.InterfaceC11885l
    public final void amazon(int i, C5019l c5019l, int i2) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1022, new C14389l(c5597lM4399new, i2, 6));
    }

    @Override // defpackage.InterfaceC13521l
    public final void appmetrica(C14723l c14723l) {
        C5019l c5019l;
        C5597l c5597lM4400static = (!(c14723l instanceof C17361l) || (c5019l = ((C17361l) c14723l).f33826l) == null) ? m4400static() : m4395default(c5019l);
        m4401super(c5597lM4400static, 10, new C18725l(c5597lM4400static, c14723l, 9));
    }

    @Override // defpackage.InterfaceC13521l
    public final void billing(C15074l c15074l) {
        C5597l c5597lM4397goto = m4397goto();
        m4401super(c5597lM4397goto, 25, new C5131l((Object) c5597lM4397goto, (Object) c15074l, 12));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: case */
    public final void mo2731case(C2848l c2848l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 29, new C18725l(c5597lM4400static, c2848l, 12));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: catch */
    public final void mo2732catch(C1372l c1372l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 12, new C5131l((Object) c5597lM4400static, (Object) c1372l, 5));
    }

    @Override // defpackage.InterfaceC4784l
    /* JADX INFO: renamed from: class */
    public final void mo1600class(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l, int i2) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1000, new C18725l(c5597lM4399new, c13071l, c2040l, i2));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: continue */
    public final void mo2733continue(int i, int i2) {
        C5597l c5597lM4397goto = m4397goto();
        m4401super(c5597lM4397goto, 24, new C5015l(c5597lM4397goto, i, i2));
    }

    @Override // defpackage.InterfaceC4784l
    public final void crashlytics(int i, C5019l c5019l, C2040l c2040l) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1005, new C5524l(c5597lM4399new, c2040l, 0));
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final C5597l m4395default(C5019l c5019l) {
        this.f34103l.getClass();
        AbstractC10759l abstractC10759l = c5019l == null ? null : (AbstractC10759l) ((C15333l) this.f34108l.f3601l).get(c5019l);
        if (c5019l != null && abstractC10759l != null) {
            return m4396final(abstractC10759l, abstractC10759l.mopub(c5019l.yandex, this.f34105l).crashlytics, c5019l);
        }
        int iMo2761implements = this.f34103l.mo2761implements();
        AbstractC10759l abstractC10759lMo2791l = this.f34103l.mo2791l();
        if (iMo2761implements >= abstractC10759lMo2791l.metrica()) {
            abstractC10759lMo2791l = AbstractC10759l.yandex;
        }
        return m4396final(abstractC10759lMo2791l, iMo2761implements, null);
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: else */
    public final void mo2734else(C16616l c16616l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 13, new C18725l(c5597lM4400static, c16616l, 28));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: extends */
    public final void mo2735extends(List list) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 27, new C18725l(c5597lM4400static, list, 11));
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final C5597l m4396final(AbstractC10759l abstractC10759l, int i, C5019l c5019l) {
        C5019l c5019l2 = abstractC10759l.startapp() ? null : c5019l;
        this.f34106l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = abstractC10759l.equals(this.f34103l.mo2791l()) && i == this.f34103l.mo2761implements();
        long jM3986try = 0;
        if (c5019l2 == null || !c5019l2.loadAd()) {
            if (z) {
                jM3986try = this.f34103l.mo2804static();
            } else if (!abstractC10759l.startapp()) {
                jM3986try = AbstractC15323l.m3986try(abstractC10759l.remoteconfig(i, this.f34102l, 0L).smaato);
            }
        } else if (z && this.f34103l.mo2815while() == c5019l2.loadAd && this.f34103l.mo2805strictfp() == c5019l2.crashlytics) {
            jM3986try = this.f34103l.mo2771l();
        }
        return new C5597l(jElapsedRealtime, abstractC10759l, i, c5019l2, jM3986try, this.f34103l.mo2791l(), this.f34103l.mo2761implements(), (C5019l) this.f34108l.f3605l, this.f34103l.mo2771l(), this.f34103l.firebase());
    }

    @Override // defpackage.InterfaceC13521l
    public final void firebase(C4262l c4262l, C4262l c4262l2, int i) {
        if (i == 1) {
            this.f34109l = false;
        }
        InterfaceC9814l interfaceC9814l = this.f34103l;
        interfaceC9814l.getClass();
        C1424l c1424l = this.f34108l;
        c1424l.f3605l = C1424l.m892default(interfaceC9814l, (AbstractC1186l) c1424l.f3602l, (C5019l) c1424l.f3604l, (C3904l) c1424l.f3603l);
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 11, new C2766l(i, c5597lM4400static, c4262l, c4262l2));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: for */
    public final void mo2736for(int i, boolean z) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, -1, new C18725l(c5597lM4400static, z, i));
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final C5597l m4397goto() {
        return m4395default((C5019l) this.f34108l.f3606l);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4398import(C17804l c17804l, Looper looper) {
        AbstractC12442l.subscription(this.f34103l == null || ((AbstractC1186l) this.f34108l.f3602l).isEmpty());
        c17804l.getClass();
        this.f34103l = c17804l;
        this.f34104l = this.f34106l.yandex(looper, null);
        C8961l c8961l = this.f34110l;
        C5131l c5131l = new C5131l(this, c17804l, 6);
        c8961l.getClass();
        C18527l c18527l = this.f34106l;
        AbstractC12442l.subscription(c18527l != null);
        this.f34110l = new C8961l((CopyOnWriteArraySet) c8961l.billing, looper, looper.getThread(), c18527l, c5131l, c8961l.loadAd);
    }

    @Override // defpackage.InterfaceC13521l
    public final void inmobi(int i, boolean z) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 30, new C18725l(c5597lM4400static, i, z));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: interface */
    public final void mo2737interface(boolean z) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 7, new C14132l(c5597lM4400static, z, 1));
    }

    @Override // defpackage.InterfaceC11885l
    public final void isVip(int i, C5019l c5019l) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1025, new C11111l(c5597lM4399new, 5));
    }

    @Override // defpackage.InterfaceC4784l
    public final void license(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1001, new C18725l(c5597lM4399new, c13071l, c2040l, 27, (byte) 0));
    }

    @Override // defpackage.InterfaceC4784l
    public final void loadAd(int i, C5019l c5019l, C2040l c2040l) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1004, new C5524l(c5597lM4399new, c2040l, 1));
    }

    @Override // defpackage.InterfaceC13521l
    public final void metrica(C7417l c7417l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 28, new C5131l((Object) c5597lM4400static, (Object) c7417l, 8));
    }

    @Override // defpackage.InterfaceC13521l
    public final void mopub(int i) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 6, new C14389l(c5597lM4400static, i, 0));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final C5597l m4399new(int i, C5019l c5019l) {
        this.f34103l.getClass();
        if (c5019l != null) {
            return ((AbstractC10759l) ((C15333l) this.f34108l.f3601l).get(c5019l)) != null ? m4395default(c5019l) : m4396final(AbstractC10759l.yandex, i, c5019l);
        }
        AbstractC10759l abstractC10759lMo2791l = this.f34103l.mo2791l();
        if (i >= abstractC10759lMo2791l.metrica()) {
            abstractC10759lMo2791l = AbstractC10759l.yandex;
        }
        return m4396final(abstractC10759lMo2791l, i, null);
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: package */
    public final void mo2739package(C3852l c3852l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 14, new C18725l(c5597lM4400static, c3852l, 17));
    }

    @Override // defpackage.InterfaceC13521l
    public final void premium(C1047l c1047l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 2, new C5131l((Object) c5597lM4400static, (Object) c1047l, 9));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: private */
    public final void mo2740private(boolean z) {
        C5597l c5597lM4397goto = m4397goto();
        m4401super(c5597lM4397goto, 23, new C14132l(c5597lM4397goto, z, 0));
    }

    @Override // defpackage.InterfaceC13521l
    public final void pro(boolean z) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 9, new C14132l(c5597lM4400static, z, 2));
    }

    @Override // defpackage.InterfaceC11885l
    public final void purchase(int i, C5019l c5019l, C2183l c2183l) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1023, new C11111l(c5597lM4399new, c2183l, 4));
    }

    @Override // defpackage.InterfaceC13521l
    public final void remoteconfig(C4970l c4970l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 19, new C18725l(c5597lM4400static, c4970l, 23));
    }

    @Override // defpackage.InterfaceC13521l
    public final void signatures(C14723l c14723l) {
        C5019l c5019l;
        C5597l c5597lM4400static = (!(c14723l instanceof C17361l) || (c5019l = ((C17361l) c14723l).f33826l) == null) ? m4400static() : m4395default(c5019l);
        m4401super(c5597lM4400static, 10, new C5131l((Object) c5597lM4400static, (Object) c14723l, 10));
    }

    @Override // defpackage.InterfaceC13521l
    public final void smaato(C13736l c13736l) {
        C5597l c5597lM4397goto = m4397goto();
        m4401super(c5597lM4397goto, 20, new C5131l((Object) c5597lM4397goto, (Object) c13736l, 7));
    }

    @Override // defpackage.InterfaceC13521l
    public final void startapp(int i, boolean z) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 5, new C10194l(c5597lM4400static, z, i));
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final C5597l m4400static() {
        return m4395default((C5019l) this.f34108l.f3605l);
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: strictfp */
    public final void mo2741strictfp(long j) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 17, new C18725l(c5597lM4400static, j, 21, (byte) 0));
    }

    @Override // defpackage.InterfaceC13521l
    public final void subs(int i) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 8, new C14389l(c5597lM4400static, i, 4));
    }

    @Override // defpackage.InterfaceC4784l
    public final void subscription(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1002, new C18725l(c5597lM4399new, c13071l, c2040l, 26, (byte) 0));
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void m4401super(C5597l c5597l, int i, InterfaceC16975l interfaceC16975l) {
        this.f34107l.put(i, c5597l);
        this.f34110l.mopub(i, interfaceC16975l);
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: switch */
    public final void mo2742switch(long j) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 18, new C18725l(c5597lM4400static, j, 19, (byte) 0));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: synchronized */
    public final void mo2743synchronized(C3852l c3852l) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 15, new C18725l(c5597lM4400static, c3852l, 14));
    }

    @Override // defpackage.InterfaceC13521l
    public final void tapsense(int i) {
        C5597l c5597lM4397goto = m4397goto();
        m4401super(c5597lM4397goto, 21, new C14389l(c5597lM4397goto, i, 3));
    }

    @Override // defpackage.InterfaceC11885l
    /* JADX INFO: renamed from: throw */
    public final void mo2164throw(int i, C5019l c5019l) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1027, new C11111l(c5597lM4399new, 3));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: throws */
    public final void mo2744throws(long j) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 16, new C18725l(c5597lM4400static, j, 18, (byte) 0));
    }

    @Override // defpackage.InterfaceC13521l
    public final void vip(boolean z) {
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 3, new C14132l(c5597lM4400static, z, 3));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: volatile */
    public final void mo2745volatile(AbstractC10759l abstractC10759l, int i) {
        InterfaceC9814l interfaceC9814l = this.f34103l;
        interfaceC9814l.getClass();
        C1424l c1424l = this.f34108l;
        c1424l.f3605l = C1424l.m892default(interfaceC9814l, (AbstractC1186l) c1424l.f3602l, (C5019l) c1424l.f3604l, (C3904l) c1424l.f3603l);
        c1424l.m925l(interfaceC9814l.mo2791l());
        C5597l c5597lM4400static = m4400static();
        m4401super(c5597lM4400static, 0, new C14389l(c5597lM4400static, i, 7));
    }

    @Override // defpackage.InterfaceC11885l
    public final void yandex(int i, C5019l c5019l, Exception exc) {
        C5597l c5597lM4399new = m4399new(i, c5019l);
        m4401super(c5597lM4399new, 1024, new C5131l((Object) c5597lM4399new, (Object) exc, 14));
    }

    @Override // defpackage.InterfaceC13521l
    /* JADX INFO: renamed from: native */
    public final void mo2738native() {
    }

    @Override // defpackage.InterfaceC13521l
    public final void admob(boolean z) {
    }

    @Override // defpackage.InterfaceC13521l
    public final void isPro(int i) {
    }

    @Override // defpackage.InterfaceC13521l
    public final void applovin(InterfaceC9814l interfaceC9814l, C3895l c3895l) {
    }
}
