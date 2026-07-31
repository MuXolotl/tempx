package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٕۥُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16047l {
    public final C9917l amazon;
    public final C8688l billing;
    public final C7686l crashlytics;
    public final C7647l loadAd;
    public final C8688l purchase;
    public final C9917l yandex;

    public C16047l(C9917l c9917l, C7647l c7647l, C7686l c7686l, C9917l c9917l2) {
        this.yandex = c9917l;
        this.loadAd = c7647l;
        this.crashlytics = c7686l;
        this.amazon = c9917l2;
        final int i = 0;
        this.purchase = new C8688l(new Function0(this) { // from class: lؚٕ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C16047l f30344l;

            {
                this.f30344l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C16047l c16047l = this.f30344l;
                switch (i2) {
                    case 0:
                        return (C2667l) c16047l.yandex.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) c16047l.amazon.get()).entrySet()) {
                            C4069l c4069l = (C4069l) entry.getKey();
                            AbstractC0958l abstractC0958l = (AbstractC0958l) entry.getValue();
                            C9494l c9494l = (C9494l) c16047l.yandex().f5777l.f12039l.get(c4069l);
                            if (c9494l != null) {
                                linkedHashMap.put(abstractC0958l, new C16755l(c9494l.yandex));
                            }
                        }
                        return AbstractC8676l.tapsense(linkedHashMap);
                }
            }
        });
        final int i2 = 1;
        this.billing = new C8688l(new Function0(this) { // from class: lؚٕ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C16047l f30344l;

            {
                this.f30344l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C16047l c16047l = this.f30344l;
                switch (i3) {
                    case 0:
                        return (C2667l) c16047l.yandex.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) c16047l.amazon.get()).entrySet()) {
                            C4069l c4069l = (C4069l) entry.getKey();
                            AbstractC0958l abstractC0958l = (AbstractC0958l) entry.getValue();
                            C9494l c9494l = (C9494l) c16047l.yandex().f5777l.f12039l.get(c4069l);
                            if (c9494l != null) {
                                linkedHashMap.put(abstractC0958l, new C16755l(c9494l.yandex));
                            }
                        }
                        return AbstractC8676l.tapsense(linkedHashMap);
                }
            }
        });
    }

    public final LinkedHashSet loadAd(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16755l c16755l = (C16755l) ((Map) this.billing.getValue()).get((AbstractC0958l) it.next());
            if (c16755l != null) {
                linkedHashSet.add(new C16755l(c16755l.yandex));
            }
        }
        return linkedHashSet;
    }

    public final C2667l yandex() {
        return (C2667l) this.purchase.getValue();
    }
}
