package defpackage;

import io.realm.kotlin.internal.RealmInitializer;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lِٟۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12125l {
    public final C8677l admob;
    public final String amazon;
    public final C5501l billing;
    public final String crashlytics;
    public final C11534l loadAd;
    public final C8677l mopub;
    public final LinkedHashMap purchase;
    public final C16034l subs;
    public final C15452l yandex;

    public C12125l(String str, String str2, Set set, long j, C8677l c8677l, C8677l c8677l2, long j2, C15452l c15452l, C11534l c11534l) {
        String string;
        C5131l c5131l;
        this.yandex = c15452l;
        this.loadAd = c11534l;
        if (str.length() == 0) {
            File file = RealmInitializer.yandex;
            string = (file == null ? null : file).getAbsolutePath();
        } else {
            string = str;
        }
        String str3 = AbstractC8942l.yandex;
        if (AbstractC16648l.isVip(string, "." + str3, false)) {
            String strStartapp = AbstractC14814l.startapp(".", str3);
            File file2 = RealmInitializer.yandex;
            String str4 = (file2 == null ? null : file2).getAbsolutePath() + str3;
            int iM3324for = AbstractC12024l.m3324for(string, strStartapp, 0, false, 2);
            if (iM3324for >= 0) {
                string = AbstractC12024l.m3327import(string, iM3324for, strStartapp.length() + iM3324for, str4).toString();
            }
        }
        File absoluteFile = new File(string).getAbsoluteFile();
        if (!absoluteFile.exists() && !absoluteFile.mkdirs()) {
            C8339l.smaato("Directories for Realm file could not be created: ".concat(string));
            throw null;
        }
        if (absoluteFile.isFile()) {
            C8339l.metrica("Provided directory is a file: ".concat(string));
            throw null;
        }
        this.crashlytics = new File(string, str2).getAbsolutePath();
        this.amazon = str2;
        Set set2 = set;
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase < 16 ? 16 : iFirebase);
        for (Object obj : set2) {
            linkedHashMap.put(obj, AbstractC5293l.loadAd((InterfaceC1388l) obj));
        }
        this.purchase = linkedHashMap;
        this.mopub = c8677l;
        this.admob = c8677l2;
        C15452l c15452l2 = this.yandex;
        AbstractC13082l abstractC13082l = null;
        if (c15452l2 == null) {
            c5131l = null;
        } else {
            if (!(c15452l2 instanceof C15452l)) {
                C18725l.billing();
                throw null;
            }
            c5131l = new C5131l(this, c15452l2, 4);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList<String> arrayList = new ArrayList(AbstractC14055l.billing(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC13226l) it.next()).purchase().crashlytics);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str5 : arrayList) {
            Object c9987l = linkedHashMap2.get(str5);
            if (c9987l == null && !linkedHashMap2.containsKey(str5)) {
                c9987l = new C9987l();
            }
            C9987l c9987l2 = (C9987l) c9987l;
            c9987l2.f20387l++;
            linkedHashMap2.put(str5, c9987l2);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            AbstractC9464l.crashlytics(entry);
            entry.setValue(Integer.valueOf(((C9987l) entry.getValue()).f20387l));
        }
        Map mapLoadAd = AbstractC9464l.loadAd(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : mapLoadAd.entrySet()) {
            if (((Number) entry2.getValue()).intValue() > 1) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        Set setKeySet = linkedHashMap3.keySet();
        if (!setKeySet.isEmpty()) {
            C8339l.metrica("The schema has declared the following class names multiple times: ".concat(AbstractC16901l.m4210case(setKeySet, null, null, null, null, 63)));
            throw null;
        }
        this.subs = new C16034l(this, 1, j2, abstractC13082l, j, c5131l);
        this.billing = new C5501l(6, this);
    }

    public final NativePointer yandex() {
        int i = AbstractC9795l.yandex;
        return (NativePointer) this.subs.invoke(new LongPointerWrapper(realmcJNI.realm_config_new(), false, 2, null));
    }
}
