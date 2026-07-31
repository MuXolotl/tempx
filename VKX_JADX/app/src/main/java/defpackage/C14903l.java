package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔٔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14903l extends AbstractC10113l implements InterfaceC6357l, InterfaceC2800l, InterfaceC16113l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public Function1 f29315l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public boolean f29316l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f29318l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f29320l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f29321l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f29322l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public boolean f29324l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f29325l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f29328l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public float f29330l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f29333l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public float f29334l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C11925l f29335l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f29339l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public boolean f29340l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C14070l f29342l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f29343l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public C11925l f29344l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public Function1 f29345l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public Object f29347l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f29348l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f29323l = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f29341l = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public int f29317l = 3;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public long f29319l = 0;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f29329l = true;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C7074l f29327l = new C7074l(this, 0);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C17893l f29332l = new C17893l(0, new C14903l[16]);

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public boolean f29337l = true;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public long f29331l = AbstractC7563l.loadAd(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final C15488l f29336l = new C15488l(this, 1);

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final C15488l f29346l = new C15488l(this, 0);

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public long f29326l = 0;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public final C15488l f29338l = new C15488l(this, 2);

    public C14903l(C14070l c14070l) {
        this.f29342l = c14070l;
    }

    @Override // defpackage.AbstractC10113l, defpackage.InterfaceC6357l
    public final Object Signature() {
        return this.f29347l;
    }

    @Override // defpackage.InterfaceC6357l
    public final AbstractC10113l adcel(long j) {
        int i;
        C14070l c14070l = this.f29342l;
        C3654l c3654l = c14070l.yandex;
        C3654l c3654l2 = c14070l.yandex;
        if (c3654l.f7698l == 3) {
            c3654l.purchase();
        }
        if (AbstractC13082l.loadAd(c3654l2)) {
            C4020l c4020l = c14070l.adcel;
            c4020l.f8276l = 3;
            c4020l.adcel(j);
        }
        C3654l c3654lLicense = c3654l2.license();
        if (c3654lLicense != null) {
            C14070l c14070l2 = c3654lLicense.f7667l;
            if (this.f29317l != 3 && !c3654l2.f7689l) {
                AbstractC0081l.crashlytics("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iInmobi = AbstractC5020l.inmobi(c14070l2.amazon);
            if (iInmobi != 0) {
                i = 2;
                if (iInmobi != 2) {
                    C8339l.smaato("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC1757l.m1029case(c14070l2.amazon)));
                    return null;
                }
            } else {
                i = 1;
            }
            this.f29317l = i;
        } else {
            this.f29317l = 3;
        }
        m3907return(j);
        return this;
    }

    @Override // defpackage.InterfaceC2800l
    public final void appmetrica() {
        this.f29316l = true;
        C7074l c7074l = this.f29327l;
        c7074l.admob();
        boolean z = this.f29318l;
        C14070l c14070l = this.f29342l;
        if (z) {
            C17893l c17893lSignatures = c14070l.yandex.signatures();
            Object[] objArr = c17893lSignatures.f34848l;
            int i = c17893lSignatures.f34846l;
            for (int i2 = 0; i2 < i; i2++) {
                C3654l c3654l = (C3654l) objArr[i2];
                if (c3654l.ads() && c3654l.subscription() == 1 && C3654l.m1369continue(c3654l)) {
                    C3654l.m1371goto(c14070l.yandex, false, 7);
                }
            }
        }
        if (this.f29348l || (!this.f29339l && !purchase().f23549l && this.f29318l)) {
            this.f29318l = false;
            int i3 = c14070l.amazon;
            c14070l.amazon = 3;
            c14070l.mopub(false);
            C3654l c3654l2 = c14070l.yandex;
            C5227l snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l2)).getSnapshotObserver();
            snapshotObserver.yandex.crashlytics(c3654l2, snapshotObserver.purchase, this.f29346l);
            c14070l.amazon = i3;
            this.f29348l = false;
        }
        if (c7074l.amazon) {
            c7074l.purchase = true;
        }
        if (c7074l.loadAd && c7074l.purchase()) {
            c7074l.mopub();
        }
        this.f29316l = false;
    }

    @Override // defpackage.InterfaceC2800l
    public final InterfaceC2800l billing() {
        C14070l c14070l;
        C3654l c3654lLicense = this.f29342l.yandex.license();
        if (c3654lLicense == null || (c14070l = c3654lLicense.f7667l) == null) {
            return null;
        }
        return c14070l.startapp;
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: catch */
    public final int mo1458catch() {
        return this.f29342l.yandex().mo1458catch();
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: class */
    public final void mo1459class(long j, float f, C11925l c11925l) {
        m3903implements(j, f, null, c11925l);
    }

    @Override // defpackage.InterfaceC6357l
    public final int crashlytics(int i) {
        C14070l c14070l = this.f29342l;
        if (AbstractC13082l.loadAd(c14070l.yandex)) {
            return c14070l.adcel.crashlytics(i);
        }
        m3909try();
        return c14070l.yandex().crashlytics(i);
    }

    @Override // defpackage.InterfaceC2800l
    /* JADX INFO: renamed from: extends */
    public final void mo1263extends() {
        C3654l.m1371goto(this.f29342l.yandex, false, 7);
    }

    @Override // defpackage.InterfaceC6357l
    /* JADX INFO: renamed from: for */
    public final int mo1460for(int i) {
        C14070l c14070l = this.f29342l;
        if (AbstractC13082l.loadAd(c14070l.yandex)) {
            return c14070l.adcel.mo1460for(i);
        }
        m3909try();
        return c14070l.yandex().mo1460for(i);
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final List m3902goto() {
        C14070l c14070l = this.f29342l;
        c14070l.yandex.m1390protected();
        boolean z = this.f29337l;
        C17893l c17893l = this.f29332l;
        if (!z) {
            return c17893l.admob();
        }
        C3654l c3654l = c14070l.yandex;
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C3654l c3654l2 = (C3654l) objArr[i2];
            if (c17893l.f34846l <= i2) {
                c17893l.crashlytics(c3654l2.f7667l.startapp);
            } else {
                C14903l c14903l = c3654l2.f7667l.startapp;
                Object[] objArr2 = c17893l.f34848l;
                Object obj = objArr2[i2];
                objArr2[i2] = c14903l;
            }
        }
        c17893l.metrica(((C17893l) ((C4588l) c3654l.metrica()).f9321l).f34846l, c17893l.f34846l);
        this.f29337l = false;
        return c17893l.admob();
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void m3903implements(long j, float f, Function1 function1, C11925l c11925l) {
        AbstractC9601l placementScope;
        C14070l c14070l = this.f29342l;
        C3654l c3654l = c14070l.yandex;
        C3654l c3654l2 = c14070l.yandex;
        try {
            this.f29322l = true;
            if (!C5177l.loadAd(j, this.f29319l) || function1 != this.f29345l || this.f29324l) {
                if (c14070l.firebase || c14070l.isPro || this.f29324l) {
                    this.f29318l = true;
                    this.f29324l = false;
                }
            }
            C4020l c4020l = c14070l.adcel;
            if (c4020l != null) {
                C14070l c14070l2 = c4020l.f8282l;
                if (c4020l.f8285l == 3 && !AbstractC13082l.loadAd(c14070l2.yandex)) {
                    c14070l2.crashlytics = true;
                }
            }
            C4020l c4020l2 = c14070l.adcel;
            if (c4020l2 != null && c4020l2.m1461goto()) {
                AbstractC18026l abstractC18026l = c14070l.yandex().f35294l;
                if (abstractC18026l == null || (placementScope = abstractC18026l.f23546l) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l2)).getPlacementScope();
                }
                C4020l c4020l3 = c14070l.adcel;
                C3654l c3654lLicense = c3654l2.license();
                if (c3654lLicense != null) {
                    c3654lLicense.f7667l.admob = 0;
                }
                c4020l3.f8281l = Alert.DURATION_SHOW_INDEFINITELY;
                placementScope.mopub(c4020l3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            C4020l c4020l4 = c14070l.adcel;
            if (c4020l4 != null && !c4020l4.f8280l) {
                AbstractC0081l.crashlytics("Error: Placement happened before lookahead.");
            }
            m3910while(j, f, function1, c11925l);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            c3654l.m1373abstract(th);
            throw null;
        }
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: interface */
    public final void mo883interface(long j, float f, Function1 function1) {
        m3903implements(j, f, function1, null);
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void m3904l() {
        C14070l c14070l = this.f29342l;
        C3654l c3654l = c14070l.yandex;
        C3654l c3654l2 = c14070l.yandex;
        if (!c3654l.m1389private() || c14070l.smaato <= 0) {
            return;
        }
        C14070l c14070l2 = c3654l2.f7667l;
        if ((c14070l2.isPro || c14070l2.firebase) && !c14070l2.startapp.f29318l) {
            c3654l2.m1387new(false);
        }
        C17893l c17893lSignatures = c3654l2.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            ((C3654l) objArr[i2]).f7667l.startapp.m3904l();
        }
    }

    @Override // defpackage.InterfaceC6357l
    public final int metrica(int i) {
        C14070l c14070l = this.f29342l;
        if (AbstractC13082l.loadAd(c14070l.yandex)) {
            return c14070l.adcel.metrica(i);
        }
        m3909try();
        return c14070l.yandex().metrica(i);
    }

    @Override // defpackage.InterfaceC16113l
    public final void premium(boolean z) {
        C14070l c14070l = this.f29342l;
        if (z != c14070l.yandex().f23550l) {
            c14070l.yandex().f23550l = z;
            this.f29324l = true;
        }
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void m3905protected() {
        this.f29340l = true;
        C14070l c14070l = this.f29342l;
        C3654l c3654lLicense = c14070l.yandex.license();
        float f = purchase().f35268l;
        C3654l c3654l = c14070l.yandex;
        C18289l c18289l = c3654l.f7703l;
        AbstractC18026l abstractC18026l = (AbstractC18026l) c18289l.purchase;
        C11103l c11103l = (C11103l) c18289l.amazon;
        while (abstractC18026l != c11103l) {
            C9405l c9405l = (C9405l) abstractC18026l;
            f += c9405l.f35268l;
            abstractC18026l = c9405l.f35271l;
        }
        if (f != this.f29330l) {
            this.f29330l = f;
            if (c3654lLicense != null) {
                c3654lLicense.m1375case();
            }
            if (c3654lLicense != null) {
                c3654lLicense.inmobi();
            }
        }
        if (!purchase().f23549l) {
            boolean z = this.f29328l;
            if (!z || this.f29327l.amazon()) {
                m3906public();
            }
            if (z) {
                ((C11103l) c3654l.f7703l.amazon).m4490l();
            } else {
                if (c3654lLicense != null) {
                    c3654lLicense.inmobi();
                }
                if (this.f29320l && c3654lLicense != null) {
                    c3654lLicense.m1387new(false);
                }
            }
        }
        if (c3654lLicense != null) {
            C14070l c14070l2 = c3654lLicense.f7667l;
            if (!this.f29320l && c14070l2.amazon == 3) {
                if (this.f29341l != Integer.MAX_VALUE) {
                    AbstractC0081l.crashlytics("Place was called on a node which was placed already");
                }
                int i = c14070l2.subs;
                this.f29341l = i;
                c14070l2.subs = i + 1;
            }
        } else {
            this.f29341l = 0;
        }
        appmetrica();
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m3906public() {
        boolean z = this.f29328l;
        this.f29328l = true;
        C14070l c14070l = this.f29342l;
        C3654l c3654l = c14070l.yandex;
        C18289l c18289l = c3654l.f7703l;
        if (!z) {
            ((C11103l) c18289l.amazon).m4490l();
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getRectManager().admob(c14070l.yandex);
            if (c3654l.ads()) {
                C3654l.m1371goto(c3654l, true, 6);
            } else if (c3654l.f7667l.purchase) {
                C3654l.m1370final(c3654l, true, 6);
            }
        }
        AbstractC18026l abstractC18026l = ((C11103l) c18289l.amazon).f35271l;
        for (AbstractC18026l abstractC18026l2 = (AbstractC18026l) c18289l.purchase; !AbstractC8576l.yandex(abstractC18026l2, abstractC18026l) && abstractC18026l2 != null; abstractC18026l2 = abstractC18026l2.f35271l) {
            if (abstractC18026l2.f35280l) {
                abstractC18026l2.m4495l();
            }
        }
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C3654l c3654l2 = (C3654l) objArr[i2];
            if (c3654l2.pro() != Integer.MAX_VALUE) {
                c3654l2.f7667l.startapp.m3906public();
                C3654l.m1372super(c3654l2);
            }
        }
    }

    @Override // defpackage.InterfaceC2800l
    public final C11103l purchase() {
        return (C11103l) this.f29342l.yandex.f7703l.amazon;
    }

    @Override // defpackage.InterfaceC6357l
    public final int remoteconfig(int i) {
        C14070l c14070l = this.f29342l;
        if (AbstractC13082l.loadAd(c14070l.yandex)) {
            return c14070l.adcel.remoteconfig(i);
        }
        m3909try();
        return c14070l.yandex().remoteconfig(i);
    }

    @Override // defpackage.InterfaceC2800l
    public final void requestLayout() {
        this.f29342l.yandex.m1387new(false);
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final boolean m3907return(long j) {
        C14070l c14070l = this.f29342l;
        C3654l c3654l = c14070l.yandex;
        C3654l c3654l2 = c14070l.yandex;
        try {
            if (c3654l.f7684l) {
                AbstractC0081l.yandex("measure is called on a deactivated node");
            }
            InterfaceC11218l interfaceC11218lYandex = AbstractC5672l.yandex(c3654l2);
            C3654l c3654lLicense = c3654l2.license();
            boolean z = true;
            c3654l2.f7689l = c3654l2.f7689l || (c3654lLicense != null && c3654lLicense.f7689l);
            if (!c3654l2.ads() && C15519l.loadAd(this.f20594l, j)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218lYandex).subs(c3654l2, false);
                c3654l2.m1383import();
                return false;
            }
            this.f29327l.billing = false;
            C17893l c17893lSignatures = c3654l2.signatures();
            Object[] objArr = c17893lSignatures.f34848l;
            int i = c17893lSignatures.f34846l;
            for (int i2 = 0; i2 < i; i2++) {
                ((C3654l) objArr[i2]).f7667l.startapp.f29327l.crashlytics = false;
                Unit unit = Unit.INSTANCE;
            }
            this.f29333l = true;
            long j2 = c14070l.yandex().f20590l;
            m2888new(j);
            if (c14070l.amazon != 5) {
                AbstractC0081l.crashlytics("layout state is not idle before measure starts");
            }
            this.f29331l = j;
            c14070l.amazon = 1;
            this.f29321l = false;
            C5227l snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l2)).getSnapshotObserver();
            snapshotObserver.yandex.crashlytics(c3654l2, snapshotObserver.crashlytics, this.f29336l);
            if (c14070l.amazon == 1) {
                this.f29318l = true;
                this.f29348l = true;
                c14070l.amazon = 5;
            }
            if (C4999l.loadAd(c14070l.yandex().f20590l, j2) && c14070l.yandex().f20592l == this.f20592l && c14070l.yandex().f20591l == this.f20591l) {
                z = false;
            }
            m2887default((((long) c14070l.yandex().f20591l) & 4294967295L) | (((long) c14070l.yandex().f20592l) << 32));
            return z;
        } catch (Throwable th) {
            c3654l.m1373abstract(th);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC2800l
    public final void signatures(C3006l c3006l) {
        C17893l c17893lSignatures = this.f29342l.yandex.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            c3006l.invoke(((C3654l) objArr[i2]).f7667l.startapp);
        }
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: switch */
    public final int mo1466switch() {
        return this.f29342l.yandex().mo1466switch();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m3908this() {
        if (this.f29328l) {
            this.f29328l = false;
            C14070l c14070l = this.f29342l;
            C3654l c3654l = c14070l.yandex;
            C3654l c3654l2 = c14070l.yandex;
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getRectManager().subs(c3654l2);
            C18289l c18289l = c3654l2.f7703l;
            AbstractC18026l abstractC18026l = ((C11103l) c18289l.amazon).f35271l;
            for (AbstractC18026l abstractC18026l2 = (AbstractC18026l) c18289l.purchase; !AbstractC8576l.yandex(abstractC18026l2, abstractC18026l) && abstractC18026l2 != null; abstractC18026l2 = abstractC18026l2.f35271l) {
                abstractC18026l2.m4485l();
                abstractC18026l2.m4467l();
            }
            C17893l c17893lSignatures = c3654l2.signatures();
            Object[] objArr = c17893lSignatures.f34848l;
            int i = c17893lSignatures.f34846l;
            for (int i2 = 0; i2 < i; i2++) {
                ((C3654l) objArr[i2]).f7667l.startapp.m3908this();
            }
        }
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: throw */
    public final int mo884throw(AbstractC12914l abstractC12914l) {
        C14070l c14070l = this.f29342l;
        C3654l c3654lLicense = c14070l.yandex.license();
        int i = c3654lLicense != null ? c3654lLicense.f7667l.amazon : 0;
        C7074l c7074l = this.f29327l;
        if (i == 1) {
            c7074l.crashlytics = true;
        } else {
            C3654l c3654lLicense2 = c14070l.yandex.license();
            if ((c3654lLicense2 != null ? c3654lLicense2.f7667l.amazon : 0) == 3) {
                c7074l.amazon = true;
            }
        }
        this.f29339l = true;
        int iMo884throw = c14070l.yandex().mo884throw(abstractC12914l);
        this.f29339l = false;
        return iMo884throw;
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m3909try() {
        int i;
        C14070l c14070l = this.f29342l;
        C3654l.m1371goto(c14070l.yandex, false, 7);
        C3654l c3654l = c14070l.yandex;
        C3654l c3654lLicense = c3654l.license();
        if (c3654lLicense == null || c3654l.f7698l != 3) {
            return;
        }
        int iInmobi = AbstractC5020l.inmobi(c3654lLicense.f7667l.amazon);
        if (iInmobi != 0) {
            i = 2;
            if (iInmobi != 2) {
                i = c3654lLicense.f7698l;
            }
        } else {
            i = 1;
        }
        c3654l.f7698l = i;
    }

    @Override // defpackage.InterfaceC2800l
    public final int vip() {
        return this.f29341l;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final void m3910while(long j, float f, Function1 function1, C11925l c11925l) {
        C14070l c14070l = this.f29342l;
        C3654l c3654l = c14070l.yandex;
        C3654l c3654l2 = c14070l.yandex;
        if (c3654l.f7684l) {
            AbstractC0081l.yandex("place is called on a deactivated node");
        }
        c14070l.amazon = 3;
        this.f29319l = j;
        this.f29325l = f;
        this.f29345l = function1;
        this.f29335l = c11925l;
        this.f29340l = false;
        InterfaceC11218l interfaceC11218lYandex = AbstractC5672l.yandex(c3654l2);
        if (this.f29318l || !this.f29328l) {
            this.f29327l.mopub = false;
            c14070l.billing(false);
            this.f29315l = function1;
            this.f29326l = j;
            this.f29334l = f;
            this.f29344l = c11925l;
            C5227l snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218lYandex).getSnapshotObserver();
            snapshotObserver.yandex.crashlytics(c3654l2, snapshotObserver.billing, this.f29338l);
        } else {
            AbstractC18026l abstractC18026lYandex = c14070l.yandex();
            abstractC18026lYandex.m4478l(C5177l.amazon(j, abstractC18026lYandex.f20593l), f, function1, c11925l);
            m3905protected();
        }
        c14070l.amazon = 5;
        if (c14070l.yandex().f23549l && (c14070l.firebase || c14070l.isPro)) {
            requestLayout();
        }
        this.f29343l = true;
    }

    @Override // defpackage.InterfaceC2800l
    public final C7074l yandex() {
        return this.f29327l;
    }
}
