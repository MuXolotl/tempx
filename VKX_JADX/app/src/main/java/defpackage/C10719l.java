package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: renamed from: lَۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10719l implements InterfaceC10687l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Map f21718l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f21719l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C15390l f21720l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CaptureRequest f21721l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC11450l f21722l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Map f21723l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Map f21724l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final long f21725l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final ArrayMap f21726l;

    public C10719l(InterfaceC11450l interfaceC11450l, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, C15390l c15390l, long j) {
        this.f21722l = interfaceC11450l;
        this.f21721l = captureRequest;
        this.f21718l = map;
        this.f21724l = map2;
        this.f21723l = map3;
        this.f21726l = arrayMap;
        this.f21719l = z;
        this.f21720l = c15390l;
        this.f21725l = j;
    }

    @Override // defpackage.InterfaceC10687l
    public final C15390l billing() {
        return this.f21720l;
    }

    @Override // defpackage.InterfaceC2024l
    public final Object loadAd(C5192l c5192l) {
        Map map = this.f21720l.crashlytics;
        Map map2 = this.f21723l;
        if (map2.containsKey(c5192l)) {
            return map2.get(c5192l);
        }
        if (map.containsKey(c5192l)) {
            return map.get(c5192l);
        }
        Map map3 = this.f21724l;
        return map3.containsKey(c5192l) ? map3.get(c5192l) : this.f21718l.get(c5192l);
    }

    @Override // defpackage.InterfaceC10687l
    /* JADX INFO: renamed from: package */
    public final Map mo2962package() {
        return this.f21726l;
    }

    @Override // defpackage.InterfaceC10687l
    /* JADX INFO: renamed from: super */
    public final long mo2963super() {
        return this.f21725l;
    }

    @Override // defpackage.InterfaceC10687l
    /* JADX INFO: renamed from: switch */
    public final boolean mo2964switch() {
        return this.f21719l;
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        C2336l c2336l = AbstractC18202l.yandex;
        if (interfaceC1388l.equals(c2336l.loadAd(CaptureRequest.class))) {
            return this.f21721l;
        }
        boolean zEquals = interfaceC1388l.equals(c2336l.loadAd(CameraCaptureSession.class));
        InterfaceC11450l interfaceC11450l = this.f21722l;
        if (zEquals) {
            Object objMo842while = interfaceC11450l.mo842while(c2336l.loadAd(CameraCaptureSession.class));
            if (objMo842while != null) {
                return objMo842while;
            }
        } else if (interfaceC1388l.equals(c2336l.loadAd(C18353l.ads()))) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object objMo842while2 = interfaceC11450l.mo842while(c2336l.loadAd(C18353l.ads()));
                if (objMo842while2 != null) {
                    return objMo842while2;
                }
            } else {
                C8339l.smaato("Check failed.");
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC2024l
    public final Object yandex(C5192l c5192l, C12920l c12920l) {
        Object objLoadAd = loadAd(c5192l);
        return objLoadAd == null ? c12920l : objLoadAd;
    }
}
