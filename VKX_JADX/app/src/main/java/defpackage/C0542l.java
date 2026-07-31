package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lؑۘۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0542l implements InterfaceC9289l {
    public final C9377l loadAd;
    public final Context yandex;
    public final Object crashlytics = new Object();
    public Map amazon = C14054l.f27396l;

    public C0542l(Context context, C9377l c9377l, Set set) throws C7410l {
        this.yandex = context;
        this.loadAd = c9377l;
        try {
            yandex(AbstractC16901l.m4213const(set));
        } catch (C12868l e) {
            throw new C7410l(e);
        }
    }

    @Override // defpackage.InterfaceC9289l
    public final void yandex(List list) throws C12868l {
        List<String> listM4213const;
        InterfaceC7744l c0554l;
        synchronized (this.crashlytics) {
            Set setKeySet = this.amazon.keySet();
            Set setM4213const = setKeySet instanceof Collection ? setKeySet : AbstractC16901l.m4213const(setKeySet);
            if (setM4213const.isEmpty()) {
                listM4213const = AbstractC16901l.m4213const(list);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!setM4213const.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                listM4213const = arrayList;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (!listM4213const.isEmpty() && AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Creating new surface combinations for: " + listM4213const);
        }
        C9377l c9377l = this.loadAd;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listM4213const.isEmpty()) {
            try {
                for (String str : listM4213const) {
                    C7615l c7615lYandex = c9377l.yandex();
                    C10160l.yandex(str);
                    InterfaceC5389l interfaceC5389lAmazon = AbstractC14814l.amazon(c7615lYandex, str);
                    C5849l c5849l = new C5849l(interfaceC5389lAmazon, new C5979l((StreamConfigurationMap) ((C10861l) interfaceC5389lAmazon).crashlytics(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP), new C3111l(interfaceC5389lAmazon)));
                    Context context = this.yandex;
                    C8906l c8906l = new C8906l(str, c5849l.yandex());
                    if (Build.VERSION.SDK_INT >= 35) {
                        C4723l c4723l = (C4723l) c9377l.yandex.f3601l;
                        AbstractC17943l.yandex(c4723l);
                        c0554l = new C0554l(interfaceC5389lAmazon, c4723l, c5849l);
                    } else {
                        c0554l = InterfaceC7744l.ad;
                    }
                    linkedHashMap.put(str, new C1557l(context, interfaceC5389lAmazon, c8906l, c0554l));
                }
            } catch (C6422l e) {
                throw new C12868l("Failed to query camera metadata", e);
            } catch (Exception e2) {
                throw new C12868l("Failed to build surface combinations", e2);
            }
        }
        synchronized (this.crashlytics) {
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.amazon.containsKey(str2)) {
                        linkedHashMap2.put(str2, this.amazon.get(str2));
                    }
                }
                linkedHashMap2.putAll(linkedHashMap);
                this.amazon = linkedHashMap2;
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Committed new surface combination map. Total cameras: " + linkedHashMap2.size());
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
