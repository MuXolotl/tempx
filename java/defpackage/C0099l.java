package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: lۣؑؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0099l {
    public final LinkedHashMap loadAd;
    public final /* synthetic */ int yandex;

    public C0099l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new LinkedHashMap();
                break;
            default:
                this.loadAd = new LinkedHashMap();
                break;
        }
    }

    public void amazon(String str, InterfaceC8396l interfaceC8396l) {
        this.loadAd.put(str, interfaceC8396l);
    }

    public void crashlytics(long j) {
        this.loadAd.put("owner_id", new C1014l(j));
    }

    public void loadAd(int i, String str) {
        this.loadAd.put(str, new C14513l(i, 22, (byte) 0));
    }

    public void purchase(String str, String str2) {
        this.loadAd.put(str, new C11534l(str2, 5));
    }

    public String toString() {
        switch (this.yandex) {
            case 1:
                return AbstractC16901l.m4210case(this.loadAd.entrySet(), ",", null, null, new C10949l(24), 30);
            default:
                return super.toString();
        }
    }

    public void yandex(AbstractC8590l abstractC8590l) {
        int i = abstractC8590l.yandex;
        int i2 = abstractC8590l.loadAd;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.loadAd;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + abstractC8590l);
        }
        treeMap2.put(Integer.valueOf(i2), abstractC8590l);
    }
}
