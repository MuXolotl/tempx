package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٍُۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9887l extends AbstractC2712l {
    public static final C9887l smaato;
    public final C5978l admob;
    public final List amazon;
    public final List billing;
    public final List firebase;
    public final Map isPro;
    public final List mopub;
    public final List purchase;
    public final List subs;

    static {
        List list = Collections.EMPTY_LIST;
        smaato = new C9887l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public C9887l(String str, List list, List list2, List list3, List list4, List list5, List list6, C5978l c5978l, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((C15979l) list2.get(i)).yandex;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        loadAd(arrayList, list3);
        loadAd(arrayList, list4);
        loadAd(arrayList, list5);
        loadAd(arrayList, list6);
        DesugarCollections.unmodifiableList(arrayList);
        this.amazon = DesugarCollections.unmodifiableList(list2);
        this.purchase = DesugarCollections.unmodifiableList(list3);
        this.billing = DesugarCollections.unmodifiableList(list4);
        this.mopub = DesugarCollections.unmodifiableList(list5);
        DesugarCollections.unmodifiableList(list6);
        this.admob = c5978l;
        this.subs = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.isPro = DesugarCollections.unmodifiableMap(map);
        this.firebase = DesugarCollections.unmodifiableList(list8);
    }

    public static ArrayList crashlytics(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                C17945l c17945l = (C17945l) list2.get(i3);
                if (c17945l.f34925l == i && c17945l.f34924l == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static void loadAd(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((C4389l) list.get(i)).yandex;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    @Override // defpackage.AbstractC2712l
    public final Object yandex(List list) {
        ArrayList arrayListCrashlytics = crashlytics(0, this.amazon, list);
        List list2 = Collections.EMPTY_LIST;
        return new C9887l(this.yandex, this.loadAd, arrayListCrashlytics, list2, crashlytics(1, this.billing, list), crashlytics(2, this.mopub, list), list2, this.admob, this.subs, this.crashlytics, this.isPro, this.firebase);
    }
}
