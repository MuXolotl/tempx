package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;

/* JADX INFO: renamed from: lؑۡٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0646l implements InterfaceC2360l {
    public static final HashMap billing;
    public final InterfaceC15879l amazon;
    public final InterfaceC2360l crashlytics;
    public final C17735l purchase;

    static {
        HashMap map = new HashMap();
        billing = map;
        map.put(1, C18680l.isPro);
        map.put(8, C18680l.admob);
        map.put(6, C18680l.mopub);
        map.put(5, C18680l.billing);
        map.put(4, C18680l.purchase);
        map.put(0, C18680l.subs);
    }

    public C0646l(InterfaceC2360l interfaceC2360l, InterfaceC15879l interfaceC15879l, C17735l c17735l) {
        this.crashlytics = interfaceC2360l;
        this.amazon = interfaceC15879l;
        this.purchase = c17735l;
    }

    @Override // defpackage.InterfaceC2360l
    public final InterfaceC15313l loadAd(int i) {
        if (yandex(i)) {
            return this.crashlytics.loadAd(i);
        }
        return null;
    }

    @Override // defpackage.InterfaceC2360l
    public final boolean yandex(int i) {
        if (!this.crashlytics.yandex(i)) {
            return false;
        }
        C18680l c18680l = (C18680l) billing.get(Integer.valueOf(i));
        if (c18680l == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.purchase.crashlytics(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.yandex(this.amazon, c18680l) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).loadAd())) {
                return false;
            }
        }
        return true;
    }
}
