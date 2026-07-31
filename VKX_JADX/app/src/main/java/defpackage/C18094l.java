package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* JADX INFO: renamed from: l٘ٞۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18094l implements InterfaceC3525l {
    public final C16628l yandex;

    public C18094l(C16628l c16628l) {
        this.yandex = c16628l;
    }

    @Override // defpackage.InterfaceC3525l
    public final InterfaceC3773l yandex(C6669l c6669l, C15106l c15106l) {
        ImageDecoder.Source sourceM3273continue;
        Bitmap.Config configLoadAd = AbstractC10413l.loadAd(c15106l);
        if ((configLoadAd == Bitmap.Config.ARGB_8888 || configLoadAd == Bitmap.Config.HARDWARE) && (sourceM3273continue = AbstractC11880l.m3273continue(c6669l.yandex, c15106l, false)) != null) {
            return new C9882l(sourceM3273continue, c6669l.yandex, c15106l, this.yandex);
        }
        return null;
    }
}
