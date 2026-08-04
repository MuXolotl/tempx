package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lّۚٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12840l extends AbstractC15422l {
    public final /* synthetic */ int firebase;
    public final /* synthetic */ String remoteconfig;
    public final /* synthetic */ C16166l smaato;
    public final /* synthetic */ C17423l vip;

    public /* synthetic */ C12840l(C16166l c16166l, String str, C17423l c17423l, int i) {
        this.firebase = i;
        this.smaato = c16166l;
        this.remoteconfig = str;
        this.vip = c17423l;
    }

    @Override // defpackage.AbstractC15422l
    public final void amazon(Object obj) throws Exception {
        int i = this.firebase;
        C17423l c17423l = this.vip;
        String str = this.remoteconfig;
        C16166l c16166l = this.smaato;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = c16166l.loadAd;
                ArrayList arrayList = c16166l.amazon;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    C6541l.isPro("Attempting to launch an unregistered ActivityResultLauncher with contract ", c17423l, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    c16166l.loadAd(iIntValue, c17423l, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = c16166l.amazon;
                Object obj3 = c16166l.loadAd.get(str);
                if (obj3 == null) {
                    C6541l.isPro("Attempting to launch an unregistered ActivityResultLauncher with contract ", c17423l, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    c16166l.loadAd(iIntValue2, c17423l, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void subs() {
        this.smaato.purchase(this.remoteconfig);
    }
}
