package defpackage;

import android.hardware.camera2.CameraExtensionCharacteristics;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lِؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3390l implements InterfaceC16282l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final CameraExtensionCharacteristics f7234l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f7235l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f7236l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC1220l f7237l;

    public C3390l(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        this.f7236l = str;
        this.f7235l = i;
        this.f7234l = cameraExtensionCharacteristics;
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        AbstractC9968l.crashlytics(2, new C5234l(this, 0));
        AbstractC9968l.crashlytics(2, new C5234l(this, 1));
        this.f7237l = AbstractC9968l.crashlytics(2, new C5234l(this, 2));
        AbstractC9968l.crashlytics(2, new C5234l(this, 3));
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        if (interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(CameraExtensionCharacteristics.class))) {
            return this.f7234l;
        }
        return null;
    }
}
