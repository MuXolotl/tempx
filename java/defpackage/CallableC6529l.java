package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lؙ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC6529l implements Callable {
    public final /* synthetic */ int amazon;
    public final /* synthetic */ Context crashlytics;
    public final /* synthetic */ String loadAd;
    public final /* synthetic */ Object purchase;
    public final /* synthetic */ int yandex;

    public /* synthetic */ CallableC6529l(String str, Context context, Object obj, int i, int i2) {
        this.yandex = i2;
        this.loadAd = str;
        this.crashlytics = context;
        this.purchase = obj;
        this.amazon = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.yandex;
        int i2 = this.amazon;
        Object obj = this.purchase;
        Context context = this.crashlytics;
        String str = this.loadAd;
        switch (i) {
            case 0:
                Object[] objArr = {(C17129l) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC8202l.loadAd(str, context, DesugarCollections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return AbstractC8202l.loadAd(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new C11253l(-3);
                }
        }
    }
}
