package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.C18680l;
import defpackage.InterfaceC15879l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean yandex(InterfaceC15879l interfaceC15879l, C18680l c18680l) {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL) && interfaceC15879l.metrica() == 0 && c18680l == C18680l.purchase;
    }
}
