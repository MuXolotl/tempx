package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lْٖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13416l {
    public final InterfaceC9576l Signature;
    public final InterfaceC9576l ad;
    public final InterfaceC9576l adcel;
    public final InterfaceC9576l admob;
    public final InterfaceC9576l ads;
    public final C13161l advert = new C13161l();
    public final InterfaceC9576l amazon;
    public final InterfaceC9576l applovin;
    public final InterfaceC9576l appmetrica;
    public final InterfaceC9576l billing;
    public final InterfaceC9576l crashlytics;
    public final InterfaceC9576l firebase;
    public final InterfaceC9576l inmobi;
    public final InterfaceC9576l isPro;
    public final InterfaceC9576l isVip;
    public final InterfaceC9576l license;
    public final C9377l loadAd;
    public final InterfaceC9576l metrica;
    public final InterfaceC9576l mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final InterfaceC9576l f26314package;
    public final InterfaceC9576l premium;
    public final InterfaceC9576l pro;
    public final InterfaceC9576l purchase;
    public final InterfaceC9576l remoteconfig;
    public final InterfaceC9576l signatures;
    public final InterfaceC9576l smaato;
    public final InterfaceC9576l startapp;
    public final InterfaceC9576l subs;
    public final InterfaceC9576l subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final InterfaceC9576l f26315synchronized;
    public final InterfaceC9576l tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final InterfaceC9576l f26316throws;
    public final InterfaceC9576l vip;
    public final C17927l yandex;

    public C13416l(C9377l c9377l, C17927l c17927l, C13568l c13568l) {
        this.loadAd = c9377l;
        this.yandex = c17927l;
        this.crashlytics = AbstractC11043l.purchase(c9377l, this, 4);
        this.amazon = AbstractC11043l.purchase(c9377l, this, 3);
        this.purchase = AbstractC11043l.purchase(c9377l, this, 2);
        this.billing = AbstractC11043l.purchase(c9377l, this, 9);
        this.mopub = AbstractC11043l.purchase(c9377l, this, 10);
        this.admob = AbstractC11043l.purchase(c9377l, this, 8);
        this.subs = AbstractC11043l.purchase(c9377l, this, 7);
        this.isPro = AbstractC11043l.purchase(c9377l, this, 11);
        this.firebase = AbstractC11043l.purchase(c9377l, this, 6);
        this.smaato = AbstractC11043l.purchase(c9377l, this, 12);
        this.remoteconfig = AbstractC11043l.purchase(c9377l, this, 5);
        this.vip = AbstractC11043l.purchase(c9377l, this, 14);
        this.metrica = AbstractC11043l.purchase(c9377l, this, 13);
        this.startapp = AbstractC11043l.purchase(c9377l, this, 16);
        this.adcel = AbstractC11043l.purchase(c9377l, this, 15);
        this.ads = AbstractC11043l.purchase(c9377l, this, 17);
        this.subscription = AbstractC11043l.purchase(c9377l, this, 18);
        this.tapsense = AbstractC11043l.purchase(c9377l, this, 19);
        this.Signature = AbstractC11043l.purchase(c9377l, this, 20);
        this.license = AbstractC11043l.purchase(c9377l, this, 22);
        this.pro = AbstractC11043l.purchase(c9377l, this, 21);
        this.ad = AbstractC11043l.purchase(c9377l, this, 23);
        this.isVip = AbstractC11043l.purchase(c9377l, this, 25);
        this.signatures = AbstractC11043l.purchase(c9377l, this, 26);
        this.premium = AbstractC11043l.purchase(c9377l, this, 28);
        this.applovin = AbstractC11043l.purchase(c9377l, this, 27);
        this.appmetrica = AbstractC11043l.purchase(c9377l, this, 29);
        this.inmobi = AbstractC11043l.purchase(c9377l, this, 24);
        this.f26316throws = AbstractC11043l.purchase(c9377l, this, 30);
        this.f26314package = AbstractC11043l.purchase(c9377l, this, 1);
        this.f26315synchronized = AbstractC11043l.purchase(c9377l, this, 31);
        C13161l.m3575native(this.advert, C6693l.yandex(new C13698l(c9377l, this, 0, 6)));
    }

    public final InterfaceC4902l loadAd() {
        Range rangePurchase;
        C15736l c15736l = (C15736l) this.amazon.get();
        if ("robolectric".equals(Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = C11557l.f23233l;
            if (list == null || !list.isEmpty()) {
                for (CameraCharacteristics.Key key : list) {
                    if (AbstractC5088l.metrica()) {
                        Log.w("CXCP", "Failed to read " + key + " for zoom features.");
                    }
                    if (((C10861l) c15736l.loadAd).crashlytics(key) == null) {
                        return new C11557l(c15736l);
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30 && (rangePurchase = AbstractC5121l.purchase(c15736l.loadAd)) != null) {
            return new C5602l(c15736l, rangePurchase);
        }
        return new C18449l(c15736l);
    }

    public final InterfaceC18560l yandex() {
        C17735l c17735lYandex = ((C5849l) this.subs.get()).yandex();
        Iterator it = c17735lYandex.crashlytics(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).crashlytics()) {
                return new C11280l(c17735lYandex);
            }
        }
        if (!c17735lYandex.yandex(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
            return C11485l.f23091l;
        }
        return new C11280l(c17735lYandex);
    }
}
