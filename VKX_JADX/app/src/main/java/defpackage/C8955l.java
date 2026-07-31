package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٌٟؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8955l implements InterfaceC3335l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C8955l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC3335l
    public final Bundle yandex() {
        C8195l[] c8195lArr;
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                C16166l c16166l = ((AbstractActivityC14666l) obj).f28690l;
                c16166l.getClass();
                LinkedHashMap linkedHashMap = c16166l.loadAd;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c16166l.amazon));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c16166l.mopub));
                return bundle;
            case 1:
                Map mapAmazon = ((C0504l) obj).amazon();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapAmazon.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                AbstractActivityC16046l abstractActivityC16046l = (AbstractActivityC16046l) obj;
                while (AbstractActivityC16046l.vip(((C6239l) abstractActivityC16046l.f31440l.f29441l).f13178l)) {
                }
                abstractActivityC16046l.f31439l.purchase(EnumC14812l.ON_STOP);
                return new Bundle();
            case 3:
                return ((C13734l) obj).m3739interface();
            default:
                C3557l c3557l = (C3557l) obj;
                for (Map.Entry entry2 : AbstractC8676l.tapsense((LinkedHashMap) c3557l.f7482l).entrySet()) {
                    c3557l.billing(((C1008l) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : AbstractC8676l.tapsense((LinkedHashMap) c3557l.f7479l).entrySet()) {
                    c3557l.billing(((InterfaceC3335l) entry3.getValue()).yandex(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c3557l.f7480l;
                if (linkedHashMap2.isEmpty()) {
                    c8195lArr = new C8195l[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new C8195l((String) entry4.getKey(), entry4.getValue()));
                    }
                    c8195lArr = (C8195l[]) arrayList.toArray(new C8195l[0]);
                }
                return AbstractC1315l.loadAd((C8195l[]) Arrays.copyOf(c8195lArr, c8195lArr.length));
        }
    }
}
