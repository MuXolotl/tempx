package defpackage;

import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lٍّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12320l {
    public static final int amazon;
    public static final int crashlytics;
    public static final ArrayList loadAd;
    public static final C15045l yandex;

    static {
        C10483l c10483l = new C10483l();
        loadAd = new ArrayList();
        int i = 5;
        crashlytics = 5;
        amazon = 5;
        synchronized (c10483l) {
            try {
                if (yandex == null) {
                    C15045l c15045l = new C15045l();
                    int size = loadAd.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add((C15045l) loadAd.get(i2));
                    }
                    arrayList.add(c15045l);
                    yandex = c15045l;
                    loadAd = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i3 = crashlytics;
        InterfaceC12493l.yandex.getClass();
        String string = C9370l.loadAd.loadAd.toString();
        LinkedHashMap linkedHashMap = AbstractC1303l.yandex;
        switch (AbstractC5020l.inmobi(i3)) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            default:
                C18725l.billing();
                return;
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        int i4 = AbstractC9795l.yandex;
        realmcJNI.realm_set_log_level_category(string, iInmobi);
        amazon = AbstractC1303l.yandex(AbstractC3461l.remoteconfig((short) realmcJNI.realm_get_log_level_category(C13801l.crashlytics.loadAd.toString())));
        realmcJNI.set_log_callback(new C6162l(8));
    }
}
