package defpackage;

import android.content.ComponentName;
import android.content.Context;
import j$.util.Objects;

/* JADX INFO: renamed from: lؕۚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3621l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final HandlerC8616l f7553l = new HandlerC8616l(this);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C4300l f7554l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f7555l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5008l f7556l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f7557l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C4658l f7558l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C14965l f7559l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f7560l;

    public AbstractC3621l(Context context, C5008l c5008l) {
        if (context == null) {
            C8339l.metrica("context must not be null");
            throw null;
        }
        this.f7557l = context;
        if (c5008l != null) {
            this.f7556l = c5008l;
        } else {
            this.f7556l = new C5008l(15, new ComponentName(context, getClass()));
        }
    }

    public AbstractC16531l amazon(String str, String str2) {
        if (str == null) {
            C8339l.metrica("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return crashlytics(str, C15536l.loadAd);
        }
        C8339l.metrica("routeGroupId cannot be null");
        return null;
    }

    public final void billing(C4300l c4300l) {
        C9961l.loadAd();
        if (this.f7554l != c4300l) {
            this.f7554l = c4300l;
            if (this.f7555l) {
                return;
            }
            this.f7555l = true;
            this.f7553l.sendEmptyMessage(1);
        }
    }

    public AbstractC16531l crashlytics(String str, C15536l c15536l) {
        return loadAd(str);
    }

    public AbstractC16531l loadAd(String str) {
        if (str != null) {
            return null;
        }
        C8339l.metrica("routeId cannot be null");
        return null;
    }

    public final void mopub(C4658l c4658l) {
        C9961l.loadAd();
        if (Objects.equals(this.f7558l, c4658l)) {
            return;
        }
        this.f7558l = c4658l;
        if (this.f7560l) {
            return;
        }
        this.f7560l = true;
        this.f7553l.sendEmptyMessage(2);
    }

    public abstract void purchase(C4658l c4658l);

    public AbstractC11653l yandex(String str, C15536l c15536l) {
        if (str != null) {
            return null;
        }
        C8339l.metrica("initialMemberRouteId cannot be null.");
        return null;
    }
}
