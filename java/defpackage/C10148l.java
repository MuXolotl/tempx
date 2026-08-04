package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lَؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10148l implements InterfaceC2360l {
    public final HashMap amazon;
    public final InterfaceC2360l crashlytics;

    public C10148l(InterfaceC2360l interfaceC2360l, C17735l c17735l, InterfaceC15879l interfaceC15879l, C4835l c4835l) {
        List listAmazon;
        this.crashlytics = interfaceC2360l;
        ArrayList arrayListCrashlytics = c17735l.crashlytics(ExtraSupportedQualityQuirk.class);
        if (arrayListCrashlytics.isEmpty()) {
            return;
        }
        Map map = null;
        AbstractC5641l.purchase(null, arrayListCrashlytics.size() == 1);
        ((ExtraSupportedQualityQuirk) arrayListCrashlytics.get(0)).getClass();
        if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
            map = Collections.EMPTY_MAP;
        } else if ("1".equals(interfaceC15879l.mopub()) && !interfaceC2360l.yandex(4)) {
            InterfaceC15313l interfaceC15313lLoadAd = interfaceC2360l.loadAd(1);
            C6410l c6410l = (interfaceC15313lLoadAd == null || (listAmazon = interfaceC15313lLoadAd.amazon()) == null) ? null : (C6410l) AbstractC16901l.m4217extends(listAmazon);
            if (c6410l != null) {
                InterfaceC13662l interfaceC13662lYandex = c4835l.yandex(c6410l.loadAd);
                Range rangeMo1977throw = interfaceC13662lYandex != null ? interfaceC13662lYandex.mo1977throw() : Range.create(0, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
                Size size = AbstractC5513l.amazon;
                int i = c6410l.crashlytics;
                int i2 = c6410l.admob;
                int i3 = c6410l.amazon;
                C9550l c9550lPurchase = C9550l.purchase(interfaceC15313lLoadAd.yandex(), interfaceC15313lLoadAd.loadAd(), interfaceC15313lLoadAd.crashlytics(), Collections.singletonList(new C6410l(c6410l.yandex, c6410l.loadAd, ((Number) rangeMo1977throw.clamp(Integer.valueOf(AbstractC15040l.amazon(i, i2, i2, i3, i3, size.getWidth(), c6410l.purchase, size.getHeight(), c6410l.billing)))).intValue(), c6410l.amazon, size.getWidth(), size.getHeight(), c6410l.mopub, c6410l.admob, c6410l.subs, c6410l.isPro)));
                HashMap map2 = new HashMap();
                map2.put(4, c9550lPurchase);
                Size sizeYandex = c6410l.yandex();
                if (size.getHeight() * size.getWidth() > sizeYandex.getHeight() * sizeYandex.getWidth()) {
                    map2.put(1, c9550lPurchase);
                }
                map = map2;
            }
        }
        if (map != null) {
            this.amazon = new HashMap(map);
        }
    }

    public final InterfaceC15313l crashlytics(int i) {
        HashMap map = this.amazon;
        return (map == null || !map.containsKey(Integer.valueOf(i))) ? this.crashlytics.loadAd(i) : (InterfaceC15313l) map.get(Integer.valueOf(i));
    }

    @Override // defpackage.InterfaceC2360l
    public final InterfaceC15313l loadAd(int i) {
        return crashlytics(i);
    }

    @Override // defpackage.InterfaceC2360l
    public final boolean yandex(int i) {
        return crashlytics(i) != null;
    }
}
