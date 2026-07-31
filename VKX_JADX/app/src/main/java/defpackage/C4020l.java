package defpackage;

import androidx.car.app.model.Alert;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4020l extends AbstractC10113l implements InterfaceC6357l, InterfaceC2800l, InterfaceC16113l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f8264l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f8265l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f8266l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Function1 f8270l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C11925l f8273l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public Object f8275l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public boolean f8278l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f8280l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C14070l f8282l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f8283l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C15519l f8284l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f8269l = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f8281l = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f8276l = 3;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public long f8277l = 0;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f8285l = 3;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C7074l f8272l = new C7074l(this, 1);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C17893l f8268l = new C17893l(0, new C4020l[16]);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f8267l = true;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C15839l f8286l = new C15839l(this, 0);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public boolean f8271l = true;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public long f8279l = AbstractC7563l.loadAd(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C15839l f8263l = new C15839l(this, 2);

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C15839l f8274l = new C15839l(this, 1);

    public C4020l(C14070l c14070l) {
        this.f8282l = c14070l;
        this.f8275l = c14070l.startapp.f29347l;
    }

    @Override // defpackage.AbstractC10113l, defpackage.InterfaceC6357l
    public final Object Signature() {
        return this.f8275l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // defpackage.InterfaceC6357l
    public final AbstractC10113l adcel(long j) {
        C14070l c14070l = this.f8282l;
        C3654l c3654l = c14070l.yandex;
        C3654l c3654l2 = c14070l.yandex;
        C3654l c3654lLicense = c3654l.license();
        int i = 2;
        if ((c3654lLicense != null ? c3654lLicense.f7667l.amazon : 0) == 2) {
            c14070l.loadAd = false;
        } else {
            C3654l c3654lLicense2 = c3654l2.license();
            if ((c3654lLicense2 != null ? c3654lLicense2.f7667l.amazon : 0) == 4) {
                c14070l.loadAd = false;
            }
        }
        C3654l c3654lLicense3 = c3654l2.license();
        if (c3654lLicense3 != null) {
            C14070l c14070l2 = c3654lLicense3.f7667l;
            if (this.f8276l != 3 && !c3654l2.f7689l) {
                AbstractC0081l.crashlytics("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iInmobi = AbstractC5020l.inmobi(c14070l2.amazon);
            if (iInmobi == 0 || iInmobi == 1) {
                i = 1;
            } else if (iInmobi != 2 && iInmobi != 3) {
                C8339l.smaato("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC1757l.m1029case(c14070l2.amazon)));
                return null;
            }
            this.f8276l = i;
        } else {
            this.f8276l = 3;
        }
        if (c3654l2.f7698l == 3) {
            c3654l2.purchase();
        }
        m1465return(j);
        return this;
    }

    @Override // defpackage.InterfaceC2800l
    public final void appmetrica() {
        this.f8264l = true;
        C7074l c7074l = this.f8272l;
        c7074l.admob();
        C14070l c14070l = this.f8282l;
        boolean z = c14070l.billing;
        C3654l c3654l = c14070l.yandex;
        if (z) {
            C17893l c17893lSignatures = c3654l.signatures();
            Object[] objArr = c17893lSignatures.f34848l;
            int i = c17893lSignatures.f34846l;
            for (int i2 = 0; i2 < i; i2++) {
                C3654l c3654l2 = (C3654l) objArr[i2];
                if (c3654l2.f7667l.purchase && c3654l2.tapsense() == 1) {
                    C4020l c4020l = c3654l2.f7667l.adcel;
                    if (c4020l.m1465return((c4020l != null ? c4020l.f8284l : null).yandex)) {
                        C3654l.m1370final(c3654l, false, 7);
                    }
                }
            }
        }
        C16857l c16857l = purchase().f22308l;
        if (c14070l.mopub || (!this.f8283l && !c16857l.f23549l && c14070l.billing)) {
            c14070l.billing = false;
            int i3 = c14070l.amazon;
            c14070l.amazon = 4;
            c14070l.subs(false);
            C5227l snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getSnapshotObserver();
            snapshotObserver.yandex.crashlytics(c3654l, snapshotObserver.admob, this.f8286l);
            c14070l.amazon = i3;
            if (c14070l.remoteconfig && c16857l.f23549l) {
                requestLayout();
            }
            c14070l.mopub = false;
        }
        if (c7074l.amazon) {
            c7074l.purchase = true;
        }
        if (c7074l.loadAd && c7074l.purchase()) {
            c7074l.mopub();
        }
        this.f8264l = false;
    }

    @Override // defpackage.InterfaceC2800l
    public final InterfaceC2800l billing() {
        C14070l c14070l;
        C3654l c3654lLicense = this.f8282l.yandex.license();
        if (c3654lLicense == null || (c14070l = c3654lLicense.f7667l) == null) {
            return null;
        }
        return c14070l.adcel;
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final int mo1458catch() {
        return this.f8282l.yandex().mo2645l().mo1458catch();
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void mo1459class(long j, float f, C11925l c11925l) {
        m1462implements(j, c11925l, null);
    }

    @Override // defpackage.InterfaceC6357l
    public final int crashlytics(int i) {
        m1463protected();
        return this.f8282l.yandex().mo2645l().crashlytics(i);
    }

    @Override // defpackage.InterfaceC2800l
    /* JADX INFO: renamed from: extends */
    public final void mo1263extends() {
        C3654l.m1370final(this.f8282l.yandex, false, 7);
    }

    @Override // defpackage.InterfaceC6357l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final int mo1460for(int i) {
        m1463protected();
        return this.f8282l.yandex().mo2645l().mo1460for(i);
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final boolean m1461goto() {
        C14070l c14070l = this.f8282l;
        return AbstractC13082l.loadAd(c14070l.yandex) || c14070l.crashlytics;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0006, B:5:0x000d, B:9:0x0016, B:12:0x001b, B:14:0x001f, B:15:0x0024, B:17:0x0033, B:19:0x0037, B:22:0x003d, B:21:0x003b, B:23:0x0040, B:25:0x004a, B:30:0x0053, B:32:0x007e, B:31:0x0068), top: B:36:0x0006 }] */
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void m1462implements(long j, C11925l c11925l, Function1 function1) {
        C14070l c14070l = this.f8282l;
        C3654l c3654l = c14070l.yandex;
        C3654l c3654l2 = c14070l.yandex;
        try {
            C3654l c3654lLicense = c3654l.license();
            if ((c3654lLicense != null ? c3654lLicense.f7667l.amazon : 0) == 4) {
                c14070l.crashlytics = false;
            }
            if (c3654l2.f7684l) {
                AbstractC0081l.yandex("place is called on a deactivated node");
            }
            c14070l.amazon = 4;
            boolean z = true;
            this.f8280l = true;
            this.f8278l = false;
            if (!C5177l.loadAd(j, this.f8277l)) {
                if (c14070l.vip || c14070l.remoteconfig) {
                    c14070l.billing = true;
                }
                m1468try();
            }
            InterfaceC11218l interfaceC11218lYandex = AbstractC5672l.yandex(c3654l2);
            this.f8277l = j;
            if (c14070l.billing) {
                c14070l.admob(false);
                this.f8272l.mopub = false;
                C5227l snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218lYandex).getSnapshotObserver();
                snapshotObserver.yandex.crashlytics(c3654l2, snapshotObserver.mopub, this.f8274l);
            } else {
                if (this.f8285l == 3) {
                    z = false;
                }
                if (z) {
                    AbstractC1668l abstractC1668lMo2645l = c14070l.yandex().mo2645l();
                    abstractC1668lMo2645l.m995l(C5177l.amazon(j, abstractC1668lMo2645l.f20593l));
                    m1469while();
                } else {
                    c14070l.admob(false);
                    this.f8272l.mopub = false;
                    C5227l snapshotObserver2 = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218lYandex).getSnapshotObserver();
                    snapshotObserver2.yandex.crashlytics(c3654l2, snapshotObserver2.mopub, this.f8274l);
                }
            }
            this.f8270l = function1;
            this.f8273l = c11925l;
            c14070l.amazon = 5;
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            c3654l.m1373abstract(th);
            throw null;
        }
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: interface */
    public final void mo883interface(long j, float f, Function1 function1) {
        m1462implements(j, null, function1);
    }

    @Override // defpackage.InterfaceC6357l
    public final int metrica(int i) {
        m1463protected();
        return this.f8282l.yandex().mo2645l().metrica(i);
    }

    @Override // defpackage.InterfaceC16113l
    public final void premium(boolean z) {
        AbstractC1668l abstractC1668lMo2645l;
        C14070l c14070l = this.f8282l;
        AbstractC1668l abstractC1668lMo2645l2 = c14070l.yandex().mo2645l();
        if (Boolean.valueOf(z).equals(abstractC1668lMo2645l2 != null ? Boolean.valueOf(abstractC1668lMo2645l2.f23550l) : null) || (abstractC1668lMo2645l = c14070l.yandex().mo2645l()) == null) {
            return;
        }
        abstractC1668lMo2645l.f23550l = z;
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void m1463protected() {
        int i;
        C14070l c14070l = this.f8282l;
        C3654l.m1370final(c14070l.yandex, false, 7);
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

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m1464public(boolean z) {
        if (z && m1461goto()) {
            return;
        }
        if (z || m1461goto()) {
            this.f8285l = 3;
            C17893l c17893lSignatures = this.f8282l.yandex.signatures();
            Object[] objArr = c17893lSignatures.f34848l;
            int i = c17893lSignatures.f34846l;
            for (int i2 = 0; i2 < i; i2++) {
                ((C3654l) objArr[i2]).f7667l.adcel.m1464public(true);
            }
        }
    }

    @Override // defpackage.InterfaceC2800l
    public final C11103l purchase() {
        return (C11103l) this.f8282l.yandex.f7703l.amazon;
    }

    @Override // defpackage.InterfaceC6357l
    public final int remoteconfig(int i) {
        m1463protected();
        return this.f8282l.yandex().mo2645l().remoteconfig(i);
    }

    @Override // defpackage.InterfaceC2800l
    public final void requestLayout() {
        this.f8282l.yandex.m1378default(false);
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final boolean m1465return(long j) {
        C14070l c14070l = this.f8282l;
        C3654l c3654l = c14070l.yandex;
        C3654l c3654l2 = c14070l.yandex;
        try {
            if (c3654l.f7684l) {
                AbstractC0081l.yandex("measure is called on a deactivated node");
            }
            C3654l c3654lLicense = c3654l2.license();
            c3654l2.f7689l = c3654l2.f7689l || (c3654lLicense != null && c3654lLicense.f7689l);
            if (!c3654l2.f7667l.purchase) {
                C15519l c15519l = this.f8284l;
                if (c15519l == null ? false : C15519l.loadAd(c15519l.yandex, j)) {
                    InterfaceC11218l interfaceC11218l = c3654l2.f7680l;
                    if (interfaceC11218l != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l).subs(c3654l2, true);
                    }
                    c3654l2.m1383import();
                    return false;
                }
            }
            this.f8284l = new C15519l(j);
            m2888new(j);
            this.f8272l.billing = false;
            C17893l c17893lSignatures = c3654l2.signatures();
            Object[] objArr = c17893lSignatures.f34848l;
            int i = c17893lSignatures.f34846l;
            for (int i2 = 0; i2 < i; i2++) {
                ((C3654l) objArr[i2]).f7667l.adcel.f8272l.crashlytics = false;
                Unit unit = Unit.INSTANCE;
            }
            long j2 = this.f8265l ? this.f20590l : -9223372034707292160L;
            this.f8265l = true;
            AbstractC1668l abstractC1668lMo2645l = c14070l.yandex().mo2645l();
            if (!(abstractC1668lMo2645l != null)) {
                AbstractC0081l.crashlytics("Lookahead result from lookaheadRemeasure cannot be null");
            }
            c14070l.crashlytics(j);
            m2887default((((long) abstractC1668lMo2645l.f20592l) << 32) | (((long) abstractC1668lMo2645l.f20591l) & 4294967295L));
            return (((int) (j2 >> 32)) == abstractC1668lMo2645l.f20592l && ((int) (j2 & 4294967295L)) == abstractC1668lMo2645l.f20591l) ? false : true;
        } catch (Throwable th) {
            c3654l.m1373abstract(th);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC2800l
    public final void signatures(C3006l c3006l) {
        C17893l c17893lSignatures = this.f8282l.yandex.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i = c17893lSignatures.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            c3006l.invoke(((C3654l) objArr[i2]).f7667l.adcel);
        }
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final int mo1466switch() {
        return this.f8282l.yandex().mo2645l().mo1466switch();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m1467this() {
        int i = this.f8285l;
        C14070l c14070l = this.f8282l;
        boolean z = c14070l.crashlytics;
        C3654l c3654l = c14070l.yandex;
        if (z) {
            this.f8285l = 2;
        } else {
            this.f8285l = 1;
        }
        if (i != 1 && c14070l.purchase) {
            C3654l.m1370final(c3654l, true, 6);
        }
        C17893l c17893lSignatures = c3654l.signatures();
        Object[] objArr = c17893lSignatures.f34848l;
        int i2 = c17893lSignatures.f34846l;
        for (int i3 = 0; i3 < i2; i3++) {
            C3654l c3654l2 = (C3654l) objArr[i3];
            C4020l c4020l = c3654l2.f7667l.adcel;
            if (c4020l == null) {
                C8339l.metrica("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (c4020l.f8281l != Integer.MAX_VALUE) {
                c4020l.m1467this();
                C3654l.m1372super(c3654l2);
            }
        }
    }

    @Override // defpackage.AbstractC10113l
    /* JADX INFO: renamed from: throw */
    public final int mo884throw(AbstractC12914l abstractC12914l) {
        C14070l c14070l = this.f8282l;
        C3654l c3654lLicense = c14070l.yandex.license();
        int i = c3654lLicense != null ? c3654lLicense.f7667l.amazon : 0;
        C7074l c7074l = this.f8272l;
        if (i == 2) {
            c7074l.crashlytics = true;
        } else {
            C3654l c3654lLicense2 = c14070l.yandex.license();
            if ((c3654lLicense2 != null ? c3654lLicense2.f7667l.amazon : 0) == 4) {
                c7074l.amazon = true;
            }
        }
        this.f8283l = true;
        int iMo884throw = c14070l.yandex().mo2645l().mo884throw(abstractC12914l);
        this.f8283l = false;
        return iMo884throw;
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m1468try() {
        C14070l c14070l = this.f8282l;
        if (c14070l.metrica > 0) {
            C17893l c17893lSignatures = c14070l.yandex.signatures();
            Object[] objArr = c17893lSignatures.f34848l;
            int i = c17893lSignatures.f34846l;
            for (int i2 = 0; i2 < i; i2++) {
                C3654l c3654l = (C3654l) objArr[i2];
                C14070l c14070l2 = c3654l.f7667l;
                if ((c14070l2.remoteconfig || c14070l2.vip) && !c14070l2.billing) {
                    c3654l.m1378default(false);
                }
                C4020l c4020l = c14070l2.adcel;
                if (c4020l != null) {
                    c4020l.m1468try();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC2800l
    public final int vip() {
        return this.f8281l;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final void m1469while() {
        int i;
        this.f8278l = true;
        C14070l c14070l = this.f8282l;
        C3654l c3654lLicense = c14070l.yandex.license();
        int i2 = this.f8285l;
        if ((i2 != 1 && !c14070l.crashlytics) || (i2 != 2 && c14070l.crashlytics)) {
            m1467this();
            if (this.f8266l && c3654lLicense != null) {
                c3654lLicense.m1378default(false);
            }
        }
        if (c3654lLicense != null) {
            C14070l c14070l2 = c3654lLicense.f7667l;
            if (!this.f8266l && ((i = c14070l2.amazon) == 3 || i == 4)) {
                if (this.f8281l != Integer.MAX_VALUE) {
                    AbstractC0081l.crashlytics("Place was called on a node which was placed already");
                }
                int i3 = c14070l2.admob;
                this.f8281l = i3;
                c14070l2.admob = i3 + 1;
            }
        } else {
            this.f8281l = 0;
        }
        appmetrica();
    }

    @Override // defpackage.InterfaceC2800l
    public final C7074l yandex() {
        return this.f8272l;
    }
}
