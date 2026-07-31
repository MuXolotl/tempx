package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lُٖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11079l extends AbstractC10491l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11079l(C6901l c6901l, int i) {
        super(c6901l);
        this.f22288l = i;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public boolean m3038l() {
        m2927l();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C17417l) this.f833l).f33936l.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public void m3039l(String str, C7835l c7835l, C6194l c6194l, InterfaceC11139l interfaceC11139l) {
        String str2;
        String str3 = c7835l.yandex;
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        m2927l();
        try {
            URL url = new URI(str3).toURL();
            this.f13233l.m2113try();
            byte[] bArrYandex = c6194l.yandex();
            C17923l c17923l = c17417l.f33929l;
            C17417l.admob(c17923l);
            Map map = c7835l.loadAd;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                c17923l.m4446l(new RunnableC17907l(this, str2, url, bArrYandex, map, interfaceC11139l));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16908l.crashlytics(C8118l.m2260l(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    @Override // defpackage.AbstractC10491l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final void mo1780l() {
        int i = this.f22288l;
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    private final void m3036l() {
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    private final void m3037l() {
    }
}
