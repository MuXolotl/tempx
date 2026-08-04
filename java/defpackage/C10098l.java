package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lَؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10098l implements InterfaceC0627l {
    public final C7931l crashlytics;
    public final C5664l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C10098l(C5664l c5664l, C7931l c7931l, int i) {
        this.yandex = i;
        this.loadAd = c5664l;
        this.crashlytics = c7931l;
    }

    @Override // defpackage.InterfaceC0627l
    public final InterfaceC17866l yandex(InterfaceC2413l interfaceC2413l, Map map, C15202l c15202l) throws Exception {
        boolean zMo835import;
        int i = this.yandex;
        C14054l c14054l = C14054l.f27396l;
        C5664l c5664l = this.loadAd;
        C7931l c7931l = this.crashlytics;
        switch (i) {
            case 0:
                C7472l c7472l = C7472l.f15449l;
                ArrayList arrayList = c7931l.amazon;
                if (arrayList != null) {
                    AbstractC2371l abstractC2371l = (AbstractC2371l) AbstractC16901l.m4208abstract(((C13228l) AbstractC16901l.m4208abstract(arrayList)).yandex.yandex);
                    InputConfiguration inputConfiguration = new InputConfiguration(abstractC2371l.yandex.getWidth(), abstractC2371l.yandex.getHeight(), abstractC2371l.loadAd);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList2.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
                    if (!interfaceC2413l.mo837l(inputConfiguration, arrayList2, c15202l)) {
                        Log.w("CXCP", "Failed to create reprocessable captures session from " + interfaceC2413l + " for " + c15202l + '!');
                        c15202l.yandex();
                        return c7472l;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((Surface) ((Map.Entry) it2.next()).getValue());
                    }
                    if (!interfaceC2413l.mo833continue(arrayList3, c15202l)) {
                        Log.w("CXCP", "Failed to create captures session from " + interfaceC2413l + " for " + c15202l + '!');
                        c15202l.yandex();
                        return c7472l;
                    }
                }
                return new C5522l(c14054l, AbstractC11965l.loadAd(map, c5664l));
            default:
                C7472l c7472l2 = C7472l.f15449l;
                C4291l c4291lAmazon = AbstractC11965l.amazon(c7931l, c5664l, map);
                ArrayList arrayList4 = c4291lAmazon.yandex;
                if (arrayList4.isEmpty()) {
                    Log.w("CXCP", "Failed to create OutputConfigurations for " + c7931l);
                    c15202l.yandex();
                    return c7472l2;
                }
                ArrayList arrayList5 = c7931l.amazon;
                if (arrayList5 == null) {
                    zMo835import = interfaceC2413l.mo834default(arrayList4, c15202l);
                } else {
                    AbstractC2371l abstractC2371l2 = (AbstractC2371l) AbstractC16901l.m4208abstract(((C13228l) AbstractC16901l.m4208abstract(arrayList5)).yandex.yandex);
                    zMo835import = interfaceC2413l.mo835import(new C11765l(abstractC2371l2.yandex.getWidth(), abstractC2371l2.yandex.getHeight(), abstractC2371l2.loadAd), arrayList4, c15202l);
                }
                if (zMo835import) {
                    return new C5522l(c14054l, c4291lAmazon.amazon);
                }
                Log.w("CXCP", "Failed to create capture session from " + interfaceC2413l + " for " + c15202l + '!');
                c15202l.yandex();
                return c7472l2;
        }
    }
}
