package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.Map;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* JADX INFO: renamed from: lُؗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10866l implements InterfaceC6684l, InterfaceC14606l, InterfaceC11545l, InterfaceC14623l, InterfaceC12238l, InterfaceC11139l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f21968l;

    public C10866l(AppMeasurementSdk appMeasurementSdk, C3797l c3797l) {
        this.f21968l = c3797l;
        appMeasurementSdk.yandex(new C13730l(1, this));
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C2350l c2350l = (C2350l) obj2;
        C7111l c7111l = (C7111l) ((C7247l) obj).metrica();
        C18466l c18466l = (C18466l) this.f21968l;
        Parcel parcelCrashlytics = c7111l.crashlytics();
        AbstractC1763l.loadAd(parcelCrashlytics, c18466l);
        try {
            c7111l.billing.transact(1, parcelCrashlytics, null, 1);
            parcelCrashlytics.recycle();
            c2350l.loadAd(null);
        } catch (Throwable th) {
            parcelCrashlytics.recycle();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14623l
    public /* bridge */ /* synthetic */ void admob(AbstractC11229l abstractC11229l) {
    }

    @Override // defpackage.InterfaceC6684l
    public C10227l ads() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        CatalogArtist catalogArtist = (CatalogArtist) this.f21968l;
        c10227lAdmob.add(new C12885l(catalogArtist.yandex, 4, catalogArtist.loadAd));
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    @Override // defpackage.InterfaceC14606l
    public /* bridge */ /* synthetic */ void amazon(Object obj) {
    }

    @Override // defpackage.InterfaceC14623l
    public /* bridge */ /* synthetic */ void billing(AbstractC11229l abstractC11229l, int i) {
    }

    public boolean crashlytics() {
        if (!metrica()) {
            return false;
        }
        C17417l c17417l = (C17417l) this.f21968l;
        c17417l.f33951l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C16386l c16386l = c17417l.f33944l;
        C17417l.billing(c16386l);
        return jCurrentTimeMillis - c16386l.f32050l.amazon() > c17417l.f33945l.m1674l(null, AbstractC5981l.f12630break);
    }

    @Override // defpackage.InterfaceC14623l
    public void firebase(AbstractC11229l abstractC11229l, String str) {
        C8181l c8181l = (C8181l) this.f21968l;
        c8181l.getClass();
        C8181l.mopub.loadAd("onSessionStarted with transferType = %d", 0);
        if (c8181l.purchase) {
            boolean z = c8181l.yandex.f24037l;
        }
        c8181l.yandex();
    }

    @Override // defpackage.InterfaceC14623l
    public /* bridge */ /* synthetic */ void isPro(AbstractC11229l abstractC11229l, int i) {
    }

    public void loadAd(String str, Bundle bundle) {
        String string;
        C17417l c17417l = (C17417l) this.f21968l;
        C17923l c17923l = c17417l.f33929l;
        C16386l c16386l = c17417l.f33944l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        if (c17417l.yandex()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        C17417l.billing(c16386l);
        c16386l.f32047l.ad(string);
        C3071l c3071l = c16386l.f32050l;
        c17417l.f33951l.getClass();
        c3071l.purchase(System.currentTimeMillis());
    }

    public boolean metrica() {
        C16386l c16386l = ((C17417l) this.f21968l).f33944l;
        C17417l.billing(c16386l);
        return c16386l.f32050l.amazon() > 0;
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        AbstractC5088l.Signature("VideoEncoderSession", "VideoEncoder configuration failed.", th);
        ((C12158l) this.f21968l).crashlytics();
    }

    @Override // defpackage.InterfaceC11139l
    public /* synthetic */ void purchase(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((C6901l) this.f21968l).pro(str, i, th, bArr, map);
    }

    @Override // defpackage.InterfaceC14623l
    public /* bridge */ /* synthetic */ void remoteconfig(AbstractC11229l abstractC11229l) {
    }

    @Override // defpackage.InterfaceC14623l
    public /* bridge */ /* synthetic */ void smaato(AbstractC11229l abstractC11229l, int i) {
    }

    @Override // defpackage.InterfaceC14623l
    public /* bridge */ /* synthetic */ void startapp(AbstractC11229l abstractC11229l, boolean z) {
    }

    @Override // defpackage.InterfaceC12238l
    public void subs(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C11675l c11675l = (C11675l) this.f21968l;
        if (zIsEmpty) {
            c11675l.m3189l("auto", "_err", bundle);
        } else {
            c11675l.getClass();
            C8339l.smaato("Unexpected call on client side");
        }
    }

    @Override // defpackage.InterfaceC14623l
    public /* synthetic */ void vip(AbstractC11229l abstractC11229l, int i) {
        C0022l c0022l = C8181l.mopub;
        Object[] objArr = {Integer.valueOf(i)};
        C0022l c0022l2 = C8181l.mopub;
        c0022l2.loadAd("onSessionEnded with error = %d", objArr);
        C8181l c8181l = (C8181l) this.f21968l;
        c8181l.getClass();
        c0022l2.loadAd("No need to notify transferred if the transfer type is unknown", new Object[0]);
        c8181l.yandex();
    }

    @Override // defpackage.InterfaceC14623l
    public /* bridge */ /* synthetic */ void yandex(AbstractC11229l abstractC11229l, String str) {
    }

    public /* synthetic */ C10866l(Object obj) {
        this.f21968l = obj;
    }

    public /* synthetic */ C10866l(C8181l c8181l) {
        Objects.requireNonNull(c8181l);
        this.f21968l = c8181l;
    }

    public C10866l(InterfaceC3177l interfaceC3177l) {
        this.f21968l = new WeakReference(interfaceC3177l);
    }
}
