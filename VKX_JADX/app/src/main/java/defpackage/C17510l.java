package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: renamed from: lۣٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17510l implements InterfaceC5259l {
    public static final String adcel;
    public static final String ads;
    public static final String firebase;
    public static final String metrica;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String startapp;
    public static final String subscription;
    public static final String tapsense;
    public static final String vip;
    public final IBinder admob;
    public final int amazon;
    public final String billing;
    public final int crashlytics;
    public final MediaSession.Token isPro;
    public final int loadAd;
    public final ComponentName mopub;
    public final String purchase;
    public final Bundle subs;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        firebase = Integer.toString(0, 36);
        smaato = Integer.toString(1, 36);
        remoteconfig = Integer.toString(2, 36);
        vip = Integer.toString(3, 36);
        metrica = Integer.toString(4, 36);
        startapp = Integer.toString(5, 36);
        adcel = Integer.toString(6, 36);
        ads = Integer.toString(7, 36);
        subscription = Integer.toString(8, 36);
        tapsense = Integer.toString(9, 36);
    }

    public C17510l(int i, int i2, int i3, int i4, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle, MediaSession.Token token) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
        this.purchase = str;
        this.billing = str2;
        this.mopub = componentName;
        this.admob = iBinder;
        this.subs = bundle;
        this.isPro = token;
    }

    @Override // defpackage.InterfaceC5259l
    public final Bundle admob() {
        Bundle bundle = new Bundle();
        bundle.putInt(firebase, this.yandex);
        bundle.putInt(smaato, this.loadAd);
        bundle.putInt(remoteconfig, this.crashlytics);
        bundle.putString(vip, this.purchase);
        bundle.putString(metrica, this.billing);
        bundle.putBinder(adcel, this.admob);
        bundle.putParcelable(startapp, this.mopub);
        bundle.putBundle(ads, this.subs);
        bundle.putInt(subscription, this.amazon);
        MediaSession.Token token = this.isPro;
        if (token != null) {
            bundle.putParcelable(tapsense, token);
        }
        return bundle;
    }

    @Override // defpackage.InterfaceC5259l
    public final Object amazon() {
        return this.admob;
    }

    @Override // defpackage.InterfaceC5259l
    public final int billing() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC5259l
    public final ComponentName crashlytics() {
        return this.mopub;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17510l)) {
            return false;
        }
        C17510l c17510l = (C17510l) obj;
        return this.yandex == c17510l.yandex && this.loadAd == c17510l.loadAd && this.crashlytics == c17510l.crashlytics && this.amazon == c17510l.amazon && TextUtils.equals(this.purchase, c17510l.purchase) && TextUtils.equals(this.billing, c17510l.billing) && Objects.equals(this.mopub, c17510l.mopub) && Objects.equals(this.admob, c17510l.admob) && Objects.equals(this.isPro, c17510l.isPro);
    }

    @Override // defpackage.InterfaceC5259l
    public final Bundle getExtras() {
        return new Bundle(this.subs);
    }

    @Override // defpackage.InterfaceC5259l
    public final String getServiceName() {
        return this.billing;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), Integer.valueOf(this.crashlytics), Integer.valueOf(this.amazon), this.purchase, this.billing, this.mopub, this.admob, this.isPro);
    }

    @Override // defpackage.InterfaceC5259l
    public final int loadAd() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC5259l
    public final String mopub() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC5259l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC5259l
    public final MediaSession.Token subs() {
        return this.isPro;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.purchase + " type=" + this.loadAd + " libraryVersion=" + this.crashlytics + " interfaceVersion=" + this.amazon + " service=" + this.billing + " IMediaSession=" + this.admob + " extras=" + this.subs + "}";
    }

    @Override // defpackage.InterfaceC5259l
    public final int yandex() {
        return this.loadAd;
    }
}
