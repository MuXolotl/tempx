package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4288l {
    public final C8688l amazon;
    public boolean billing;
    public final int crashlytics = Process.myPid();
    public final C8688l loadAd;
    public final C8688l purchase;
    public final Context yandex;

    public C4288l(Context context, C15435l c15435l) {
        this.yandex = context;
        final int i = 0;
        this.loadAd = new C8688l(new Function0(this) { // from class: lؘّؕ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4288l f11980l;

            {
                this.f11980l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C4288l c4288l = this.f11980l;
                switch (i2) {
                    case 0:
                        return ((C1410l) c4288l.purchase.getValue()).yandex;
                    default:
                        return AbstractC2847l.smaato(c4288l.yandex);
                }
            }
        });
        this.amazon = new C8688l(new C10740l(20, c15435l));
        final int i2 = 1;
        this.purchase = new C8688l(new Function0(this) { // from class: lؘّؕ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C4288l f11980l;

            {
                this.f11980l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C4288l c4288l = this.f11980l;
                switch (i3) {
                    case 0:
                        return ((C1410l) c4288l.purchase.getValue()).yandex;
                    default:
                        return AbstractC2847l.smaato(c4288l.yandex);
                }
            }
        });
    }

    public final Map loadAd(Map map) {
        C8688l c8688l = this.amazon;
        if (map == null) {
            return Collections.singletonMap(yandex(), new C15120l(Process.myPid(), (String) c8688l.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(yandex(), new C15120l(Process.myPid(), (String) c8688l.getValue()));
        return AbstractC8676l.tapsense(linkedHashMap);
    }

    public final String yandex() {
        return (String) this.loadAd.getValue();
    }
}
