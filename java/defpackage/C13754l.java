package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lَْۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13754l implements InterfaceC4784l, InterfaceC11885l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C13281l f26846l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C13698l f26847l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f26848l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7238l f26849l;

    public C13754l(AbstractC7238l abstractC7238l, Object obj) {
        this.f26849l = abstractC7238l;
        this.f26847l = new C13698l((CopyOnWriteArrayList) abstractC7238l.crashlytics.f26746l, 0, (C5019l) null);
        this.f26846l = new C13281l(abstractC7238l.amazon.crashlytics, 0, null);
        this.f26848l = obj;
    }

    @Override // defpackage.InterfaceC4784l
    public final void ad(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l, IOException iOException, boolean z) {
        if (billing(i, c5019l)) {
            C13698l c13698l = this.f26847l;
            C2040l c2040lMopub = mopub(c2040l, c5019l);
            c13698l.getClass();
            c13698l.subscription(new C1052l(c13698l, c13071l, c2040lMopub, iOException, z));
        }
    }

    @Override // defpackage.InterfaceC11885l
    public final void amazon(int i, C5019l c5019l, int i2) {
        if (billing(i, c5019l)) {
            this.f26846l.crashlytics(i2);
        }
    }

    public final boolean billing(int i, C5019l c5019l) {
        C5019l c5019lTapsense;
        Object obj = this.f26848l;
        AbstractC7238l abstractC7238l = this.f26849l;
        if (c5019l != null) {
            c5019lTapsense = abstractC7238l.tapsense(obj, c5019l);
            if (c5019lTapsense == null) {
                return false;
            }
        } else {
            c5019lTapsense = null;
        }
        int iLicense = abstractC7238l.license(i, obj);
        C13698l c13698l = this.f26847l;
        if (c13698l.f26744l != iLicense || !Objects.equals((C5019l) c13698l.f26743l, c5019lTapsense)) {
            this.f26847l = new C13698l((CopyOnWriteArrayList) abstractC7238l.crashlytics.f26746l, iLicense, c5019lTapsense);
        }
        C13281l c13281l = this.f26846l;
        if (c13281l.yandex == iLicense && Objects.equals(c13281l.loadAd, c5019lTapsense)) {
            return true;
        }
        this.f26846l = new C13281l(abstractC7238l.amazon.crashlytics, iLicense, c5019lTapsense);
        return true;
    }

    @Override // defpackage.InterfaceC4784l
    /* JADX INFO: renamed from: class */
    public final void mo1600class(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l, int i2) {
        if (billing(i, c5019l)) {
            C13698l c13698l = this.f26847l;
            C2040l c2040lMopub = mopub(c2040l, c5019l);
            c13698l.getClass();
            c13698l.subscription(new C2766l(c13698l, c13071l, c2040lMopub, i2));
        }
    }

    @Override // defpackage.InterfaceC4784l
    public final void crashlytics(int i, C5019l c5019l, C2040l c2040l) {
        if (billing(i, c5019l)) {
            C13698l c13698l = this.f26847l;
            C2040l c2040lMopub = mopub(c2040l, c5019l);
            C5019l c5019l2 = (C5019l) c13698l.f26743l;
            c5019l2.getClass();
            c13698l.subscription(new C17706l(c13698l, c5019l2, c2040lMopub, 11));
        }
    }

    @Override // defpackage.InterfaceC11885l
    public final void isVip(int i, C5019l c5019l) {
        if (billing(i, c5019l)) {
            this.f26846l.loadAd();
        }
    }

    @Override // defpackage.InterfaceC4784l
    public final void license(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l) {
        if (billing(i, c5019l)) {
            C13698l c13698l = this.f26847l;
            C2040l c2040lMopub = mopub(c2040l, c5019l);
            c13698l.getClass();
            c13698l.subscription(new C3424l(c13698l, c13071l, c2040lMopub, 0));
        }
    }

    @Override // defpackage.InterfaceC4784l
    public final void loadAd(int i, C5019l c5019l, C2040l c2040l) {
        if (billing(i, c5019l)) {
            C13698l c13698l = this.f26847l;
            C2040l c2040lMopub = mopub(c2040l, c5019l);
            c13698l.getClass();
            c13698l.subscription(new C15263l(c13698l, c2040lMopub, 9));
        }
    }

    public final C2040l mopub(C2040l c2040l, C5019l c5019l) {
        long j = c2040l.billing;
        AbstractC7238l abstractC7238l = this.f26849l;
        Object obj = this.f26848l;
        long jSignature = abstractC7238l.Signature(j, obj);
        long j2 = c2040l.mopub;
        long jSignature2 = abstractC7238l.Signature(j2, obj);
        return (jSignature == j && jSignature2 == j2) ? c2040l : new C2040l(c2040l.yandex, c2040l.loadAd, c2040l.crashlytics, c2040l.amazon, c2040l.purchase, jSignature, jSignature2);
    }

    @Override // defpackage.InterfaceC11885l
    public final void purchase(int i, C5019l c5019l, C2183l c2183l) {
        if (billing(i, c5019l)) {
            this.f26846l.yandex(c2183l);
        }
    }

    @Override // defpackage.InterfaceC4784l
    public final void subscription(int i, C5019l c5019l, C13071l c13071l, C2040l c2040l) {
        if (billing(i, c5019l)) {
            C13698l c13698l = this.f26847l;
            C2040l c2040lMopub = mopub(c2040l, c5019l);
            c13698l.getClass();
            c13698l.subscription(new C3424l(c13698l, c13071l, c2040lMopub, 1));
        }
    }

    @Override // defpackage.InterfaceC11885l
    /* JADX INFO: renamed from: throw */
    public final void mo2164throw(int i, C5019l c5019l) {
        if (billing(i, c5019l)) {
            this.f26846l.purchase();
        }
    }

    @Override // defpackage.InterfaceC11885l
    public final void yandex(int i, C5019l c5019l, Exception exc) {
        if (billing(i, c5019l)) {
            this.f26846l.amazon(exc);
        }
    }
}
