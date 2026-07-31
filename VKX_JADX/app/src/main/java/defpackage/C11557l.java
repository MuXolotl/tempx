package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lِؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11557l implements InterfaceC4902l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final List f23233l = Collections.singletonList(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15736l f23234l;

    public C11557l(C15736l c15736l) {
        this.f23234l = c15736l;
    }

    @Override // defpackage.InterfaceC4902l
    public final float billing() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC4902l
    public final InterfaceC1142l firebase(InterfaceC16983l interfaceC16983l) {
        return AbstractC15929l.yandex(Unit.INSTANCE);
    }

    @Override // defpackage.InterfaceC4902l
    public final Rect isPro() {
        C10861l c10861l = (C10861l) this.f23234l.loadAd;
        Rect rect = (Rect) c10861l.crashlytics(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            return rect;
        }
        if (AbstractC5088l.metrica()) {
            Log.w("CXCP", "Failed to read SENSOR_INFO_ACTIVE_ARRAY_SIZE for " + ((Object) C10160l.loadAd(c10861l.f21960l)) + '!');
        }
        return new Rect(0, 0, 4000, 3000);
    }

    @Override // defpackage.InterfaceC4902l
    public final float loadAd() {
        return 1.0f;
    }

    @Override // defpackage.InterfaceC4902l
    public final InterfaceC1142l smaato(float f, InterfaceC16983l interfaceC16983l) {
        return AbstractC15929l.yandex(Unit.INSTANCE);
    }
}
