package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lٌِۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11717l implements InterfaceC11167l {
    public final /* synthetic */ AbstractActivityC14666l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11717l(AbstractActivityC14666l abstractActivityC14666l, int i) {
        this.yandex = i;
        this.loadAd = abstractActivityC14666l;
    }

    @Override // defpackage.InterfaceC11167l
    public final void yandex() {
        int i = this.yandex;
        AbstractActivityC14666l abstractActivityC14666l = this.loadAd;
        switch (i) {
            case 0:
                Bundle bundleTapsense = ((C18396l) abstractActivityC14666l.f28688l.f26580l).tapsense("android:support:activity-result");
                if (bundleTapsense != null) {
                    C16166l c16166l = abstractActivityC14666l.f28690l;
                    LinkedHashMap linkedHashMap = c16166l.loadAd;
                    LinkedHashMap linkedHashMap2 = c16166l.yandex;
                    Bundle bundle = c16166l.mopub;
                    ArrayList<Integer> integerArrayList = bundleTapsense.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleTapsense.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleTapsense.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            c16166l.amazon.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleTapsense.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    AbstractC9464l.loadAd(linkedHashMap2).remove(num);
                                }
                            }
                            int iIntValue = integerArrayList.get(i2).intValue();
                            String str2 = stringArrayList.get(i2);
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
                            c16166l.loadAd.put(str2, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                C6239l c6239l = (C6239l) ((AbstractActivityC16046l) abstractActivityC14666l).f31440l.f29441l;
                c6239l.f13178l.loadAd(c6239l, c6239l, null);
                break;
        }
    }
}
